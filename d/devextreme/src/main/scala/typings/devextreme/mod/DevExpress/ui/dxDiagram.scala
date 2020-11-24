package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.jpg
import typings.devextreme.devextremeStrings.png_
import typings.devextreme.devextremeStrings.svg_
import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDiagram extends Widget {
  
  /**
    * [descr:dxDiagram.export()]
    */
  def export(): String = js.native
  
  @JSName("exportTo")
  def exportTo_jpg(format: jpg, callback: js.Function): Unit = js.native
  @JSName("exportTo")
  def exportTo_png(format: png_, callback: js.Function): Unit = js.native
  /**
    * [descr:dxDiagram.exportTo(format, callback)]
    */
  @JSName("exportTo")
  def exportTo_svg(format: svg_, callback: js.Function): Unit = js.native
  
  /**
    * [descr:dxDiagram.getEdgeDataSource()]
    */
  def getEdgeDataSource(): DataSource = js.native
  
  /**
    * [descr:dxDiagram.getItemById(id)]
    */
  def getItemById(id: String): dxDiagramItem = js.native
  
  /**
    * [descr:dxDiagram.getItemByKey(key)]
    */
  def getItemByKey(key: js.Any): dxDiagramItem = js.native
  
  /**
    * [descr:dxDiagram.getNodeDataSource()]
    */
  def getNodeDataSource(): DataSource = js.native
  
  /**
    * [descr:dxDiagram.import(data, updateExistingItemsOnly)]
    */
  def `import`(data: String): Unit = js.native
  def `import`(data: String, updateExistingItemsOnly: Boolean): Unit = js.native
}

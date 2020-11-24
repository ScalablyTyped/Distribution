package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeMap extends BaseWidget {
  
  /**
    * [descr:dxTreeMap.clearSelection()]
    */
  def clearSelection(): Unit = js.native
  
  /**
    * [descr:dxTreeMap.drillUp()]
    */
  def drillUp(): Unit = js.native
  
  /**
    * [descr:dxTreeMap.getCurrentNode()]
    */
  def getCurrentNode(): dxTreeMapNode = js.native
  
  /**
    * [descr:DataHelperMixin.getDataSource()]
    */
  def getDataSource(): DataSource = js.native
  
  /**
    * [descr:dxTreeMap.getRootNode()]
    */
  def getRootNode(): dxTreeMapNode = js.native
  
  /**
    * [descr:dxTreeMap.hideTooltip()]
    */
  def hideTooltip(): Unit = js.native
  
  /**
    * [descr:dxTreeMap.resetDrillDown()]
    */
  def resetDrillDown(): Unit = js.native
}

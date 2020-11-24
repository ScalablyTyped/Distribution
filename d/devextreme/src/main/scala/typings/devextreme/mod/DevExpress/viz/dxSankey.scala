package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSankey extends BaseWidget {
  
  /**
    * [descr:dxSankey.getAllLinks()]
    */
  def getAllLinks(): js.Array[dxSankeyLink] = js.native
  
  /**
    * [descr:dxSankey.getAllNodes()]
    */
  def getAllNodes(): js.Array[dxSankeyNode] = js.native
  
  /**
    * [descr:DataHelperMixin.getDataSource()]
    */
  def getDataSource(): DataSource = js.native
  
  /**
    * [descr:dxSankey.hideTooltip()]
    */
  def hideTooltip(): Unit = js.native
}

package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFunnel extends BaseWidget {
  
  /**
    * [descr:dxFunnel.clearSelection()]
    */
  def clearSelection(): Unit = js.native
  
  /**
    * [descr:dxFunnel.getAllItems()]
    */
  def getAllItems(): js.Array[dxFunnelItem] = js.native
  
  /**
    * [descr:DataHelperMixin.getDataSource()]
    */
  def getDataSource(): DataSource = js.native
  
  /**
    * [descr:dxFunnel.hideTooltip()]
    */
  def hideTooltip(): Unit = js.native
}

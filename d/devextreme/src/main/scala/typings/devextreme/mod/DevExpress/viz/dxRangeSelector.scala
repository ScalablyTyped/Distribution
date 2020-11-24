package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxRangeSelector extends BaseWidget {
  
  /**
    * [descr:DataHelperMixin.getDataSource()]
    */
  def getDataSource(): DataSource = js.native
  
  /**
    * [descr:dxRangeSelector.getValue()]
    */
  def getValue(): js.Array[Double | String | Date] = js.native
  
  /**
    * [descr:dxRangeSelector.render(skipChartAnimation)]
    */
  def render(skipChartAnimation: Boolean): Unit = js.native
  
  /**
    * [descr:dxRangeSelector.setValue(value)]
    */
  def setValue(value: js.Array[Double | String | Date]): Unit = js.native
  def setValue(value: VizRange): Unit = js.native
}

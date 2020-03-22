package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxRangeSelector extends BaseWidget {
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource = js.native
  /** Gets the currently selected range. */
  def getValue(): js.Array[Double | String | Date] = js.native
  /** Redraws the widget. */
  def render(skipChartAnimation: Boolean): Unit = js.native
  /** Sets the selected range. */
  def setValue(value: js.Array[Double | String | Date]): Unit = js.native
  def setValue(value: VizRange): Unit = js.native
}


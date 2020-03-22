package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseChart extends BaseWidget {
  /** Deselects the chart's selected series. The series is displayed in an initial style. */
  def clearSelection(): Unit = js.native
  /** Gets all the series. */
  def getAllSeries(): js.Array[baseSeriesObject] = js.native
  /** Gets the DataSource instance. */
  def getDataSource(): DataSource = js.native
  /** Gets a series with a specific name. */
  def getSeriesByName(seriesName: js.Any): chartSeriesObject = js.native
  /** Gets a series with a specific index. */
  def getSeriesByPos(seriesIndex: Double): chartSeriesObject = js.native
  /** Hides all widget tooltips. */
  def hideTooltip(): Unit = js.native
  /** Reloads data and repaints the widget. */
  def refresh(): Unit = js.native
  /** Redraws the widget. */
  def render(renderOptions: js.Any): Unit = js.native
}


package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.data.DataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseChart extends BaseWidget {
  /** @name BaseChart.clearSelection() */
  def clearSelection(): Unit = js.native
  /** @name BaseChart.getAllSeries() */
  def getAllSeries(): js.Array[baseSeriesObject] = js.native
  /** @name DataHelperMixin.getDataSource() */
  def getDataSource(): DataSource = js.native
  /** @name BaseChart.getSeriesByName(seriesName) */
  def getSeriesByName(seriesName: js.Any): chartSeriesObject = js.native
  /** @name BaseChart.getSeriesByPos(seriesIndex) */
  def getSeriesByPos(seriesIndex: Double): chartSeriesObject = js.native
  /** @name BaseChart.hideTooltip() */
  def hideTooltip(): Unit = js.native
  /** @name BaseChart.refresh() */
  def refresh(): Unit = js.native
  /** @name BaseChart.render(renderOptions) */
  def render(renderOptions: js.Any): Unit = js.native
}


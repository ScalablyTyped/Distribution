package typings.googleDotVisualization.google.visualization

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSpecs extends js.Object {
  var chartType: String
  var container: js.UndefOr[HTMLElement] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var dataSourceUrl: js.UndefOr[String] = js.undefined
  var dataTable: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var refreshInterval: js.UndefOr[Double] = js.undefined
  var view: js.UndefOr[js.Any] = js.undefined
}

object ChartSpecs {
  @scala.inline
  def apply(
    chartType: String,
    container: HTMLElement = null,
    containerId: String = null,
    dataSourceUrl: String = null,
    dataTable: js.Object = null,
    options: js.Object = null,
    query: String = null,
    refreshInterval: Int | Double = null,
    view: js.Any = null
  ): ChartSpecs = {
    val __obj = js.Dynamic.literal(chartType = chartType.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl.asInstanceOf[js.Any])
    if (dataTable != null) __obj.updateDynamic("dataTable")(dataTable.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSpecs]
  }
}


package typings.googleDotVisualization.googleNs.visualizationNs

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
    val __obj = js.Dynamic.literal(chartType = chartType)
    if (container != null) __obj.updateDynamic("container")(container)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (dataSourceUrl != null) __obj.updateDynamic("dataSourceUrl")(dataSourceUrl)
    if (dataTable != null) __obj.updateDynamic("dataTable")(dataTable)
    if (options != null) __obj.updateDynamic("options")(options)
    if (query != null) __obj.updateDynamic("query")(query)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[ChartSpecs]
  }
}


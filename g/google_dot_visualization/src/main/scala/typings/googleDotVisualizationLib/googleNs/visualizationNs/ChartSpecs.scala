package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSpecs extends js.Object {
  var chartType: java.lang.String
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var dataSourceUrl: js.UndefOr[java.lang.String] = js.undefined
  var dataTable: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[js.Object] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var refreshInterval: js.UndefOr[scala.Double] = js.undefined
  var view: js.UndefOr[js.Any] = js.undefined
}

object ChartSpecs {
  @scala.inline
  def apply(
    chartType: java.lang.String,
    container: stdLib.HTMLElement = null,
    containerId: java.lang.String = null,
    dataSourceUrl: java.lang.String = null,
    dataTable: js.Object = null,
    options: js.Object = null,
    query: java.lang.String = null,
    refreshInterval: scala.Int | scala.Double = null,
    view: js.Any = null
  ): ChartSpecs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chartType")(chartType)
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


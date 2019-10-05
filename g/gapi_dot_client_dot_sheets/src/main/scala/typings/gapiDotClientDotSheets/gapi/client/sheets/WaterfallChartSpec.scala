package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartSpec extends js.Object {
  /** The line style for the connector lines. */
  var connectorLineStyle: js.UndefOr[LineStyle] = js.undefined
  /** The domain data (horizontal axis) for the waterfall chart. */
  var domain: js.UndefOr[WaterfallChartDomain] = js.undefined
  /** True to interpret the first value as a total. */
  var firstValueIsTotal: js.UndefOr[Boolean] = js.undefined
  /** True to hide connector lines between columns. */
  var hideConnectorLines: js.UndefOr[Boolean] = js.undefined
  /** The data this waterfall chart is visualizing. */
  var series: js.UndefOr[js.Array[WaterfallChartSeries]] = js.undefined
  /** The stacked type. */
  var stackedType: js.UndefOr[String] = js.undefined
}

object WaterfallChartSpec {
  @scala.inline
  def apply(
    connectorLineStyle: LineStyle = null,
    domain: WaterfallChartDomain = null,
    firstValueIsTotal: js.UndefOr[Boolean] = js.undefined,
    hideConnectorLines: js.UndefOr[Boolean] = js.undefined,
    series: js.Array[WaterfallChartSeries] = null,
    stackedType: String = null
  ): WaterfallChartSpec = {
    val __obj = js.Dynamic.literal()
    if (connectorLineStyle != null) __obj.updateDynamic("connectorLineStyle")(connectorLineStyle)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(firstValueIsTotal)) __obj.updateDynamic("firstValueIsTotal")(firstValueIsTotal)
    if (!js.isUndefined(hideConnectorLines)) __obj.updateDynamic("hideConnectorLines")(hideConnectorLines)
    if (series != null) __obj.updateDynamic("series")(series)
    if (stackedType != null) __obj.updateDynamic("stackedType")(stackedType)
    __obj.asInstanceOf[WaterfallChartSpec]
  }
}


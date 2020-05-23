package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaterfallChartSpec extends js.Object {
  var connectorLineStyle: js.UndefOr[LineStyle] = js.undefined
  var domain: js.UndefOr[WaterfallChartDomain] = js.undefined
  var firstValueIsTotal: js.UndefOr[Boolean] = js.undefined
  var hideConnectorLines: js.UndefOr[Boolean] = js.undefined
  var series: js.UndefOr[js.Array[WaterfallChartSeries]] = js.undefined
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
    if (connectorLineStyle != null) __obj.updateDynamic("connectorLineStyle")(connectorLineStyle.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(firstValueIsTotal)) __obj.updateDynamic("firstValueIsTotal")(firstValueIsTotal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideConnectorLines)) __obj.updateDynamic("hideConnectorLines")(hideConnectorLines.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (stackedType != null) __obj.updateDynamic("stackedType")(stackedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaterfallChartSpec]
  }
}


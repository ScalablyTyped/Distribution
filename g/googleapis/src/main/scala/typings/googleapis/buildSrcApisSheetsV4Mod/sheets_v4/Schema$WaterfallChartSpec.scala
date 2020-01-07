package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A waterfall chart.
  */
@js.native
trait Schema$WaterfallChartSpec extends js.Object {
  /**
    * The line style for the connector lines.
    */
  var connectorLineStyle: js.UndefOr[Schema$LineStyle] = js.native
  /**
    * The domain data (horizontal axis) for the waterfall chart.
    */
  var domain: js.UndefOr[Schema$WaterfallChartDomain] = js.native
  /**
    * True to interpret the first value as a total.
    */
  var firstValueIsTotal: js.UndefOr[Boolean] = js.native
  /**
    * True to hide connector lines between columns.
    */
  var hideConnectorLines: js.UndefOr[Boolean] = js.native
  /**
    * The data this waterfall chart is visualizing.
    */
  var series: js.UndefOr[js.Array[Schema$WaterfallChartSeries]] = js.native
  /**
    * The stacked type.
    */
  var stackedType: js.UndefOr[String] = js.native
}

object Schema$WaterfallChartSpec {
  @scala.inline
  def apply(
    connectorLineStyle: Schema$LineStyle = null,
    domain: Schema$WaterfallChartDomain = null,
    firstValueIsTotal: js.UndefOr[Boolean] = js.undefined,
    hideConnectorLines: js.UndefOr[Boolean] = js.undefined,
    series: js.Array[Schema$WaterfallChartSeries] = null,
    stackedType: String = null
  ): Schema$WaterfallChartSpec = {
    val __obj = js.Dynamic.literal()
    if (connectorLineStyle != null) __obj.updateDynamic("connectorLineStyle")(connectorLineStyle.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(firstValueIsTotal)) __obj.updateDynamic("firstValueIsTotal")(firstValueIsTotal.asInstanceOf[js.Any])
    if (!js.isUndefined(hideConnectorLines)) __obj.updateDynamic("hideConnectorLines")(hideConnectorLines.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (stackedType != null) __obj.updateDynamic("stackedType")(stackedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WaterfallChartSpec]
  }
}


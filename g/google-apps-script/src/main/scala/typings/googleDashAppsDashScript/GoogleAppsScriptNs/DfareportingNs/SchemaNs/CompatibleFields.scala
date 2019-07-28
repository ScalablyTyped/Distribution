package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleFields extends js.Object {
  var crossDimensionReachReportCompatibleFields: js.UndefOr[CrossDimensionReachReportCompatibleFields] = js.undefined
  var floodlightReportCompatibleFields: js.UndefOr[FloodlightReportCompatibleFields] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var pathToConversionReportCompatibleFields: js.UndefOr[PathToConversionReportCompatibleFields] = js.undefined
  var reachReportCompatibleFields: js.UndefOr[ReachReportCompatibleFields] = js.undefined
  var reportCompatibleFields: js.UndefOr[ReportCompatibleFields] = js.undefined
}

object CompatibleFields {
  @scala.inline
  def apply(
    crossDimensionReachReportCompatibleFields: CrossDimensionReachReportCompatibleFields = null,
    floodlightReportCompatibleFields: FloodlightReportCompatibleFields = null,
    kind: String = null,
    pathToConversionReportCompatibleFields: PathToConversionReportCompatibleFields = null,
    reachReportCompatibleFields: ReachReportCompatibleFields = null,
    reportCompatibleFields: ReportCompatibleFields = null
  ): CompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (crossDimensionReachReportCompatibleFields != null) __obj.updateDynamic("crossDimensionReachReportCompatibleFields")(crossDimensionReachReportCompatibleFields)
    if (floodlightReportCompatibleFields != null) __obj.updateDynamic("floodlightReportCompatibleFields")(floodlightReportCompatibleFields)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (pathToConversionReportCompatibleFields != null) __obj.updateDynamic("pathToConversionReportCompatibleFields")(pathToConversionReportCompatibleFields)
    if (reachReportCompatibleFields != null) __obj.updateDynamic("reachReportCompatibleFields")(reachReportCompatibleFields)
    if (reportCompatibleFields != null) __obj.updateDynamic("reportCompatibleFields")(reportCompatibleFields)
    __obj.asInstanceOf[CompatibleFields]
  }
}


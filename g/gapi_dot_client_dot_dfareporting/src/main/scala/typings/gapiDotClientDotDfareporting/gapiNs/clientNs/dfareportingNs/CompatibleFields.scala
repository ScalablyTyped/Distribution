package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleFields extends js.Object {
  /** Contains items that are compatible to be selected for a report of type "CROSS_DIMENSION_REACH". */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[CrossDimensionReachReportCompatibleFields] = js.undefined
  /** Contains items that are compatible to be selected for a report of type "FLOODLIGHT". */
  var floodlightReportCompatibleFields: js.UndefOr[FloodlightReportCompatibleFields] = js.undefined
  /** The kind of resource this is, in this case dfareporting#compatibleFields. */
  var kind: js.UndefOr[String] = js.undefined
  /** Contains items that are compatible to be selected for a report of type "PATH_TO_CONVERSION". */
  var pathToConversionReportCompatibleFields: js.UndefOr[PathToConversionReportCompatibleFields] = js.undefined
  /** Contains items that are compatible to be selected for a report of type "REACH". */
  var reachReportCompatibleFields: js.UndefOr[ReachReportCompatibleFields] = js.undefined
  /** Contains items that are compatible to be selected for a report of type "STANDARD". */
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


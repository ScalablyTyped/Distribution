package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a response to the queryCompatibleFields method.
  */
@js.native
trait Schema$CompatibleFields extends js.Object {
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;CROSS_DIMENSION_REACH&quot;.
    */
  var crossDimensionReachReportCompatibleFields: js.UndefOr[Schema$CrossDimensionReachReportCompatibleFields] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;FLOODLIGHT&quot;.
    */
  var floodlightReportCompatibleFields: js.UndefOr[Schema$FloodlightReportCompatibleFields] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#compatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;PATH_TO_CONVERSION&quot;.
    */
  var pathToConversionReportCompatibleFields: js.UndefOr[Schema$PathToConversionReportCompatibleFields] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;REACH&quot;.
    */
  var reachReportCompatibleFields: js.UndefOr[Schema$ReachReportCompatibleFields] = js.native
  /**
    * Contains items that are compatible to be selected for a report of type
    * &quot;STANDARD&quot;.
    */
  var reportCompatibleFields: js.UndefOr[Schema$ReportCompatibleFields] = js.native
}

object Schema$CompatibleFields {
  @scala.inline
  def apply(
    crossDimensionReachReportCompatibleFields: Schema$CrossDimensionReachReportCompatibleFields = null,
    floodlightReportCompatibleFields: Schema$FloodlightReportCompatibleFields = null,
    kind: String = null,
    pathToConversionReportCompatibleFields: Schema$PathToConversionReportCompatibleFields = null,
    reachReportCompatibleFields: Schema$ReachReportCompatibleFields = null,
    reportCompatibleFields: Schema$ReportCompatibleFields = null
  ): Schema$CompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (crossDimensionReachReportCompatibleFields != null) __obj.updateDynamic("crossDimensionReachReportCompatibleFields")(crossDimensionReachReportCompatibleFields.asInstanceOf[js.Any])
    if (floodlightReportCompatibleFields != null) __obj.updateDynamic("floodlightReportCompatibleFields")(floodlightReportCompatibleFields.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (pathToConversionReportCompatibleFields != null) __obj.updateDynamic("pathToConversionReportCompatibleFields")(pathToConversionReportCompatibleFields.asInstanceOf[js.Any])
    if (reachReportCompatibleFields != null) __obj.updateDynamic("reachReportCompatibleFields")(reachReportCompatibleFields.asInstanceOf[js.Any])
    if (reportCompatibleFields != null) __obj.updateDynamic("reportCompatibleFields")(reportCompatibleFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CompatibleFields]
  }
}


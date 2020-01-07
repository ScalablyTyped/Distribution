package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents fields that are compatible to be selected for a report of type
  * &quot;PATH_TO_CONVERSION&quot;.
  */
@js.native
trait Schema$PathToConversionReportCompatibleFields extends js.Object {
  /**
    * Conversion dimensions which are compatible to be selected in the
    * &quot;conversionDimensions&quot; section of the report.
    */
  var conversionDimensions: js.UndefOr[js.Array[Schema$Dimension]] = js.native
  /**
    * Custom floodlight variables which are compatible to be selected in the
    * &quot;customFloodlightVariables&quot; section of the report.
    */
  var customFloodlightVariables: js.UndefOr[js.Array[Schema$Dimension]] = js.native
  /**
    * The kind of resource this is, in this case
    * dfareporting#pathToConversionReportCompatibleFields.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metrics which are compatible to be selected in the
    * &quot;metricNames&quot; section of the report.
    */
  var metrics: js.UndefOr[js.Array[Schema$Metric]] = js.native
  /**
    * Per-interaction dimensions which are compatible to be selected in the
    * &quot;perInteractionDimensions&quot; section of the report.
    */
  var perInteractionDimensions: js.UndefOr[js.Array[Schema$Dimension]] = js.native
}

object Schema$PathToConversionReportCompatibleFields {
  @scala.inline
  def apply(
    conversionDimensions: js.Array[Schema$Dimension] = null,
    customFloodlightVariables: js.Array[Schema$Dimension] = null,
    kind: String = null,
    metrics: js.Array[Schema$Metric] = null,
    perInteractionDimensions: js.Array[Schema$Dimension] = null
  ): Schema$PathToConversionReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (conversionDimensions != null) __obj.updateDynamic("conversionDimensions")(conversionDimensions.asInstanceOf[js.Any])
    if (customFloodlightVariables != null) __obj.updateDynamic("customFloodlightVariables")(customFloodlightVariables.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (perInteractionDimensions != null) __obj.updateDynamic("perInteractionDimensions")(perInteractionDimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PathToConversionReportCompatibleFields]
  }
}


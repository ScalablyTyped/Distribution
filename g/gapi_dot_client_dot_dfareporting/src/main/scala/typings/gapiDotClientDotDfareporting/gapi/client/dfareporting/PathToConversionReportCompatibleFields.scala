package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathToConversionReportCompatibleFields extends js.Object {
  /** Conversion dimensions which are compatible to be selected in the "conversionDimensions" section of the report. */
  var conversionDimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** Custom floodlight variables which are compatible to be selected in the "customFloodlightVariables" section of the report. */
  var customFloodlightVariables: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** The kind of resource this is, in this case dfareporting#pathToConversionReportCompatibleFields. */
  var kind: js.UndefOr[String] = js.undefined
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  /** Per-interaction dimensions which are compatible to be selected in the "perInteractionDimensions" section of the report. */
  var perInteractionDimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
}

object PathToConversionReportCompatibleFields {
  @scala.inline
  def apply(
    conversionDimensions: js.Array[Dimension] = null,
    customFloodlightVariables: js.Array[Dimension] = null,
    kind: String = null,
    metrics: js.Array[Metric] = null,
    perInteractionDimensions: js.Array[Dimension] = null
  ): PathToConversionReportCompatibleFields = {
    val __obj = js.Dynamic.literal()
    if (conversionDimensions != null) __obj.updateDynamic("conversionDimensions")(conversionDimensions)
    if (customFloodlightVariables != null) __obj.updateDynamic("customFloodlightVariables")(customFloodlightVariables)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (perInteractionDimensions != null) __obj.updateDynamic("perInteractionDimensions")(perInteractionDimensions)
    __obj.asInstanceOf[PathToConversionReportCompatibleFields]
  }
}


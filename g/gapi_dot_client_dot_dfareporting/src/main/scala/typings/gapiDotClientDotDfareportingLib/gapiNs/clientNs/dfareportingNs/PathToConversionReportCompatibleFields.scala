package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathToConversionReportCompatibleFields extends js.Object {
  /** Conversion dimensions which are compatible to be selected in the "conversionDimensions" section of the report. */
  var conversionDimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** Custom floodlight variables which are compatible to be selected in the "customFloodlightVariables" section of the report. */
  var customFloodlightVariables: js.UndefOr[js.Array[Dimension]] = js.undefined
  /** The kind of resource this is, in this case dfareporting#pathToConversionReportCompatibleFields. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Metrics which are compatible to be selected in the "metricNames" section of the report. */
  var metrics: js.UndefOr[js.Array[Metric]] = js.undefined
  /** Per-interaction dimensions which are compatible to be selected in the "perInteractionDimensions" section of the report. */
  var perInteractionDimensions: js.UndefOr[js.Array[Dimension]] = js.undefined
}


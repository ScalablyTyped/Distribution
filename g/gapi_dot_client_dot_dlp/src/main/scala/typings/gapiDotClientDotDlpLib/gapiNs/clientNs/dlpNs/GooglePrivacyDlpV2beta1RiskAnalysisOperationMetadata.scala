package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RiskAnalysisOperationMetadata extends js.Object {
  /** The time which this request was started. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** Privacy metric to compute. */
  var requestedPrivacyMetric: js.UndefOr[GooglePrivacyDlpV2beta1PrivacyMetric] = js.undefined
  /** Input dataset to compute metrics over. */
  var requestedSourceTable: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.undefined
}


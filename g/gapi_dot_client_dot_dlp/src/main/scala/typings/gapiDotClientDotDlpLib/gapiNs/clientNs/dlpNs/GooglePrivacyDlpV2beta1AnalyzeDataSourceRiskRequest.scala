package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GooglePrivacyDlpV2beta1AnalyzeDataSourceRiskRequest extends js.Object {
  /** Privacy metric to compute. */
  var privacyMetric: js.UndefOr[GooglePrivacyDlpV2beta1PrivacyMetric] = js.undefined
  /** Input dataset to compute metrics over. */
  var sourceTable: js.UndefOr[GooglePrivacyDlpV2beta1BigQueryTable] = js.undefined
}


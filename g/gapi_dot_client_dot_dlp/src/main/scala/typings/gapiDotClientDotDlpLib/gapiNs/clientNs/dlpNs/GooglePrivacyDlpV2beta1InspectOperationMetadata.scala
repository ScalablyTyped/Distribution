package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GooglePrivacyDlpV2beta1InspectOperationMetadata extends js.Object {
  /** The time which this request was started. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  var infoTypeStats: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeStatistics]] = js.undefined
  /** Total size in bytes that were processed. */
  var processedBytes: js.UndefOr[java.lang.String] = js.undefined
  /** The inspect config used to create the Operation. */
  var requestInspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.undefined
  /** Optional location to store findings. */
  var requestOutputConfig: js.UndefOr[GooglePrivacyDlpV2beta1OutputStorageConfig] = js.undefined
  /** The storage config used to create the Operation. */
  var requestStorageConfig: js.UndefOr[GooglePrivacyDlpV2beta1StorageConfig] = js.undefined
  /** Estimate of the number of bytes to process. */
  var totalEstimatedBytes: js.UndefOr[java.lang.String] = js.undefined
}


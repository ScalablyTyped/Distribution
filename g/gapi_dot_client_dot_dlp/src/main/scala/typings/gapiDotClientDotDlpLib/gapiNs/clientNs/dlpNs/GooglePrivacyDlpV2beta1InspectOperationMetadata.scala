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

object GooglePrivacyDlpV2beta1InspectOperationMetadata {
  @scala.inline
  def apply(
    createTime: java.lang.String = null,
    infoTypeStats: js.Array[GooglePrivacyDlpV2beta1InfoTypeStatistics] = null,
    processedBytes: java.lang.String = null,
    requestInspectConfig: GooglePrivacyDlpV2beta1InspectConfig = null,
    requestOutputConfig: GooglePrivacyDlpV2beta1OutputStorageConfig = null,
    requestStorageConfig: GooglePrivacyDlpV2beta1StorageConfig = null,
    totalEstimatedBytes: java.lang.String = null
  ): GooglePrivacyDlpV2beta1InspectOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (infoTypeStats != null) __obj.updateDynamic("infoTypeStats")(infoTypeStats)
    if (processedBytes != null) __obj.updateDynamic("processedBytes")(processedBytes)
    if (requestInspectConfig != null) __obj.updateDynamic("requestInspectConfig")(requestInspectConfig)
    if (requestOutputConfig != null) __obj.updateDynamic("requestOutputConfig")(requestOutputConfig)
    if (requestStorageConfig != null) __obj.updateDynamic("requestStorageConfig")(requestStorageConfig)
    if (totalEstimatedBytes != null) __obj.updateDynamic("totalEstimatedBytes")(totalEstimatedBytes)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectOperationMetadata]
  }
}


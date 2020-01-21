package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InspectOperationMetadata extends js.Object {
  /** The time which this request was started. */
  var createTime: js.UndefOr[String] = js.undefined
  var infoTypeStats: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeStatistics]] = js.undefined
  /** Total size in bytes that were processed. */
  var processedBytes: js.UndefOr[String] = js.undefined
  /** The inspect config used to create the Operation. */
  var requestInspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.undefined
  /** Optional location to store findings. */
  var requestOutputConfig: js.UndefOr[GooglePrivacyDlpV2beta1OutputStorageConfig] = js.undefined
  /** The storage config used to create the Operation. */
  var requestStorageConfig: js.UndefOr[GooglePrivacyDlpV2beta1StorageConfig] = js.undefined
  /** Estimate of the number of bytes to process. */
  var totalEstimatedBytes: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1InspectOperationMetadata {
  @scala.inline
  def apply(
    createTime: String = null,
    infoTypeStats: js.Array[GooglePrivacyDlpV2beta1InfoTypeStatistics] = null,
    processedBytes: String = null,
    requestInspectConfig: GooglePrivacyDlpV2beta1InspectConfig = null,
    requestOutputConfig: GooglePrivacyDlpV2beta1OutputStorageConfig = null,
    requestStorageConfig: GooglePrivacyDlpV2beta1StorageConfig = null,
    totalEstimatedBytes: String = null
  ): GooglePrivacyDlpV2beta1InspectOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (infoTypeStats != null) __obj.updateDynamic("infoTypeStats")(infoTypeStats.asInstanceOf[js.Any])
    if (processedBytes != null) __obj.updateDynamic("processedBytes")(processedBytes.asInstanceOf[js.Any])
    if (requestInspectConfig != null) __obj.updateDynamic("requestInspectConfig")(requestInspectConfig.asInstanceOf[js.Any])
    if (requestOutputConfig != null) __obj.updateDynamic("requestOutputConfig")(requestOutputConfig.asInstanceOf[js.Any])
    if (requestStorageConfig != null) __obj.updateDynamic("requestStorageConfig")(requestStorageConfig.asInstanceOf[js.Any])
    if (totalEstimatedBytes != null) __obj.updateDynamic("totalEstimatedBytes")(totalEstimatedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectOperationMetadata]
  }
}


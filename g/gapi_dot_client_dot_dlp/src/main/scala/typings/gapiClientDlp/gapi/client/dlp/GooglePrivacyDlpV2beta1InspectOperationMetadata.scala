package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InspectOperationMetadata extends js.Object {
  /** The time which this request was started. */
  var createTime: js.UndefOr[String] = js.native
  var infoTypeStats: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeStatistics]] = js.native
  /** Total size in bytes that were processed. */
  var processedBytes: js.UndefOr[String] = js.native
  /** The inspect config used to create the Operation. */
  var requestInspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.native
  /** Optional location to store findings. */
  var requestOutputConfig: js.UndefOr[GooglePrivacyDlpV2beta1OutputStorageConfig] = js.native
  /** The storage config used to create the Operation. */
  var requestStorageConfig: js.UndefOr[GooglePrivacyDlpV2beta1StorageConfig] = js.native
  /** Estimate of the number of bytes to process. */
  var totalEstimatedBytes: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1InspectOperationMetadata {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InspectOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectOperationMetadata]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InspectOperationMetadataOps[Self <: GooglePrivacyDlpV2beta1InspectOperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setInfoTypeStatsVarargs(value: GooglePrivacyDlpV2beta1InfoTypeStatistics*): Self = this.set("infoTypeStats", js.Array(value :_*))
    @scala.inline
    def setInfoTypeStats(value: js.Array[GooglePrivacyDlpV2beta1InfoTypeStatistics]): Self = this.set("infoTypeStats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoTypeStats: Self = this.set("infoTypeStats", js.undefined)
    @scala.inline
    def setProcessedBytes(value: String): Self = this.set("processedBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessedBytes: Self = this.set("processedBytes", js.undefined)
    @scala.inline
    def setRequestInspectConfig(value: GooglePrivacyDlpV2beta1InspectConfig): Self = this.set("requestInspectConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestInspectConfig: Self = this.set("requestInspectConfig", js.undefined)
    @scala.inline
    def setRequestOutputConfig(value: GooglePrivacyDlpV2beta1OutputStorageConfig): Self = this.set("requestOutputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOutputConfig: Self = this.set("requestOutputConfig", js.undefined)
    @scala.inline
    def setRequestStorageConfig(value: GooglePrivacyDlpV2beta1StorageConfig): Self = this.set("requestStorageConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestStorageConfig: Self = this.set("requestStorageConfig", js.undefined)
    @scala.inline
    def setTotalEstimatedBytes(value: String): Self = this.set("totalEstimatedBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalEstimatedBytes: Self = this.set("totalEstimatedBytes", js.undefined)
  }
  
}


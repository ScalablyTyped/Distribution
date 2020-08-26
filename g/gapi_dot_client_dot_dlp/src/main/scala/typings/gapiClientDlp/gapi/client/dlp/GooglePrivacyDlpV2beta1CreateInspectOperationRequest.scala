package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1CreateInspectOperationRequest extends js.Object {
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.native
  /** Additional configuration settings for long running operations. */
  var operationConfig: js.UndefOr[GooglePrivacyDlpV2beta1OperationConfig] = js.native
  /** Optional location to store findings. */
  var outputConfig: js.UndefOr[GooglePrivacyDlpV2beta1OutputStorageConfig] = js.native
  /** Specification of the data set to process. */
  var storageConfig: js.UndefOr[GooglePrivacyDlpV2beta1StorageConfig] = js.native
}

object GooglePrivacyDlpV2beta1CreateInspectOperationRequest {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1CreateInspectOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CreateInspectOperationRequest]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1CreateInspectOperationRequestOps[Self <: GooglePrivacyDlpV2beta1CreateInspectOperationRequest] (val x: Self) extends AnyVal {
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
    def setInspectConfig(value: GooglePrivacyDlpV2beta1InspectConfig): Self = this.set("inspectConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInspectConfig: Self = this.set("inspectConfig", js.undefined)
    @scala.inline
    def setOperationConfig(value: GooglePrivacyDlpV2beta1OperationConfig): Self = this.set("operationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationConfig: Self = this.set("operationConfig", js.undefined)
    @scala.inline
    def setOutputConfig(value: GooglePrivacyDlpV2beta1OutputStorageConfig): Self = this.set("outputConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputConfig: Self = this.set("outputConfig", js.undefined)
    @scala.inline
    def setStorageConfig(value: GooglePrivacyDlpV2beta1StorageConfig): Self = this.set("storageConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageConfig: Self = this.set("storageConfig", js.undefined)
  }
  
}


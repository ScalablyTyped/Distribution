package typings.gapiDotClientDotDlp.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CreateInspectOperationRequest extends js.Object {
  /** Configuration for the inspector. */
  var inspectConfig: js.UndefOr[GooglePrivacyDlpV2beta1InspectConfig] = js.undefined
  /** Additional configuration settings for long running operations. */
  var operationConfig: js.UndefOr[GooglePrivacyDlpV2beta1OperationConfig] = js.undefined
  /** Optional location to store findings. */
  var outputConfig: js.UndefOr[GooglePrivacyDlpV2beta1OutputStorageConfig] = js.undefined
  /** Specification of the data set to process. */
  var storageConfig: js.UndefOr[GooglePrivacyDlpV2beta1StorageConfig] = js.undefined
}

object GooglePrivacyDlpV2beta1CreateInspectOperationRequest {
  @scala.inline
  def apply(
    inspectConfig: GooglePrivacyDlpV2beta1InspectConfig = null,
    operationConfig: GooglePrivacyDlpV2beta1OperationConfig = null,
    outputConfig: GooglePrivacyDlpV2beta1OutputStorageConfig = null,
    storageConfig: GooglePrivacyDlpV2beta1StorageConfig = null
  ): GooglePrivacyDlpV2beta1CreateInspectOperationRequest = {
    val __obj = js.Dynamic.literal()
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig)
    if (operationConfig != null) __obj.updateDynamic("operationConfig")(operationConfig)
    if (outputConfig != null) __obj.updateDynamic("outputConfig")(outputConfig)
    if (storageConfig != null) __obj.updateDynamic("storageConfig")(storageConfig)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CreateInspectOperationRequest]
  }
}


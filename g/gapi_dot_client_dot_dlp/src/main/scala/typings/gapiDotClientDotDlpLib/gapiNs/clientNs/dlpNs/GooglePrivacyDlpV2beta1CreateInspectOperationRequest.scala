package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

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


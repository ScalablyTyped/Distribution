package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GooglePrivacyDlpV2beta1TransformationSummary extends js.Object {
  /** Set if the transformation was limited to a specific FieldId. */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
  /**
               * The field transformation that was applied. This list will contain
               * multiple only in the case of errors.
               */
  var fieldTransformations: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldTransformation]] = js.undefined
  /** Set if the transformation was limited to a specific info_type. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.undefined
  /** The specific suppression option these stats apply to. */
  var recordSuppress: js.UndefOr[GooglePrivacyDlpV2beta1RecordSuppression] = js.undefined
  var results: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1SummaryResult]] = js.undefined
  /** The specific transformation these stats apply to. */
  var transformation: js.UndefOr[GooglePrivacyDlpV2beta1PrimitiveTransformation] = js.undefined
}


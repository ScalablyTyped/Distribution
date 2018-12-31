package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1RecordTransformations extends js.Object {
  /** Transform the record by applying various field transformations. */
  var fieldTransformations: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1FieldTransformation]] = js.undefined
  /**
    * Configuration defining which records get suppressed entirely. Records that
    * match any suppression rule are omitted from the output [optional].
    */
  var recordSuppressions: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1RecordSuppression]] = js.undefined
}


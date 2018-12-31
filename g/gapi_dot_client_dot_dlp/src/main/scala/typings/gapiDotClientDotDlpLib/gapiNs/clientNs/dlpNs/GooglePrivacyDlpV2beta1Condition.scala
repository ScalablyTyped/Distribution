package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Condition extends js.Object {
  /** Field within the record this condition is evaluated against. [required] */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
  /** Operator used to compare the field or info type to the value. [required] */
  var operator: js.UndefOr[java.lang.String] = js.undefined
  /** Value to compare against. [Required, except for `EXISTS` tests.] */
  var value: js.UndefOr[GooglePrivacyDlpV2beta1Value] = js.undefined
}


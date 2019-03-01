package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1EntityId extends js.Object {
  /** Composite key indicating which field contains the entity identifier. */
  var field: js.UndefOr[GooglePrivacyDlpV2beta1FieldId] = js.undefined
}

object GooglePrivacyDlpV2beta1EntityId {
  @scala.inline
  def apply(field: GooglePrivacyDlpV2beta1FieldId = null): GooglePrivacyDlpV2beta1EntityId = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1EntityId]
  }
}


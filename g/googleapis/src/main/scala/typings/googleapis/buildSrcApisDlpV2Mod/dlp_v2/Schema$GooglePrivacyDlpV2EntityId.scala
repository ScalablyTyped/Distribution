package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entity in a dataset is a field or set of fields that correspond to a
  * single person. For example, in medical records the `EntityId` might be a
  * patient identifier, or for financial records it might be an account
  * identifier. This message is used when generalizations or analysis must take
  * into account that multiple rows correspond to the same entity.
  */
@js.native
trait Schema$GooglePrivacyDlpV2EntityId extends js.Object {
  /**
    * Composite key indicating which field contains the entity identifier.
    */
  var field: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
}

object Schema$GooglePrivacyDlpV2EntityId {
  @scala.inline
  def apply(field: Schema$GooglePrivacyDlpV2FieldId = null): Schema$GooglePrivacyDlpV2EntityId = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2EntityId]
  }
}


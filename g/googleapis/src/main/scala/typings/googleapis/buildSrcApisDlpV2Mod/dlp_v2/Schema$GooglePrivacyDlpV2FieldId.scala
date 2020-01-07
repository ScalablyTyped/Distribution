package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * General identifier of a data field in a storage service.
  */
@js.native
trait Schema$GooglePrivacyDlpV2FieldId extends js.Object {
  /**
    * Name describing the field.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2FieldId {
  @scala.inline
  def apply(name: String = null): Schema$GooglePrivacyDlpV2FieldId = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2FieldId]
  }
}


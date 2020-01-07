package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A quasi-identifier column has a custom_tag, used to know which column in
  * the data corresponds to which column in the statistical model.
  */
@js.native
trait Schema$GooglePrivacyDlpV2QuasiIdentifierField extends js.Object {
  var customTag: js.UndefOr[String] = js.native
  var field: js.UndefOr[Schema$GooglePrivacyDlpV2FieldId] = js.native
}

object Schema$GooglePrivacyDlpV2QuasiIdentifierField {
  @scala.inline
  def apply(customTag: String = null, field: Schema$GooglePrivacyDlpV2FieldId = null): Schema$GooglePrivacyDlpV2QuasiIdentifierField = {
    val __obj = js.Dynamic.literal()
    if (customTag != null) __obj.updateDynamic("customTag")(customTag.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2QuasiIdentifierField]
  }
}


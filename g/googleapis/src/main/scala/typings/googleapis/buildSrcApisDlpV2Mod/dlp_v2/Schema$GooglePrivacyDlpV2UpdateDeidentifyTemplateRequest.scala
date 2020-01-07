package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateDeidentifyTemplate.
  */
@js.native
trait Schema$GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest extends js.Object {
  /**
    * New DeidentifyTemplate value.
    */
  var deidentifyTemplate: js.UndefOr[Schema$GooglePrivacyDlpV2DeidentifyTemplate] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest {
  @scala.inline
  def apply(deidentifyTemplate: Schema$GooglePrivacyDlpV2DeidentifyTemplate = null, updateMask: String = null): Schema$GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (deidentifyTemplate != null) __obj.updateDynamic("deidentifyTemplate")(deidentifyTemplate.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2UpdateDeidentifyTemplateRequest]
  }
}


package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateDeidentifyTemplate.
  */
@js.native
trait Schema$GooglePrivacyDlpV2CreateDeidentifyTemplateRequest extends js.Object {
  /**
    * The DeidentifyTemplate to create.
    */
  var deidentifyTemplate: js.UndefOr[Schema$GooglePrivacyDlpV2DeidentifyTemplate] = js.native
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var templateId: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2CreateDeidentifyTemplateRequest {
  @scala.inline
  def apply(deidentifyTemplate: Schema$GooglePrivacyDlpV2DeidentifyTemplate = null, templateId: String = null): Schema$GooglePrivacyDlpV2CreateDeidentifyTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (deidentifyTemplate != null) __obj.updateDynamic("deidentifyTemplate")(deidentifyTemplate.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2CreateDeidentifyTemplateRequest]
  }
}


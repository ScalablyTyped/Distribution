package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreateInspectTemplate.
  */
@js.native
trait Schema$GooglePrivacyDlpV2CreateInspectTemplateRequest extends js.Object {
  /**
    * The InspectTemplate to create.
    */
  var inspectTemplate: js.UndefOr[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  /**
    * The template id can contain uppercase and lowercase letters, numbers, and
    * hyphens; that is, it must match the regular expression: `[a-zA-Z\\d-_]+`.
    * The maximum length is 100 characters. Can be empty to allow the system to
    * generate one.
    */
  var templateId: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2CreateInspectTemplateRequest {
  @scala.inline
  def apply(inspectTemplate: Schema$GooglePrivacyDlpV2InspectTemplate = null, templateId: String = null): Schema$GooglePrivacyDlpV2CreateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (inspectTemplate != null) __obj.updateDynamic("inspectTemplate")(inspectTemplate.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2CreateInspectTemplateRequest]
  }
}


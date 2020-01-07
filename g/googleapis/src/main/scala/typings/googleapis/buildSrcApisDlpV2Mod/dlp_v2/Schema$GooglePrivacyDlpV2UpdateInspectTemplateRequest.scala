package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateInspectTemplate.
  */
@js.native
trait Schema$GooglePrivacyDlpV2UpdateInspectTemplateRequest extends js.Object {
  /**
    * New InspectTemplate value.
    */
  var inspectTemplate: js.UndefOr[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2UpdateInspectTemplateRequest {
  @scala.inline
  def apply(inspectTemplate: Schema$GooglePrivacyDlpV2InspectTemplate = null, updateMask: String = null): Schema$GooglePrivacyDlpV2UpdateInspectTemplateRequest = {
    val __obj = js.Dynamic.literal()
    if (inspectTemplate != null) __obj.updateDynamic("inspectTemplate")(inspectTemplate.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2UpdateInspectTemplateRequest]
  }
}


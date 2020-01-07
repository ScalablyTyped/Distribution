package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to search for potentially sensitive info in a ContentItem.
  */
@js.native
trait Schema$GooglePrivacyDlpV2InspectContentRequest extends js.Object {
  /**
    * Configuration for the inspector. What specified here will override the
    * template referenced by the inspect_template_name argument.
    */
  var inspectConfig: js.UndefOr[Schema$GooglePrivacyDlpV2InspectConfig] = js.native
  /**
    * Optional template to use. Any configuration directly specified in
    * inspect_config will override those set in the template. Singular fields
    * that are set in this request will replace their corresponding fields in
    * the template. Repeated fields are appended. Singular sub-messages and
    * groups are recursively merged.
    */
  var inspectTemplateName: js.UndefOr[String] = js.native
  /**
    * The item to inspect.
    */
  var item: js.UndefOr[Schema$GooglePrivacyDlpV2ContentItem] = js.native
}

object Schema$GooglePrivacyDlpV2InspectContentRequest {
  @scala.inline
  def apply(
    inspectConfig: Schema$GooglePrivacyDlpV2InspectConfig = null,
    inspectTemplateName: String = null,
    item: Schema$GooglePrivacyDlpV2ContentItem = null
  ): Schema$GooglePrivacyDlpV2InspectContentRequest = {
    val __obj = js.Dynamic.literal()
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig.asInstanceOf[js.Any])
    if (inspectTemplateName != null) __obj.updateDynamic("inspectTemplateName")(inspectTemplateName.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InspectContentRequest]
  }
}


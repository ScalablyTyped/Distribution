package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GooglePrivacyDlpV2InspectJobConfig extends js.Object {
  /**
    * Actions to execute at the completion of the job. Are executed in the
    * order provided.
    */
  var actions: js.UndefOr[js.Array[Schema$GooglePrivacyDlpV2Action]] = js.native
  /**
    * How and what to scan for.
    */
  var inspectConfig: js.UndefOr[Schema$GooglePrivacyDlpV2InspectConfig] = js.native
  /**
    * If provided, will be used as the default for all values in InspectConfig.
    * `inspect_config` will be merged into the values persisted as part of the
    * template.
    */
  var inspectTemplateName: js.UndefOr[String] = js.native
  /**
    * The data to scan.
    */
  var storageConfig: js.UndefOr[Schema$GooglePrivacyDlpV2StorageConfig] = js.native
}

object Schema$GooglePrivacyDlpV2InspectJobConfig {
  @scala.inline
  def apply(
    actions: js.Array[Schema$GooglePrivacyDlpV2Action] = null,
    inspectConfig: Schema$GooglePrivacyDlpV2InspectConfig = null,
    inspectTemplateName: String = null,
    storageConfig: Schema$GooglePrivacyDlpV2StorageConfig = null
  ): Schema$GooglePrivacyDlpV2InspectJobConfig = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (inspectConfig != null) __obj.updateDynamic("inspectConfig")(inspectConfig.asInstanceOf[js.Any])
    if (inspectTemplateName != null) __obj.updateDynamic("inspectTemplateName")(inspectTemplateName.asInstanceOf[js.Any])
    if (storageConfig != null) __obj.updateDynamic("storageConfig")(storageConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InspectJobConfig]
  }
}


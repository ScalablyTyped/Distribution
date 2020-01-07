package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GooglePrivacyDlpV2RequestedOptions extends js.Object {
  var jobConfig: js.UndefOr[Schema$GooglePrivacyDlpV2InspectJobConfig] = js.native
  /**
    * If run with an InspectTemplate, a snapshot of its state at the time of
    * this run.
    */
  var snapshotInspectTemplate: js.UndefOr[Schema$GooglePrivacyDlpV2InspectTemplate] = js.native
}

object Schema$GooglePrivacyDlpV2RequestedOptions {
  @scala.inline
  def apply(
    jobConfig: Schema$GooglePrivacyDlpV2InspectJobConfig = null,
    snapshotInspectTemplate: Schema$GooglePrivacyDlpV2InspectTemplate = null
  ): Schema$GooglePrivacyDlpV2RequestedOptions = {
    val __obj = js.Dynamic.literal()
    if (jobConfig != null) __obj.updateDynamic("jobConfig")(jobConfig.asInstanceOf[js.Any])
    if (snapshotInspectTemplate != null) __obj.updateDynamic("snapshotInspectTemplate")(snapshotInspectTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2RequestedOptions]
  }
}


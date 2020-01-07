package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for UpdateJobTrigger.
  */
@js.native
trait Schema$GooglePrivacyDlpV2UpdateJobTriggerRequest extends js.Object {
  /**
    * New JobTrigger value.
    */
  var jobTrigger: js.UndefOr[Schema$GooglePrivacyDlpV2JobTrigger] = js.native
  /**
    * Mask to control which fields get updated.
    */
  var updateMask: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2UpdateJobTriggerRequest {
  @scala.inline
  def apply(jobTrigger: Schema$GooglePrivacyDlpV2JobTrigger = null, updateMask: String = null): Schema$GooglePrivacyDlpV2UpdateJobTriggerRequest = {
    val __obj = js.Dynamic.literal()
    if (jobTrigger != null) __obj.updateDynamic("jobTrigger")(jobTrigger.asInstanceOf[js.Any])
    if (updateMask != null) __obj.updateDynamic("updateMask")(updateMask.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2UpdateJobTriggerRequest]
  }
}


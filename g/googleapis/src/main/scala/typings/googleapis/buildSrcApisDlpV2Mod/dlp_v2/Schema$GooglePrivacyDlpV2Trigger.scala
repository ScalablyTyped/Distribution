package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What event needs to occur for a new job to be started.
  */
@js.native
trait Schema$GooglePrivacyDlpV2Trigger extends js.Object {
  /**
    * Create a job on a repeating basis based on the elapse of time.
    */
  var schedule: js.UndefOr[Schema$GooglePrivacyDlpV2Schedule] = js.native
}

object Schema$GooglePrivacyDlpV2Trigger {
  @scala.inline
  def apply(schedule: Schema$GooglePrivacyDlpV2Schedule = null): Schema$GooglePrivacyDlpV2Trigger = {
    val __obj = js.Dynamic.literal()
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Trigger]
  }
}


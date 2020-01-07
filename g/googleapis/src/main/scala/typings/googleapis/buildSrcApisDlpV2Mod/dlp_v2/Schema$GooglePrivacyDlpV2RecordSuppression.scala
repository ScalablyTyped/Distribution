package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration to suppress records whose suppression conditions evaluate to
  * true.
  */
@js.native
trait Schema$GooglePrivacyDlpV2RecordSuppression extends js.Object {
  /**
    * A condition that when it evaluates to true will result in the record
    * being evaluated to be suppressed from the transformed content.
    */
  var condition: js.UndefOr[Schema$GooglePrivacyDlpV2RecordCondition] = js.native
}

object Schema$GooglePrivacyDlpV2RecordSuppression {
  @scala.inline
  def apply(condition: Schema$GooglePrivacyDlpV2RecordCondition = null): Schema$GooglePrivacyDlpV2RecordSuppression = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2RecordSuppression]
  }
}


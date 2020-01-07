package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A value of a field, including its frequency.
  */
@js.native
trait Schema$GooglePrivacyDlpV2ValueFrequency extends js.Object {
  /**
    * How many times the value is contained in the field.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * A value contained in the field in question.
    */
  var value: js.UndefOr[Schema$GooglePrivacyDlpV2Value] = js.native
}

object Schema$GooglePrivacyDlpV2ValueFrequency {
  @scala.inline
  def apply(count: String = null, value: Schema$GooglePrivacyDlpV2Value = null): Schema$GooglePrivacyDlpV2ValueFrequency = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2ValueFrequency]
  }
}


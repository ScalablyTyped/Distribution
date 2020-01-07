package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$GooglePrivacyDlpV2TimeZone extends js.Object {
  /**
    * Set only if the offset can be determined. Positive for time ahead of UTC.
    * E.g. For &quot;UTC-9&quot;, this value is -540.
    */
  var offsetMinutes: js.UndefOr[Double] = js.native
}

object Schema$GooglePrivacyDlpV2TimeZone {
  @scala.inline
  def apply(offsetMinutes: Int | Double = null): Schema$GooglePrivacyDlpV2TimeZone = {
    val __obj = js.Dynamic.literal()
    if (offsetMinutes != null) __obj.updateDynamic("offsetMinutes")(offsetMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2TimeZone]
  }
}


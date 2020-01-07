package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * For use with `Date`, `Timestamp`, and `TimeOfDay`, extract or preserve a
  * portion of the value.
  */
@js.native
trait Schema$GooglePrivacyDlpV2TimePartConfig extends js.Object {
  var partToExtract: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2TimePartConfig {
  @scala.inline
  def apply(partToExtract: String = null): Schema$GooglePrivacyDlpV2TimePartConfig = {
    val __obj = js.Dynamic.literal()
    if (partToExtract != null) __obj.updateDynamic("partToExtract")(partToExtract.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2TimePartConfig]
  }
}


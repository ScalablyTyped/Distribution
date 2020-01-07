package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Statistics regarding a specific InfoType.
  */
@js.native
trait Schema$GooglePrivacyDlpV2InfoTypeStats extends js.Object {
  /**
    * Number of findings for this infoType.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * The type of finding this stat is for.
    */
  var infoType: js.UndefOr[Schema$GooglePrivacyDlpV2InfoType] = js.native
}

object Schema$GooglePrivacyDlpV2InfoTypeStats {
  @scala.inline
  def apply(count: String = null, infoType: Schema$GooglePrivacyDlpV2InfoType = null): Schema$GooglePrivacyDlpV2InfoTypeStats = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2InfoTypeStats]
  }
}


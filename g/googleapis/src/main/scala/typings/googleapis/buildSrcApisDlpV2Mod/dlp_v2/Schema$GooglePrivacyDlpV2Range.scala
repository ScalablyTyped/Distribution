package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic half-open interval [start, end)
  */
@js.native
trait Schema$GooglePrivacyDlpV2Range extends js.Object {
  /**
    * Index of the last character of the range (exclusive).
    */
  var end: js.UndefOr[String] = js.native
  /**
    * Index of the first character of the range (inclusive).
    */
  var start: js.UndefOr[String] = js.native
}

object Schema$GooglePrivacyDlpV2Range {
  @scala.inline
  def apply(end: String = null, start: String = null): Schema$GooglePrivacyDlpV2Range = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2Range]
  }
}


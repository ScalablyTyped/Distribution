package typings.googleapis.buildSrcApisDlpV2Mod.dlp_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for infoType-dependent details parsed from quote.
  */
@js.native
trait Schema$GooglePrivacyDlpV2QuoteInfo extends js.Object {
  /**
    * The date time indicated by the quote.
    */
  var dateTime: js.UndefOr[Schema$GooglePrivacyDlpV2DateTime] = js.native
}

object Schema$GooglePrivacyDlpV2QuoteInfo {
  @scala.inline
  def apply(dateTime: Schema$GooglePrivacyDlpV2DateTime = null): Schema$GooglePrivacyDlpV2QuoteInfo = {
    val __obj = js.Dynamic.literal()
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GooglePrivacyDlpV2QuoteInfo]
  }
}


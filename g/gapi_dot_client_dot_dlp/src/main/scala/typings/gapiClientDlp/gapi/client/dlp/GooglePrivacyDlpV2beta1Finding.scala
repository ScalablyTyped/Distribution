package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1Finding extends js.Object {
  /** Timestamp when finding was detected. */
  var createTime: js.UndefOr[String] = js.undefined
  /** The specific type of info the string might be. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.undefined
  /** Estimate of how likely it is that the info_type is correct. */
  var likelihood: js.UndefOr[String] = js.undefined
  /** Location of the info found. */
  var location: js.UndefOr[GooglePrivacyDlpV2beta1Location] = js.undefined
  /** The specific string that may be potentially sensitive info. */
  var quote: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1Finding {
  @scala.inline
  def apply(
    createTime: String = null,
    infoType: GooglePrivacyDlpV2beta1InfoType = null,
    likelihood: String = null,
    location: GooglePrivacyDlpV2beta1Location = null,
    quote: String = null
  ): GooglePrivacyDlpV2beta1Finding = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    if (likelihood != null) __obj.updateDynamic("likelihood")(likelihood.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1Finding]
  }
}


package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InfoTypeStatistics extends js.Object {
  /** Number of findings for this info type. */
  var count: js.UndefOr[String] = js.undefined
  /** The type of finding this stat is for. */
  var infoType: js.UndefOr[GooglePrivacyDlpV2beta1InfoType] = js.undefined
}

object GooglePrivacyDlpV2beta1InfoTypeStatistics {
  @scala.inline
  def apply(count: String = null, infoType: GooglePrivacyDlpV2beta1InfoType = null): GooglePrivacyDlpV2beta1InfoTypeStatistics = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (infoType != null) __obj.updateDynamic("infoType")(infoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoTypeStatistics]
  }
}


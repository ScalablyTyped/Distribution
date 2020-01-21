package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1TimePartConfig extends js.Object {
  var partToExtract: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1TimePartConfig {
  @scala.inline
  def apply(partToExtract: String = null): GooglePrivacyDlpV2beta1TimePartConfig = {
    val __obj = js.Dynamic.literal()
    if (partToExtract != null) __obj.updateDynamic("partToExtract")(partToExtract.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1TimePartConfig]
  }
}


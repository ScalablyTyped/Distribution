package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InfoType extends js.Object {
  /** Name of the information type. */
  var name: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1InfoType {
  @scala.inline
  def apply(name: String = null): GooglePrivacyDlpV2beta1InfoType = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoType]
  }
}


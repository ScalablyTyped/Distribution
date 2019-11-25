package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1CategoryDescription extends js.Object {
  /** Human readable form of the category name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** Internal name of the category. */
  var name: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1CategoryDescription {
  @scala.inline
  def apply(displayName: String = null, name: String = null): GooglePrivacyDlpV2beta1CategoryDescription = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1CategoryDescription]
  }
}


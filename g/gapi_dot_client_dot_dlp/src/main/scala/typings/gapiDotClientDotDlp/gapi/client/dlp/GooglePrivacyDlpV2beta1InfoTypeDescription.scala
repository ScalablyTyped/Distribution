package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1InfoTypeDescription extends js.Object {
  /** List of categories this infoType belongs to. */
  var categories: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1CategoryDescription]] = js.undefined
  /** Human readable form of the infoType name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** Internal name of the infoType. */
  var name: js.UndefOr[String] = js.undefined
}

object GooglePrivacyDlpV2beta1InfoTypeDescription {
  @scala.inline
  def apply(
    categories: js.Array[GooglePrivacyDlpV2beta1CategoryDescription] = null,
    displayName: String = null,
    name: String = null
  ): GooglePrivacyDlpV2beta1InfoTypeDescription = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoTypeDescription]
  }
}


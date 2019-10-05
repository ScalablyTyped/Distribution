package typings.gapiDotClientDotDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1ListRootCategoriesResponse extends js.Object {
  /** List of all into type categories supported by the API. */
  var categories: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1CategoryDescription]] = js.undefined
}

object GooglePrivacyDlpV2beta1ListRootCategoriesResponse {
  @scala.inline
  def apply(categories: js.Array[GooglePrivacyDlpV2beta1CategoryDescription] = null): GooglePrivacyDlpV2beta1ListRootCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]
  }
}


package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1ListRootCategoriesResponse extends js.Object {
  /** List of all into type categories supported by the API. */
  var categories: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1CategoryDescription]] = js.native
}

object GooglePrivacyDlpV2beta1ListRootCategoriesResponse {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1ListRootCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1ListRootCategoriesResponse]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1ListRootCategoriesResponseOps[Self <: GooglePrivacyDlpV2beta1ListRootCategoriesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategoriesVarargs(value: GooglePrivacyDlpV2beta1CategoryDescription*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[GooglePrivacyDlpV2beta1CategoryDescription]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
  }
  
}


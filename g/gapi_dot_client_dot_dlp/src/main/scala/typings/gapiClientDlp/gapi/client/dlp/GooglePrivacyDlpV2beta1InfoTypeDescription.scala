package typings.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InfoTypeDescription extends js.Object {
  /** List of categories this infoType belongs to. */
  var categories: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1CategoryDescription]] = js.native
  /** Human readable form of the infoType name. */
  var displayName: js.UndefOr[String] = js.native
  /** Internal name of the infoType. */
  var name: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1InfoTypeDescription {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InfoTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoTypeDescription]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InfoTypeDescriptionOps[Self <: GooglePrivacyDlpV2beta1InfoTypeDescription] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}


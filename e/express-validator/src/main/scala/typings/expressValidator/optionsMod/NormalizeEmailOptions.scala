package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NormalizeEmailOptions extends js.Object {
  var all_lowercase: js.UndefOr[Boolean] = js.native
  var gmail_convert_googlemaildotcom: js.UndefOr[Boolean] = js.native
  var gmail_lowercase: js.UndefOr[Boolean] = js.native
  var gmail_remove_dots: js.UndefOr[Boolean] = js.native
  var gmail_remove_subaddress: js.UndefOr[Boolean] = js.native
  var icloud_lowercase: js.UndefOr[Boolean] = js.native
  var icloud_remove_subaddress: js.UndefOr[Boolean] = js.native
  var outlookdotcom_lowercase: js.UndefOr[Boolean] = js.native
  var outlookdotcom_remove_subaddress: js.UndefOr[Boolean] = js.native
  var yahoo_lowercase: js.UndefOr[Boolean] = js.native
  var yahoo_remove_subaddress: js.UndefOr[Boolean] = js.native
}

object NormalizeEmailOptions {
  @scala.inline
  def apply(): NormalizeEmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NormalizeEmailOptions]
  }
  @scala.inline
  implicit class NormalizeEmailOptionsOps[Self <: NormalizeEmailOptions] (val x: Self) extends AnyVal {
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
    def setAll_lowercase(value: Boolean): Self = this.set("all_lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAll_lowercase: Self = this.set("all_lowercase", js.undefined)
    @scala.inline
    def setGmail_convert_googlemaildotcom(value: Boolean): Self = this.set("gmail_convert_googlemaildotcom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmail_convert_googlemaildotcom: Self = this.set("gmail_convert_googlemaildotcom", js.undefined)
    @scala.inline
    def setGmail_lowercase(value: Boolean): Self = this.set("gmail_lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmail_lowercase: Self = this.set("gmail_lowercase", js.undefined)
    @scala.inline
    def setGmail_remove_dots(value: Boolean): Self = this.set("gmail_remove_dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmail_remove_dots: Self = this.set("gmail_remove_dots", js.undefined)
    @scala.inline
    def setGmail_remove_subaddress(value: Boolean): Self = this.set("gmail_remove_subaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmail_remove_subaddress: Self = this.set("gmail_remove_subaddress", js.undefined)
    @scala.inline
    def setIcloud_lowercase(value: Boolean): Self = this.set("icloud_lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcloud_lowercase: Self = this.set("icloud_lowercase", js.undefined)
    @scala.inline
    def setIcloud_remove_subaddress(value: Boolean): Self = this.set("icloud_remove_subaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcloud_remove_subaddress: Self = this.set("icloud_remove_subaddress", js.undefined)
    @scala.inline
    def setOutlookdotcom_lowercase(value: Boolean): Self = this.set("outlookdotcom_lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlookdotcom_lowercase: Self = this.set("outlookdotcom_lowercase", js.undefined)
    @scala.inline
    def setOutlookdotcom_remove_subaddress(value: Boolean): Self = this.set("outlookdotcom_remove_subaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlookdotcom_remove_subaddress: Self = this.set("outlookdotcom_remove_subaddress", js.undefined)
    @scala.inline
    def setYahoo_lowercase(value: Boolean): Self = this.set("yahoo_lowercase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYahoo_lowercase: Self = this.set("yahoo_lowercase", js.undefined)
    @scala.inline
    def setYahoo_remove_subaddress(value: Boolean): Self = this.set("yahoo_remove_subaddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYahoo_remove_subaddress: Self = this.set("yahoo_remove_subaddress", js.undefined)
  }
  
}


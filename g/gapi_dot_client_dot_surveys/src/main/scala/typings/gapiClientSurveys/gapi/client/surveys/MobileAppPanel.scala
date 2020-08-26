package typings.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAppPanel extends js.Object {
  /**
    * Country code for the country of the users that the panel contains. Uses standard ISO 3166-1 2-character language codes. For instance, 'US' for the
    * United States, and 'GB' for the United Kingdom. Any survey created targeting this panel must also target the corresponding country.
    */
  var country: js.UndefOr[String] = js.native
  /** Whether or not the panel is accessible to all API users. */
  var isPublicPanel: js.UndefOr[Boolean] = js.native
  /**
    * Language code that the panel can target. For instance, 'en-US'. Uses standard BCP47 language codes. See specification. Any survey created targeting
    * this panel must also target the corresponding language.
    */
  var language: js.UndefOr[String] = js.native
  /** Unique panel ID string. This corresponds to the mobile_app_panel_id used in Survey Insert requests. */
  var mobileAppPanelId: js.UndefOr[String] = js.native
  /** Human readable name of the audience panel. */
  var name: js.UndefOr[String] = js.native
  /**
    * List of email addresses for users who can target members of this panel. Must contain at least the address of the user making the API call for panels
    * that are not public. This field will be empty for public panels.
    */
  var owners: js.UndefOr[js.Array[String]] = js.native
}

object MobileAppPanel {
  @scala.inline
  def apply(): MobileAppPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppPanel]
  }
  @scala.inline
  implicit class MobileAppPanelOps[Self <: MobileAppPanel] (val x: Self) extends AnyVal {
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setIsPublicPanel(value: Boolean): Self = this.set("isPublicPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPublicPanel: Self = this.set("isPublicPanel", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMobileAppPanelId(value: String): Self = this.set("mobileAppPanelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileAppPanelId: Self = this.set("mobileAppPanelId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwnersVarargs(value: String*): Self = this.set("owners", js.Array(value :_*))
    @scala.inline
    def setOwners(value: js.Array[String]): Self = this.set("owners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
  }
  
}


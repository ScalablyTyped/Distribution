package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileAppPanel extends js.Object {
  var country: js.UndefOr[String] = js.native
  var isPublicPanel: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var mobileAppPanelId: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
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


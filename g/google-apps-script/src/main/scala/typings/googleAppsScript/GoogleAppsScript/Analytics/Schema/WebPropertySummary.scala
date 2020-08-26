package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPropertySummary extends js.Object {
  var id: js.UndefOr[String] = js.native
  var internalWebPropertyId: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var level: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var profiles: js.UndefOr[js.Array[ProfileSummary]] = js.native
  var starred: js.UndefOr[Boolean] = js.native
  var websiteUrl: js.UndefOr[String] = js.native
}

object WebPropertySummary {
  @scala.inline
  def apply(): WebPropertySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebPropertySummary]
  }
  @scala.inline
  implicit class WebPropertySummaryOps[Self <: WebPropertySummary] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = this.set("internalWebPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalWebPropertyId: Self = this.set("internalWebPropertyId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProfilesVarargs(value: ProfileSummary*): Self = this.set("profiles", js.Array(value :_*))
    @scala.inline
    def setProfiles(value: js.Array[ProfileSummary]): Self = this.set("profiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfiles: Self = this.set("profiles", js.undefined)
    @scala.inline
    def setStarred(value: Boolean): Self = this.set("starred", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarred: Self = this.set("starred", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
  
}


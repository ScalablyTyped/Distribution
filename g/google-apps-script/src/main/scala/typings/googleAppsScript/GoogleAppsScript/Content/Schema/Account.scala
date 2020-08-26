package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Account extends js.Object {
  var adultContent: js.UndefOr[Boolean] = js.native
  var adwordsLinks: js.UndefOr[js.Array[AccountAdwordsLink]] = js.native
  var businessInformation: js.UndefOr[AccountBusinessInformation] = js.native
  var googleMyBusinessLink: js.UndefOr[AccountGoogleMyBusinessLink] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var reviewsUrl: js.UndefOr[String] = js.native
  var sellerId: js.UndefOr[String] = js.native
  var users: js.UndefOr[js.Array[AccountUser]] = js.native
  var websiteUrl: js.UndefOr[String] = js.native
  var youtubeChannelLinks: js.UndefOr[js.Array[AccountYouTubeChannelLink]] = js.native
}

object Account {
  @scala.inline
  def apply(): Account = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
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
    def setAdultContent(value: Boolean): Self = this.set("adultContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdultContent: Self = this.set("adultContent", js.undefined)
    @scala.inline
    def setAdwordsLinksVarargs(value: AccountAdwordsLink*): Self = this.set("adwordsLinks", js.Array(value :_*))
    @scala.inline
    def setAdwordsLinks(value: js.Array[AccountAdwordsLink]): Self = this.set("adwordsLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdwordsLinks: Self = this.set("adwordsLinks", js.undefined)
    @scala.inline
    def setBusinessInformation(value: AccountBusinessInformation): Self = this.set("businessInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessInformation: Self = this.set("businessInformation", js.undefined)
    @scala.inline
    def setGoogleMyBusinessLink(value: AccountGoogleMyBusinessLink): Self = this.set("googleMyBusinessLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoogleMyBusinessLink: Self = this.set("googleMyBusinessLink", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setReviewsUrl(value: String): Self = this.set("reviewsUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewsUrl: Self = this.set("reviewsUrl", js.undefined)
    @scala.inline
    def setSellerId(value: String): Self = this.set("sellerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSellerId: Self = this.set("sellerId", js.undefined)
    @scala.inline
    def setUsersVarargs(value: AccountUser*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[AccountUser]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
    @scala.inline
    def setYoutubeChannelLinksVarargs(value: AccountYouTubeChannelLink*): Self = this.set("youtubeChannelLinks", js.Array(value :_*))
    @scala.inline
    def setYoutubeChannelLinks(value: js.Array[AccountYouTubeChannelLink]): Self = this.set("youtubeChannelLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoutubeChannelLinks: Self = this.set("youtubeChannelLinks", js.undefined)
  }
  
}


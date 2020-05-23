package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var adultContent: js.UndefOr[Boolean] = js.undefined
  var adwordsLinks: js.UndefOr[js.Array[AccountAdwordsLink]] = js.undefined
  var businessInformation: js.UndefOr[AccountBusinessInformation] = js.undefined
  var googleMyBusinessLink: js.UndefOr[AccountGoogleMyBusinessLink] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var reviewsUrl: js.UndefOr[String] = js.undefined
  var sellerId: js.UndefOr[String] = js.undefined
  var users: js.UndefOr[js.Array[AccountUser]] = js.undefined
  var websiteUrl: js.UndefOr[String] = js.undefined
  var youtubeChannelLinks: js.UndefOr[js.Array[AccountYouTubeChannelLink]] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    adultContent: js.UndefOr[Boolean] = js.undefined,
    adwordsLinks: js.Array[AccountAdwordsLink] = null,
    businessInformation: AccountBusinessInformation = null,
    googleMyBusinessLink: AccountGoogleMyBusinessLink = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    reviewsUrl: String = null,
    sellerId: String = null,
    users: js.Array[AccountUser] = null,
    websiteUrl: String = null,
    youtubeChannelLinks: js.Array[AccountYouTubeChannelLink] = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adultContent)) __obj.updateDynamic("adultContent")(adultContent.get.asInstanceOf[js.Any])
    if (adwordsLinks != null) __obj.updateDynamic("adwordsLinks")(adwordsLinks.asInstanceOf[js.Any])
    if (businessInformation != null) __obj.updateDynamic("businessInformation")(businessInformation.asInstanceOf[js.Any])
    if (googleMyBusinessLink != null) __obj.updateDynamic("googleMyBusinessLink")(googleMyBusinessLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (reviewsUrl != null) __obj.updateDynamic("reviewsUrl")(reviewsUrl.asInstanceOf[js.Any])
    if (sellerId != null) __obj.updateDynamic("sellerId")(sellerId.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl.asInstanceOf[js.Any])
    if (youtubeChannelLinks != null) __obj.updateDynamic("youtubeChannelLinks")(youtubeChannelLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}


package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  var adultContent: js.UndefOr[scala.Boolean] = js.undefined
  var adwordsLinks: js.UndefOr[js.Array[AccountAdwordsLink]] = js.undefined
  var businessInformation: js.UndefOr[AccountBusinessInformation] = js.undefined
  var googleMyBusinessLink: js.UndefOr[AccountGoogleMyBusinessLink] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var reviewsUrl: js.UndefOr[java.lang.String] = js.undefined
  var sellerId: js.UndefOr[java.lang.String] = js.undefined
  var users: js.UndefOr[js.Array[AccountUser]] = js.undefined
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
  var youtubeChannelLinks: js.UndefOr[js.Array[AccountYouTubeChannelLink]] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    adultContent: js.UndefOr[scala.Boolean] = js.undefined,
    adwordsLinks: js.Array[AccountAdwordsLink] = null,
    businessInformation: AccountBusinessInformation = null,
    googleMyBusinessLink: AccountGoogleMyBusinessLink = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    reviewsUrl: java.lang.String = null,
    sellerId: java.lang.String = null,
    users: js.Array[AccountUser] = null,
    websiteUrl: java.lang.String = null,
    youtubeChannelLinks: js.Array[AccountYouTubeChannelLink] = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adultContent)) __obj.updateDynamic("adultContent")(adultContent)
    if (adwordsLinks != null) __obj.updateDynamic("adwordsLinks")(adwordsLinks)
    if (businessInformation != null) __obj.updateDynamic("businessInformation")(businessInformation)
    if (googleMyBusinessLink != null) __obj.updateDynamic("googleMyBusinessLink")(googleMyBusinessLink)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (reviewsUrl != null) __obj.updateDynamic("reviewsUrl")(reviewsUrl)
    if (sellerId != null) __obj.updateDynamic("sellerId")(sellerId)
    if (users != null) __obj.updateDynamic("users")(users)
    if (websiteUrl != null) __obj.updateDynamic("websiteUrl")(websiteUrl)
    if (youtubeChannelLinks != null) __obj.updateDynamic("youtubeChannelLinks")(youtubeChannelLinks)
    __obj.asInstanceOf[Account]
  }
}


package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /** Indicates whether the merchant sells adult content. */
  var adultContent: js.UndefOr[Boolean] = js.undefined
  /**
    * List of linked AdWords accounts that are active or pending approval. To create a new link request, add a new link with status active to the list. It
    * will remain in a pending state until approved or rejected either in the AdWords interface or through the  AdWords API. To delete an active link, or to
    * cancel a link request, remove it from the list.
    */
  var adwordsLinks: js.UndefOr[js.Array[AccountAdwordsLink]] = js.undefined
  /** Merchant Center account ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#account". */
  var kind: js.UndefOr[String] = js.undefined
  /** Display name for the account. */
  var name: js.UndefOr[String] = js.undefined
  /** URL for individual seller reviews, i.e., reviews for each child account. */
  var reviewsUrl: js.UndefOr[String] = js.undefined
  /** Client-specific, locally-unique, internal ID for the child account. */
  var sellerId: js.UndefOr[String] = js.undefined
  /** Users with access to the account. Every account (except for subaccounts) must have at least one admin user. */
  var users: js.UndefOr[js.Array[AccountUser]] = js.undefined
  /** The merchant's website. */
  var websiteUrl: js.UndefOr[String] = js.undefined
  /**
    * List of linked YouTube channels that are active or pending approval. To create a new link request, add a new link with status active to the list. It
    * will remain in a pending state until approved or rejected in the YT Creator Studio interface. To delete an active link, or to cancel a link request,
    * remove it from the list.
    */
  var youtubeChannelLinks: js.UndefOr[js.Array[AccountYouTubeChannelLink]] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    adultContent: js.UndefOr[Boolean] = js.undefined,
    adwordsLinks: js.Array[AccountAdwordsLink] = null,
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


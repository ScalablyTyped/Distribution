package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YouTubeNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityContentDetails extends js.Object {
  var bulletin: js.UndefOr[ActivityContentDetailsBulletin] = js.undefined
  var channelItem: js.UndefOr[ActivityContentDetailsChannelItem] = js.undefined
  var comment: js.UndefOr[ActivityContentDetailsComment] = js.undefined
  var favorite: js.UndefOr[ActivityContentDetailsFavorite] = js.undefined
  var like: js.UndefOr[ActivityContentDetailsLike] = js.undefined
  var playlistItem: js.UndefOr[ActivityContentDetailsPlaylistItem] = js.undefined
  var promotedItem: js.UndefOr[ActivityContentDetailsPromotedItem] = js.undefined
  var recommendation: js.UndefOr[ActivityContentDetailsRecommendation] = js.undefined
  var social: js.UndefOr[ActivityContentDetailsSocial] = js.undefined
  var subscription: js.UndefOr[ActivityContentDetailsSubscription] = js.undefined
  var upload: js.UndefOr[ActivityContentDetailsUpload] = js.undefined
}

object ActivityContentDetails {
  @scala.inline
  def apply(
    bulletin: ActivityContentDetailsBulletin = null,
    channelItem: ActivityContentDetailsChannelItem = null,
    comment: ActivityContentDetailsComment = null,
    favorite: ActivityContentDetailsFavorite = null,
    like: ActivityContentDetailsLike = null,
    playlistItem: ActivityContentDetailsPlaylistItem = null,
    promotedItem: ActivityContentDetailsPromotedItem = null,
    recommendation: ActivityContentDetailsRecommendation = null,
    social: ActivityContentDetailsSocial = null,
    subscription: ActivityContentDetailsSubscription = null,
    upload: ActivityContentDetailsUpload = null
  ): ActivityContentDetails = {
    val __obj = js.Dynamic.literal()
    if (bulletin != null) __obj.updateDynamic("bulletin")(bulletin)
    if (channelItem != null) __obj.updateDynamic("channelItem")(channelItem)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (favorite != null) __obj.updateDynamic("favorite")(favorite)
    if (like != null) __obj.updateDynamic("like")(like)
    if (playlistItem != null) __obj.updateDynamic("playlistItem")(playlistItem)
    if (promotedItem != null) __obj.updateDynamic("promotedItem")(promotedItem)
    if (recommendation != null) __obj.updateDynamic("recommendation")(recommendation)
    if (social != null) __obj.updateDynamic("social")(social)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    if (upload != null) __obj.updateDynamic("upload")(upload)
    __obj.asInstanceOf[ActivityContentDetails]
  }
}


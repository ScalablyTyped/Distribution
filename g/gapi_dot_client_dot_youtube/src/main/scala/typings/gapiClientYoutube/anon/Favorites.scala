package typings.gapiClientYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Favorites extends js.Object {
  /**
    * The ID of the playlist that contains the channel"s favorite videos. Use the  playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var favorites: js.UndefOr[String] = js.undefined
  /**
    * The ID of the playlist that contains the channel"s liked videos. Use the   playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var likes: js.UndefOr[String] = js.undefined
  /**
    * The ID of the playlist that contains the channel"s uploaded videos. Use the  videos.insert method to upload new videos and the videos.delete method to
    * delete previously uploaded videos.
    */
  var uploads: js.UndefOr[String] = js.undefined
  /**
    * The ID of the playlist that contains the channel"s watch history. Use the  playlistItems.insert and  playlistItems.delete to add or remove items from
    * that list.
    */
  var watchHistory: js.UndefOr[String] = js.undefined
  /**
    * The ID of the playlist that contains the channel"s watch later playlist. Use the playlistItems.insert and  playlistItems.delete to add or remove items
    * from that list.
    */
  var watchLater: js.UndefOr[String] = js.undefined
}

object Favorites {
  @scala.inline
  def apply(
    favorites: String = null,
    likes: String = null,
    uploads: String = null,
    watchHistory: String = null,
    watchLater: String = null
  ): Favorites = {
    val __obj = js.Dynamic.literal()
    if (favorites != null) __obj.updateDynamic("favorites")(favorites.asInstanceOf[js.Any])
    if (likes != null) __obj.updateDynamic("likes")(likes.asInstanceOf[js.Any])
    if (uploads != null) __obj.updateDynamic("uploads")(uploads.asInstanceOf[js.Any])
    if (watchHistory != null) __obj.updateDynamic("watchHistory")(watchHistory.asInstanceOf[js.Any])
    if (watchLater != null) __obj.updateDynamic("watchLater")(watchLater.asInstanceOf[js.Any])
    __obj.asInstanceOf[Favorites]
  }
}


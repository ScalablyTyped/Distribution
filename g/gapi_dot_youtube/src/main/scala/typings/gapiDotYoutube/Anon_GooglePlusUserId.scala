package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GooglePlusUserId extends js.Object {
  /**
    * The googlePlusUserId object identifies the Google+ profile ID associated with this channel.
    */
  var googlePlusUserId: String
  /**
    * The relatedPlaylists object is a map that identifies playlists associated with the channel, such as the channels uploaded videos or favorite videos. You can retrieve any of these playlists using the playlists.list method.
    */
  var relatedPlaylists: Anon_Favorites
}

object Anon_GooglePlusUserId {
  @scala.inline
  def apply(googlePlusUserId: String, relatedPlaylists: Anon_Favorites): Anon_GooglePlusUserId = {
    val __obj = js.Dynamic.literal(googlePlusUserId = googlePlusUserId, relatedPlaylists = relatedPlaylists)
  
    __obj.asInstanceOf[Anon_GooglePlusUserId]
  }
}


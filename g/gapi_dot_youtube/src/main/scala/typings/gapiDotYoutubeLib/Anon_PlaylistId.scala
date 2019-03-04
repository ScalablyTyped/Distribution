package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PlaylistId extends js.Object {
  /**
    * The value that YouTube uses to uniquely identify the playlist.
    */
  var playlistId: java.lang.String
  /**
    * The value that YouTube uses to uniquely identify the item in the playlist.
    */
  var playlistItemId: java.lang.String
  /**
    *  The resourceId object contains information that identifies the resource that was added to the playlist.
    */
  var resourceId: Anon_Kind
}

object Anon_PlaylistId {
  @scala.inline
  def apply(playlistId: java.lang.String, playlistItemId: java.lang.String, resourceId: Anon_Kind): Anon_PlaylistId = {
    val __obj = js.Dynamic.literal(playlistId = playlistId, playlistItemId = playlistItemId, resourceId = resourceId)
  
    __obj.asInstanceOf[Anon_PlaylistId]
  }
}


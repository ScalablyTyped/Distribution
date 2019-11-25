package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChannelIdKindPlaylistId extends js.Object {
  /**
    * If the id.type propertys value is youtube#channel, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify a channel that matches the search query.
    */
  var channelId: String
  /**
    * The type of the API resource.
    */
  var kind: String
  /**
    * If the id.type propertys value is youtube#playlist, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify a playlist that matches the search query.
    */
  var playlistId: String
  /**
    * If the id.type propertys value is youtube#video, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify a video that matches the search query.
    */
  var videoId: String
}

object Anon_ChannelIdKindPlaylistId {
  @scala.inline
  def apply(channelId: String, kind: String, playlistId: String, videoId: String): Anon_ChannelIdKindPlaylistId = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], playlistId = playlistId.asInstanceOf[js.Any], videoId = videoId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ChannelIdKindPlaylistId]
  }
}


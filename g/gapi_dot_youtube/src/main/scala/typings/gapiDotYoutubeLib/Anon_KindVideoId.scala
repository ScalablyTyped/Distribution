package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_KindVideoId extends js.Object {
  /**
           * If the id.type propertys value is youtube#channel, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify a channel that matches the search query.
           */
  var channelId: java.lang.String
  /**
           * The type of the API resource.
           */
  var kind: java.lang.String
  /**
           * If the id.type propertys value is youtube#playlist, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify a playlist that matches the search query.
           */
  var playlistId: java.lang.String
  /**
           * If the id.type propertys value is youtube#video, then this property will be present and its value will contain the ID that YouTube uses to uniquely identify a video that matches the search query.
           */
  var videoId: java.lang.String
}


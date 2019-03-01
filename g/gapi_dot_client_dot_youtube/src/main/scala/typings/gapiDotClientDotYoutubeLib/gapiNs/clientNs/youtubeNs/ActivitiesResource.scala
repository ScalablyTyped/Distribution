package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResource extends js.Object {
  /**
    * Posts a bulletin for a specific channel. (The user submitting the request must be authorized to act on the channel's behalf.)
    *
    * Note: Even though an activity resource can contain information about actions like a user rating a video or marking a video as a favorite, you need to
    * use other API methods to generate those activity resources. For example, you would use the API's videos.rate() method to rate a video and the
    * playlistItems.insert() method to mark a video as a favorite.
    */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Activity]
  /**
    * Returns a list of channel activity events that match the request criteria. For example, you can retrieve events associated with a particular channel,
    * events associated with the user's subscriptions and Google+ friends, or the YouTube home page feed, which is customized for each user.
    */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltChannelId): gapiDotClientLib.gapiNs.clientNs.Request[ActivityListResponse]
}

object ActivitiesResource {
  @scala.inline
  def apply(
    insert: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Activity]
    ],
    list: js.Function1[
      gapiDotClientDotYoutubeLib.Anon_AltChannelId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ActivityListResponse]
    ]
  ): ActivitiesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[ActivitiesResource]
  }
}


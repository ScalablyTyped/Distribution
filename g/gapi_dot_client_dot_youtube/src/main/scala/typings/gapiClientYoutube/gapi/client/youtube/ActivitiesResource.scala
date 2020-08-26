package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.Alt
import typings.gapiClientYoutube.anon.ChannelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivitiesResource extends js.Object {
  /**
    * Posts a bulletin for a specific channel. (The user submitting the request must be authorized to act on the channel's behalf.)
    *
    * Note: Even though an activity resource can contain information about actions like a user rating a video or marking a video as a favorite, you need to
    * use other API methods to generate those activity resources. For example, you would use the API's videos.rate() method to rate a video and the
    * playlistItems.insert() method to mark a video as a favorite.
    */
  def insert(request: Alt): Request[Activity] = js.native
  /**
    * Returns a list of channel activity events that match the request criteria. For example, you can retrieve events associated with a particular channel,
    * events associated with the user's subscriptions and Google+ friends, or the YouTube home page feed, which is customized for each user.
    */
  def list(request: ChannelId): Request[ActivityListResponse] = js.native
}

object ActivitiesResource {
  @scala.inline
  def apply(insert: Alt => Request[Activity], list: ChannelId => Request[ActivityListResponse]): ActivitiesResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ActivitiesResource]
  }
  @scala.inline
  implicit class ActivitiesResourceOps[Self <: ActivitiesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInsert(value: Alt => Request[Activity]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: ChannelId => Request[ActivityListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}


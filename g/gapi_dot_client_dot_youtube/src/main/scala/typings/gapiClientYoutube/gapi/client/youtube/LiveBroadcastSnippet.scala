package typings.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveBroadcastSnippet extends js.Object {
  /**
    * The date and time that the broadcast actually ended. This information is only available once the broadcast's state is complete. The value is specified
    * in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var actualEndTime: js.UndefOr[String] = js.native
  /**
    * The date and time that the broadcast actually started. This information is only available once the broadcast's state is live. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var actualStartTime: js.UndefOr[String] = js.native
  /** The ID that YouTube uses to uniquely identify the channel that is publishing the broadcast. */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The broadcast's description. As with the title, you can set this field by modifying the broadcast resource or by setting the description field of the
    * corresponding video resource.
    */
  var description: js.UndefOr[String] = js.native
  var isDefaultBroadcast: js.UndefOr[Boolean] = js.native
  /** The id of the live chat for this broadcast. */
  var liveChatId: js.UndefOr[String] = js.native
  /**
    * The date and time that the broadcast was added to YouTube's live broadcast schedule. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ)
    * format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /** The date and time that the broadcast is scheduled to end. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var scheduledEndTime: js.UndefOr[String] = js.native
  /** The date and time that the broadcast is scheduled to start. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var scheduledStartTime: js.UndefOr[String] = js.native
  /**
    * A map of thumbnail images associated with the broadcast. For each nested object in this object, the key is the name of the thumbnail image, and the
    * value is an object that contains other information about the thumbnail.
    */
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.native
  /**
    * The broadcast's title. Note that the broadcast represents exactly one YouTube video. You can set this field by modifying the broadcast resource or by
    * setting the title field of the corresponding video resource.
    */
  var title: js.UndefOr[String] = js.native
}

object LiveBroadcastSnippet {
  @scala.inline
  def apply(): LiveBroadcastSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveBroadcastSnippet]
  }
  @scala.inline
  implicit class LiveBroadcastSnippetOps[Self <: LiveBroadcastSnippet] (val x: Self) extends AnyVal {
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
    def setActualEndTime(value: String): Self = this.set("actualEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualEndTime: Self = this.set("actualEndTime", js.undefined)
    @scala.inline
    def setActualStartTime(value: String): Self = this.set("actualStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualStartTime: Self = this.set("actualStartTime", js.undefined)
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setIsDefaultBroadcast(value: Boolean): Self = this.set("isDefaultBroadcast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefaultBroadcast: Self = this.set("isDefaultBroadcast", js.undefined)
    @scala.inline
    def setLiveChatId(value: String): Self = this.set("liveChatId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveChatId: Self = this.set("liveChatId", js.undefined)
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    @scala.inline
    def setScheduledEndTime(value: String): Self = this.set("scheduledEndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledEndTime: Self = this.set("scheduledEndTime", js.undefined)
    @scala.inline
    def setScheduledStartTime(value: String): Self = this.set("scheduledStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledStartTime: Self = this.set("scheduledStartTime", js.undefined)
    @scala.inline
    def setThumbnails(value: ThumbnailDetails): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}


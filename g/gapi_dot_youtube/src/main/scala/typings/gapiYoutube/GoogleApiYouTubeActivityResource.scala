package typings.gapiYoutube

import typings.gapiYoutube.anon.Bulletin
import typings.gapiYoutube.anon.ChannelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiYouTubeActivityResource extends js.Object {
  /**
    * The contentDetails object contains information about the content associated with the activity.
    */
  var contentDetails: Bulletin = js.native
  /**
    * The ETag of the activity resource.
    */
  var etag: String = js.native
  /**
    * The ID that YouTube uses to uniquely identify the activity.
    */
  var id: String = js.native
  /**
    * The type of the API resource. For activity resources, the value will be youtube#activity.
    */
  var kind: String = js.native
  /**
    * The snippet object contains basic details about the activity, including the activitys type and group ID.
    */
  var snippet: ChannelId = js.native
}

object GoogleApiYouTubeActivityResource {
  @scala.inline
  def apply(contentDetails: Bulletin, etag: String, id: String, kind: String, snippet: ChannelId): GoogleApiYouTubeActivityResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeActivityResource]
  }
  @scala.inline
  implicit class GoogleApiYouTubeActivityResourceOps[Self <: GoogleApiYouTubeActivityResource] (val x: Self) extends AnyVal {
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
    def setContentDetails(value: Bulletin): Self = this.set("contentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnippet(value: ChannelId): Self = this.set("snippet", value.asInstanceOf[js.Any])
  }
  
}


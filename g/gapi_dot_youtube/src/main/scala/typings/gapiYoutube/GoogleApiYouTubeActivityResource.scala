package typings.gapiYoutube

import typings.gapiYoutube.anon.Bulletin
import typings.gapiYoutube.anon.ChannelId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeActivityResource extends js.Object {
  /**
    * The contentDetails object contains information about the content associated with the activity.
    */
  var contentDetails: Bulletin
  /**
    * The ETag of the activity resource.
    */
  var etag: String
  /**
    * The ID that YouTube uses to uniquely identify the activity.
    */
  var id: String
  /**
    * The type of the API resource. For activity resources, the value will be youtube#activity.
    */
  var kind: String
  /**
    * The snippet object contains basic details about the activity, including the activitys type and group ID.
    */
  var snippet: ChannelId
}

object GoogleApiYouTubeActivityResource {
  @scala.inline
  def apply(contentDetails: Bulletin, etag: String, id: String, kind: String, snippet: ChannelId): GoogleApiYouTubeActivityResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeActivityResource]
  }
}


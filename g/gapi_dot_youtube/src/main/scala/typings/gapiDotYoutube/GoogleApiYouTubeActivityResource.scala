package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeActivityResource extends js.Object {
  /**
    * The contentDetails object contains information about the content associated with the activity.
    */
  var contentDetails: Anon_Bulletin
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
  var snippet: Anon_ChannelIdChannelTitle
}

object GoogleApiYouTubeActivityResource {
  @scala.inline
  def apply(
    contentDetails: Anon_Bulletin,
    etag: String,
    id: String,
    kind: String,
    snippet: Anon_ChannelIdChannelTitle
  ): GoogleApiYouTubeActivityResource = {
    val __obj = js.Dynamic.literal(contentDetails = contentDetails, etag = etag, id = id, kind = kind, snippet = snippet)
  
    __obj.asInstanceOf[GoogleApiYouTubeActivityResource]
  }
}


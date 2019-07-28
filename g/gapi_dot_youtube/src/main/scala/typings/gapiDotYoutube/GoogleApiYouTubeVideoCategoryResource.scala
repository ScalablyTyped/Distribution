package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeVideoCategoryResource extends js.Object {
  /**
    * The ETag of the videoCategory resource.
    */
  var etag: String
  /**
    * The ID that YouTube uses to uniquely identify the video category.
    */
  var id: String
  /**
    * The type of the API resource. For video category resources, the value will be youtube#videoCategory.
    */
  var kind: String
  /**
    * The snippet object contains basic details about the video category, including its title.
    */
  var snippet: Anon_ChannelIdTitle
}

object GoogleApiYouTubeVideoCategoryResource {
  @scala.inline
  def apply(etag: String, id: String, kind: String, snippet: Anon_ChannelIdTitle): GoogleApiYouTubeVideoCategoryResource = {
    val __obj = js.Dynamic.literal(etag = etag, id = id, kind = kind, snippet = snippet)
  
    __obj.asInstanceOf[GoogleApiYouTubeVideoCategoryResource]
  }
}


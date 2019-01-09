package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeVideoCategoryResource extends js.Object {
  /**
    * The ETag of the videoCategory resource.
    */
  var etag: java.lang.String
  /**
    * The ID that YouTube uses to uniquely identify the video category.
    */
  var id: java.lang.String
  /**
    * The type of the API resource. For video category resources, the value will be youtube#videoCategory.
    */
  var kind: java.lang.String
  /**
    * The snippet object contains basic details about the video category, including its title.
    */
  var snippet: Anon_ChannelIdTitle
}


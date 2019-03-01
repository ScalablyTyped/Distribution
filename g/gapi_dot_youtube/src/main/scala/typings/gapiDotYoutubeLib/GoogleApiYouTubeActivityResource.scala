package typings
package gapiDotYoutubeLib

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
  var etag: java.lang.String
  /**
    * The ID that YouTube uses to uniquely identify the activity.
    */
  var id: java.lang.String
  /**
    * The type of the API resource. For activity resources, the value will be youtube#activity.
    */
  var kind: java.lang.String
  /**
    * The snippet object contains basic details about the activity, including the activitys type and group ID.
    */
  var snippet: Anon_ChannelIdChannelTitle
}

object GoogleApiYouTubeActivityResource {
  @scala.inline
  def apply(
    contentDetails: Anon_Bulletin,
    etag: java.lang.String,
    id: java.lang.String,
    kind: java.lang.String,
    snippet: Anon_ChannelIdChannelTitle
  ): GoogleApiYouTubeActivityResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentDetails")(contentDetails)
    __obj.updateDynamic("etag")(etag)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("snippet")(snippet)
    __obj.asInstanceOf[GoogleApiYouTubeActivityResource]
  }
}


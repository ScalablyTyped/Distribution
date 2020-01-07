package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the uploaded video.
  */
@js.native
trait Schema$ActivityContentDetailsUpload extends js.Object {
  /**
    * The ID that YouTube uses to uniquely identify the uploaded video.
    */
  var videoId: js.UndefOr[String] = js.native
}

object Schema$ActivityContentDetailsUpload {
  @scala.inline
  def apply(videoId: String = null): Schema$ActivityContentDetailsUpload = {
    val __obj = js.Dynamic.literal()
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ActivityContentDetailsUpload]
  }
}


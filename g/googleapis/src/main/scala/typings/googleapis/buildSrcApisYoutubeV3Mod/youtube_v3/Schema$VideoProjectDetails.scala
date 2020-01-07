package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Project specific details about the content of a YouTube Video.
  */
@js.native
trait Schema$VideoProjectDetails extends js.Object {
  /**
    * A list of project tags associated with the video during the upload.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object Schema$VideoProjectDetails {
  @scala.inline
  def apply(tags: js.Array[String] = null): Schema$VideoProjectDetails = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoProjectDetails]
  }
}


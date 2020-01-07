package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a video.
  */
@js.native
trait Schema$CreateVideoResponse extends js.Object {
  /**
    * The object ID of the created video.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$CreateVideoResponse {
  @scala.inline
  def apply(objectId: String = null): Schema$CreateVideoResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateVideoResponse]
  }
}


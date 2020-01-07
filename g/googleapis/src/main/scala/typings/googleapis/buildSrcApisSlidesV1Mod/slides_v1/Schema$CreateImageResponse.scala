package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating an image.
  */
@js.native
trait Schema$CreateImageResponse extends js.Object {
  /**
    * The object ID of the created image.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$CreateImageResponse {
  @scala.inline
  def apply(objectId: String = null): Schema$CreateImageResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateImageResponse]
  }
}


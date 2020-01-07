package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a slide.
  */
@js.native
trait Schema$CreateSlideResponse extends js.Object {
  /**
    * The object ID of the created slide.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$CreateSlideResponse {
  @scala.inline
  def apply(objectId: String = null): Schema$CreateSlideResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateSlideResponse]
  }
}


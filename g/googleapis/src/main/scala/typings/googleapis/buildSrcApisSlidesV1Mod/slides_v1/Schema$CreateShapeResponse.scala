package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of creating a shape.
  */
@js.native
trait Schema$CreateShapeResponse extends js.Object {
  /**
    * The object ID of the created shape.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$CreateShapeResponse {
  @scala.inline
  def apply(objectId: String = null): Schema$CreateShapeResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateShapeResponse]
  }
}


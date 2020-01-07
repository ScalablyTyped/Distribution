package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of grouping objects.
  */
@js.native
trait Schema$GroupObjectsResponse extends js.Object {
  /**
    * The object ID of the created group.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$GroupObjectsResponse {
  @scala.inline
  def apply(objectId: String = null): Schema$GroupObjectsResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GroupObjectsResponse]
  }
}


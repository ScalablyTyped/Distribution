package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response of duplicating an object.
  */
@js.native
trait Schema$DuplicateObjectResponse extends js.Object {
  /**
    * The ID of the new duplicate object.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$DuplicateObjectResponse {
  @scala.inline
  def apply(objectId: String = null): Schema$DuplicateObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DuplicateObjectResponse]
  }
}


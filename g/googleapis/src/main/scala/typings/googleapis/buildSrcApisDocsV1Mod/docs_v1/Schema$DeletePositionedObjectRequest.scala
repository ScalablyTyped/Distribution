package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deletes a PositionedObject from the document.
  */
@js.native
trait Schema$DeletePositionedObjectRequest extends js.Object {
  /**
    * The ID of the positioned object to delete.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$DeletePositionedObjectRequest {
  @scala.inline
  def apply(objectId: String = null): Schema$DeletePositionedObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeletePositionedObjectRequest]
  }
}


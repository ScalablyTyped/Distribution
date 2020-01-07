package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of inserting an inline image.
  */
@js.native
trait Schema$InsertInlineImageResponse extends js.Object {
  /**
    * The ID of the created InlineObject.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$InsertInlineImageResponse {
  @scala.inline
  def apply(objectId: String = null): Schema$InsertInlineImageResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InsertInlineImageResponse]
  }
}


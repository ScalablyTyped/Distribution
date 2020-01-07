package typings.googleapis.buildSrcApisSlidesV1Mod.slides_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Updates the category of a line.
  */
@js.native
trait Schema$UpdateLineCategoryRequest extends js.Object {
  /**
    * The line category to update to.  The exact line type is determined based
    * on the category to update to and how it&#39;s routed to connect to other
    * page elements.
    */
  var lineCategory: js.UndefOr[String] = js.native
  /**
    * The object ID of the line the update is applied to.  Only a line with a
    * category indicating it is a &quot;connector&quot; can be updated.  The
    * line may be rerouted after updating its category.
    */
  var objectId: js.UndefOr[String] = js.native
}

object Schema$UpdateLineCategoryRequest {
  @scala.inline
  def apply(lineCategory: String = null, objectId: String = null): Schema$UpdateLineCategoryRequest = {
    val __obj = js.Dynamic.literal()
    if (lineCategory != null) __obj.updateDynamic("lineCategory")(lineCategory.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateLineCategoryRequest]
  }
}


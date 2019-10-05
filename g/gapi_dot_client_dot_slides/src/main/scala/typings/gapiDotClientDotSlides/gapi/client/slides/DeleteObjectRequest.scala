package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectRequest extends js.Object {
  /**
    * The object ID of the page or page element to delete.
    *
    * If after a delete operation a group contains
    * only 1 or no page elements, the group is also deleted.
    *
    * If a placeholder is deleted on a layout, any empty inheriting shapes are
    * also deleted.
    */
  var objectId: js.UndefOr[String] = js.undefined
}

object DeleteObjectRequest {
  @scala.inline
  def apply(objectId: String = null): DeleteObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[DeleteObjectRequest]
  }
}


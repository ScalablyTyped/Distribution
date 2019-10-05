package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateObjectRequest extends js.Object {
  var objectId: js.UndefOr[String] = js.undefined
  var objectIds: js.UndefOr[js.Object] = js.undefined
}

object DuplicateObjectRequest {
  @scala.inline
  def apply(objectId: String = null, objectIds: js.Object = null): DuplicateObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    if (objectIds != null) __obj.updateDynamic("objectIds")(objectIds)
    __obj.asInstanceOf[DuplicateObjectRequest]
  }
}


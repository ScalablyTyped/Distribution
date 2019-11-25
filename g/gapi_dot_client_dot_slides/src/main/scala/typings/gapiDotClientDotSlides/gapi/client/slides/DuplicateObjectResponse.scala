package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateObjectResponse extends js.Object {
  /** The ID of the new duplicate object. */
  var objectId: js.UndefOr[String] = js.undefined
}

object DuplicateObjectResponse {
  @scala.inline
  def apply(objectId: String = null): DuplicateObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateObjectResponse]
  }
}


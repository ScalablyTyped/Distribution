package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEmbeddedObjectRequest extends js.Object {
  /** The ID of the embedded object to delete. */
  var objectId: js.UndefOr[Double] = js.undefined
}

object DeleteEmbeddedObjectRequest {
  @scala.inline
  def apply(objectId: Int | Double = null): DeleteEmbeddedObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmbeddedObjectRequest]
  }
}


package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEmbeddedObjectRequest extends js.Object {
  /** The ID of the embedded object to delete. */
  var objectId: js.UndefOr[scala.Double] = js.undefined
}

object DeleteEmbeddedObjectRequest {
  @scala.inline
  def apply(objectId: scala.Int | scala.Double = null): DeleteEmbeddedObjectRequest = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEmbeddedObjectRequest]
  }
}


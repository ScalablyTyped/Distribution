package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateObjectResponse extends js.Object {
  /** The ID of the new duplicate object. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object DuplicateObjectResponse {
  @scala.inline
  def apply(objectId: java.lang.String = null): DuplicateObjectResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[DuplicateObjectResponse]
  }
}


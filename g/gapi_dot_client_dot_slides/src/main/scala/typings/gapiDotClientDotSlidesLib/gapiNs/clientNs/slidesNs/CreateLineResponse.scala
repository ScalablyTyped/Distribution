package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLineResponse extends js.Object {
  /** The object ID of the created line. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object CreateLineResponse {
  @scala.inline
  def apply(objectId: java.lang.String = null): CreateLineResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[CreateLineResponse]
  }
}


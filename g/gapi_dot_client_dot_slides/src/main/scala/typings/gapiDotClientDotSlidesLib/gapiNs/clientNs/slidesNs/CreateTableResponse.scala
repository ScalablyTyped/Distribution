package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTableResponse extends js.Object {
  /** The object ID of the created table. */
  var objectId: js.UndefOr[java.lang.String] = js.undefined
}

object CreateTableResponse {
  @scala.inline
  def apply(objectId: java.lang.String = null): CreateTableResponse = {
    val __obj = js.Dynamic.literal()
    if (objectId != null) __obj.updateDynamic("objectId")(objectId)
    __obj.asInstanceOf[CreateTableResponse]
  }
}


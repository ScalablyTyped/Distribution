package typings
package gapiDotClientDotStreetviewpublishLib.gapiNs.clientNs.streetviewpublishNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhotoId extends js.Object {
  /** Required. A unique identifier for a photo. */
  var id: js.UndefOr[java.lang.String] = js.undefined
}

object PhotoId {
  @scala.inline
  def apply(id: java.lang.String = null): PhotoId = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[PhotoId]
  }
}


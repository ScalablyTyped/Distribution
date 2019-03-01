package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsListResponse extends js.Object {
  /** The list of locations. */
  var items: js.UndefOr[js.Array[Location]] = js.undefined
  /** The type of resource. This is always mirror#locationsList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object LocationsListResponse {
  @scala.inline
  def apply(items: js.Array[Location] = null, kind: java.lang.String = null): LocationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[LocationsListResponse]
  }
}


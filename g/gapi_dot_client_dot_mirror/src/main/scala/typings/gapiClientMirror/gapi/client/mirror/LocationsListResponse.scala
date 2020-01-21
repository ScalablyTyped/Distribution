package typings.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsListResponse extends js.Object {
  /** The list of locations. */
  var items: js.UndefOr[js.Array[Location]] = js.undefined
  /** The type of resource. This is always mirror#locationsList. */
  var kind: js.UndefOr[String] = js.undefined
}

object LocationsListResponse {
  @scala.inline
  def apply(items: js.Array[Location] = null, kind: String = null): LocationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsListResponse]
  }
}


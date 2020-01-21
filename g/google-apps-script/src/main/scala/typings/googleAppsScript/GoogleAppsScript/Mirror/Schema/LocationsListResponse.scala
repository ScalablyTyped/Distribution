package typings.googleAppsScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Location]] = js.undefined
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


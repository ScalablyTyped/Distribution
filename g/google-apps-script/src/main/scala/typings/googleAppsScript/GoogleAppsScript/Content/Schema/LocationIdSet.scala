package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationIdSet extends js.Object {
  var locationIds: js.UndefOr[js.Array[String]] = js.undefined
}

object LocationIdSet {
  @scala.inline
  def apply(locationIds: js.Array[String] = null): LocationIdSet = {
    val __obj = js.Dynamic.literal()
    if (locationIds != null) __obj.updateDynamic("locationIds")(locationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationIdSet]
  }
}


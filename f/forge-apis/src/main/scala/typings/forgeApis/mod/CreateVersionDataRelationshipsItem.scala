package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVersionDataRelationshipsItem extends js.Object {
  var data: js.UndefOr[CreateVersionDataRelationshipsItemData] = js.undefined
}

object CreateVersionDataRelationshipsItem {
  @scala.inline
  def apply(data: CreateVersionDataRelationshipsItemData = null): CreateVersionDataRelationshipsItem = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVersionDataRelationshipsItem]
  }
}


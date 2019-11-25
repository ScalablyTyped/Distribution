package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateItemDataRelationshipsTip extends js.Object {
  var data: js.UndefOr[CreateItemDataRelationshipsTipData] = js.undefined
}

object CreateItemDataRelationshipsTip {
  @scala.inline
  def apply(data: CreateItemDataRelationshipsTipData = null): CreateItemDataRelationshipsTip = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemDataRelationshipsTip]
  }
}


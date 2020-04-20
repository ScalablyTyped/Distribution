package typings.dndCore

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDropResult extends js.Object {
  var dropResult: js.Any
  var isSourcePublic: Boolean
  var item: js.Any
  var itemType: Identifier | js.Array[Identifier]
  var sourceId: String
  var targetId: String
  var targetIds: js.Array[String]
}

object AnonDropResult {
  @scala.inline
  def apply(
    dropResult: js.Any,
    isSourcePublic: Boolean,
    item: js.Any,
    itemType: Identifier | js.Array[Identifier],
    sourceId: String,
    targetId: String,
    targetIds: js.Array[String]
  ): AnonDropResult = {
    val __obj = js.Dynamic.literal(dropResult = dropResult.asInstanceOf[js.Any], isSourcePublic = isSourcePublic.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDropResult]
  }
}


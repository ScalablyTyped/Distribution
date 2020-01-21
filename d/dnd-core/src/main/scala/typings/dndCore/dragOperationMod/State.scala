package typings.dndCore.dragOperationMod

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var didDrop: Boolean
  var dropResult: js.Any
  var isSourcePublic: Boolean | Null
  var item: js.Any
  var itemType: Identifier | js.Array[Identifier] | Null
  var sourceId: String | Null
  var targetIds: js.Array[String]
}

object State {
  @scala.inline
  def apply(
    didDrop: Boolean,
    dropResult: js.Any,
    item: js.Any,
    targetIds: js.Array[String],
    isSourcePublic: js.UndefOr[Boolean] = js.undefined,
    itemType: Identifier | js.Array[Identifier] = null,
    sourceId: String = null
  ): State = {
    val __obj = js.Dynamic.literal(didDrop = didDrop.asInstanceOf[js.Any], dropResult = dropResult.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
    if (!js.isUndefined(isSourcePublic)) __obj.updateDynamic("isSourcePublic")(isSourcePublic.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (sourceId != null) __obj.updateDynamic("sourceId")(sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
}


package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginDragPayload extends js.Object {
  var clientOffset: XYCoord | Null
  var isSourcePublic: Boolean
  var item: js.Any
  var itemType: Identifier
  var sourceClientOffset: XYCoord | Null
  var sourceId: Identifier
}

object BeginDragPayload {
  @scala.inline
  def apply(
    isSourcePublic: Boolean,
    item: js.Any,
    itemType: Identifier,
    sourceId: Identifier,
    clientOffset: XYCoord = null,
    sourceClientOffset: XYCoord = null
  ): BeginDragPayload = {
    val __obj = js.Dynamic.literal(isSourcePublic = isSourcePublic.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], clientOffset = clientOffset.asInstanceOf[js.Any], sourceClientOffset = sourceClientOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDragPayload]
  }
}


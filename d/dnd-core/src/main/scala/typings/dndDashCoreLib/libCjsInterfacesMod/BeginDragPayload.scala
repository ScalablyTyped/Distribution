package typings
package dndDashCoreLib.libCjsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginDragPayload extends js.Object {
  var clientOffset: XYCoord | scala.Null
  var isSourcePublic: scala.Boolean
  var item: js.Any
  var itemType: Identifier
  var sourceClientOffset: XYCoord | scala.Null
  var sourceId: Identifier
}

object BeginDragPayload {
  @scala.inline
  def apply(
    isSourcePublic: scala.Boolean,
    item: js.Any,
    itemType: Identifier,
    sourceId: Identifier,
    clientOffset: XYCoord = null,
    sourceClientOffset: XYCoord = null
  ): BeginDragPayload = {
    val __obj = js.Dynamic.literal(isSourcePublic = isSourcePublic, item = item, itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    if (clientOffset != null) __obj.updateDynamic("clientOffset")(clientOffset)
    if (sourceClientOffset != null) __obj.updateDynamic("sourceClientOffset")(sourceClientOffset)
    __obj.asInstanceOf[BeginDragPayload]
  }
}


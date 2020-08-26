package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginDragPayload extends js.Object {
  var clientOffset: XYCoord | Null = js.native
  var isSourcePublic: Boolean = js.native
  var item: js.Any = js.native
  var itemType: Identifier = js.native
  var sourceClientOffset: XYCoord | Null = js.native
  var sourceId: Identifier = js.native
}

object BeginDragPayload {
  @scala.inline
  def apply(isSourcePublic: Boolean, item: js.Any, itemType: Identifier, sourceId: Identifier): BeginDragPayload = {
    val __obj = js.Dynamic.literal(isSourcePublic = isSourcePublic.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginDragPayload]
  }
  @scala.inline
  implicit class BeginDragPayloadOps[Self <: BeginDragPayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsSourcePublic(value: Boolean): Self = this.set("isSourcePublic", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemType(value: Identifier): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceId(value: Identifier): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientOffset(value: XYCoord): Self = this.set("clientOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientOffsetNull: Self = this.set("clientOffset", null)
    @scala.inline
    def setSourceClientOffset(value: XYCoord): Self = this.set("sourceClientOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceClientOffsetNull: Self = this.set("sourceClientOffset", null)
  }
  
}


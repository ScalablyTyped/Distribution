package typings.dndCore.dragOperationMod

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var didDrop: Boolean = js.native
  var dropResult: js.Any = js.native
  var isSourcePublic: Boolean | Null = js.native
  var item: js.Any = js.native
  var itemType: Identifier | js.Array[Identifier] | Null = js.native
  var sourceId: String | Null = js.native
  var targetIds: js.Array[String] = js.native
}

object State {
  @scala.inline
  def apply(didDrop: Boolean, dropResult: js.Any, item: js.Any, targetIds: js.Array[String]): State = {
    val __obj = js.Dynamic.literal(didDrop = didDrop.asInstanceOf[js.Any], dropResult = dropResult.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setDidDrop(value: Boolean): Self = this.set("didDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropResult(value: js.Any): Self = this.set("dropResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetIdsVarargs(value: String*): Self = this.set("targetIds", js.Array(value :_*))
    @scala.inline
    def setTargetIds(value: js.Array[String]): Self = this.set("targetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSourcePublic(value: Boolean): Self = this.set("isSourcePublic", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSourcePublicNull: Self = this.set("isSourcePublic", null)
    @scala.inline
    def setItemTypeVarargs(value: Identifier*): Self = this.set("itemType", js.Array(value :_*))
    @scala.inline
    def setItemType(value: Identifier | js.Array[Identifier]): Self = this.set("itemType", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemTypeNull: Self = this.set("itemType", null)
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceIdNull: Self = this.set("sourceId", null)
  }
  
}


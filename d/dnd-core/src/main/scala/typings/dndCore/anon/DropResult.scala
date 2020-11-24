package typings.dndCore.anon

import typings.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropResult extends js.Object {
  
  var dropResult: js.Any = js.native
  
  var isSourcePublic: Boolean = js.native
  
  var item: js.Any = js.native
  
  var itemType: Identifier | js.Array[Identifier] = js.native
  
  var sourceId: String = js.native
  
  var targetId: String = js.native
  
  var targetIds: js.Array[String] = js.native
}
object DropResult {
  
  @scala.inline
  def apply(
    dropResult: js.Any,
    isSourcePublic: Boolean,
    item: js.Any,
    itemType: Identifier | js.Array[Identifier],
    sourceId: String,
    targetId: String,
    targetIds: js.Array[String]
  ): DropResult = {
    val __obj = js.Dynamic.literal(dropResult = dropResult.asInstanceOf[js.Any], isSourcePublic = isSourcePublic.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemType = itemType.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any], targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropResult]
  }
  
  @scala.inline
  implicit class DropResultOps[Self <: DropResult] (val x: Self) extends AnyVal {
    
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
    def setDropResult(value: js.Any): Self = this.set("dropResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSourcePublic(value: Boolean): Self = this.set("isSourcePublic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTypeVarargs(value: Identifier*): Self = this.set("itemType", js.Array(value :_*))
    
    @scala.inline
    def setItemType(value: Identifier | js.Array[Identifier]): Self = this.set("itemType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceId(value: String): Self = this.set("sourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: String): Self = this.set("targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdsVarargs(value: String*): Self = this.set("targetIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetIds(value: js.Array[String]): Self = this.set("targetIds", value.asInstanceOf[js.Any])
  }
}

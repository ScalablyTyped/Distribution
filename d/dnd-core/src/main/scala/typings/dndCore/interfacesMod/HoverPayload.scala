package typings.dndCore.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverPayload extends js.Object {
  
  var clientOffset: XYCoord | Null = js.native
  
  var targetIds: js.Array[Identifier] = js.native
}
object HoverPayload {
  
  @scala.inline
  def apply(targetIds: js.Array[Identifier]): HoverPayload = {
    val __obj = js.Dynamic.literal(targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverPayload]
  }
  
  @scala.inline
  implicit class HoverPayloadOps[Self <: HoverPayload] (val x: Self) extends AnyVal {
    
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
    def setTargetIdsVarargs(value: Identifier*): Self = this.set("targetIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetIds(value: js.Array[Identifier]): Self = this.set("targetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOffset(value: XYCoord): Self = this.set("clientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOffsetNull: Self = this.set("clientOffset", null)
  }
}

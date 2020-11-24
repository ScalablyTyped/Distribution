package typings.dndCore.dragOffsetMod

import typings.dndCore.interfacesMod.XYCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var clientOffset: XYCoord | Null = js.native
  
  var initialClientOffset: XYCoord | Null = js.native
  
  var initialSourceClientOffset: XYCoord | Null = js.native
}
object State {
  
  @scala.inline
  def apply(): State = {
    val __obj = js.Dynamic.literal()
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
    def setClientOffset(value: XYCoord): Self = this.set("clientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOffsetNull: Self = this.set("clientOffset", null)
    
    @scala.inline
    def setInitialClientOffset(value: XYCoord): Self = this.set("initialClientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialClientOffsetNull: Self = this.set("initialClientOffset", null)
    
    @scala.inline
    def setInitialSourceClientOffset(value: XYCoord): Self = this.set("initialSourceClientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSourceClientOffsetNull: Self = this.set("initialSourceClientOffset", null)
  }
}

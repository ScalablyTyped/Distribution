package typings.estreeWalker.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncWalker extends js.Object {
  
  var enter: js.UndefOr[AsyncWalkerHandler] = js.native
  
  var leave: js.UndefOr[AsyncWalkerHandler] = js.native
}
object AsyncWalker {
  
  @scala.inline
  def apply(): AsyncWalker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncWalker]
  }
  
  @scala.inline
  implicit class AsyncWalkerOps[Self <: AsyncWalker] (val x: Self) extends AnyVal {
    
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
    def setEnter(value: AsyncWalkerHandler): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setLeave(value: AsyncWalkerHandler): Self = this.set("leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
  }
}

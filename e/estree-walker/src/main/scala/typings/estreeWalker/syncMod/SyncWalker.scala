package typings.estreeWalker.syncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncWalker extends js.Object {
  
  var enter: js.UndefOr[WalkerHandler] = js.native
  
  var leave: js.UndefOr[WalkerHandler] = js.native
}
object SyncWalker {
  
  @scala.inline
  def apply(): SyncWalker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncWalker]
  }
  
  @scala.inline
  implicit class SyncWalkerOps[Self <: SyncWalker] (val x: Self) extends AnyVal {
    
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
    def setEnter(value: WalkerHandler): Self = this.set("enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setLeave(value: WalkerHandler): Self = this.set("leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeave: Self = this.set("leave", js.undefined)
  }
}

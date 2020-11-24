package typings.focusLock.focusablesMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusableIn extends js.Object {
  
  var guard: Boolean = js.native
  
  var index: Double = js.native
  
  var lockItem: Boolean = js.native
  
  var node: HTMLElement = js.native
}
object FocusableIn {
  
  @scala.inline
  def apply(guard: Boolean, index: Double, lockItem: Boolean, node: HTMLElement): FocusableIn = {
    val __obj = js.Dynamic.literal(guard = guard.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lockItem = lockItem.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[FocusableIn]
  }
  
  @scala.inline
  implicit class FocusableInOps[Self <: FocusableIn] (val x: Self) extends AnyVal {
    
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
    def setGuard(value: Boolean): Self = this.set("guard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockItem(value: Boolean): Self = this.set("lockItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
  }
}

package typings.emojiMart.storeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreHandlers extends js.Object {
  
  var getter: js.UndefOr[js.Function1[/* key */ String, _]] = js.native
  
  var setter: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, Unit]] = js.native
}
object StoreHandlers {
  
  @scala.inline
  def apply(): StoreHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreHandlers]
  }
  
  @scala.inline
  implicit class StoreHandlersOps[Self <: StoreHandlers] (val x: Self) extends AnyVal {
    
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
    def setGetter(value: /* key */ String => _): Self = this.set("getter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetter: Self = this.set("getter", js.undefined)
    
    @scala.inline
    def setSetter(value: (/* key */ String, /* value */ js.Any) => Unit): Self = this.set("setter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetter: Self = this.set("setter", js.undefined)
  }
}

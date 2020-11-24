package typings.domHelpers.anon

import typings.domHelpers.addEventListenerMod.EventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Once[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */] extends js.Object {
  
  var __once: js.UndefOr[EventHandler[K]] = js.native
}
object Once {
  
  @scala.inline
  def apply[K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */](): Once[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Once[K]]
  }
  
  @scala.inline
  implicit class OnceOps[Self <: Once[_], K /* <: /* keyof std.HTMLElementEventMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 92 */ js.Any */] (val x: Self with Once[K]) extends AnyVal {
    
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
    def set__once(value: EventHandler[K]): Self = this.set("__once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__once: Self = this.set("__once", js.undefined)
  }
}

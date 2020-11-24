package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatingHookContext[T, Key] extends js.Object {
  
  var onerror: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.native
  
  var onsuccess: js.UndefOr[js.Function1[/* primKey */ Key, Unit]] = js.native
}
object CreatingHookContext {
  
  @scala.inline
  def apply[T, Key](): CreatingHookContext[T, Key] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatingHookContext[T, Key]]
  }
  
  @scala.inline
  implicit class CreatingHookContextOps[Self <: CreatingHookContext[_, _], T, Key] (val x: Self with (CreatingHookContext[T, Key])) extends AnyVal {
    
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
    def setOnerror(value: /* err */ js.Any => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnsuccess(value: /* primKey */ Key => Unit): Self = this.set("onsuccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnsuccess: Self = this.set("onsuccess", js.undefined)
  }
}

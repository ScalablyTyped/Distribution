package typings.feathersjsFeathers.anon

import typings.feathersjsFeathers.mod.Hook
import typings.feathersjsFeathers.mod.HookContext
import typings.feathersjsFeathers.mod.SkipSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.HooksObject> */
@js.native
trait PartialHooksObject extends js.Object {
  
  var after: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
  
  var before: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
  
  var error: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
  
  var `finally`: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
}
object PartialHooksObject {
  
  @scala.inline
  def apply(): PartialHooksObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHooksObject]
  }
  
  @scala.inline
  implicit class PartialHooksObjectOps[Self <: PartialHooksObject] (val x: Self) extends AnyVal {
    
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
    def setAfterVarargs(value: Hook*): Self = this.set("after", js.Array(value :_*))
    
    @scala.inline
    def setAfterFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfter(value: PartialHookMap | Hook | js.Array[Hook]): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBeforeVarargs(value: Hook*): Self = this.set("before", js.Array(value :_*))
    
    @scala.inline
    def setBeforeFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBefore(value: PartialHookMap | Hook | js.Array[Hook]): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setErrorVarargs(value: Hook*): Self = this.set("error", js.Array(value :_*))
    
    @scala.inline
    def setErrorFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: PartialHookMap | Hook | js.Array[Hook]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setFinallyVarargs(value: Hook*): Self = this.set("finally", js.Array(value :_*))
    
    @scala.inline
    def setFinallyFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("finally", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinally(value: PartialHookMap | Hook | js.Array[Hook]): Self = this.set("finally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinally: Self = this.set("finally", js.undefined)
  }
}

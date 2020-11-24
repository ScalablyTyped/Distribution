package typings.feathersjsFeathers.mod

import typings.feathersjsFeathers.anon.PartialHookMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HooksObject extends js.Object {
  
  var after: PartialHookMap | Hook | js.Array[Hook] = js.native
  
  var before: PartialHookMap | Hook | js.Array[Hook] = js.native
  
  var error: PartialHookMap | Hook | js.Array[Hook] = js.native
  
  var `finally`: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.native
}
object HooksObject {
  
  @scala.inline
  def apply(
    after: PartialHookMap | Hook | js.Array[Hook],
    before: PartialHookMap | Hook | js.Array[Hook],
    error: PartialHookMap | Hook | js.Array[Hook]
  ): HooksObject = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[HooksObject]
  }
  
  @scala.inline
  implicit class HooksObjectOps[Self <: HooksObject] (val x: Self) extends AnyVal {
    
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
    def setBeforeVarargs(value: Hook*): Self = this.set("before", js.Array(value :_*))
    
    @scala.inline
    def setBeforeFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBefore(value: PartialHookMap | Hook | js.Array[Hook]): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorVarargs(value: Hook*): Self = this.set("error", js.Array(value :_*))
    
    @scala.inline
    def setErrorFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: PartialHookMap | Hook | js.Array[Hook]): Self = this.set("error", value.asInstanceOf[js.Any])
    
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

package typings.feathersjsFeathers.anon

import typings.feathersjsFeathers.mod.Hook
import typings.feathersjsFeathers.mod.HookContext
import typings.feathersjsFeathers.mod.SkipSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.HookMap> */
@js.native
trait PartialHookMap extends js.Object {
  
  var all: js.UndefOr[Hook | js.Array[Hook]] = js.native
  
  var create: js.UndefOr[Hook | js.Array[Hook]] = js.native
  
  var find: js.UndefOr[Hook | js.Array[Hook]] = js.native
  
  var get: js.UndefOr[Hook | js.Array[Hook]] = js.native
  
  var patch: js.UndefOr[Hook | js.Array[Hook]] = js.native
  
  var remove: js.UndefOr[Hook | js.Array[Hook]] = js.native
  
  var update: js.UndefOr[Hook | js.Array[Hook]] = js.native
}
object PartialHookMap {
  
  @scala.inline
  def apply(): PartialHookMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialHookMap]
  }
  
  @scala.inline
  implicit class PartialHookMapOps[Self <: PartialHookMap] (val x: Self) extends AnyVal {
    
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
    def setAllVarargs(value: Hook*): Self = this.set("all", js.Array(value :_*))
    
    @scala.inline
    def setAllFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("all", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAll(value: Hook | js.Array[Hook]): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAll: Self = this.set("all", js.undefined)
    
    @scala.inline
    def setCreateVarargs(value: Hook*): Self = this.set("create", js.Array(value :_*))
    
    @scala.inline
    def setCreateFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreate(value: Hook | js.Array[Hook]): Self = this.set("create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setFindVarargs(value: Hook*): Self = this.set("find", js.Array(value :_*))
    
    @scala.inline
    def setFindFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFind(value: Hook | js.Array[Hook]): Self = this.set("find", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFind: Self = this.set("find", js.undefined)
    
    @scala.inline
    def setGetVarargs(value: Hook*): Self = this.set("get", js.Array(value :_*))
    
    @scala.inline
    def setGetFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: Hook | js.Array[Hook]): Self = this.set("get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setPatchVarargs(value: Hook*): Self = this.set("patch", js.Array(value :_*))
    
    @scala.inline
    def setPatchFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("patch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPatch(value: Hook | js.Array[Hook]): Self = this.set("patch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    
    @scala.inline
    def setRemoveVarargs(value: Hook*): Self = this.set("remove", js.Array(value :_*))
    
    @scala.inline
    def setRemoveFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Hook | js.Array[Hook]): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setUpdateVarargs(value: Hook*): Self = this.set("update", js.Array(value :_*))
    
    @scala.inline
    def setUpdateFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: Hook | js.Array[Hook]): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}

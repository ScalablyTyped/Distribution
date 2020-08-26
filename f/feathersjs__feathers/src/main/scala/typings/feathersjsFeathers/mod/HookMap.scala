package typings.feathersjsFeathers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookMap extends js.Object {
  var all: Hook | js.Array[Hook] = js.native
  var create: Hook | js.Array[Hook] = js.native
  var find: Hook | js.Array[Hook] = js.native
  var get: Hook | js.Array[Hook] = js.native
  var patch: Hook | js.Array[Hook] = js.native
  var remove: Hook | js.Array[Hook] = js.native
  var update: Hook | js.Array[Hook] = js.native
}

object HookMap {
  @scala.inline
  def apply(
    all: Hook | js.Array[Hook],
    create: Hook | js.Array[Hook],
    find: Hook | js.Array[Hook],
    get: Hook | js.Array[Hook],
    patch: Hook | js.Array[Hook],
    remove: Hook | js.Array[Hook],
    update: Hook | js.Array[Hook]
  ): HookMap = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookMap]
  }
  @scala.inline
  implicit class HookMapOps[Self <: HookMap] (val x: Self) extends AnyVal {
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
    def setCreateVarargs(value: Hook*): Self = this.set("create", js.Array(value :_*))
    @scala.inline
    def setCreateFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setCreate(value: Hook | js.Array[Hook]): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindVarargs(value: Hook*): Self = this.set("find", js.Array(value :_*))
    @scala.inline
    def setFindFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setFind(value: Hook | js.Array[Hook]): Self = this.set("find", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetVarargs(value: Hook*): Self = this.set("get", js.Array(value :_*))
    @scala.inline
    def setGetFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Hook | js.Array[Hook]): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchVarargs(value: Hook*): Self = this.set("patch", js.Array(value :_*))
    @scala.inline
    def setPatchFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Hook | js.Array[Hook]): Self = this.set("patch", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveVarargs(value: Hook*): Self = this.set("remove", js.Array(value :_*))
    @scala.inline
    def setRemoveFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: Hook | js.Array[Hook]): Self = this.set("remove", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateVarargs(value: Hook*): Self = this.set("update", js.Array(value :_*))
    @scala.inline
    def setUpdateFunction1(
      value: /* hook */ HookContext[js.Any] => (js.Promise[HookContext[js.Any] | SkipSymbol | Unit]) | HookContext[js.Any] | SkipSymbol | Unit
    ): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Hook | js.Array[Hook]): Self = this.set("update", value.asInstanceOf[js.Any])
  }
  
}


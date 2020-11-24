package typings.feathersjsFeathers.anon

import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Id
import typings.feathersjsFeathers.mod.NullableId
import typings.feathersjsFeathers.mod.Paginated
import typings.feathersjsFeathers.mod.Params
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
@js.native
trait PartialServiceMethodsanyS extends js.Object {
  
  var create: js.UndefOr[
    js.Function2[
      /* data */ Partial[_] | js.Array[Partial[_]], 
      /* params */ js.UndefOr[Params], 
      js.Promise[_ | js.Array[_]]
    ]
  ] = js.native
  
  var find: js.UndefOr[
    js.Function1[/* params */ js.UndefOr[Params], js.Promise[_ | js.Array[_] | Paginated[_]]]
  ] = js.native
  
  var get: js.UndefOr[js.Function2[/* id */ Id, /* params */ js.UndefOr[Params], js.Promise[_]]] = js.native
  
  var patch: js.UndefOr[
    js.Function3[
      /* id */ NullableId, 
      /* data */ Partial[_], 
      /* params */ js.UndefOr[Params], 
      js.Promise[_]
    ]
  ] = js.native
  
  var remove: js.UndefOr[
    js.Function2[/* id */ NullableId, /* params */ js.UndefOr[Params], js.Promise[_]]
  ] = js.native
  
  var setup: js.UndefOr[js.Function2[/* app */ Application[_], /* path */ String, Unit]] = js.native
  
  var update: js.UndefOr[
    js.Function3[/* id */ NullableId, /* data */ js.Any, /* params */ js.UndefOr[Params], js.Promise[_]]
  ] = js.native
}
object PartialServiceMethodsanyS {
  
  @scala.inline
  def apply(): PartialServiceMethodsanyS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServiceMethodsanyS]
  }
  
  @scala.inline
  implicit class PartialServiceMethodsanySOps[Self <: PartialServiceMethodsanyS] (val x: Self) extends AnyVal {
    
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
    def setCreate(
      value: (/* data */ Partial[_] | js.Array[Partial[_]], /* params */ js.UndefOr[Params]) => js.Promise[_ | js.Array[_]]
    ): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setFind(value: /* params */ js.UndefOr[Params] => js.Promise[_ | js.Array[_] | Paginated[_]]): Self = this.set("find", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFind: Self = this.set("find", js.undefined)
    
    @scala.inline
    def setGet(value: (/* id */ Id, /* params */ js.UndefOr[Params]) => js.Promise[_]): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setPatch(
      value: (/* id */ NullableId, /* data */ Partial[_], /* params */ js.UndefOr[Params]) => js.Promise[_]
    ): Self = this.set("patch", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePatch: Self = this.set("patch", js.undefined)
    
    @scala.inline
    def setRemove(value: (/* id */ NullableId, /* params */ js.UndefOr[Params]) => js.Promise[_]): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setSetup(value: (/* app */ Application[_], /* path */ String) => Unit): Self = this.set("setup", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetup: Self = this.set("setup", js.undefined)
    
    @scala.inline
    def setUpdate(value: (/* id */ NullableId, /* data */ js.Any, /* params */ js.UndefOr[Params]) => js.Promise[_]): Self = this.set("update", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}

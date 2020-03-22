package typings.feathersjsExpress

import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Id
import typings.feathersjsFeathers.mod.NullableId
import typings.feathersjsFeathers.mod.Paginated
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
trait PartialServiceMethodsanyS extends js.Object {
  var create: js.UndefOr[js.Function1[/* data */ Partial[_], js.Promise[_ | js.Array[_]]]] = js.undefined
  var find: js.UndefOr[js.Function0[js.Promise[_ | js.Array[_] | Paginated[_]]]] = js.undefined
  var get: js.UndefOr[js.Function1[/* id */ Id, js.Promise[_]]] = js.undefined
  var patch: js.UndefOr[js.Function2[/* id */ NullableId, /* data */ Partial[_], js.Promise[_]]] = js.undefined
  var remove: js.UndefOr[js.Function1[/* id */ NullableId, js.Promise[_]]] = js.undefined
  var setup: js.UndefOr[js.Function2[/* app */ Application[_], /* path */ String, Unit]] = js.undefined
  var update: js.UndefOr[js.Function2[/* id */ NullableId, /* data */ js.Any, js.Promise[_]]] = js.undefined
}

object PartialServiceMethodsanyS {
  @scala.inline
  def apply(
    create: /* data */ Partial[_] => js.Promise[_ | js.Array[_]] = null,
    find: () => js.Promise[_ | js.Array[_] | Paginated[_]] = null,
    get: /* id */ Id => js.Promise[_] = null,
    patch: (/* id */ NullableId, /* data */ Partial[_]) => js.Promise[_] = null,
    remove: /* id */ NullableId => js.Promise[_] = null,
    setup: (/* app */ Application[_], /* path */ String) => Unit = null,
    update: (/* id */ NullableId, /* data */ js.Any) => js.Promise[_] = null
  ): PartialServiceMethodsanyS = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction0(find))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (patch != null) __obj.updateDynamic("patch")(js.Any.fromFunction2(patch))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction2(setup))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction2(update))
    __obj.asInstanceOf[PartialServiceMethodsanyS]
  }
}


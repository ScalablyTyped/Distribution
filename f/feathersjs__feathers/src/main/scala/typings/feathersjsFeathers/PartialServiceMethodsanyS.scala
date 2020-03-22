package typings.feathersjsFeathers

import typings.feathersjsFeathers.mod.Application
import typings.feathersjsFeathers.mod.Id
import typings.feathersjsFeathers.mod.NullableId
import typings.feathersjsFeathers.mod.Paginated
import typings.feathersjsFeathers.mod.Params
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
trait PartialServiceMethodsanyS extends js.Object {
  var create: js.UndefOr[
    js.Function2[
      /* data */ Partial[_] | js.Array[Partial[_]], 
      /* params */ js.UndefOr[Params], 
      js.Promise[_ | js.Array[_]]
    ]
  ] = js.undefined
  var find: js.UndefOr[
    js.Function1[/* params */ js.UndefOr[Params], js.Promise[_ | js.Array[_] | Paginated[_]]]
  ] = js.undefined
  var get: js.UndefOr[js.Function2[/* id */ Id, /* params */ js.UndefOr[Params], js.Promise[_]]] = js.undefined
  var patch: js.UndefOr[
    js.Function3[
      /* id */ NullableId, 
      /* data */ Partial[_], 
      /* params */ js.UndefOr[Params], 
      js.Promise[_]
    ]
  ] = js.undefined
  var remove: js.UndefOr[
    js.Function2[/* id */ NullableId, /* params */ js.UndefOr[Params], js.Promise[_]]
  ] = js.undefined
  var setup: js.UndefOr[js.Function2[/* app */ Application[_], /* path */ String, Unit]] = js.undefined
  var update: js.UndefOr[
    js.Function3[/* id */ NullableId, /* data */ js.Any, /* params */ js.UndefOr[Params], js.Promise[_]]
  ] = js.undefined
}

object PartialServiceMethodsanyS {
  @scala.inline
  def apply(
    create: (/* data */ Partial[_] | js.Array[Partial[_]], /* params */ js.UndefOr[Params]) => js.Promise[_ | js.Array[_]] = null,
    find: /* params */ js.UndefOr[Params] => js.Promise[_ | js.Array[_] | Paginated[_]] = null,
    get: (/* id */ Id, /* params */ js.UndefOr[Params]) => js.Promise[_] = null,
    patch: (/* id */ NullableId, /* data */ Partial[_], /* params */ js.UndefOr[Params]) => js.Promise[_] = null,
    remove: (/* id */ NullableId, /* params */ js.UndefOr[Params]) => js.Promise[_] = null,
    setup: (/* app */ Application[_], /* path */ String) => Unit = null,
    update: (/* id */ NullableId, /* data */ js.Any, /* params */ js.UndefOr[Params]) => js.Promise[_] = null
  ): PartialServiceMethodsanyS = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (find != null) __obj.updateDynamic("find")(js.Any.fromFunction1(find))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction2(get))
    if (patch != null) __obj.updateDynamic("patch")(js.Any.fromFunction3(patch))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction2(remove))
    if (setup != null) __obj.updateDynamic("setup")(js.Any.fromFunction2(setup))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3(update))
    __obj.asInstanceOf[PartialServiceMethodsanyS]
  }
}


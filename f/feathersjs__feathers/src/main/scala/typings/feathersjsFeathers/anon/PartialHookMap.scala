package typings.feathersjsFeathers.anon

import typings.feathersjsFeathers.mod.Hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.HookMap> */
trait PartialHookMap extends js.Object {
  var all: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
  var create: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
  var find: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
  var get: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
  var patch: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
  var remove: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
  var update: js.UndefOr[Hook | js.Array[Hook]] = js.undefined
}

object PartialHookMap {
  @scala.inline
  def apply(
    all: Hook | js.Array[Hook] = null,
    create: Hook | js.Array[Hook] = null,
    find: Hook | js.Array[Hook] = null,
    get: Hook | js.Array[Hook] = null,
    patch: Hook | js.Array[Hook] = null,
    remove: Hook | js.Array[Hook] = null,
    update: Hook | js.Array[Hook] = null
  ): PartialHookMap = {
    val __obj = js.Dynamic.literal()
    if (all != null) __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (find != null) __obj.updateDynamic("find")(find.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    if (patch != null) __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHookMap]
  }
}


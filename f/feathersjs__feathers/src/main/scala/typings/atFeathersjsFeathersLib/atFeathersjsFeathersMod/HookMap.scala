package typings
package atFeathersjsFeathersLib.atFeathersjsFeathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookMap extends js.Object {
  var all: Hook | js.Array[Hook]
  var create: Hook | js.Array[Hook]
  var find: Hook | js.Array[Hook]
  var get: Hook | js.Array[Hook]
  var patch: Hook | js.Array[Hook]
  var remove: Hook | js.Array[Hook]
  var update: Hook | js.Array[Hook]
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    __obj.updateDynamic("find")(find.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    __obj.updateDynamic("patch")(patch.asInstanceOf[js.Any])
    __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookMap]
  }
}


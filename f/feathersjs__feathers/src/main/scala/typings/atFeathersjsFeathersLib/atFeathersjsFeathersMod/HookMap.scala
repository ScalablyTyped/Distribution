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
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], create = create.asInstanceOf[js.Any], find = find.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookMap]
  }
}


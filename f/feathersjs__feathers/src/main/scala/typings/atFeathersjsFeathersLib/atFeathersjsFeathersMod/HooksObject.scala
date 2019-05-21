package typings
package atFeathersjsFeathersLib.atFeathersjsFeathersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HooksObject extends js.Object {
  var after: stdLib.Partial[HookMap] | Hook | js.Array[Hook]
  var before: stdLib.Partial[HookMap] | Hook | js.Array[Hook]
  var error: stdLib.Partial[HookMap] | Hook | js.Array[Hook]
  var `finally`: js.UndefOr[stdLib.Partial[HookMap] | Hook | js.Array[Hook]] = js.undefined
}

object HooksObject {
  @scala.inline
  def apply(
    after: stdLib.Partial[HookMap] | Hook | js.Array[Hook],
    before: stdLib.Partial[HookMap] | Hook | js.Array[Hook],
    error: stdLib.Partial[HookMap] | Hook | js.Array[Hook],
    `finally`: stdLib.Partial[HookMap] | Hook | js.Array[Hook] = null
  ): HooksObject = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    if (`finally` != null) __obj.updateDynamic("finally")(`finally`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HooksObject]
  }
}


package typings.atFeathersjsFeathers.atFeathersjsFeathersMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HooksObject extends js.Object {
  var after: Partial[HookMap] | Hook | js.Array[Hook]
  var before: Partial[HookMap] | Hook | js.Array[Hook]
  var error: Partial[HookMap] | Hook | js.Array[Hook]
  var `finally`: js.UndefOr[Partial[HookMap] | Hook | js.Array[Hook]] = js.undefined
}

object HooksObject {
  @scala.inline
  def apply(
    after: Partial[HookMap] | Hook | js.Array[Hook],
    before: Partial[HookMap] | Hook | js.Array[Hook],
    error: Partial[HookMap] | Hook | js.Array[Hook],
    `finally`: Partial[HookMap] | Hook | js.Array[Hook] = null
  ): HooksObject = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    if (`finally` != null) __obj.updateDynamic("finally")(`finally`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HooksObject]
  }
}


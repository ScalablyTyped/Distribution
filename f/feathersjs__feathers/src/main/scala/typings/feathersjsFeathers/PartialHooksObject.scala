package typings.feathersjsFeathers

import typings.feathersjsFeathers.mod.Hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.HooksObject> */
trait PartialHooksObject extends js.Object {
  var after: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.undefined
  var before: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.undefined
  var error: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.undefined
  var `finally`: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.undefined
}

object PartialHooksObject {
  @scala.inline
  def apply(
    after: PartialHookMap | Hook | js.Array[Hook] = null,
    before: PartialHookMap | Hook | js.Array[Hook] = null,
    error: PartialHookMap | Hook | js.Array[Hook] = null,
    `finally`: PartialHookMap | Hook | js.Array[Hook] = null
  ): PartialHooksObject = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (`finally` != null) __obj.updateDynamic("finally")(`finally`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialHooksObject]
  }
}


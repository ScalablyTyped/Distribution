package typings.feathersjsFeathers.mod

import typings.feathersjsFeathers.PartialHookMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HooksObject extends js.Object {
  var after: PartialHookMap | Hook | js.Array[Hook]
  var before: PartialHookMap | Hook | js.Array[Hook]
  var error: PartialHookMap | Hook | js.Array[Hook]
  var `finally`: js.UndefOr[PartialHookMap | Hook | js.Array[Hook]] = js.undefined
}

object HooksObject {
  @scala.inline
  def apply(
    after: PartialHookMap | Hook | js.Array[Hook],
    before: PartialHookMap | Hook | js.Array[Hook],
    error: PartialHookMap | Hook | js.Array[Hook],
    `finally`: PartialHookMap | Hook | js.Array[Hook] = null
  ): HooksObject = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    if (`finally` != null) __obj.updateDynamic("finally")(`finally`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HooksObject]
  }
}


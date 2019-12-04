package typings.atFirebaseFirestore.distTestUnitSpecsSpecUnderscoreTestUnderscoreRunnerMod

import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecWatchRemove extends js.Object {
  var cause: js.UndefOr[SpecError] = js.undefined
  var targetIds: js.Array[TargetId]
}

object SpecWatchRemove {
  @scala.inline
  def apply(targetIds: js.Array[TargetId], cause: SpecError = null): SpecWatchRemove = {
    val __obj = js.Dynamic.literal(targetIds = targetIds.asInstanceOf[js.Any])
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWatchRemove]
  }
}


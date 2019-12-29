package typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateUnderscoreSchemaMod

import typings.atFirebaseFirestore.Anon_Code
import typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateUnderscoreSyncerMod.QueryTargetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTargetStateSchema extends js.Object {
  var error: js.UndefOr[Anon_Code] = js.undefined
  var state: QueryTargetState
  var updateTimeMs: Double
}

object QueryTargetStateSchema {
  @scala.inline
  def apply(state: QueryTargetState, updateTimeMs: Double, error: Anon_Code = null): QueryTargetStateSchema = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTargetStateSchema]
  }
}


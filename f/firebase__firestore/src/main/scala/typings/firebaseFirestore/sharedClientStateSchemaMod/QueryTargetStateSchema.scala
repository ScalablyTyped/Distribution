package typings.firebaseFirestore.sharedClientStateSchemaMod

import typings.firebaseFirestore.anon.Code
import typings.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTargetStateSchema extends js.Object {
  var error: js.UndefOr[Code] = js.undefined
  var state: QueryTargetState
  var updateTimeMs: Double
}

object QueryTargetStateSchema {
  @scala.inline
  def apply(state: QueryTargetState, updateTimeMs: Double, error: Code = null): QueryTargetStateSchema = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTargetStateSchema]
  }
}


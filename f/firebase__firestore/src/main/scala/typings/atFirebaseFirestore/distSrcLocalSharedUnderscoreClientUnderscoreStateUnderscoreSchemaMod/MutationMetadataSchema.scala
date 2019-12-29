package typings.atFirebaseFirestore.distSrcLocalSharedUnderscoreClientUnderscoreStateUnderscoreSchemaMod

import typings.atFirebaseFirestore.Anon_Code
import typings.atFirebaseFirestore.distSrcCoreTypesMod.MutationBatchState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationMetadataSchema extends js.Object {
  var error: js.UndefOr[Anon_Code] = js.undefined
  var state: MutationBatchState
  var updateTimeMs: Double
}

object MutationMetadataSchema {
  @scala.inline
  def apply(state: MutationBatchState, updateTimeMs: Double, error: Anon_Code = null): MutationMetadataSchema = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], updateTimeMs = updateTimeMs.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationMetadataSchema]
  }
}


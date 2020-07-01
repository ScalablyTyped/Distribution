package typings.googleapis.bigqueryV2Mod.bigqueryV2

import typings.googleapis.anon.Labels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaModelDefinition extends js.Object {
  /**
    * [Output-only, Beta] Model options used for the first training run. These
    * options are immutable for subsequent training runs. Default values are
    * used for any options not specified in the input query.
    */
  var modelOptions: js.UndefOr[Labels] = js.native
  /**
    * [Output-only, Beta] Information about ml training runs, each training run
    * comprises of multiple iterations and there may be multiple training runs
    * for the model if warm start is used or if a user decides to continue a
    * previously cancelled query.
    */
  var trainingRuns: js.UndefOr[js.Array[SchemaBqmlTrainingRun]] = js.native
}

object SchemaModelDefinition {
  @scala.inline
  def apply(modelOptions: Labels = null, trainingRuns: js.Array[SchemaBqmlTrainingRun] = null): SchemaModelDefinition = {
    val __obj = js.Dynamic.literal()
    if (modelOptions != null) __obj.updateDynamic("modelOptions")(modelOptions.asInstanceOf[js.Any])
    if (trainingRuns != null) __obj.updateDynamic("trainingRuns")(trainingRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaModelDefinition]
  }
}


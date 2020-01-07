package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import typings.googleapis.Anon_Labels
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ModelDefinition extends js.Object {
  /**
    * [Output-only, Beta] Model options used for the first training run. These
    * options are immutable for subsequent training runs. Default values are
    * used for any options not specified in the input query.
    */
  var modelOptions: js.UndefOr[Anon_Labels] = js.native
  /**
    * [Output-only, Beta] Information about ml training runs, each training run
    * comprises of multiple iterations and there may be multiple training runs
    * for the model if warm start is used or if a user decides to continue a
    * previously cancelled query.
    */
  var trainingRuns: js.UndefOr[js.Array[Schema$BqmlTrainingRun]] = js.native
}

object Schema$ModelDefinition {
  @scala.inline
  def apply(modelOptions: Anon_Labels = null, trainingRuns: js.Array[Schema$BqmlTrainingRun] = null): Schema$ModelDefinition = {
    val __obj = js.Dynamic.literal()
    if (modelOptions != null) __obj.updateDynamic("modelOptions")(modelOptions.asInstanceOf[js.Any])
    if (trainingRuns != null) __obj.updateDynamic("trainingRuns")(trainingRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ModelDefinition]
  }
}


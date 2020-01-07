package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BigQueryModelTraining extends js.Object {
  /**
    * [Output-only, Beta] Index of current ML training iteration. Updated
    * during create model query job to show job progress.
    */
  var currentIteration: js.UndefOr[Double] = js.native
  /**
    * [Output-only, Beta] Expected number of iterations for the create model
    * query job specified as num_iterations in the input query. The actual
    * total number of iterations may be less than this number due to early
    * stop.
    */
  var expectedTotalIterations: js.UndefOr[String] = js.native
}

object Schema$BigQueryModelTraining {
  @scala.inline
  def apply(currentIteration: Int | Double = null, expectedTotalIterations: String = null): Schema$BigQueryModelTraining = {
    val __obj = js.Dynamic.literal()
    if (currentIteration != null) __obj.updateDynamic("currentIteration")(currentIteration.asInstanceOf[js.Any])
    if (expectedTotalIterations != null) __obj.updateDynamic("expectedTotalIterations")(expectedTotalIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BigQueryModelTraining]
  }
}


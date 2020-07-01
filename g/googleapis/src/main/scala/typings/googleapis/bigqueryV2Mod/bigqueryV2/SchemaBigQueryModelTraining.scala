package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBigQueryModelTraining extends js.Object {
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

object SchemaBigQueryModelTraining {
  @scala.inline
  def apply(currentIteration: js.UndefOr[Double] = js.undefined, expectedTotalIterations: String = null): SchemaBigQueryModelTraining = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(currentIteration)) __obj.updateDynamic("currentIteration")(currentIteration.get.asInstanceOf[js.Any])
    if (expectedTotalIterations != null) __obj.updateDynamic("expectedTotalIterations")(expectedTotalIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBigQueryModelTraining]
  }
}


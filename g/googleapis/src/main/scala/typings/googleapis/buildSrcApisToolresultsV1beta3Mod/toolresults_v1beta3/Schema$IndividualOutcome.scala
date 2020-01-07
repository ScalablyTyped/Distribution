package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Step Id and outcome of each individual step that was run as a group with
  * other steps with the same configuration.
  */
@js.native
trait Schema$IndividualOutcome extends js.Object {
  var outcomeSummary: js.UndefOr[String] = js.native
  var stepId: js.UndefOr[String] = js.native
}

object Schema$IndividualOutcome {
  @scala.inline
  def apply(outcomeSummary: String = null, stepId: String = null): Schema$IndividualOutcome = {
    val __obj = js.Dynamic.literal()
    if (outcomeSummary != null) __obj.updateDynamic("outcomeSummary")(outcomeSummary.asInstanceOf[js.Any])
    if (stepId != null) __obj.updateDynamic("stepId")(stepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$IndividualOutcome]
  }
}


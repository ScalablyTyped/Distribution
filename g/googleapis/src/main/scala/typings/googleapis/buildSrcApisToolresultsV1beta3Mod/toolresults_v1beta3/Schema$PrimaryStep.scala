package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores rollup test status of multiple steps that were run as a group and
  * outcome of each individual step.
  */
@js.native
trait Schema$PrimaryStep extends js.Object {
  /**
    * Step Id and outcome of each individual step.
    */
  var individualOutcome: js.UndefOr[js.Array[Schema$IndividualOutcome]] = js.native
  /**
    * Rollup test status of multiple steps that were run with the same
    * configuration as a group.
    */
  var rollUp: js.UndefOr[String] = js.native
}

object Schema$PrimaryStep {
  @scala.inline
  def apply(individualOutcome: js.Array[Schema$IndividualOutcome] = null, rollUp: String = null): Schema$PrimaryStep = {
    val __obj = js.Dynamic.literal()
    if (individualOutcome != null) __obj.updateDynamic("individualOutcome")(individualOutcome.asInstanceOf[js.Any])
    if (rollUp != null) __obj.updateDynamic("rollUp")(rollUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PrimaryStep]
  }
}


package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details when multiple steps are run with the same configuration as a group.
  */
@js.native
trait Schema$MultiStep extends js.Object {
  /**
    * Unique int given to each step. Ranges from 0(inclusive) to total number
    * of steps(exclusive). The primary step is 0.
    */
  var multistepNumber: js.UndefOr[Double] = js.native
  /**
    * Present if it is a primary (original) step.
    */
  var primaryStep: js.UndefOr[Schema$PrimaryStep] = js.native
  /**
    * Step Id of the primary (original) step, which might be this step.
    */
  var primaryStepId: js.UndefOr[String] = js.native
}

object Schema$MultiStep {
  @scala.inline
  def apply(
    multistepNumber: Int | Double = null,
    primaryStep: Schema$PrimaryStep = null,
    primaryStepId: String = null
  ): Schema$MultiStep = {
    val __obj = js.Dynamic.literal()
    if (multistepNumber != null) __obj.updateDynamic("multistepNumber")(multistepNumber.asInstanceOf[js.Any])
    if (primaryStep != null) __obj.updateDynamic("primaryStep")(primaryStep.asInstanceOf[js.Any])
    if (primaryStepId != null) __obj.updateDynamic("primaryStepId")(primaryStepId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MultiStep]
  }
}


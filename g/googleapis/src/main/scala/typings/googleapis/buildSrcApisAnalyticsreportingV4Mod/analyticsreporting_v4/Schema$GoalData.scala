package typings.googleapis.buildSrcApisAnalyticsreportingV4Mod.analyticsreporting_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents all the details pertaining to a goal.
  */
@js.native
trait Schema$GoalData extends js.Object {
  /**
    * URL of the page where this goal was completed.
    */
  var goalCompletionLocation: js.UndefOr[String] = js.native
  /**
    * Total number of goal completions in this activity.
    */
  var goalCompletions: js.UndefOr[String] = js.native
  /**
    * This identifies the goal as configured for the profile.
    */
  var goalIndex: js.UndefOr[Double] = js.native
  /**
    * Name of the goal.
    */
  var goalName: js.UndefOr[String] = js.native
  /**
    * URL of the page one step prior to the goal completion.
    */
  var goalPreviousStep1: js.UndefOr[String] = js.native
  /**
    * URL of the page two steps prior to the goal completion.
    */
  var goalPreviousStep2: js.UndefOr[String] = js.native
  /**
    * URL of the page three steps prior to the goal completion.
    */
  var goalPreviousStep3: js.UndefOr[String] = js.native
  /**
    * Value in this goal.
    */
  var goalValue: js.UndefOr[Double] = js.native
}

object Schema$GoalData {
  @scala.inline
  def apply(
    goalCompletionLocation: String = null,
    goalCompletions: String = null,
    goalIndex: Int | Double = null,
    goalName: String = null,
    goalPreviousStep1: String = null,
    goalPreviousStep2: String = null,
    goalPreviousStep3: String = null,
    goalValue: Int | Double = null
  ): Schema$GoalData = {
    val __obj = js.Dynamic.literal()
    if (goalCompletionLocation != null) __obj.updateDynamic("goalCompletionLocation")(goalCompletionLocation.asInstanceOf[js.Any])
    if (goalCompletions != null) __obj.updateDynamic("goalCompletions")(goalCompletions.asInstanceOf[js.Any])
    if (goalIndex != null) __obj.updateDynamic("goalIndex")(goalIndex.asInstanceOf[js.Any])
    if (goalName != null) __obj.updateDynamic("goalName")(goalName.asInstanceOf[js.Any])
    if (goalPreviousStep1 != null) __obj.updateDynamic("goalPreviousStep1")(goalPreviousStep1.asInstanceOf[js.Any])
    if (goalPreviousStep2 != null) __obj.updateDynamic("goalPreviousStep2")(goalPreviousStep2.asInstanceOf[js.Any])
    if (goalPreviousStep3 != null) __obj.updateDynamic("goalPreviousStep3")(goalPreviousStep3.asInstanceOf[js.Any])
    if (goalValue != null) __obj.updateDynamic("goalValue")(goalValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoalData]
  }
}


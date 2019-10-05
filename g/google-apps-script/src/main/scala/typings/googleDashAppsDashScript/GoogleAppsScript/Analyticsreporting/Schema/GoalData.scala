package typings.googleDashAppsDashScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalData extends js.Object {
  var goalCompletionLocation: js.UndefOr[String] = js.undefined
  var goalCompletions: js.UndefOr[String] = js.undefined
  var goalIndex: js.UndefOr[Double] = js.undefined
  var goalName: js.UndefOr[String] = js.undefined
  var goalPreviousStep1: js.UndefOr[String] = js.undefined
  var goalPreviousStep2: js.UndefOr[String] = js.undefined
  var goalPreviousStep3: js.UndefOr[String] = js.undefined
  var goalValue: js.UndefOr[Double] = js.undefined
}

object GoalData {
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
  ): GoalData = {
    val __obj = js.Dynamic.literal()
    if (goalCompletionLocation != null) __obj.updateDynamic("goalCompletionLocation")(goalCompletionLocation)
    if (goalCompletions != null) __obj.updateDynamic("goalCompletions")(goalCompletions)
    if (goalIndex != null) __obj.updateDynamic("goalIndex")(goalIndex.asInstanceOf[js.Any])
    if (goalName != null) __obj.updateDynamic("goalName")(goalName)
    if (goalPreviousStep1 != null) __obj.updateDynamic("goalPreviousStep1")(goalPreviousStep1)
    if (goalPreviousStep2 != null) __obj.updateDynamic("goalPreviousStep2")(goalPreviousStep2)
    if (goalPreviousStep3 != null) __obj.updateDynamic("goalPreviousStep3")(goalPreviousStep3)
    if (goalValue != null) __obj.updateDynamic("goalValue")(goalValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoalData]
  }
}


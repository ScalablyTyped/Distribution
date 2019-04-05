package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsreportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoalData extends js.Object {
  var goalCompletionLocation: js.UndefOr[java.lang.String] = js.undefined
  var goalCompletions: js.UndefOr[java.lang.String] = js.undefined
  var goalIndex: js.UndefOr[scala.Double] = js.undefined
  var goalName: js.UndefOr[java.lang.String] = js.undefined
  var goalPreviousStep1: js.UndefOr[java.lang.String] = js.undefined
  var goalPreviousStep2: js.UndefOr[java.lang.String] = js.undefined
  var goalPreviousStep3: js.UndefOr[java.lang.String] = js.undefined
  var goalValue: js.UndefOr[stdLib.Number] = js.undefined
}

object GoalData {
  @scala.inline
  def apply(
    goalCompletionLocation: java.lang.String = null,
    goalCompletions: java.lang.String = null,
    goalIndex: scala.Int | scala.Double = null,
    goalName: java.lang.String = null,
    goalPreviousStep1: java.lang.String = null,
    goalPreviousStep2: java.lang.String = null,
    goalPreviousStep3: java.lang.String = null,
    goalValue: stdLib.Number = null
  ): GoalData = {
    val __obj = js.Dynamic.literal()
    if (goalCompletionLocation != null) __obj.updateDynamic("goalCompletionLocation")(goalCompletionLocation)
    if (goalCompletions != null) __obj.updateDynamic("goalCompletions")(goalCompletions)
    if (goalIndex != null) __obj.updateDynamic("goalIndex")(goalIndex.asInstanceOf[js.Any])
    if (goalName != null) __obj.updateDynamic("goalName")(goalName)
    if (goalPreviousStep1 != null) __obj.updateDynamic("goalPreviousStep1")(goalPreviousStep1)
    if (goalPreviousStep2 != null) __obj.updateDynamic("goalPreviousStep2")(goalPreviousStep2)
    if (goalPreviousStep3 != null) __obj.updateDynamic("goalPreviousStep3")(goalPreviousStep3)
    if (goalValue != null) __obj.updateDynamic("goalValue")(goalValue)
    __obj.asInstanceOf[GoalData]
  }
}


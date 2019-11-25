package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmissionHistory extends js.Object {
  var gradeHistory: js.UndefOr[GradeHistory] = js.undefined
  var stateHistory: js.UndefOr[StateHistory] = js.undefined
}

object SubmissionHistory {
  @scala.inline
  def apply(gradeHistory: GradeHistory = null, stateHistory: StateHistory = null): SubmissionHistory = {
    val __obj = js.Dynamic.literal()
    if (gradeHistory != null) __obj.updateDynamic("gradeHistory")(gradeHistory.asInstanceOf[js.Any])
    if (stateHistory != null) __obj.updateDynamic("stateHistory")(stateHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmissionHistory]
  }
}


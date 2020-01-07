package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The history of the submission. This currently includes state and grade
  * histories.
  */
@js.native
trait Schema$SubmissionHistory extends js.Object {
  /**
    * The grade history information of the submission, if present.
    */
  var gradeHistory: js.UndefOr[Schema$GradeHistory] = js.native
  /**
    * The state history information of the submission, if present.
    */
  var stateHistory: js.UndefOr[Schema$StateHistory] = js.native
}

object Schema$SubmissionHistory {
  @scala.inline
  def apply(gradeHistory: Schema$GradeHistory = null, stateHistory: Schema$StateHistory = null): Schema$SubmissionHistory = {
    val __obj = js.Dynamic.literal()
    if (gradeHistory != null) __obj.updateDynamic("gradeHistory")(gradeHistory.asInstanceOf[js.Any])
    if (stateHistory != null) __obj.updateDynamic("stateHistory")(stateHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SubmissionHistory]
  }
}


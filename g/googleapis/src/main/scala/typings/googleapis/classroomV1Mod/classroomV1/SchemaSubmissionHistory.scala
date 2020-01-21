package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The history of the submission. This currently includes state and grade
  * histories.
  */
@js.native
trait SchemaSubmissionHistory extends js.Object {
  /**
    * The grade history information of the submission, if present.
    */
  var gradeHistory: js.UndefOr[SchemaGradeHistory] = js.native
  /**
    * The state history information of the submission, if present.
    */
  var stateHistory: js.UndefOr[SchemaStateHistory] = js.native
}

object SchemaSubmissionHistory {
  @scala.inline
  def apply(gradeHistory: SchemaGradeHistory = null, stateHistory: SchemaStateHistory = null): SchemaSubmissionHistory = {
    val __obj = js.Dynamic.literal()
    if (gradeHistory != null) __obj.updateDynamic("gradeHistory")(gradeHistory.asInstanceOf[js.Any])
    if (stateHistory != null) __obj.updateDynamic("stateHistory")(stateHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubmissionHistory]
  }
}


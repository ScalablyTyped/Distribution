package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The history of each grade on this submission.
  */
@js.native
trait SchemaGradeHistory extends js.Object {
  /**
    * The teacher who made the grade change.
    */
  var actorUserId: js.UndefOr[String] = js.native
  /**
    * The type of grade change at this time in the submission grade history.
    */
  var gradeChangeType: js.UndefOr[String] = js.native
  /**
    * When the grade of the submission was changed.
    */
  var gradeTimestamp: js.UndefOr[String] = js.native
  /**
    * The denominator of the grade at this time in the submission grade
    * history.
    */
  var maxPoints: js.UndefOr[Double] = js.native
  /**
    * The numerator of the grade at this time in the submission grade history.
    */
  var pointsEarned: js.UndefOr[Double] = js.native
}

object SchemaGradeHistory {
  @scala.inline
  def apply(
    actorUserId: String = null,
    gradeChangeType: String = null,
    gradeTimestamp: String = null,
    maxPoints: js.UndefOr[Double] = js.undefined,
    pointsEarned: js.UndefOr[Double] = js.undefined
  ): SchemaGradeHistory = {
    val __obj = js.Dynamic.literal()
    if (actorUserId != null) __obj.updateDynamic("actorUserId")(actorUserId.asInstanceOf[js.Any])
    if (gradeChangeType != null) __obj.updateDynamic("gradeChangeType")(gradeChangeType.asInstanceOf[js.Any])
    if (gradeTimestamp != null) __obj.updateDynamic("gradeTimestamp")(gradeTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPoints)) __obj.updateDynamic("maxPoints")(maxPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointsEarned)) __obj.updateDynamic("pointsEarned")(pointsEarned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGradeHistory]
  }
}


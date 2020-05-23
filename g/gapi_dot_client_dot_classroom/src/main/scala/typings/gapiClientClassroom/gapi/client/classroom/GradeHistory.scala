package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradeHistory extends js.Object {
  /** The teacher who made the grade change. */
  var actorUserId: js.UndefOr[String] = js.undefined
  /** The type of grade change at this time in the submission grade history. */
  var gradeChangeType: js.UndefOr[String] = js.undefined
  /** When the grade of the submission was changed. */
  var gradeTimestamp: js.UndefOr[String] = js.undefined
  /**
    * The denominator of the grade at this time in the submission grade
    * history.
    */
  var maxPoints: js.UndefOr[Double] = js.undefined
  /** The numerator of the grade at this time in the submission grade history. */
  var pointsEarned: js.UndefOr[Double] = js.undefined
}

object GradeHistory {
  @scala.inline
  def apply(
    actorUserId: String = null,
    gradeChangeType: String = null,
    gradeTimestamp: String = null,
    maxPoints: js.UndefOr[Double] = js.undefined,
    pointsEarned: js.UndefOr[Double] = js.undefined
  ): GradeHistory = {
    val __obj = js.Dynamic.literal()
    if (actorUserId != null) __obj.updateDynamic("actorUserId")(actorUserId.asInstanceOf[js.Any])
    if (gradeChangeType != null) __obj.updateDynamic("gradeChangeType")(gradeChangeType.asInstanceOf[js.Any])
    if (gradeTimestamp != null) __obj.updateDynamic("gradeTimestamp")(gradeTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPoints)) __obj.updateDynamic("maxPoints")(maxPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pointsEarned)) __obj.updateDynamic("pointsEarned")(pointsEarned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradeHistory]
  }
}


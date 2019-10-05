package typings.gapiDotClientDotClassroom.gapi.client.classroom

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
    maxPoints: Int | Double = null,
    pointsEarned: Int | Double = null
  ): GradeHistory = {
    val __obj = js.Dynamic.literal()
    if (actorUserId != null) __obj.updateDynamic("actorUserId")(actorUserId)
    if (gradeChangeType != null) __obj.updateDynamic("gradeChangeType")(gradeChangeType)
    if (gradeTimestamp != null) __obj.updateDynamic("gradeTimestamp")(gradeTimestamp)
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints.asInstanceOf[js.Any])
    if (pointsEarned != null) __obj.updateDynamic("pointsEarned")(pointsEarned.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradeHistory]
  }
}


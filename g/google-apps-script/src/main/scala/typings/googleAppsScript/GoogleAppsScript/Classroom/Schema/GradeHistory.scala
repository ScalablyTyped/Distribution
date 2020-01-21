package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradeHistory extends js.Object {
  var actorUserId: js.UndefOr[String] = js.undefined
  var gradeChangeType: js.UndefOr[String] = js.undefined
  var gradeTimestamp: js.UndefOr[String] = js.undefined
  var maxPoints: js.UndefOr[Double] = js.undefined
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
    if (actorUserId != null) __obj.updateDynamic("actorUserId")(actorUserId.asInstanceOf[js.Any])
    if (gradeChangeType != null) __obj.updateDynamic("gradeChangeType")(gradeChangeType.asInstanceOf[js.Any])
    if (gradeTimestamp != null) __obj.updateDynamic("gradeTimestamp")(gradeTimestamp.asInstanceOf[js.Any])
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints.asInstanceOf[js.Any])
    if (pointsEarned != null) __obj.updateDynamic("pointsEarned")(pointsEarned.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradeHistory]
  }
}


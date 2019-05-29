package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradeHistory extends js.Object {
  var actorUserId: js.UndefOr[java.lang.String] = js.undefined
  var gradeChangeType: js.UndefOr[java.lang.String] = js.undefined
  var gradeTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var maxPoints: js.UndefOr[scala.Double] = js.undefined
  var pointsEarned: js.UndefOr[scala.Double] = js.undefined
}

object GradeHistory {
  @scala.inline
  def apply(
    actorUserId: java.lang.String = null,
    gradeChangeType: java.lang.String = null,
    gradeTimestamp: java.lang.String = null,
    maxPoints: scala.Int | scala.Double = null,
    pointsEarned: scala.Int | scala.Double = null
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


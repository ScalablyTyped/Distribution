package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradeHistory extends js.Object {
  var actorUserId: js.UndefOr[java.lang.String] = js.undefined
  var gradeChangeType: js.UndefOr[java.lang.String] = js.undefined
  var gradeTimestamp: js.UndefOr[java.lang.String] = js.undefined
  var maxPoints: js.UndefOr[stdLib.Number] = js.undefined
  var pointsEarned: js.UndefOr[stdLib.Number] = js.undefined
}

object GradeHistory {
  @scala.inline
  def apply(
    actorUserId: java.lang.String = null,
    gradeChangeType: java.lang.String = null,
    gradeTimestamp: java.lang.String = null,
    maxPoints: stdLib.Number = null,
    pointsEarned: stdLib.Number = null
  ): GradeHistory = {
    val __obj = js.Dynamic.literal()
    if (actorUserId != null) __obj.updateDynamic("actorUserId")(actorUserId)
    if (gradeChangeType != null) __obj.updateDynamic("gradeChangeType")(gradeChangeType)
    if (gradeTimestamp != null) __obj.updateDynamic("gradeTimestamp")(gradeTimestamp)
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints)
    if (pointsEarned != null) __obj.updateDynamic("pointsEarned")(pointsEarned)
    __obj.asInstanceOf[GradeHistory]
  }
}


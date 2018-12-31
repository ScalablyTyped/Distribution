package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradeHistory extends js.Object {
  /** The teacher who made the grade change. */
  var actorUserId: js.UndefOr[java.lang.String] = js.undefined
  /** The type of grade change at this time in the submission grade history. */
  var gradeChangeType: js.UndefOr[java.lang.String] = js.undefined
  /** When the grade of the submission was changed. */
  var gradeTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The denominator of the grade at this time in the submission grade
    * history.
    */
  var maxPoints: js.UndefOr[scala.Double] = js.undefined
  /** The numerator of the grade at this time in the submission grade history. */
  var pointsEarned: js.UndefOr[scala.Double] = js.undefined
}


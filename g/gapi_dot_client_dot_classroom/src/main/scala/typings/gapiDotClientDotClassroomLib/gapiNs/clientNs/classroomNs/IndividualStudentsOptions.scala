package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndividualStudentsOptions extends js.Object {
  /**
    * Identifiers for the students that have access to the
    * coursework/announcement.
    */
  var studentIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IndividualStudentsOptions {
  @scala.inline
  def apply(studentIds: js.Array[java.lang.String] = null): IndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (studentIds != null) __obj.updateDynamic("studentIds")(studentIds)
    __obj.asInstanceOf[IndividualStudentsOptions]
  }
}


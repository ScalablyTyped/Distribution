package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait IndividualStudentsOptions extends js.Object {
  /**
    * Identifiers for the students that have access to the
    * coursework/announcement.
    */
  var studentIds: js.UndefOr[js.Array[String]] = js.undefined
}

object IndividualStudentsOptions {
  @scala.inline
  def apply(studentIds: js.Array[String] = null): IndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (studentIds != null) __obj.updateDynamic("studentIds")(studentIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndividualStudentsOptions]
  }
}


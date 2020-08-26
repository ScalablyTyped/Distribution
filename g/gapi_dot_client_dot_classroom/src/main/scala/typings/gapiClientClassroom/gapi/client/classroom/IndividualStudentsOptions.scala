package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IndividualStudentsOptions extends js.Object {
  /**
    * Identifiers for the students that have access to the
    * coursework/announcement.
    */
  var studentIds: js.UndefOr[js.Array[String]] = js.native
}

object IndividualStudentsOptions {
  @scala.inline
  def apply(): IndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndividualStudentsOptions]
  }
  @scala.inline
  implicit class IndividualStudentsOptionsOps[Self <: IndividualStudentsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStudentIdsVarargs(value: String*): Self = this.set("studentIds", js.Array(value :_*))
    @scala.inline
    def setStudentIds(value: js.Array[String]): Self = this.set("studentIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudentIds: Self = this.set("studentIds", js.undefined)
  }
  
}


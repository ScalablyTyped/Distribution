package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains fields to add or remove students from a course work or
  * announcement where the `assigneeMode` is set to `INDIVIDUAL_STUDENTS`.
  */
@js.native
trait SchemaModifyIndividualStudentsOptions extends js.Object {
  /**
    * Ids of students to be added as having access to this
    * coursework/announcement.
    */
  var addStudentIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Ids of students to be removed from having access to this
    * coursework/announcement.
    */
  var removeStudentIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyIndividualStudentsOptions {
  @scala.inline
  def apply(): SchemaModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyIndividualStudentsOptions]
  }
  @scala.inline
  implicit class SchemaModifyIndividualStudentsOptionsOps[Self <: SchemaModifyIndividualStudentsOptions] (val x: Self) extends AnyVal {
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
    def setAddStudentIdsVarargs(value: String*): Self = this.set("addStudentIds", js.Array(value :_*))
    @scala.inline
    def setAddStudentIds(value: js.Array[String]): Self = this.set("addStudentIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddStudentIds: Self = this.set("addStudentIds", js.undefined)
    @scala.inline
    def setRemoveStudentIdsVarargs(value: String*): Self = this.set("removeStudentIds", js.Array(value :_*))
    @scala.inline
    def setRemoveStudentIds(value: js.Array[String]): Self = this.set("removeStudentIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveStudentIds: Self = this.set("removeStudentIds", js.undefined)
  }
  
}


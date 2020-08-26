package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to modify assignee mode and options of a coursework.
  */
@js.native
trait SchemaModifyCourseWorkAssigneesRequest extends js.Object {
  /**
    * Mode of the coursework describing whether it will be assigned to all
    * students or specified individual students.
    */
  var assigneeMode: js.UndefOr[String] = js.native
  /**
    * Set which students are assigned or not assigned to the coursework. Must
    * be specified only when `assigneeMode` is `INDIVIDUAL_STUDENTS`.
    */
  var modifyIndividualStudentsOptions: js.UndefOr[SchemaModifyIndividualStudentsOptions] = js.native
}

object SchemaModifyCourseWorkAssigneesRequest {
  @scala.inline
  def apply(): SchemaModifyCourseWorkAssigneesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyCourseWorkAssigneesRequest]
  }
  @scala.inline
  implicit class SchemaModifyCourseWorkAssigneesRequestOps[Self <: SchemaModifyCourseWorkAssigneesRequest] (val x: Self) extends AnyVal {
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
    def setAssigneeMode(value: String): Self = this.set("assigneeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssigneeMode: Self = this.set("assigneeMode", js.undefined)
    @scala.inline
    def setModifyIndividualStudentsOptions(value: SchemaModifyIndividualStudentsOptions): Self = this.set("modifyIndividualStudentsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifyIndividualStudentsOptions: Self = this.set("modifyIndividualStudentsOptions", js.undefined)
  }
  
}


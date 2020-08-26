package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyIndividualStudentsOptions extends js.Object {
  var addStudentIds: js.UndefOr[js.Array[String]] = js.native
  var removeStudentIds: js.UndefOr[js.Array[String]] = js.native
}

object ModifyIndividualStudentsOptions {
  @scala.inline
  def apply(): ModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyIndividualStudentsOptions]
  }
  @scala.inline
  implicit class ModifyIndividualStudentsOptionsOps[Self <: ModifyIndividualStudentsOptions] (val x: Self) extends AnyVal {
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


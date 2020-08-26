package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Announcement extends js.Object {
  var alternateLink: js.UndefOr[String] = js.native
  var assigneeMode: js.UndefOr[String] = js.native
  var courseId: js.UndefOr[String] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var creatorUserId: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.native
  var materials: js.UndefOr[js.Array[Material]] = js.native
  var scheduledTime: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
  var updateTime: js.UndefOr[String] = js.native
}

object Announcement {
  @scala.inline
  def apply(): Announcement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Announcement]
  }
  @scala.inline
  implicit class AnnouncementOps[Self <: Announcement] (val x: Self) extends AnyVal {
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
    def setAlternateLink(value: String): Self = this.set("alternateLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternateLink: Self = this.set("alternateLink", js.undefined)
    @scala.inline
    def setAssigneeMode(value: String): Self = this.set("assigneeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssigneeMode: Self = this.set("assigneeMode", js.undefined)
    @scala.inline
    def setCourseId(value: String): Self = this.set("courseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseId: Self = this.set("courseId", js.undefined)
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setCreatorUserId(value: String): Self = this.set("creatorUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorUserId: Self = this.set("creatorUserId", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIndividualStudentsOptions(value: IndividualStudentsOptions): Self = this.set("individualStudentsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndividualStudentsOptions: Self = this.set("individualStudentsOptions", js.undefined)
    @scala.inline
    def setMaterialsVarargs(value: Material*): Self = this.set("materials", js.Array(value :_*))
    @scala.inline
    def setMaterials(value: js.Array[Material]): Self = this.set("materials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterials: Self = this.set("materials", js.undefined)
    @scala.inline
    def setScheduledTime(value: String): Self = this.set("scheduledTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScheduledTime: Self = this.set("scheduledTime", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}


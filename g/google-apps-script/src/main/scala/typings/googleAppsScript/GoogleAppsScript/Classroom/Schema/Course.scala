package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Course extends js.Object {
  var alternateLink: js.UndefOr[String] = js.native
  var calendarId: js.UndefOr[String] = js.native
  var courseGroupEmail: js.UndefOr[String] = js.native
  var courseMaterialSets: js.UndefOr[js.Array[CourseMaterialSet]] = js.native
  var courseState: js.UndefOr[String] = js.native
  var creationTime: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var descriptionHeading: js.UndefOr[String] = js.native
  var enrollmentCode: js.UndefOr[String] = js.native
  var guardiansEnabled: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var ownerId: js.UndefOr[String] = js.native
  var room: js.UndefOr[String] = js.native
  var section: js.UndefOr[String] = js.native
  var teacherFolder: js.UndefOr[DriveFolder] = js.native
  var teacherGroupEmail: js.UndefOr[String] = js.native
  var updateTime: js.UndefOr[String] = js.native
}

object Course {
  @scala.inline
  def apply(): Course = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Course]
  }
  @scala.inline
  implicit class CourseOps[Self <: Course] (val x: Self) extends AnyVal {
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
    def setCalendarId(value: String): Self = this.set("calendarId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendarId: Self = this.set("calendarId", js.undefined)
    @scala.inline
    def setCourseGroupEmail(value: String): Self = this.set("courseGroupEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseGroupEmail: Self = this.set("courseGroupEmail", js.undefined)
    @scala.inline
    def setCourseMaterialSetsVarargs(value: CourseMaterialSet*): Self = this.set("courseMaterialSets", js.Array(value :_*))
    @scala.inline
    def setCourseMaterialSets(value: js.Array[CourseMaterialSet]): Self = this.set("courseMaterialSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseMaterialSets: Self = this.set("courseMaterialSets", js.undefined)
    @scala.inline
    def setCourseState(value: String): Self = this.set("courseState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCourseState: Self = this.set("courseState", js.undefined)
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionHeading(value: String): Self = this.set("descriptionHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescriptionHeading: Self = this.set("descriptionHeading", js.undefined)
    @scala.inline
    def setEnrollmentCode(value: String): Self = this.set("enrollmentCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnrollmentCode: Self = this.set("enrollmentCode", js.undefined)
    @scala.inline
    def setGuardiansEnabled(value: Boolean): Self = this.set("guardiansEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuardiansEnabled: Self = this.set("guardiansEnabled", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    @scala.inline
    def setRoom(value: String): Self = this.set("room", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoom: Self = this.set("room", js.undefined)
    @scala.inline
    def setSection(value: String): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
    @scala.inline
    def setTeacherFolder(value: DriveFolder): Self = this.set("teacherFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeacherFolder: Self = this.set("teacherFolder", js.undefined)
    @scala.inline
    def setTeacherGroupEmail(value: String): Self = this.set("teacherGroupEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTeacherGroupEmail: Self = this.set("teacherGroupEmail", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
  
}


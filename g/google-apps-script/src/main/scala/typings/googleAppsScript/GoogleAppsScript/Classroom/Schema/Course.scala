package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Course extends js.Object {
  var alternateLink: js.UndefOr[String] = js.undefined
  var calendarId: js.UndefOr[String] = js.undefined
  var courseGroupEmail: js.UndefOr[String] = js.undefined
  var courseMaterialSets: js.UndefOr[js.Array[CourseMaterialSet]] = js.undefined
  var courseState: js.UndefOr[String] = js.undefined
  var creationTime: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var descriptionHeading: js.UndefOr[String] = js.undefined
  var enrollmentCode: js.UndefOr[String] = js.undefined
  var guardiansEnabled: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var ownerId: js.UndefOr[String] = js.undefined
  var room: js.UndefOr[String] = js.undefined
  var section: js.UndefOr[String] = js.undefined
  var teacherFolder: js.UndefOr[DriveFolder] = js.undefined
  var teacherGroupEmail: js.UndefOr[String] = js.undefined
  var updateTime: js.UndefOr[String] = js.undefined
}

object Course {
  @scala.inline
  def apply(
    alternateLink: String = null,
    calendarId: String = null,
    courseGroupEmail: String = null,
    courseMaterialSets: js.Array[CourseMaterialSet] = null,
    courseState: String = null,
    creationTime: String = null,
    description: String = null,
    descriptionHeading: String = null,
    enrollmentCode: String = null,
    guardiansEnabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    name: String = null,
    ownerId: String = null,
    room: String = null,
    section: String = null,
    teacherFolder: DriveFolder = null,
    teacherGroupEmail: String = null,
    updateTime: String = null
  ): Course = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink.asInstanceOf[js.Any])
    if (calendarId != null) __obj.updateDynamic("calendarId")(calendarId.asInstanceOf[js.Any])
    if (courseGroupEmail != null) __obj.updateDynamic("courseGroupEmail")(courseGroupEmail.asInstanceOf[js.Any])
    if (courseMaterialSets != null) __obj.updateDynamic("courseMaterialSets")(courseMaterialSets.asInstanceOf[js.Any])
    if (courseState != null) __obj.updateDynamic("courseState")(courseState.asInstanceOf[js.Any])
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (descriptionHeading != null) __obj.updateDynamic("descriptionHeading")(descriptionHeading.asInstanceOf[js.Any])
    if (enrollmentCode != null) __obj.updateDynamic("enrollmentCode")(enrollmentCode.asInstanceOf[js.Any])
    if (!js.isUndefined(guardiansEnabled)) __obj.updateDynamic("guardiansEnabled")(guardiansEnabled.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (room != null) __obj.updateDynamic("room")(room.asInstanceOf[js.Any])
    if (section != null) __obj.updateDynamic("section")(section.asInstanceOf[js.Any])
    if (teacherFolder != null) __obj.updateDynamic("teacherFolder")(teacherFolder.asInstanceOf[js.Any])
    if (teacherGroupEmail != null) __obj.updateDynamic("teacherGroupEmail")(teacherGroupEmail.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Course]
  }
}


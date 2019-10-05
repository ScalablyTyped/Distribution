package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

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
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (calendarId != null) __obj.updateDynamic("calendarId")(calendarId)
    if (courseGroupEmail != null) __obj.updateDynamic("courseGroupEmail")(courseGroupEmail)
    if (courseMaterialSets != null) __obj.updateDynamic("courseMaterialSets")(courseMaterialSets)
    if (courseState != null) __obj.updateDynamic("courseState")(courseState)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (descriptionHeading != null) __obj.updateDynamic("descriptionHeading")(descriptionHeading)
    if (enrollmentCode != null) __obj.updateDynamic("enrollmentCode")(enrollmentCode)
    if (!js.isUndefined(guardiansEnabled)) __obj.updateDynamic("guardiansEnabled")(guardiansEnabled)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId)
    if (room != null) __obj.updateDynamic("room")(room)
    if (section != null) __obj.updateDynamic("section")(section)
    if (teacherFolder != null) __obj.updateDynamic("teacherFolder")(teacherFolder)
    if (teacherGroupEmail != null) __obj.updateDynamic("teacherGroupEmail")(teacherGroupEmail)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[Course]
  }
}


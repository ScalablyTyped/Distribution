package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Course extends js.Object {
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  var calendarId: js.UndefOr[java.lang.String] = js.undefined
  var courseGroupEmail: js.UndefOr[java.lang.String] = js.undefined
  var courseMaterialSets: js.UndefOr[js.Array[CourseMaterialSet]] = js.undefined
  var courseState: js.UndefOr[java.lang.String] = js.undefined
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var descriptionHeading: js.UndefOr[java.lang.String] = js.undefined
  var enrollmentCode: js.UndefOr[java.lang.String] = js.undefined
  var guardiansEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var ownerId: js.UndefOr[java.lang.String] = js.undefined
  var room: js.UndefOr[java.lang.String] = js.undefined
  var section: js.UndefOr[java.lang.String] = js.undefined
  var teacherFolder: js.UndefOr[DriveFolder] = js.undefined
  var teacherGroupEmail: js.UndefOr[java.lang.String] = js.undefined
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

object Course {
  @scala.inline
  def apply(
    alternateLink: java.lang.String = null,
    calendarId: java.lang.String = null,
    courseGroupEmail: java.lang.String = null,
    courseMaterialSets: js.Array[CourseMaterialSet] = null,
    courseState: java.lang.String = null,
    creationTime: java.lang.String = null,
    description: java.lang.String = null,
    descriptionHeading: java.lang.String = null,
    enrollmentCode: java.lang.String = null,
    guardiansEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    name: java.lang.String = null,
    ownerId: java.lang.String = null,
    room: java.lang.String = null,
    section: java.lang.String = null,
    teacherFolder: DriveFolder = null,
    teacherGroupEmail: java.lang.String = null,
    updateTime: java.lang.String = null
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


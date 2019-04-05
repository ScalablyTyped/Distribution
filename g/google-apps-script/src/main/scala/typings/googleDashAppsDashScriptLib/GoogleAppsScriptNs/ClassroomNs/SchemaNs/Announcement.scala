package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Announcement extends js.Object {
  var alternateLink: js.UndefOr[java.lang.String] = js.undefined
  var assigneeMode: js.UndefOr[java.lang.String] = js.undefined
  var courseId: js.UndefOr[java.lang.String] = js.undefined
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  var creatorUserId: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
  var materials: js.UndefOr[js.Array[Material]] = js.undefined
  var scheduledTime: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

object Announcement {
  @scala.inline
  def apply(
    alternateLink: java.lang.String = null,
    assigneeMode: java.lang.String = null,
    courseId: java.lang.String = null,
    creationTime: java.lang.String = null,
    creatorUserId: java.lang.String = null,
    id: java.lang.String = null,
    individualStudentsOptions: IndividualStudentsOptions = null,
    materials: js.Array[Material] = null,
    scheduledTime: java.lang.String = null,
    state: java.lang.String = null,
    text: java.lang.String = null,
    updateTime: java.lang.String = null
  ): Announcement = {
    val __obj = js.Dynamic.literal()
    if (alternateLink != null) __obj.updateDynamic("alternateLink")(alternateLink)
    if (assigneeMode != null) __obj.updateDynamic("assigneeMode")(assigneeMode)
    if (courseId != null) __obj.updateDynamic("courseId")(courseId)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (creatorUserId != null) __obj.updateDynamic("creatorUserId")(creatorUserId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (individualStudentsOptions != null) __obj.updateDynamic("individualStudentsOptions")(individualStudentsOptions)
    if (materials != null) __obj.updateDynamic("materials")(materials)
    if (scheduledTime != null) __obj.updateDynamic("scheduledTime")(scheduledTime)
    if (state != null) __obj.updateDynamic("state")(state)
    if (text != null) __obj.updateDynamic("text")(text)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[Announcement]
  }
}


package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyIndividualStudentsOptions extends js.Object {
  var addStudentIds: js.UndefOr[js.Array[String]] = js.undefined
  var removeStudentIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ModifyIndividualStudentsOptions {
  @scala.inline
  def apply(addStudentIds: js.Array[String] = null, removeStudentIds: js.Array[String] = null): ModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (addStudentIds != null) __obj.updateDynamic("addStudentIds")(addStudentIds)
    if (removeStudentIds != null) __obj.updateDynamic("removeStudentIds")(removeStudentIds)
    __obj.asInstanceOf[ModifyIndividualStudentsOptions]
  }
}


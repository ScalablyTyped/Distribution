package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyIndividualStudentsOptions extends js.Object {
  var addStudentIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var removeStudentIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ModifyIndividualStudentsOptions {
  @scala.inline
  def apply(
    addStudentIds: js.Array[java.lang.String] = null,
    removeStudentIds: js.Array[java.lang.String] = null
  ): ModifyIndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (addStudentIds != null) __obj.updateDynamic("addStudentIds")(addStudentIds)
    if (removeStudentIds != null) __obj.updateDynamic("removeStudentIds")(removeStudentIds)
    __obj.asInstanceOf[ModifyIndividualStudentsOptions]
  }
}


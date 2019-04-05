package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndividualStudentsOptions extends js.Object {
  var studentIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IndividualStudentsOptions {
  @scala.inline
  def apply(studentIds: js.Array[java.lang.String] = null): IndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (studentIds != null) __obj.updateDynamic("studentIds")(studentIds)
    __obj.asInstanceOf[IndividualStudentsOptions]
  }
}


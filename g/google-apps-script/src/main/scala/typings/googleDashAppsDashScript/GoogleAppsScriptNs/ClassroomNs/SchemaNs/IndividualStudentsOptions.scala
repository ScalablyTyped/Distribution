package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndividualStudentsOptions extends js.Object {
  var studentIds: js.UndefOr[js.Array[String]] = js.undefined
}

object IndividualStudentsOptions {
  @scala.inline
  def apply(studentIds: js.Array[String] = null): IndividualStudentsOptions = {
    val __obj = js.Dynamic.literal()
    if (studentIds != null) __obj.updateDynamic("studentIds")(studentIds)
    __obj.asInstanceOf[IndividualStudentsOptions]
  }
}


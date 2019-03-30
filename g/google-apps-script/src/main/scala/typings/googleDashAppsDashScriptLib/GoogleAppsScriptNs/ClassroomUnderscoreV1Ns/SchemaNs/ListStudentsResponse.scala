package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStudentsResponse extends js.Object {
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var students: js.UndefOr[js.Array[Student]] = js.undefined
}

object ListStudentsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, students: js.Array[Student] = null): ListStudentsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (students != null) __obj.updateDynamic("students")(students)
    __obj.asInstanceOf[ListStudentsResponse]
  }
}


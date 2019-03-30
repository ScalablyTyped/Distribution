package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStudentSubmissionsResponse extends js.Object {
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var studentSubmissions: js.UndefOr[js.Array[StudentSubmission]] = js.undefined
}

object ListStudentSubmissionsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, studentSubmissions: js.Array[StudentSubmission] = null): ListStudentSubmissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (studentSubmissions != null) __obj.updateDynamic("studentSubmissions")(studentSubmissions)
    __obj.asInstanceOf[ListStudentSubmissionsResponse]
  }
}


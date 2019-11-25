package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStudentSubmissionsResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var studentSubmissions: js.UndefOr[js.Array[StudentSubmission]] = js.undefined
}

object ListStudentSubmissionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, studentSubmissions: js.Array[StudentSubmission] = null): ListStudentSubmissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (studentSubmissions != null) __obj.updateDynamic("studentSubmissions")(studentSubmissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStudentSubmissionsResponse]
  }
}


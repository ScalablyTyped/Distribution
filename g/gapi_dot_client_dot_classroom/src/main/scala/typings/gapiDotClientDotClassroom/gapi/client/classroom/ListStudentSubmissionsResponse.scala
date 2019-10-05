package typings.gapiDotClientDotClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStudentSubmissionsResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Student work that matches the request. */
  var studentSubmissions: js.UndefOr[js.Array[StudentSubmission]] = js.undefined
}

object ListStudentSubmissionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, studentSubmissions: js.Array[StudentSubmission] = null): ListStudentSubmissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (studentSubmissions != null) __obj.updateDynamic("studentSubmissions")(studentSubmissions)
    __obj.asInstanceOf[ListStudentSubmissionsResponse]
  }
}


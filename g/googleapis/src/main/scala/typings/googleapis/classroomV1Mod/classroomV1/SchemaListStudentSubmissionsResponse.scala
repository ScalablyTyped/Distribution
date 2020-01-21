package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing student submissions.
  */
@js.native
trait SchemaListStudentSubmissionsResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Student work that matches the request.
    */
  var studentSubmissions: js.UndefOr[js.Array[SchemaStudentSubmission]] = js.native
}

object SchemaListStudentSubmissionsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, studentSubmissions: js.Array[SchemaStudentSubmission] = null): SchemaListStudentSubmissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (studentSubmissions != null) __obj.updateDynamic("studentSubmissions")(studentSubmissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListStudentSubmissionsResponse]
  }
}


package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStudentSubmissionsResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Student work that matches the request. */
  var studentSubmissions: js.UndefOr[js.Array[StudentSubmission]] = js.native
}

object ListStudentSubmissionsResponse {
  @scala.inline
  def apply(): ListStudentSubmissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStudentSubmissionsResponse]
  }
  @scala.inline
  implicit class ListStudentSubmissionsResponseOps[Self <: ListStudentSubmissionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setStudentSubmissionsVarargs(value: StudentSubmission*): Self = this.set("studentSubmissions", js.Array(value :_*))
    @scala.inline
    def setStudentSubmissions(value: js.Array[StudentSubmission]): Self = this.set("studentSubmissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudentSubmissions: Self = this.set("studentSubmissions", js.undefined)
  }
  
}


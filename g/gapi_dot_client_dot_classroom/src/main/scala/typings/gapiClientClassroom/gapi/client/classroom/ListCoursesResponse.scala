package typings.gapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCoursesResponse extends js.Object {
  /** Courses that match the list request. */
  var courses: js.UndefOr[js.Array[Course]] = js.undefined
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListCoursesResponse {
  @scala.inline
  def apply(courses: js.Array[Course] = null, nextPageToken: String = null): ListCoursesResponse = {
    val __obj = js.Dynamic.literal()
    if (courses != null) __obj.updateDynamic("courses")(courses.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCoursesResponse]
  }
}


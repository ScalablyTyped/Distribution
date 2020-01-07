package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing courses.
  */
@js.native
trait Schema$ListCoursesResponse extends js.Object {
  /**
    * Courses that match the list request.
    */
  var courses: js.UndefOr[js.Array[Schema$Course]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListCoursesResponse {
  @scala.inline
  def apply(courses: js.Array[Schema$Course] = null, nextPageToken: String = null): Schema$ListCoursesResponse = {
    val __obj = js.Dynamic.literal()
    if (courses != null) __obj.updateDynamic("courses")(courses.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListCoursesResponse]
  }
}


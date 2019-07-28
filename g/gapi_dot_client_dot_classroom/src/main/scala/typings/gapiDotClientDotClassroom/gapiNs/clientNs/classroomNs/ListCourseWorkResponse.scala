package typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCourseWorkResponse extends js.Object {
  /** Course work items that match the request. */
  var courseWork: js.UndefOr[js.Array[CourseWork]] = js.undefined
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListCourseWorkResponse {
  @scala.inline
  def apply(courseWork: js.Array[CourseWork] = null, nextPageToken: String = null): ListCourseWorkResponse = {
    val __obj = js.Dynamic.literal()
    if (courseWork != null) __obj.updateDynamic("courseWork")(courseWork)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListCourseWorkResponse]
  }
}


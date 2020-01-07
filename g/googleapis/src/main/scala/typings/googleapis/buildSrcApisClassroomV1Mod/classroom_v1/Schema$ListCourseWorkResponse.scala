package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response when listing course work.
  */
@js.native
trait Schema$ListCourseWorkResponse extends js.Object {
  /**
    * Course work items that match the request.
    */
  var courseWork: js.UndefOr[js.Array[Schema$CourseWork]] = js.native
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListCourseWorkResponse {
  @scala.inline
  def apply(courseWork: js.Array[Schema$CourseWork] = null, nextPageToken: String = null): Schema$ListCourseWorkResponse = {
    val __obj = js.Dynamic.literal()
    if (courseWork != null) __obj.updateDynamic("courseWork")(courseWork.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListCourseWorkResponse]
  }
}


package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCourseWorkResponse extends js.Object {
  var courseWork: js.UndefOr[js.Array[CourseWork]] = js.undefined
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


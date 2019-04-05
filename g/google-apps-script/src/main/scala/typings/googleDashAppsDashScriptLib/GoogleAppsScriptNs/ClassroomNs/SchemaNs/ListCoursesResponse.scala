package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ClassroomNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCoursesResponse extends js.Object {
  var courses: js.UndefOr[js.Array[Course]] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListCoursesResponse {
  @scala.inline
  def apply(courses: js.Array[Course] = null, nextPageToken: java.lang.String = null): ListCoursesResponse = {
    val __obj = js.Dynamic.literal()
    if (courses != null) __obj.updateDynamic("courses")(courses)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListCoursesResponse]
  }
}


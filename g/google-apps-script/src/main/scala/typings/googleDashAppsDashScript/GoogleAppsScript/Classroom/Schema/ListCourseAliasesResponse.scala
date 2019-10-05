package typings.googleDashAppsDashScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCourseAliasesResponse extends js.Object {
  var aliases: js.UndefOr[js.Array[CourseAlias]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListCourseAliasesResponse {
  @scala.inline
  def apply(aliases: js.Array[CourseAlias] = null, nextPageToken: String = null): ListCourseAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListCourseAliasesResponse]
  }
}


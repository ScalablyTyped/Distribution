package typings.gapiDotClientDotClassroom.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCourseAliasesResponse extends js.Object {
  /** The course aliases. */
  var aliases: js.UndefOr[js.Array[CourseAlias]] = js.undefined
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
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


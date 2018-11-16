package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

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
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}


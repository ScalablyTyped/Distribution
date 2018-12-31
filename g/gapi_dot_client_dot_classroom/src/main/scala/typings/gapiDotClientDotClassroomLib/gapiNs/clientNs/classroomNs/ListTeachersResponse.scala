package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTeachersResponse extends js.Object {
  /**
    * Token identifying the next page of results to return. If empty, no further
    * results are available.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Teachers who match the list request. */
  var teachers: js.UndefOr[js.Array[Teacher]] = js.undefined
}


package typings
package gapiDotClientDotClassroomLib.gapiNs.clientNs.classroomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListAnnouncementsResponse extends js.Object {
  /** Announcement items that match the request. */
  var announcements: js.UndefOr[js.Array[Announcement]] = js.undefined
  /**
               * Token identifying the next page of results to return. If empty, no further
               * results are available.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}


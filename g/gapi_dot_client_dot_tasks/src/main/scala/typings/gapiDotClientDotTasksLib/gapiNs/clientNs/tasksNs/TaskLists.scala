package typings
package gapiDotClientDotTasksLib.gapiNs.clientNs.tasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TaskLists extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Collection of task lists. */
  var items: js.UndefOr[js.Array[TaskList]] = js.undefined
  /** Type of the resource. This is always "tasks#taskLists". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token that can be used to request the next page of this result. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}


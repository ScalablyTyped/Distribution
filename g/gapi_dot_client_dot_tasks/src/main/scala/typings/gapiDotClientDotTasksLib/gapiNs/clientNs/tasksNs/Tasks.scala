package typings
package gapiDotClientDotTasksLib.gapiNs.clientNs.tasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Tasks extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Collection of tasks. */
  var items: js.UndefOr[js.Array[Task]] = js.undefined
  /** Type of the resource. This is always "tasks#tasks". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token used to access the next page of this result. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}


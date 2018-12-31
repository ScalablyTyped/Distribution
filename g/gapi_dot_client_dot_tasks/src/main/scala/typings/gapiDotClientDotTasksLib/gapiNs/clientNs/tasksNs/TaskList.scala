package typings
package gapiDotClientDotTasksLib.gapiNs.clientNs.tasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskList extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Task list identifier. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the resource. This is always "tasks#taskList". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** URL pointing to this task list. Used to retrieve, update, or delete this task list. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the task list. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Last modification time of the task list (as a RFC 3339 timestamp). */
  var updated: js.UndefOr[java.lang.String] = js.undefined
}


package typings.gapiClientTaskqueue.gapi.client.taskqueue

import typings.gapiClientTaskqueue.AnonAdminEmails
import typings.gapiClientTaskqueue.AnonLeasedLastHour
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskQueue extends js.Object {
  /** ACLs that are applicable to this TaskQueue object. */
  var acl: js.UndefOr[AnonAdminEmails] = js.undefined
  /** Name of the taskqueue. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of REST object returned, in this case taskqueue. */
  var kind: js.UndefOr[String] = js.undefined
  /** The number of times we should lease out tasks before giving up on them. If unset we lease them out forever until a worker deletes the task. */
  var maxLeases: js.UndefOr[Double] = js.undefined
  /** Statistics for the TaskQueue object in question. */
  var stats: js.UndefOr[AnonLeasedLastHour] = js.undefined
}

object TaskQueue {
  @scala.inline
  def apply(
    acl: AnonAdminEmails = null,
    id: String = null,
    kind: String = null,
    maxLeases: Int | Double = null,
    stats: AnonLeasedLastHour = null
  ): TaskQueue = {
    val __obj = js.Dynamic.literal()
    if (acl != null) __obj.updateDynamic("acl")(acl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (maxLeases != null) __obj.updateDynamic("maxLeases")(maxLeases.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskQueue]
  }
}


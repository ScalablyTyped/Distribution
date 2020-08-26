package typings.gapiClientTaskqueue.gapi.client.taskqueue

import typings.gapiClientTaskqueue.anon.AdminEmails
import typings.gapiClientTaskqueue.anon.LeasedLastHour
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskQueue extends js.Object {
  /** ACLs that are applicable to this TaskQueue object. */
  var acl: js.UndefOr[AdminEmails] = js.native
  /** Name of the taskqueue. */
  var id: js.UndefOr[String] = js.native
  /** The kind of REST object returned, in this case taskqueue. */
  var kind: js.UndefOr[String] = js.native
  /** The number of times we should lease out tasks before giving up on them. If unset we lease them out forever until a worker deletes the task. */
  var maxLeases: js.UndefOr[Double] = js.native
  /** Statistics for the TaskQueue object in question. */
  var stats: js.UndefOr[LeasedLastHour] = js.native
}

object TaskQueue {
  @scala.inline
  def apply(): TaskQueue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskQueue]
  }
  @scala.inline
  implicit class TaskQueueOps[Self <: TaskQueue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcl(value: AdminEmails): Self = this.set("acl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaxLeases(value: Double): Self = this.set("maxLeases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLeases: Self = this.set("maxLeases", js.undefined)
    @scala.inline
    def setStats(value: LeasedLastHour): Self = this.set("stats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStats: Self = this.set("stats", js.undefined)
  }
  
}


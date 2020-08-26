package typings.gapiClientTaskqueue.gapi.client.taskqueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /** Time (in seconds since the epoch) at which the task was enqueued. */
  var enqueueTimestamp: js.UndefOr[String] = js.native
  /** Name of the task. */
  var id: js.UndefOr[String] = js.native
  /** The kind of object returned, in this case set to task. */
  var kind: js.UndefOr[String] = js.native
  /** Time (in seconds since the epoch) at which the task lease will expire. This value is 0 if the task isnt currently leased out to a worker. */
  var leaseTimestamp: js.UndefOr[String] = js.native
  /** A bag of bytes which is the task payload. The payload on the JSON side is always Base64 encoded. */
  var payloadBase64: js.UndefOr[String] = js.native
  /** Name of the queue that the task is in. */
  var queueName: js.UndefOr[String] = js.native
  /** The number of leases applied to this task. */
  var retry_count: js.UndefOr[Double] = js.native
  /** Tag for the task, could be used later to lease tasks grouped by a specific tag. */
  var tag: js.UndefOr[String] = js.native
}

object Task {
  @scala.inline
  def apply(): Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
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
    def setEnqueueTimestamp(value: String): Self = this.set("enqueueTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnqueueTimestamp: Self = this.set("enqueueTimestamp", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLeaseTimestamp(value: String): Self = this.set("leaseTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaseTimestamp: Self = this.set("leaseTimestamp", js.undefined)
    @scala.inline
    def setPayloadBase64(value: String): Self = this.set("payloadBase64", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadBase64: Self = this.set("payloadBase64", js.undefined)
    @scala.inline
    def setQueueName(value: String): Self = this.set("queueName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueName: Self = this.set("queueName", js.undefined)
    @scala.inline
    def setRetry_count(value: Double): Self = this.set("retry_count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry_count: Self = this.set("retry_count", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}


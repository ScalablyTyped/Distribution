package typings.gapiClientTaskqueue.gapi.client.taskqueue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /** Time (in seconds since the epoch) at which the task was enqueued. */
  var enqueueTimestamp: js.UndefOr[String] = js.undefined
  /** Name of the task. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind of object returned, in this case set to task. */
  var kind: js.UndefOr[String] = js.undefined
  /** Time (in seconds since the epoch) at which the task lease will expire. This value is 0 if the task isnt currently leased out to a worker. */
  var leaseTimestamp: js.UndefOr[String] = js.undefined
  /** A bag of bytes which is the task payload. The payload on the JSON side is always Base64 encoded. */
  var payloadBase64: js.UndefOr[String] = js.undefined
  /** Name of the queue that the task is in. */
  var queueName: js.UndefOr[String] = js.undefined
  /** The number of leases applied to this task. */
  var retry_count: js.UndefOr[Double] = js.undefined
  /** Tag for the task, could be used later to lease tasks grouped by a specific tag. */
  var tag: js.UndefOr[String] = js.undefined
}

object Task {
  @scala.inline
  def apply(
    enqueueTimestamp: String = null,
    id: String = null,
    kind: String = null,
    leaseTimestamp: String = null,
    payloadBase64: String = null,
    queueName: String = null,
    retry_count: js.UndefOr[Double] = js.undefined,
    tag: String = null
  ): Task = {
    val __obj = js.Dynamic.literal()
    if (enqueueTimestamp != null) __obj.updateDynamic("enqueueTimestamp")(enqueueTimestamp.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (leaseTimestamp != null) __obj.updateDynamic("leaseTimestamp")(leaseTimestamp.asInstanceOf[js.Any])
    if (payloadBase64 != null) __obj.updateDynamic("payloadBase64")(payloadBase64.asInstanceOf[js.Any])
    if (queueName != null) __obj.updateDynamic("queueName")(queueName.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_count)) __obj.updateDynamic("retry_count")(retry_count.get.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}


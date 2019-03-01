package typings
package gapiDotClientDotTaskqueueLib.gapiNs.clientNs.taskqueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  /** Time (in seconds since the epoch) at which the task was enqueued. */
  var enqueueTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the task. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind of object returned, in this case set to task. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Time (in seconds since the epoch) at which the task lease will expire. This value is 0 if the task isnt currently leased out to a worker. */
  var leaseTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** A bag of bytes which is the task payload. The payload on the JSON side is always Base64 encoded. */
  var payloadBase64: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the queue that the task is in. */
  var queueName: js.UndefOr[java.lang.String] = js.undefined
  /** The number of leases applied to this task. */
  var retry_count: js.UndefOr[scala.Double] = js.undefined
  /** Tag for the task, could be used later to lease tasks grouped by a specific tag. */
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object Task {
  @scala.inline
  def apply(
    enqueueTimestamp: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    leaseTimestamp: java.lang.String = null,
    payloadBase64: java.lang.String = null,
    queueName: java.lang.String = null,
    retry_count: scala.Int | scala.Double = null,
    tag: java.lang.String = null
  ): Task = {
    val __obj = js.Dynamic.literal()
    if (enqueueTimestamp != null) __obj.updateDynamic("enqueueTimestamp")(enqueueTimestamp)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (leaseTimestamp != null) __obj.updateDynamic("leaseTimestamp")(leaseTimestamp)
    if (payloadBase64 != null) __obj.updateDynamic("payloadBase64")(payloadBase64)
    if (queueName != null) __obj.updateDynamic("queueName")(queueName)
    if (retry_count != null) __obj.updateDynamic("retry_count")(retry_count.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Task]
  }
}


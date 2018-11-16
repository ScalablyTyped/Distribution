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


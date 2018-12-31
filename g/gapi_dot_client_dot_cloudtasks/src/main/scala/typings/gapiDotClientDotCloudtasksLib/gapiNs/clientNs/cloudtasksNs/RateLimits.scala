package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RateLimits extends js.Object {
  /**
    * Output only.
    *
    * The max burst size limits how fast the queue is processed when
    * many tasks are in the queue and the rate is high. This field
    * allows the queue to have a high rate so processing starts shortly
    * after a task is enqueued, but still limits resource usage when
    * many tasks are enqueued in a short period of time.
    *
    * &#42; For App Engine queues, if
    * RateLimits.max_tasks_dispatched_per_second is 1, this
    * field is 10; otherwise this field is
    * RateLimits.max_tasks_dispatched_per_second / 5.
    * &#42; For pull queues, this field is output only and always 10,000.
    *
    * Note: For App Engine queues that were created through
    * `queue.yaml/xml`, `max_burst_size` might not have the same
    * settings as specified above; CloudTasks.UpdateQueue can be
    * used to set `max_burst_size` only to the values specified above.
    *
    * This field has the same meaning as
    * [bucket_size in queue.yaml](/appengine/docs/standard/python/config/queueref#bucket_size).
    */
  var maxBurstSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum number of concurrent tasks that Cloud Tasks allows
    * to be dispatched for this queue. After this threshold has been
    * reached, Cloud Tasks stops dispatching tasks until the number of
    * concurrent requests decreases.
    *
    * The maximum allowed value is 5,000.
    *
    * &#42; For App Engine queues, this field is 10 by default.
    * &#42; For pull queues, this field is output only and always -1, which
    * indicates no limit.
    *
    * This field has the same meaning as
    * [max_concurrent_requests in queue.yaml](/appengine/docs/standard/python/config/queueref#max_concurrent_requests).
    */
  var maxConcurrentTasks: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum rate at which tasks are dispatched from this
    * queue.
    *
    * The maximum allowed value is 500.
    *
    * &#42; For App Engine queues, this field is 1 by default.
    * &#42; For pull queues, this field is output only and always 10,000.
    *
    * This field has the same meaning as
    * [rate in queue.yaml](/appengine/docs/standard/python/config/queueref#rate).
    */
  var maxTasksDispatchedPerSecond: js.UndefOr[scala.Double] = js.undefined
}


package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateBucket extends js.Object {
  /** Available for Bucket.Type.ACTIVITY_TYPE, Bucket.Type.ACTIVITY_SEGMENT */
  var activity: js.UndefOr[scala.Double] = js.undefined
  /** There will be one dataset per AggregateBy in the request. */
  var dataset: js.UndefOr[js.Array[Dataset]] = js.undefined
  /** The end time for the aggregated data, in milliseconds since epoch, inclusive. */
  var endTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /** Available for Bucket.Type.SESSION */
  var session: js.UndefOr[Session] = js.undefined
  /** The start time for the aggregated data, in milliseconds since epoch, inclusive. */
  var startTimeMillis: js.UndefOr[java.lang.String] = js.undefined
  /** The type of a bucket signifies how the data aggregation is performed in the bucket. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AggregateBucket {
  @scala.inline
  def apply(
    activity: scala.Int | scala.Double = null,
    dataset: js.Array[Dataset] = null,
    endTimeMillis: java.lang.String = null,
    session: Session = null,
    startTimeMillis: java.lang.String = null,
    `type`: java.lang.String = null
  ): AggregateBucket = {
    val __obj = js.Dynamic.literal()
    if (activity != null) __obj.updateDynamic("activity")(activity.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    if (endTimeMillis != null) __obj.updateDynamic("endTimeMillis")(endTimeMillis)
    if (session != null) __obj.updateDynamic("session")(session)
    if (startTimeMillis != null) __obj.updateDynamic("startTimeMillis")(startTimeMillis)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AggregateBucket]
  }
}


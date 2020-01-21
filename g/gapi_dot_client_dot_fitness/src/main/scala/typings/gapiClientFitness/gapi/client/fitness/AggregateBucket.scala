package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateBucket extends js.Object {
  /** Available for Bucket.Type.ACTIVITY_TYPE, Bucket.Type.ACTIVITY_SEGMENT */
  var activity: js.UndefOr[Double] = js.undefined
  /** There will be one dataset per AggregateBy in the request. */
  var dataset: js.UndefOr[js.Array[Dataset]] = js.undefined
  /** The end time for the aggregated data, in milliseconds since epoch, inclusive. */
  var endTimeMillis: js.UndefOr[String] = js.undefined
  /** Available for Bucket.Type.SESSION */
  var session: js.UndefOr[Session] = js.undefined
  /** The start time for the aggregated data, in milliseconds since epoch, inclusive. */
  var startTimeMillis: js.UndefOr[String] = js.undefined
  /** The type of a bucket signifies how the data aggregation is performed in the bucket. */
  var `type`: js.UndefOr[String] = js.undefined
}

object AggregateBucket {
  @scala.inline
  def apply(
    activity: Int | Double = null,
    dataset: js.Array[Dataset] = null,
    endTimeMillis: String = null,
    session: Session = null,
    startTimeMillis: String = null,
    `type`: String = null
  ): AggregateBucket = {
    val __obj = js.Dynamic.literal()
    if (activity != null) __obj.updateDynamic("activity")(activity.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (endTimeMillis != null) __obj.updateDynamic("endTimeMillis")(endTimeMillis.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (startTimeMillis != null) __obj.updateDynamic("startTimeMillis")(startTimeMillis.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateBucket]
  }
}


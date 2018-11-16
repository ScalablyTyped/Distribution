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


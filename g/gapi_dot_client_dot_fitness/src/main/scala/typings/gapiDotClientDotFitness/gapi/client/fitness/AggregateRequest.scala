package typings.gapiDotClientDotFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateRequest extends js.Object {
  /**
    * The specification of data to be aggregated. At least one aggregateBy spec must be provided. All data that is specified will be aggregated using the
    * same bucketing criteria. There will be one dataset in the response for every aggregateBy spec.
    */
  var aggregateBy: js.UndefOr[js.Array[AggregateBy]] = js.undefined
  /**
    * Specifies that data be aggregated each activity segment recored for a user. Similar to bucketByActivitySegment, but bucketing is done for each activity
    * segment rather than all segments of the same type. Mutually exclusive of other bucketing specifications.
    */
  var bucketByActivitySegment: js.UndefOr[BucketByActivity] = js.undefined
  /**
    * Specifies that data be aggregated by the type of activity being performed when the data was recorded. All data that was recorded during a certain
    * activity type (for the given time range) will be aggregated into the same bucket. Data that was recorded while the user was not active will not be
    * included in the response. Mutually exclusive of other bucketing specifications.
    */
  var bucketByActivityType: js.UndefOr[BucketByActivity] = js.undefined
  /**
    * Specifies that data be aggregated by user sessions. Data that does not fall within the time range of a session will not be included in the response.
    * Mutually exclusive of other bucketing specifications.
    */
  var bucketBySession: js.UndefOr[BucketBySession] = js.undefined
  /** Specifies that data be aggregated by a single time interval. Mutually exclusive of other bucketing specifications. */
  var bucketByTime: js.UndefOr[BucketByTime] = js.undefined
  /** The end of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive. */
  var endTimeMillis: js.UndefOr[String] = js.undefined
  /**
    * A list of acceptable data quality standards. Only data points which conform to at least one of the specified data quality standards will be returned.
    * If the list is empty, all data points are returned.
    */
  var filteredDataQualityStandard: js.UndefOr[js.Array[String]] = js.undefined
  /** The start of a window of time. Data that intersects with this time window will be aggregated. The time is in milliseconds since epoch, inclusive. */
  var startTimeMillis: js.UndefOr[String] = js.undefined
}

object AggregateRequest {
  @scala.inline
  def apply(
    aggregateBy: js.Array[AggregateBy] = null,
    bucketByActivitySegment: BucketByActivity = null,
    bucketByActivityType: BucketByActivity = null,
    bucketBySession: BucketBySession = null,
    bucketByTime: BucketByTime = null,
    endTimeMillis: String = null,
    filteredDataQualityStandard: js.Array[String] = null,
    startTimeMillis: String = null
  ): AggregateRequest = {
    val __obj = js.Dynamic.literal()
    if (aggregateBy != null) __obj.updateDynamic("aggregateBy")(aggregateBy.asInstanceOf[js.Any])
    if (bucketByActivitySegment != null) __obj.updateDynamic("bucketByActivitySegment")(bucketByActivitySegment.asInstanceOf[js.Any])
    if (bucketByActivityType != null) __obj.updateDynamic("bucketByActivityType")(bucketByActivityType.asInstanceOf[js.Any])
    if (bucketBySession != null) __obj.updateDynamic("bucketBySession")(bucketBySession.asInstanceOf[js.Any])
    if (bucketByTime != null) __obj.updateDynamic("bucketByTime")(bucketByTime.asInstanceOf[js.Any])
    if (endTimeMillis != null) __obj.updateDynamic("endTimeMillis")(endTimeMillis.asInstanceOf[js.Any])
    if (filteredDataQualityStandard != null) __obj.updateDynamic("filteredDataQualityStandard")(filteredDataQualityStandard.asInstanceOf[js.Any])
    if (startTimeMillis != null) __obj.updateDynamic("startTimeMillis")(startTimeMillis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateRequest]
  }
}


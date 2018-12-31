package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  /** The value of this data point. Either "true" or "false". */
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The value of this data point as a distribution. A distribution value can contain a list of buckets and/or an underflowBucket and an overflowBucket. The
    * values of these points can be used to create a histogram.
    */
  var distributionValue: js.UndefOr[PointDistribution] = js.undefined
  /** The value of this data point as a double-precision floating-point number. */
  var doubleValue: js.UndefOr[scala.Double] = js.undefined
  /**
    * The interval [start, end] is the time period to which the point's value applies. For gauge metrics, whose values are instantaneous measurements, this
    * interval should be empty (start should equal end). For cumulative metrics (of which deltas and rates are special cases), the interval should be
    * non-empty. Both start and end are RFC 3339 strings.
    */
  var end: js.UndefOr[java.lang.String] = js.undefined
  /** The value of this data point as a 64-bit integer. */
  var int64Value: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The interval [start, end] is the time period to which the point's value applies. For gauge metrics, whose values are instantaneous measurements, this
    * interval should be empty (start should equal end). For cumulative metrics (of which deltas and rates are special cases), the interval should be
    * non-empty. Both start and end are RFC 3339 strings.
    */
  var start: js.UndefOr[java.lang.String] = js.undefined
  /** The value of this data point in string format. */
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
}


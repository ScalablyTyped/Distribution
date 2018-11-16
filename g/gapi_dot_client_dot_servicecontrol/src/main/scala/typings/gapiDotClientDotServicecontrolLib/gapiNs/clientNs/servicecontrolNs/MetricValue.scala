package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MetricValue extends js.Object {
  /** A boolean value. */
  var boolValue: js.UndefOr[scala.Boolean] = js.undefined
  /** A distribution value. */
  var distributionValue: js.UndefOr[Distribution] = js.undefined
  /** A double precision floating point value. */
  var doubleValue: js.UndefOr[scala.Double] = js.undefined
  /**
               * The end of the time period over which this metric value's measurement
               * applies.
               */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** A signed 64-bit integer value. */
  var int64Value: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The labels describing the metric value.
               * See comments on google.api.servicecontrol.v1.Operation.labels for
               * the overriding relationship.
               */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** A money value. */
  var moneyValue: js.UndefOr[Money] = js.undefined
  /**
               * The start of the time period over which this metric value's measurement
               * applies. The time period has different semantics for different metric
               * types (cumulative, delta, and gauge). See the metric definition
               * documentation in the service configuration for details.
               */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** A text string value. */
  var stringValue: js.UndefOr[java.lang.String] = js.undefined
}


package typings.gapiDotClientDotAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricValue extends js.Object {
  /** The expected value of the metric. */
  var value: js.UndefOr[String] = js.undefined
  /**
    * The variance (i.e. square of the standard deviation) of the metric value.
    * If value is exact, variance is 0.
    * Can be used to calculate margin of error as a percentage of value, using
    * the following formula, where Z is the standard constant that depends on the
    * desired size of the confidence interval (e.g. for 90% confidence interval,
    * use Z = 1.645):
    *
    * marginOfError = 100 &#42; Z &#42; sqrt(variance) / value
    */
  var variance: js.UndefOr[String] = js.undefined
}

object MetricValue {
  @scala.inline
  def apply(value: String = null, variance: String = null): MetricValue = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    if (variance != null) __obj.updateDynamic("variance")(variance)
    __obj.asInstanceOf[MetricValue]
  }
}


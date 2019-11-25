package typings.gapiDotClientDotDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetric extends js.Object {
  /** Custom metric name. */
  var name: js.UndefOr[String] = js.undefined
  /** Custom metric numeric value. */
  var value: js.UndefOr[Double] = js.undefined
}

object CustomMetric {
  @scala.inline
  def apply(name: String = null, value: Int | Double = null): CustomMetric = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMetric]
  }
}


package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetric extends js.Object {
  /** Custom metric name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Custom metric numeric value. */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object CustomMetric {
  @scala.inline
  def apply(name: java.lang.String = null, value: scala.Int | scala.Double = null): CustomMetric = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMetric]
  }
}


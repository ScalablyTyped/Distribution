package typings.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /** The maximum of the population values. */
  var max: js.UndefOr[Double] = js.undefined
  /** The minimum of the population values. */
  var min: js.UndefOr[Double] = js.undefined
}

object Range {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): Range = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}


package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDistance extends js.Object {
  /** @default 20 */
  var distance: js.UndefOr[Double] = js.undefined
  /** @default 30 */
  var threshold: js.UndefOr[Double] = js.undefined
}

object AnonDistance {
  @scala.inline
  def apply(distance: Int | Double = null, threshold: Int | Double = null): AnonDistance = {
    val __obj = js.Dynamic.literal()
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDistance]
  }
}


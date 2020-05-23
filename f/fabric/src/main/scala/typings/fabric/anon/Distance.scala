package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distance extends js.Object {
  /** @default 20 */
  var distance: js.UndefOr[Double] = js.undefined
  /** @default 30 */
  var threshold: js.UndefOr[Double] = js.undefined
}

object Distance {
  @scala.inline
  def apply(distance: js.UndefOr[Double] = js.undefined, threshold: js.UndefOr[Double] = js.undefined): Distance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
}


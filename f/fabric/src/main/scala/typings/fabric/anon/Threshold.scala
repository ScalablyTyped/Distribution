package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Threshold extends js.Object {
  /** @default 100 */
  var threshold: js.UndefOr[Double] = js.undefined
}

object Threshold {
  @scala.inline
  def apply(threshold: js.UndefOr[Double] = js.undefined): Threshold = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
}


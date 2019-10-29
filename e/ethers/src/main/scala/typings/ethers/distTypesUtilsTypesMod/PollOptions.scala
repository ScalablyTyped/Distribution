package typings.ethers.distTypesUtilsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollOptions extends js.Object {
  var ceiling: js.UndefOr[Double] = js.undefined
  var floor: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var onceBlock: js.UndefOr[OnceBlockable] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PollOptions {
  @scala.inline
  def apply(
    ceiling: Int | Double = null,
    floor: Int | Double = null,
    interval: Int | Double = null,
    onceBlock: OnceBlockable = null,
    timeout: Int | Double = null
  ): PollOptions = {
    val __obj = js.Dynamic.literal()
    if (ceiling != null) __obj.updateDynamic("ceiling")(ceiling.asInstanceOf[js.Any])
    if (floor != null) __obj.updateDynamic("floor")(floor.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (onceBlock != null) __obj.updateDynamic("onceBlock")(onceBlock)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollOptions]
  }
}


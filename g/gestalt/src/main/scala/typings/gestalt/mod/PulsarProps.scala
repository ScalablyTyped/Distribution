package typings.gestalt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PulsarProps extends js.Object {
  var paused: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
}

object PulsarProps {
  @scala.inline
  def apply(paused: js.UndefOr[Boolean] = js.undefined, size: Int | Double = null): PulsarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PulsarProps]
  }
}


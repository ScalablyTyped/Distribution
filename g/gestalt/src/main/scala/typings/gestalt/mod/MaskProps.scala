package typings.gestalt.mod

import typings.gestalt.gestaltNumbers.`0`
import typings.gestalt.gestaltNumbers.`1`
import typings.gestalt.gestaltNumbers.`2`
import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltNumbers.`6`
import typings.gestalt.gestaltNumbers.`7`
import typings.gestalt.gestaltNumbers.`8`
import typings.gestalt.gestaltStrings.circle
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var rounding: js.UndefOr[circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.undefined
  var wash: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var willChangeTransform: js.UndefOr[Boolean] = js.undefined
}

object MaskProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    height: Double | String = null,
    rounding: circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` = null,
    wash: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    willChangeTransform: js.UndefOr[Boolean] = js.undefined
  ): MaskProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rounding != null) __obj.updateDynamic("rounding")(rounding.asInstanceOf[js.Any])
    if (!js.isUndefined(wash)) __obj.updateDynamic("wash")(wash.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(willChangeTransform)) __obj.updateDynamic("willChangeTransform")(willChangeTransform.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskProps]
  }
}


package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaskProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var shape: js.UndefOr[
    gestaltLib.gestaltLibStrings.circle | gestaltLib.gestaltLibStrings.rounded | gestaltLib.gestaltLibStrings.square
  ] = js.undefined
  var wash: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object MaskProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode = null,
    height: scala.Double | java.lang.String = null,
    shape: gestaltLib.gestaltLibStrings.circle | gestaltLib.gestaltLibStrings.rounded | gestaltLib.gestaltLibStrings.square = null,
    wash: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Double | java.lang.String = null
  ): MaskProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (!js.isUndefined(wash)) __obj.updateDynamic("wash")(wash)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaskProps]
  }
}


package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyoutProps extends js.Object {
  var anchor: reactLib.reactMod.RefObject[_]
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var color: js.UndefOr[
    gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.orange | gestaltLib.gestaltLibStrings.white
  ] = js.undefined
  var idealDirection: js.UndefOr[
    gestaltLib.gestaltLibStrings.up | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.down | gestaltLib.gestaltLibStrings.left
  ] = js.undefined
  var positionRelativeToAnchor: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl | scala.Double
  ] = js.undefined
  def onDismiss(): scala.Unit
}

object FlyoutProps {
  @scala.inline
  def apply(
    anchor: reactLib.reactMod.RefObject[_],
    onDismiss: () => scala.Unit,
    children: reactLib.reactMod.ReactNode = null,
    color: gestaltLib.gestaltLibStrings.blue | gestaltLib.gestaltLibStrings.orange | gestaltLib.gestaltLibStrings.white = null,
    idealDirection: gestaltLib.gestaltLibStrings.up | gestaltLib.gestaltLibStrings.right | gestaltLib.gestaltLibStrings.down | gestaltLib.gestaltLibStrings.left = null,
    positionRelativeToAnchor: js.UndefOr[scala.Boolean] = js.undefined,
    size: gestaltLib.gestaltLibStrings.xs | gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg | gestaltLib.gestaltLibStrings.xl | scala.Double = null
  ): FlyoutProps = {
    val __obj = js.Dynamic.literal(anchor = anchor, onDismiss = js.Any.fromFunction0(onDismiss))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (idealDirection != null) __obj.updateDynamic("idealDirection")(idealDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(positionRelativeToAnchor)) __obj.updateDynamic("positionRelativeToAnchor")(positionRelativeToAnchor)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlyoutProps]
  }
}


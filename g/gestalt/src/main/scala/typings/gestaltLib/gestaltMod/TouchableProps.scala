package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchableProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var fullHeight: js.UndefOr[scala.Boolean] = js.undefined
  var fullWidth: js.UndefOr[scala.Boolean] = js.undefined
  var mouseCursor: js.UndefOr[
    gestaltLib.gestaltLibStrings.copy | gestaltLib.gestaltLibStrings.grab | gestaltLib.gestaltLibStrings.grabbing | gestaltLib.gestaltLibStrings.move | gestaltLib.gestaltLibStrings.noDrop | gestaltLib.gestaltLibStrings.pointer | gestaltLib.gestaltLibStrings.zoomIn | gestaltLib.gestaltLibStrings.zoomOut
  ] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventHTMLDivElement, scala.Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventHTMLDivElement, scala.Unit]] = js.undefined
  var shape: js.UndefOr[
    gestaltLib.gestaltLibStrings.square | gestaltLib.gestaltLibStrings.rounded | gestaltLib.gestaltLibStrings.pill | gestaltLib.gestaltLibStrings.circle | gestaltLib.gestaltLibStrings.roundedTop | gestaltLib.gestaltLibStrings.roundedBottom | gestaltLib.gestaltLibStrings.roundedLeft | gestaltLib.gestaltLibStrings.roundedRight
  ] = js.undefined
  def onTouch(args: gestaltLib.Anon_EventHTMLDivElementKeyboardEvent): scala.Unit
}

object TouchableProps {
  @scala.inline
  def apply(
    onTouch: gestaltLib.Anon_EventHTMLDivElementKeyboardEvent => scala.Unit,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    fullHeight: js.UndefOr[scala.Boolean] = js.undefined,
    fullWidth: js.UndefOr[scala.Boolean] = js.undefined,
    mouseCursor: gestaltLib.gestaltLibStrings.copy | gestaltLib.gestaltLibStrings.grab | gestaltLib.gestaltLibStrings.grabbing | gestaltLib.gestaltLibStrings.move | gestaltLib.gestaltLibStrings.noDrop | gestaltLib.gestaltLibStrings.pointer | gestaltLib.gestaltLibStrings.zoomIn | gestaltLib.gestaltLibStrings.zoomOut = null,
    onMouseEnter: /* args */ gestaltLib.Anon_EventHTMLDivElement => scala.Unit = null,
    onMouseLeave: /* args */ gestaltLib.Anon_EventHTMLDivElement => scala.Unit = null,
    shape: gestaltLib.gestaltLibStrings.square | gestaltLib.gestaltLibStrings.rounded | gestaltLib.gestaltLibStrings.pill | gestaltLib.gestaltLibStrings.circle | gestaltLib.gestaltLibStrings.roundedTop | gestaltLib.gestaltLibStrings.roundedBottom | gestaltLib.gestaltLibStrings.roundedLeft | gestaltLib.gestaltLibStrings.roundedRight = null
  ): TouchableProps = {
    val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction1(onTouch))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fullHeight)) __obj.updateDynamic("fullHeight")(fullHeight)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (mouseCursor != null) __obj.updateDynamic("mouseCursor")(mouseCursor.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchableProps]
  }
}


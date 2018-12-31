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
  var onMouseEnter: js.UndefOr[
    js.Function1[/* args */ gestaltLib.Anon_EventSyntheticEventMouseEvent, scala.Unit]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[/* args */ gestaltLib.Anon_EventSyntheticEventMouseEvent, scala.Unit]
  ] = js.undefined
  var shape: js.UndefOr[
    gestaltLib.gestaltLibStrings.square | gestaltLib.gestaltLibStrings.rounded | gestaltLib.gestaltLibStrings.pill | gestaltLib.gestaltLibStrings.circle | gestaltLib.gestaltLibStrings.roundedTop | gestaltLib.gestaltLibStrings.roundedBottom | gestaltLib.gestaltLibStrings.roundedLeft | gestaltLib.gestaltLibStrings.roundedRight
  ] = js.undefined
  def onTouch(args: gestaltLib.Anon_EventSyntheticEventMouseEventHTMLDivElement): scala.Unit
}


package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlyoutProps extends js.Object {
  var anchor: reactLib.reactMod.ReactNs.RefObject[_]
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
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


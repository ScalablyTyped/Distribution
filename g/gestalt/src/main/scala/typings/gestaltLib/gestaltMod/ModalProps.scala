package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ModalProps extends js.Object {
  var accessibilityCloseLabel: java.lang.String
  var accessibilityModalLabel: java.lang.String
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var footer: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var heading: java.lang.String
  var role: js.UndefOr[gestaltLib.gestaltLibStrings.alertdialog | gestaltLib.gestaltLibStrings.dialog] = js.undefined
  var size: js.UndefOr[
    gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg
  ] = js.undefined
  def onDismiss(): scala.Unit
}


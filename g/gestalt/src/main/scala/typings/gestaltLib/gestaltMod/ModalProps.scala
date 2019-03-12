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

object ModalProps {
  @scala.inline
  def apply(
    accessibilityCloseLabel: java.lang.String,
    accessibilityModalLabel: java.lang.String,
    heading: java.lang.String,
    onDismiss: () => scala.Unit,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    footer: reactLib.reactMod.ReactNs.ReactNode = null,
    role: gestaltLib.gestaltLibStrings.alertdialog | gestaltLib.gestaltLibStrings.dialog = null,
    size: gestaltLib.gestaltLibStrings.sm | gestaltLib.gestaltLibStrings.md | gestaltLib.gestaltLibStrings.lg = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(accessibilityCloseLabel = accessibilityCloseLabel, accessibilityModalLabel = accessibilityModalLabel, heading = heading, onDismiss = js.Any.fromFunction0(onDismiss))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}


package typings.gestalt.gestaltMod

import typings.gestalt.gestaltStrings.alertdialog
import typings.gestalt.gestaltStrings.dialog
import typings.gestalt.gestaltStrings.lg
import typings.gestalt.gestaltStrings.md
import typings.gestalt.gestaltStrings.sm
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var accessibilityCloseLabel: String
  var accessibilityModalLabel: String
  var children: js.UndefOr[ReactNode] = js.undefined
  var footer: js.UndefOr[ReactNode] = js.undefined
  var heading: String
  var role: js.UndefOr[alertdialog | dialog] = js.undefined
  var size: js.UndefOr[sm | md | lg] = js.undefined
  def onDismiss(): Unit
}

object ModalProps {
  @scala.inline
  def apply(
    accessibilityCloseLabel: String,
    accessibilityModalLabel: String,
    heading: String,
    onDismiss: () => Unit,
    children: ReactNode = null,
    footer: ReactNode = null,
    role: alertdialog | dialog = null,
    size: sm | md | lg = null
  ): ModalProps = {
    val __obj = js.Dynamic.literal(accessibilityCloseLabel = accessibilityCloseLabel.asInstanceOf[js.Any], accessibilityModalLabel = accessibilityModalLabel.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], onDismiss = js.Any.fromFunction0(onDismiss))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
}


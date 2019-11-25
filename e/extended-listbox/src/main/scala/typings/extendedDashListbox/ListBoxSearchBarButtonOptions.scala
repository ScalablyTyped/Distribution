package typings.extendedDashListbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxSearchBarButtonOptions extends js.Object {
  /** css class for the i-tag of the button */
  var icon: js.UndefOr[String] = js.undefined
  /** callback for button click */
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** determines if the button is visible */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object ListBoxSearchBarButtonOptions {
  @scala.inline
  def apply(icon: String = null, onClick: () => Unit = null, visible: js.UndefOr[Boolean] = js.undefined): ListBoxSearchBarButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBoxSearchBarButtonOptions]
  }
}


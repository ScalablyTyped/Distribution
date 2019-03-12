package typings
package extendedDashListboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBoxSearchBarButtonOptions extends js.Object {
  /** css class for the i-tag of the button */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** callback for button click */
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** determines if the button is visible */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ListBoxSearchBarButtonOptions {
  @scala.inline
  def apply(
    icon: java.lang.String = null,
    onClick: () => scala.Unit = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ListBoxSearchBarButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ListBoxSearchBarButtonOptions]
  }
}


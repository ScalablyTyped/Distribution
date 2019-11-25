package typings.firefoxDashWebextDashBrowser.browser.devtools.panels

import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A button created by the extension. */
trait Button extends js.Object {
  /**
    * Fired when the button is clicked.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onClicked: WebExtEvent[js.Function0[Unit]]
  /**
    * Updates the attributes of the button. If some of the arguments are omitted or `null`, the corresponding
    * attributes are not updated.
    * @param [iconPath] Path to the new icon of the button.
    * @param [tooltipText] Text shown as a tooltip when user hovers the mouse over the button.
    * @param [disabled] Whether the button is disabled.
    * @deprecated Unsupported on Firefox at this time.
    */
  var update: js.UndefOr[
    js.Function3[
      /* iconPath */ js.UndefOr[String], 
      /* tooltipText */ js.UndefOr[String], 
      /* disabled */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
}

object Button {
  @scala.inline
  def apply(
    onClicked: WebExtEvent[js.Function0[Unit]],
    update: (/* iconPath */ js.UndefOr[String], /* tooltipText */ js.UndefOr[String], /* disabled */ js.UndefOr[Boolean]) => Unit = null
  ): Button = {
    val __obj = js.Dynamic.literal(onClicked = onClicked.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3(update))
    __obj.asInstanceOf[Button]
  }
}


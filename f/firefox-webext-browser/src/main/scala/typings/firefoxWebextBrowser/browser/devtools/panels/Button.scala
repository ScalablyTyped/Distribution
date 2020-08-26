package typings.firefoxWebextBrowser.browser.devtools.panels

import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A button created by the extension. */
@js.native
trait Button extends js.Object {
  /**
    * Fired when the button is clicked.
    * @deprecated Unsupported on Firefox at this time.
    */
  var onClicked: WebExtEvent[js.Function0[Unit]] = js.native
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
  ] = js.native
}

object Button {
  @scala.inline
  def apply(onClicked: WebExtEvent[js.Function0[Unit]]): Button = {
    val __obj = js.Dynamic.literal(onClicked = onClicked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Button]
  }
  @scala.inline
  implicit class ButtonOps[Self <: Button] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnClicked(value: WebExtEvent[js.Function0[Unit]]): Self = this.set("onClicked", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(
      value: (/* iconPath */ js.UndefOr[String], /* tooltipText */ js.UndefOr[String], /* disabled */ js.UndefOr[Boolean]) => Unit
    ): Self = this.set("update", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}


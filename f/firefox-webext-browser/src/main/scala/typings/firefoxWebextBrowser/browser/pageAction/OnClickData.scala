package typings.firefoxWebextBrowser.browser.pageAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information sent when a page action is clicked. */
trait OnClickData extends js.Object {
  /** An integer value of button by which menu item was clicked. */
  var button: js.UndefOr[Double] = js.undefined
  /** An array of keyboard modifiers that were held while the menu item was clicked. */
  var modifiers: js.Array[OnClickDataModifiers]
}

object OnClickData {
  @scala.inline
  def apply(modifiers: js.Array[OnClickDataModifiers], button: js.UndefOr[Double] = js.undefined): OnClickData = {
    val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(button)) __obj.updateDynamic("button")(button.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClickData]
  }
}


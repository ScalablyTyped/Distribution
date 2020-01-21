package typings.fundamentalReact.inputGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputGroupAddonProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  /* Set to **true** if add-on is a button. */
  var isButton: js.UndefOr[Boolean] = js.undefined
}

object InputGroupAddonProps {
  @scala.inline
  def apply(className: String = null, isButton: js.UndefOr[Boolean] = js.undefined): InputGroupAddonProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isButton)) __obj.updateDynamic("isButton")(isButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputGroupAddonProps]
  }
}


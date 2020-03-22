package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<fundamental-react.fundamental-react/lib/InputGroup/InputGroup.InputGroupAddonProps> */
trait PartialInputGroupAddonPro extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var isButton: js.UndefOr[Boolean] = js.undefined
}

object PartialInputGroupAddonPro {
  @scala.inline
  def apply(className: String = null, isButton: js.UndefOr[Boolean] = js.undefined): PartialInputGroupAddonPro = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(isButton)) __obj.updateDynamic("isButton")(isButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialInputGroupAddonPro]
  }
}


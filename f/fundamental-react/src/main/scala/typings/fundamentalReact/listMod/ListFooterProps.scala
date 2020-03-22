package typings.fundamentalReact.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFooterProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object ListFooterProps {
  @scala.inline
  def apply(className: String = null): ListFooterProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFooterProps]
  }
}


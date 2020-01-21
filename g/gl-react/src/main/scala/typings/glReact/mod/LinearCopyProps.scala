package typings.glReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearCopyProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
}

object LinearCopyProps {
  @scala.inline
  def apply(children: js.Any = null): LinearCopyProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearCopyProps]
  }
}


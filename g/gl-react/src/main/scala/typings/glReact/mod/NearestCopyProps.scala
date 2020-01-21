package typings.glReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NearestCopyProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
}

object NearestCopyProps {
  @scala.inline
  def apply(children: js.Any = null): NearestCopyProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestCopyProps]
  }
}


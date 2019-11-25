package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tree
trait TreeIcons extends js.Object {
  var collapse: js.UndefOr[String] = js.undefined
  var expand: js.UndefOr[String] = js.undefined
}

object TreeIcons {
  @scala.inline
  def apply(collapse: String = null, expand: String = null): TreeIcons = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeIcons]
  }
}


package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Tree
trait TreeIcons extends js.Object {
  var collapse: js.UndefOr[java.lang.String] = js.undefined
  var expand: js.UndefOr[java.lang.String] = js.undefined
}

object TreeIcons {
  @scala.inline
  def apply(collapse: java.lang.String = null, expand: java.lang.String = null): TreeIcons = {
    val __obj = js.Dynamic.literal()
    if (collapse != null) __obj.updateDynamic("collapse")(collapse)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    __obj.asInstanceOf[TreeIcons]
  }
}


package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// DropDown
trait DropDownIcons extends js.Object {
  var dropdown: js.UndefOr[java.lang.String] = js.undefined
}

object DropDownIcons {
  @scala.inline
  def apply(dropdown: java.lang.String = null): DropDownIcons = {
    val __obj = js.Dynamic.literal()
    if (dropdown != null) __obj.updateDynamic("dropdown")(dropdown)
    __obj.asInstanceOf[DropDownIcons]
  }
}


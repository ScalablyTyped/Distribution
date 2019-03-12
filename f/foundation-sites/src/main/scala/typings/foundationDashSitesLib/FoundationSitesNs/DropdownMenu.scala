package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/dropdown-menu.html#javascript-reference
trait DropdownMenu extends js.Object {
  def destroy(): scala.Unit
}

object DropdownMenu {
  @scala.inline
  def apply(destroy: () => scala.Unit): DropdownMenu = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[DropdownMenu]
  }
}


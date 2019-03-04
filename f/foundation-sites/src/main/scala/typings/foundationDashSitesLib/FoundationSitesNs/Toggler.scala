package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/toggler.html#javascript-reference
trait Toggler extends js.Object {
  def destroy(): scala.Unit
  def toggle(): scala.Unit
}

object Toggler {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit], toggle: js.Function0[scala.Unit]): Toggler = {
    val __obj = js.Dynamic.literal(destroy = destroy, toggle = toggle)
  
    __obj.asInstanceOf[Toggler]
  }
}


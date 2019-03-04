package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/sticky.html#javascript-reference
trait Sticky extends js.Object {
  def destroy(): scala.Unit
}

object Sticky {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit]): Sticky = {
    val __obj = js.Dynamic.literal(destroy = destroy)
  
    __obj.asInstanceOf[Sticky]
  }
}


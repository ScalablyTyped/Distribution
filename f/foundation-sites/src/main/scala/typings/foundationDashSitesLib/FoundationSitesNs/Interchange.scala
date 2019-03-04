package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/interchange.html#javascript-reference
trait Interchange extends js.Object {
  def destroy(): scala.Unit
  def replace(path: java.lang.String): scala.Unit
}

object Interchange {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit], replace: js.Function1[java.lang.String, scala.Unit]): Interchange = {
    val __obj = js.Dynamic.literal(destroy = destroy, replace = replace)
  
    __obj.asInstanceOf[Interchange]
  }
}


package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/magellan.html#javascript-reference
trait Magellan extends js.Object {
  def calcPoints(): scala.Unit
  def destroy(): scala.Unit
  def reflow(): scala.Unit
  def scrollToLoc(location: java.lang.String): scala.Unit
}

object Magellan {
  @scala.inline
  def apply(
    calcPoints: () => scala.Unit,
    destroy: () => scala.Unit,
    reflow: () => scala.Unit,
    scrollToLoc: java.lang.String => scala.Unit
  ): Magellan = {
    val __obj = js.Dynamic.literal(calcPoints = js.Any.fromFunction0(calcPoints), destroy = js.Any.fromFunction0(destroy), reflow = js.Any.fromFunction0(reflow), scrollToLoc = js.Any.fromFunction1(scrollToLoc))
  
    __obj.asInstanceOf[Magellan]
  }
}


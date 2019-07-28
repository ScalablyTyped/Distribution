package typings.foundationDashSites.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/magellan.html#javascript-reference
trait Magellan extends js.Object {
  def calcPoints(): Unit
  def destroy(): Unit
  def reflow(): Unit
  def scrollToLoc(location: String): Unit
}

object Magellan {
  @scala.inline
  def apply(calcPoints: () => Unit, destroy: () => Unit, reflow: () => Unit, scrollToLoc: String => Unit): Magellan = {
    val __obj = js.Dynamic.literal(calcPoints = js.Any.fromFunction0(calcPoints), destroy = js.Any.fromFunction0(destroy), reflow = js.Any.fromFunction0(reflow), scrollToLoc = js.Any.fromFunction1(scrollToLoc))
  
    __obj.asInstanceOf[Magellan]
  }
}


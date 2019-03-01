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
    calcPoints: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    reflow: js.Function0[scala.Unit],
    scrollToLoc: js.Function1[java.lang.String, scala.Unit]
  ): Magellan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calcPoints")(calcPoints)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("reflow")(reflow)
    __obj.updateDynamic("scrollToLoc")(scrollToLoc)
    __obj.asInstanceOf[Magellan]
  }
}


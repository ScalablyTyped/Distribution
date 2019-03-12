package typings
package detectDashPassiveDashEventsLib.detectDashPassiveDashEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectPassiveEvents extends js.Object {
  var hasSupport: scala.Boolean
  def update(): scala.Unit
}

object detectPassiveEvents {
  @scala.inline
  def apply(hasSupport: scala.Boolean, update: () => scala.Unit): detectPassiveEvents = {
    val __obj = js.Dynamic.literal(hasSupport = hasSupport, update = js.Any.fromFunction0(update))
  
    __obj.asInstanceOf[detectPassiveEvents]
  }
}


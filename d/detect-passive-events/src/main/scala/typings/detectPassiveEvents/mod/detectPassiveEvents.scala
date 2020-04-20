package typings.detectPassiveEvents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait detectPassiveEvents extends js.Object {
  var hasSupport: Boolean
  def update(): Unit
}

object detectPassiveEvents {
  @scala.inline
  def apply(hasSupport: Boolean, update: () => Unit): detectPassiveEvents = {
    val __obj = js.Dynamic.literal(hasSupport = hasSupport.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectPassiveEvents]
  }
}


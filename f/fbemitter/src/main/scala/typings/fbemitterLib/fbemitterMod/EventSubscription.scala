package typings
package fbemitterLib.fbemitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fbemitter", "EventSubscription")
@js.native
class EventSubscription () extends js.Object {
  var context: js.Any = js.native
  var listener: js.Function = js.native
  /**
    * Removes this subscription from the subscriber that controls it.
    */
  def remove(): scala.Unit = js.native
}


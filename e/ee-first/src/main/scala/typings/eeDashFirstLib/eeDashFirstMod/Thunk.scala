package typings
package eeDashFirstLib.eeDashFirstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thunk[TEmitter /* <: nodeLib.eventsMod.EventEmitter */] extends js.Object {
  def apply(listener: Listener[TEmitter]): scala.Unit = js.native
  /**
    * The group of listeners can be cancelled before being invoked and have all the event listeners removed
    * from the underlying event emitters.
    */
  def cancel(): scala.Unit = js.native
}


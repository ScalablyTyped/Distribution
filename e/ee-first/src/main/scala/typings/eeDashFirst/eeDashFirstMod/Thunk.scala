package typings.eeDashFirst.eeDashFirstMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Thunk[TEmitter /* <: EventEmitter */] extends js.Object {
  def apply(listener: Listener[TEmitter]): Unit = js.native
  /**
    * The group of listeners can be cancelled before being invoked and have all the event listeners removed
    * from the underlying event emitters.
    */
  def cancel(): Unit = js.native
}


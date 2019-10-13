package typings.eventsDotOnce

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("events.once", JSImport.Namespace)
@js.native
object eventsDotOnceMod extends js.Object {
  def apply(emitter: EventEmitter, event: String): js.Promise[js.Array[_]] = js.native
  def apply(emitter: EventEmitter, event: js.Symbol): js.Promise[js.Array[_]] = js.native
}


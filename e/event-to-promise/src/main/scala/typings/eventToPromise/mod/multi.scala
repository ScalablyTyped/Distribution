package typings.eventToPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("event-to-promise", "multi")
@js.native
object multi extends js.Object {
  
  def apply(emitter: EventSource, successEvents: js.Array[String]): js.Promise[_] = js.native
  def apply(emitter: EventSource, successEvents: js.Array[String], errorEvents: js.Array[String]): js.Promise[_] = js.native
}

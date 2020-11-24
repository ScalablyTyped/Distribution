package typings.eventsource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The MessageEvent interface represents a message received by a target object. */
@js.native
trait MessageEvent[T] extends Event {
  
  /**
    * Returns the data of the message.
    */
  val data: T = js.native
  
  /**
    * Returns the last event ID string, for server-sent events.
    */
  val lastEventId: String = js.native
  
  /**
    * Returns the origin of the message, for server-sent events and
    * cross-document messaging.
    */
  val origin: String = js.native
}

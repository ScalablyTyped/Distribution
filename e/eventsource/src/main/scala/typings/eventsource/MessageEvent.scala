package typings.eventsource

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The MessageEvent interface represents a message received by a target object. */
@js.native
trait MessageEvent extends Event {
  /**
    * Returns the data of the message.
    */
  val data: js.Any = js.native
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

@JSGlobal("MessageEvent")
@js.native
object MessageEvent
  extends Instantiable1[/* type */ String, MessageEvent]
     with Instantiable2[/* type */ String, /* eventInitDict */ MessageEventInit, MessageEvent]


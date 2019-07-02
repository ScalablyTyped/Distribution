package typings
package eventsourceLib

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
  val lastEventId: java.lang.String = js.native
  /**
    * Returns the origin of the message, for server-sent events and
    * cross-document messaging.
    */
  val origin: java.lang.String = js.native
}

@JSGlobal("MessageEvent")
@js.native
class MessageEventCls protected () extends MessageEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MessageEventInit) = this()
}

@JSGlobal("MessageEvent")
@js.native
object MessageEvent
  extends org.scalablytyped.runtime.Instantiable2[/* type */ java.lang.String, /* eventInitDict */ MessageEventInit, MessageEvent]
     with org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, MessageEvent]


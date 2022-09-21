package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "EventSourceApi")
@js.native
open class EventSourceApi protected () extends StObject {
  def this(context: CalendarContext, internalEventSource: EventSource[Any]) = this()
  
  /* private */ var context: Any = js.native
  
  def format: String = js.native
  
  def id: String = js.native
  
  var internalEventSource: EventSource[Any] = js.native
  
  def refetch(): Unit = js.native
  
  def remove(): Unit = js.native
  
  def url: String = js.native
}

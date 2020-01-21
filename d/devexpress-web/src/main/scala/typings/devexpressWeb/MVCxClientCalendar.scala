package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the Calendar and CalendarFor extensions.
  */
@JSGlobal("MVCxClientCalendar")
@js.native
class MVCxClientCalendar () extends ASPxClientCalendar {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientCalendar: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientCalendar]] = js.native
}

/* static members */
@JSGlobal("MVCxClientCalendar")
@js.native
object MVCxClientCalendar extends js.Object {
  /**
    * Converts the specified object to the MVCxClientCalendar type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): MVCxClientCalendar = js.native
}


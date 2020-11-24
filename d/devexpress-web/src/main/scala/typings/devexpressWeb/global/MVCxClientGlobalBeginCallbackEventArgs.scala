package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientGlobalEvents.BeginCallback event.
  */
@JSGlobal("MVCxClientGlobalBeginCallbackEventArgs")
@js.native
class MVCxClientGlobalBeginCallbackEventArgs protected ()
  extends typings.devexpressWeb.MVCxClientGlobalBeginCallbackEventArgs {
  /**
    * Initializes a new instance of the MVCxClientGlobalBeginCallbackEventArgs class.
    * @param control An ASPxClientControl class descendant object that is the control that initiated a callback.
    * @param command A string value that is the name of the command that initiated a callback.
    */
  def this(control: typings.devexpressWeb.ASPxClientControl, command: String) = this()
}

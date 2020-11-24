package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client ASPxClientControlCollection.ControlsInitialized event.
  */
@JSGlobal("ASPxClientControlsInitializedEventArgs")
@js.native
class ASPxClientControlsInitializedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientControlsInitializedEventArgs {
  /**
    * Initializes a new object of the ASPxClientControlsInitializedEventArgs type with the specified settings.
    * @param isCallback true if a callback is sent to the server during controls initialization; otherwise, false.
    */
  def this(isCallback: Boolean) = this()
}

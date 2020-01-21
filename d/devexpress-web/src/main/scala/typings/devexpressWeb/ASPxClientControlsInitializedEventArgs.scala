package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client ASPxClientControlCollection.ControlsInitialized event.
  */
@JSGlobal("ASPxClientControlsInitializedEventArgs")
@js.native
class ASPxClientControlsInitializedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the ASPxClientControlsInitializedEventArgs type with the specified settings.
    * @param isCallback true if a callback is sent to the server during controls initialization; otherwise, false.
    */
  def this(isCallback: Boolean) = this()
  /**
    * Gets a value that specifies whether a callback is sent during a controls initialization.
    */
  var isCallback: Boolean = js.native
}


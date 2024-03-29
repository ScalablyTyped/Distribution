package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client ASPxClientControlCollection.ControlsInitialized event.
  */
@JSGlobal("ASPxClientControlsInitializedEventArgs")
@js.native
open class ASPxClientControlsInitializedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientControlsInitializedEventArgs {
  /**
    * Initializes a new object of the ASPxClientControlsInitializedEventArgs type with the specified settings.
    * @param isCallback true if a callback is sent to the server during controls initialization; otherwise, false.
    */
  def this(isCallback: Boolean) = this()
  
  /**
    * Gets a value that specifies whether a callback is sent during a controls initialization.
    */
  /* CompleteClass */
  var isCallback: Boolean = js.native
}

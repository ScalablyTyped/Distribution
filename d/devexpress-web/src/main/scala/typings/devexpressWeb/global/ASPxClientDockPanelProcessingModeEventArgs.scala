package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockPanel.AfterFloat event.
  */
@JSGlobal("ASPxClientDockPanelProcessingModeEventArgs")
@js.native
class ASPxClientDockPanelProcessingModeEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDockPanelProcessingModeEventArgs {
  /**
    * For internal use only.
    */
  def this(processOnServer: Boolean, zone: typings.devexpressWeb.ASPxClientDockZone) = this()
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
  
  /**
    * Gets the zone currently being processed.
    */
  /* CompleteClass */
  var zone: typings.devexpressWeb.ASPxClientDockZone = js.native
}

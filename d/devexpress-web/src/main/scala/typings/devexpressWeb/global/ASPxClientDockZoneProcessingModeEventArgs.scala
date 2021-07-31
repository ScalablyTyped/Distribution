package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockZone.AfterDock event.
  */
@JSGlobal("ASPxClientDockZoneProcessingModeEventArgs")
@js.native
class ASPxClientDockZoneProcessingModeEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDockZoneProcessingModeEventArgs {
  /**
    * Initializes a new object of the ASPxClientDockZoneProcessingModeEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param panel An ASPxClientDockPanel object that is a panel related to the event.
    */
  def this(processOnServer: Boolean, panel: typings.devexpressWeb.ASPxClientDockPanel) = this()
  
  /**
    * Gets the panel currently being processed.
    */
  /* CompleteClass */
  var panel: typings.devexpressWeb.ASPxClientDockPanel = js.native
  
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  var processOnServer: Boolean = js.native
}

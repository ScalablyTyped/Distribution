package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockPanel.BeforeDock event.
  */
@JSGlobal("ASPxClientDockPanelProcessingModeCancelEventArgs")
@js.native
open class ASPxClientDockPanelProcessingModeCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDockPanelProcessingModeCancelEventArgs {
  /**
    * For internal use only.
    */
  def this(processOnServer: Boolean, zone: typings.devexpressWeb.ASPxClientDockZone) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
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

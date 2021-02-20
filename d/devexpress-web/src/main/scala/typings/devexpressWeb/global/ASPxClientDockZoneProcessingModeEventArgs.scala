package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDockZone.AfterDock event.
  */
@JSGlobal("ASPxClientDockZoneProcessingModeEventArgs")
@js.native
class ASPxClientDockZoneProcessingModeEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientDockZoneProcessingModeEventArgs {
  /**
    * Initializes a new object of the ASPxClientDockZoneProcessingModeEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param panel An ASPxClientDockPanel object that is a panel related to the event.
    */
  def this(processOnServer: Boolean, panel: typings.devexpressWeb.ASPxClientDockPanel) = this()
}

package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /**
    * Gets the panel currently being processed.
    */
  /* CompleteClass */
  override var panel: typings.devexpressWeb.ASPxClientDockPanel = js.native
  /**
    * Gets or sets a value that specifies whether the event should be finally processed on the server side.
    */
  /* CompleteClass */
  override var processOnServer: Boolean = js.native
}


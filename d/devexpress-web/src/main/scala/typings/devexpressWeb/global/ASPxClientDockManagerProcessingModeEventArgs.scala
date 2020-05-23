package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockManager.AfterDock event.
  */
@JSGlobal("ASPxClientDockManagerProcessingModeEventArgs")
@js.native
class ASPxClientDockManagerProcessingModeEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientDockManagerProcessingModeEventArgs {
  /**
    * Initializes a new object of the ASPxClientDockManagerProcessingModeEventArgs type with the specified settings.
    * @param processOnServer true to process the event on the server side; false to completely handle it on the client side.
    * @param panel An ASPxClientDockPanel object that is a panel related to the event.
    * @param zone An ASPxClientDockZone object that is a zone related to the event.
    */
  def this(
    processOnServer: Boolean,
    panel: typings.devexpressWeb.ASPxClientDockPanel,
    zone: typings.devexpressWeb.ASPxClientDockZone
  ) = this()
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
  /**
    * Gets the zone currently being processed.
    */
  /* CompleteClass */
  override var zone: typings.devexpressWeb.ASPxClientDockZone = js.native
}


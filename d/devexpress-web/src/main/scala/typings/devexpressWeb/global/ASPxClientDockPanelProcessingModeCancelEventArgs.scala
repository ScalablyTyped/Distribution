package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockPanel.BeforeDock event.
  */
@JSGlobal("ASPxClientDockPanelProcessingModeCancelEventArgs")
@js.native
class ASPxClientDockPanelProcessingModeCancelEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientDockPanelProcessingModeCancelEventArgs {
  /**
    * For internal use only.
    */
  def this(processOnServer: Boolean, zone: typings.devexpressWeb.ASPxClientDockZone) = this()
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  /* CompleteClass */
  override var cancel: Boolean = js.native
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


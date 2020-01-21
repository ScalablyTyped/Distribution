package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
@JSGlobal("ASPxClientDockManagerProcessingModeCancelEventArgs")
@js.native
class ASPxClientDockManagerProcessingModeCancelEventArgs protected () extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * For internal use only.
    */
  def this(processOnServer: Boolean, panel: ASPxClientDockPanel, zone: ASPxClientDockZone) = this()
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
  /**
    * Gets the zone currently being processed.
    */
  var zone: ASPxClientDockZone = js.native
}


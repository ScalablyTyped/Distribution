package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDockManager.BeforeDock event.
  */
@JSGlobal("ASPxClientDockManagerCancelEventArgs")
@js.native
class ASPxClientDockManagerCancelEventArgs protected () extends ASPxClientCancelEventArgs {
  /**
    * For internal use only.
    */
  def this(panel: ASPxClientDockPanel) = this()
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
}


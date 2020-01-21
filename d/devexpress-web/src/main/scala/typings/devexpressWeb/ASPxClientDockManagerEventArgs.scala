package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on panels.
  */
@JSGlobal("ASPxClientDockManagerEventArgs")
@js.native
class ASPxClientDockManagerEventArgs protected () extends ASPxClientEventArgs {
  /**
    * For internal use only.
    */
  def this(panel: ASPxClientDockPanel) = this()
  /**
    * Gets the panel currently being processed.
    */
  var panel: ASPxClientDockPanel = js.native
}


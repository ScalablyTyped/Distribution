package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client ControlsInitialized event.
  */
trait ASPxClientControlsInitializedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a value that specifies whether a callback is sent during a controls initialization.
    * Value: true if a callback is sent; otherwise, false.
    */
  var isCallback: scala.Boolean
}

object ASPxClientControlsInitializedEventArgs {
  @scala.inline
  def apply(isCallback: scala.Boolean): ASPxClientControlsInitializedEventArgs = {
    val __obj = js.Dynamic.literal(isCallback = isCallback)
  
    __obj.asInstanceOf[ASPxClientControlsInitializedEventArgs]
  }
}


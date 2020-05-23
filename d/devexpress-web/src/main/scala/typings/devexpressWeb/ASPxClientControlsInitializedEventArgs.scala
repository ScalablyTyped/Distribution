package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the client ASPxClientControlCollection.ControlsInitialized event.
  */
trait ASPxClientControlsInitializedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a value that specifies whether a callback is sent during a controls initialization.
    */
  var isCallback: Boolean
}

object ASPxClientControlsInitializedEventArgs {
  @scala.inline
  def apply(isCallback: Boolean): ASPxClientControlsInitializedEventArgs = {
    val __obj = js.Dynamic.literal(isCallback = isCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlsInitializedEventArgs]
  }
}


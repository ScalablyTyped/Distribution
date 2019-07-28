package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ToolbarUpdating event.
  */
trait ASPxClientFileManagerToolbarUpdatingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the currently active file manager area.
    * Value: A string value that identifies the active area.
    */
  var activeAreaName: String
}

object ASPxClientFileManagerToolbarUpdatingEventArgs {
  @scala.inline
  def apply(activeAreaName: String): ASPxClientFileManagerToolbarUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(activeAreaName = activeAreaName)
  
    __obj.asInstanceOf[ASPxClientFileManagerToolbarUpdatingEventArgs]
  }
}


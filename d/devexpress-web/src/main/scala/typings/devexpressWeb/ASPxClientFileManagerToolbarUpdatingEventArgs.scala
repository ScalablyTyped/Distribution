package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ToolbarUpdating event.
  */
trait ASPxClientFileManagerToolbarUpdatingEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the currently active file manager area.
    */
  var activeAreaName: String
}

object ASPxClientFileManagerToolbarUpdatingEventArgs {
  @scala.inline
  def apply(activeAreaName: String): ASPxClientFileManagerToolbarUpdatingEventArgs = {
    val __obj = js.Dynamic.literal(activeAreaName = activeAreaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerToolbarUpdatingEventArgs]
  }
}


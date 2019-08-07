package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFileManager.ToolbarUpdating event.
  */
@JSGlobal("ASPxClientFileManagerToolbarUpdatingEventArgs")
@js.native
class ASPxClientFileManagerToolbarUpdatingEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFileManagerToolbarUpdatingEventArgs class with the specified setting.
    * @param activeAreaName The active file manager area. Initializes the ASPxClientFileManagerToolbarUpdatingEventArgs.activeAreaName property.
    */
  def this(activeAreaName: String) = this()
  /**
    * Gets the name of the currently active file manager area.
    */
  var activeAreaName: String = js.native
}


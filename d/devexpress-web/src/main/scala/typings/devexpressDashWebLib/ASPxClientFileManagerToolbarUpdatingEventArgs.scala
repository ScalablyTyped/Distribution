package typings
package devexpressDashWebLib

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
  var activeAreaName: java.lang.String
}

object ASPxClientFileManagerToolbarUpdatingEventArgs {
  @scala.inline
  def apply(activeAreaName: java.lang.String): ASPxClientFileManagerToolbarUpdatingEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activeAreaName")(activeAreaName)
    __obj.asInstanceOf[ASPxClientFileManagerToolbarUpdatingEventArgs]
  }
}


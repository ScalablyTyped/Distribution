package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DropZoneLeave event.
  */
trait ASPxClientUploadControlDropZoneLeaveEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a drop zone object related to the processed event.
    * Value: An object that is a drop zone related to the processed event.
    */
  var dropZone: js.Object
}

object ASPxClientUploadControlDropZoneLeaveEventArgs {
  @scala.inline
  def apply(dropZone: js.Object): ASPxClientUploadControlDropZoneLeaveEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone)
  
    __obj.asInstanceOf[ASPxClientUploadControlDropZoneLeaveEventArgs]
  }
}


package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.DropZoneLeave event.
  */
trait ASPxClientUploadControlDropZoneLeaveEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a <strong>drop zone</strong> object related to the processed event.
    */
  var dropZone: js.Any
}

object ASPxClientUploadControlDropZoneLeaveEventArgs {
  @scala.inline
  def apply(dropZone: js.Any): ASPxClientUploadControlDropZoneLeaveEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlDropZoneLeaveEventArgs]
  }
}


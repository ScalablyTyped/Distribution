package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.DropZoneEnter event.
  */
trait ASPxClientUploadControlDropZoneEnterEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a <strong>drop zone</strong> object related to the processed event.
    */
  var dropZone: js.Any
}

object ASPxClientUploadControlDropZoneEnterEventArgs {
  @scala.inline
  def apply(dropZone: js.Any): ASPxClientUploadControlDropZoneEnterEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlDropZoneEnterEventArgs]
  }
}


package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DropZoneEnter event.
  */
trait ASPxClientUploadControlDropZoneEnterEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a drop zone object related to the processed event.
    * Value: An object that is a drop zone related to the processed event.
    */
  var dropZone: js.Object
}

object ASPxClientUploadControlDropZoneEnterEventArgs {
  @scala.inline
  def apply(dropZone: js.Object): ASPxClientUploadControlDropZoneEnterEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone)
  
    __obj.asInstanceOf[ASPxClientUploadControlDropZoneEnterEventArgs]
  }
}


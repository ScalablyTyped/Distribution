package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientUploadControl.DropZoneLeave event.
  */
@JSGlobal("ASPxClientUploadControlDropZoneLeaveEventArgs")
@js.native
class ASPxClientUploadControlDropZoneLeaveEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientUploadControlDropZoneLeaveEventArgs object.
    * @param dropZone An object that is a drop zone related to the processed event.
    */
  def this(dropZone: js.Any) = this()
  /**
    * Gets a <strong>drop zone</strong> object related to the processed event.
    */
  var dropZone: js.Any = js.native
}


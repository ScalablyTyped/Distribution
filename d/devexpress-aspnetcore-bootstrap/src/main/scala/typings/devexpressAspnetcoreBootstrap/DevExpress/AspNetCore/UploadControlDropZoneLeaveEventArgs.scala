package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlDropZoneLeaveEventArgs extends EventArgs {
  val dropZone: js.Any
}

object UploadControlDropZoneLeaveEventArgs {
  @scala.inline
  def apply(dropZone: js.Any, sender: Control): UploadControlDropZoneLeaveEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlDropZoneLeaveEventArgs]
  }
}


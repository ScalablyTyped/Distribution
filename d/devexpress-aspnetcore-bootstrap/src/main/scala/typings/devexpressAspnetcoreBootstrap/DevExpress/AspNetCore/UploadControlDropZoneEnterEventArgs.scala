package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlDropZoneEnterEventArgs extends EventArgs {
  val dropZone: js.Any
}

object UploadControlDropZoneEnterEventArgs {
  @scala.inline
  def apply(dropZone: js.Any, sender: Control): UploadControlDropZoneEnterEventArgs = {
    val __obj = js.Dynamic.literal(dropZone = dropZone.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlDropZoneEnterEventArgs]
  }
}


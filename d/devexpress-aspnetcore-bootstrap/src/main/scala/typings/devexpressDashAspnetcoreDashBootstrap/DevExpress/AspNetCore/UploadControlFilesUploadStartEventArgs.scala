package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlFilesUploadStartEventArgs extends EventArgs {
  val cancel: Boolean
}

object UploadControlFilesUploadStartEventArgs {
  @scala.inline
  def apply(cancel: Boolean, sender: Control): UploadControlFilesUploadStartEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadControlFilesUploadStartEventArgs]
  }
}


package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlFilesUploadStartEventArgs extends EventArgs {
  val cancel: scala.Boolean
}

object UploadControlFilesUploadStartEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, sender: Control): UploadControlFilesUploadStartEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, sender = sender)
  
    __obj.asInstanceOf[UploadControlFilesUploadStartEventArgs]
  }
}


package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlFilesUploadCompleteEventArgs extends EventArgs {
  val callbackData: java.lang.String
  val errorText: java.lang.String
}

object UploadControlFilesUploadCompleteEventArgs {
  @scala.inline
  def apply(callbackData: java.lang.String, errorText: java.lang.String, sender: Control): UploadControlFilesUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackData")(callbackData)
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[UploadControlFilesUploadCompleteEventArgs]
  }
}


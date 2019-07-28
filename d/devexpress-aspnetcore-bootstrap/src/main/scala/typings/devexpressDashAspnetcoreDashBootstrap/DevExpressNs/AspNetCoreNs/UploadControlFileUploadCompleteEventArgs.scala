package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlFileUploadCompleteEventArgs extends EventArgs {
  val callbackData: String
  val errorText: String
  val inputIndex: Double
  val isValid: Boolean
}

object UploadControlFileUploadCompleteEventArgs {
  @scala.inline
  def apply(callbackData: String, errorText: String, inputIndex: Double, isValid: Boolean, sender: Control): UploadControlFileUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData, errorText = errorText, inputIndex = inputIndex, isValid = isValid, sender = sender)
  
    __obj.asInstanceOf[UploadControlFileUploadCompleteEventArgs]
  }
}


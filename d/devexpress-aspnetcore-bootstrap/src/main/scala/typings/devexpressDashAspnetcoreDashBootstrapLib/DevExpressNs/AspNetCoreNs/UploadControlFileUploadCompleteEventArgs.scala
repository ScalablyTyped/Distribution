package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadControlFileUploadCompleteEventArgs extends EventArgs {
  val callbackData: java.lang.String
  val errorText: java.lang.String
  val inputIndex: scala.Double
  val isValid: scala.Boolean
}

object UploadControlFileUploadCompleteEventArgs {
  @scala.inline
  def apply(
    callbackData: java.lang.String,
    errorText: java.lang.String,
    inputIndex: scala.Double,
    isValid: scala.Boolean,
    sender: Control
  ): UploadControlFileUploadCompleteEventArgs = {
    val __obj = js.Dynamic.literal(callbackData = callbackData, errorText = errorText, inputIndex = inputIndex, isValid = isValid, sender = sender)
  
    __obj.asInstanceOf[UploadControlFileUploadCompleteEventArgs]
  }
}


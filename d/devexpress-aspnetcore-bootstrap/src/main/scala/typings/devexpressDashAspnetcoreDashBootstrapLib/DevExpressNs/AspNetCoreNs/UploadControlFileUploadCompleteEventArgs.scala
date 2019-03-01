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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callbackData")(callbackData)
    __obj.updateDynamic("errorText")(errorText)
    __obj.updateDynamic("inputIndex")(inputIndex)
    __obj.updateDynamic("isValid")(isValid)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[UploadControlFileUploadCompleteEventArgs]
  }
}


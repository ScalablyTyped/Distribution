package typings.dymoLabelFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorDetails extends js.Object {
  /** An empty string if no error is detected; an error message if an error is detected. */
  var errorDetails: String = js.native
  /** Indicates whether the browser is supported or not. */
  var isBrowserSupported: Boolean = js.native
  /** Indicates whether the Framework is installed or not. */
  var isFrameworkInstalled: Boolean = js.native
}

object ErrorDetails {
  @scala.inline
  def apply(errorDetails: String, isBrowserSupported: Boolean, isFrameworkInstalled: Boolean): ErrorDetails = {
    val __obj = js.Dynamic.literal(errorDetails = errorDetails.asInstanceOf[js.Any], isBrowserSupported = isBrowserSupported.asInstanceOf[js.Any], isFrameworkInstalled = isFrameworkInstalled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
  @scala.inline
  implicit class ErrorDetailsOps[Self <: ErrorDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorDetails(value: String): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBrowserSupported(value: Boolean): Self = this.set("isBrowserSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFrameworkInstalled(value: Boolean): Self = this.set("isFrameworkInstalled", value.asInstanceOf[js.Any])
  }
  
}


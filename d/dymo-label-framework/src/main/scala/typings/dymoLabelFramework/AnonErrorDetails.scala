package typings.dymoLabelFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorDetails extends js.Object {
  /** An empty string if no error is detected; an error message if an error is detected. */
  var errorDetails: String
  /** Indicates whether the browser is supported or not. */
  var isBrowserSupported: Boolean
  /** Indicates whether the Framework is installed or not. */
  var isFrameworkInstalled: Boolean
}

object AnonErrorDetails {
  @scala.inline
  def apply(errorDetails: String, isBrowserSupported: Boolean, isFrameworkInstalled: Boolean): AnonErrorDetails = {
    val __obj = js.Dynamic.literal(errorDetails = errorDetails.asInstanceOf[js.Any], isBrowserSupported = isBrowserSupported.asInstanceOf[js.Any], isFrameworkInstalled = isFrameworkInstalled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorDetails]
  }
}


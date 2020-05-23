package typings.dymoLabelFramework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetails extends js.Object {
  /** An empty string if no error is detected; an error message if an error is detected. */
  var errorDetails: String
  /** Indicates whether the browser is supported or not. */
  var isBrowserSupported: Boolean
  /** Indicates whether the Framework is installed or not. */
  var isFrameworkInstalled: Boolean
}

object ErrorDetails {
  @scala.inline
  def apply(errorDetails: String, isBrowserSupported: Boolean, isFrameworkInstalled: Boolean): ErrorDetails = {
    val __obj = js.Dynamic.literal(errorDetails = errorDetails.asInstanceOf[js.Any], isBrowserSupported = isBrowserSupported.asInstanceOf[js.Any], isFrameworkInstalled = isFrameworkInstalled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
}


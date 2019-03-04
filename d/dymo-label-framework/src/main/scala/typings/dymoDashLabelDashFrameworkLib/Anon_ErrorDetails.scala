package typings
package dymoDashLabelDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorDetails extends js.Object {
  /** An empty string if no error is detected; an error message if an error is detected. */
  var errorDetails: java.lang.String
  /** Indicates whether the browser is supported or not. */
  var isBrowserSupported: scala.Boolean
  /** Indicates whether the Framework is installed or not. */
  var isFrameworkInstalled: scala.Boolean
}

object Anon_ErrorDetails {
  @scala.inline
  def apply(
    errorDetails: java.lang.String,
    isBrowserSupported: scala.Boolean,
    isFrameworkInstalled: scala.Boolean
  ): Anon_ErrorDetails = {
    val __obj = js.Dynamic.literal(errorDetails = errorDetails, isBrowserSupported = isBrowserSupported, isFrameworkInstalled = isFrameworkInstalled)
  
    __obj.asInstanceOf[Anon_ErrorDetails]
  }
}


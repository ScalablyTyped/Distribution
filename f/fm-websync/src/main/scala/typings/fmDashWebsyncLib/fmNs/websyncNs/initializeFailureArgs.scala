package typings
package fmDashWebsyncLib.fmNs.websyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait initializeFailureArgs extends baseArgs {
  /**
    * The error generated while initializing.
    */
  var error: java.lang.String
}

object initializeFailureArgs {
  @scala.inline
  def apply(error: java.lang.String): initializeFailureArgs = {
    val __obj = js.Dynamic.literal(error = error)
  
    __obj.asInstanceOf[initializeFailureArgs]
  }
}


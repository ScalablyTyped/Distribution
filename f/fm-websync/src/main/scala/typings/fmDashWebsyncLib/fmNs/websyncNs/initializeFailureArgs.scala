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
  def apply(
    error: java.lang.String,
    StringDictionary: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): initializeFailureArgs = {
    val __obj = js.Dynamic.literal(error = error)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[initializeFailureArgs]
  }
}


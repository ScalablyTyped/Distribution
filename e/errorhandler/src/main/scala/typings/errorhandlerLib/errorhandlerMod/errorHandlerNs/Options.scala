package typings
package errorhandlerLib.errorhandlerMod.errorHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Defaults to true.
    *
    * Possible values:
    *   true       : Log errors using console.error(str).
    *   false      : Only send the error back in the response.
    *   A function : pass the error to a function for handling.
    */
  var log: scala.Boolean | LoggingCallback
}

object Options {
  @scala.inline
  def apply(log: scala.Boolean | LoggingCallback): Options = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}


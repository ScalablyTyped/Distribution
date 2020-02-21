package typings.errorhandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Provide a function to be called with the error and a string representation of the erro
    * Defaults to true.
    *
    * Possible values:
    *   true       : Log errors using console.error(str).
    *   false      : Only send the error back in the response.
    *   A function : pass the error to a function for handling.
    */
  var log: Boolean | LoggingCallback
}

object Options {
  @scala.inline
  def apply(log: Boolean | LoggingCallback): Options = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}


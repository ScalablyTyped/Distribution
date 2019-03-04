package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryError extends js.Object {
  /** A string representing the error information. */
  var body: java.lang.String
  /** The response code corresponding to the error. */
  var code: scala.Double
}

object QueryError {
  @scala.inline
  def apply(body: java.lang.String, code: scala.Double): QueryError = {
    val __obj = js.Dynamic.literal(body = body, code = code)
  
    __obj.asInstanceOf[QueryError]
  }
}


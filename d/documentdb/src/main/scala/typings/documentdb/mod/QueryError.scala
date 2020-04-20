package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryError extends js.Object {
  /** A string representing the error information. */
  var body: String
  /** The response code corresponding to the error. */
  var code: Double
}

object QueryError {
  @scala.inline
  def apply(body: String, code: Double): QueryError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryError]
  }
}


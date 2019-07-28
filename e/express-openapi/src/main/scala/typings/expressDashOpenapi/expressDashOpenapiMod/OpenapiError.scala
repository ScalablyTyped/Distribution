package typings.expressDashOpenapi.expressDashOpenapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenapiError extends js.Object {
  var errorCode: String
  var location: String
  var message: String
  var path: String
}

object OpenapiError {
  @scala.inline
  def apply(errorCode: String, location: String, message: String, path: String): OpenapiError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, location = location, message = message, path = path)
  
    __obj.asInstanceOf[OpenapiError]
  }
}


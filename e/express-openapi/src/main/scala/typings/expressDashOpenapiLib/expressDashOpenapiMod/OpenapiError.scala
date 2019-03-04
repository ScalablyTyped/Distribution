package typings
package expressDashOpenapiLib.expressDashOpenapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenapiError extends js.Object {
  var errorCode: java.lang.String
  var location: java.lang.String
  var message: java.lang.String
  var path: java.lang.String
}

object OpenapiError {
  @scala.inline
  def apply(
    errorCode: java.lang.String,
    location: java.lang.String,
    message: java.lang.String,
    path: java.lang.String
  ): OpenapiError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, location = location, message = message, path = path)
  
    __obj.asInstanceOf[OpenapiError]
  }
}


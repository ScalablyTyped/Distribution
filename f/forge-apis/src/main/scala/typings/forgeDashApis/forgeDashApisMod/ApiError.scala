package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiError extends js.Object {
  var statusCode: Double
  var statusMessage: String
}

object ApiError {
  @scala.inline
  def apply(statusCode: Double, statusMessage: String): ApiError = {
    val __obj = js.Dynamic.literal(statusCode = statusCode, statusMessage = statusMessage)
  
    __obj.asInstanceOf[ApiError]
  }
}


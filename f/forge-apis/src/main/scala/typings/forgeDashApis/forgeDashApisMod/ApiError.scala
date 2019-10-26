package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiError extends js.Object {
  var statusBody: js.Object
  var statusCode: Double
  var statusMessage: String
}

object ApiError {
  @scala.inline
  def apply(statusBody: js.Object, statusCode: Double, statusMessage: String): ApiError = {
    val __obj = js.Dynamic.literal(statusBody = statusBody, statusCode = statusCode, statusMessage = statusMessage)
  
    __obj.asInstanceOf[ApiError]
  }
}


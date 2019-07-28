package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiResponse extends js.Object {
  var body: js.Any
  var headers: js.Any
  var statusCode: Double
}

object ApiResponse {
  @scala.inline
  def apply(body: js.Any, headers: js.Any, statusCode: Double): ApiResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, statusCode = statusCode)
  
    __obj.asInstanceOf[ApiResponse]
  }
}


package typings
package forgeDashApisLib.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiResponse extends js.Object {
  var body: js.Any
  var headers: js.Any
  var statusCode: scala.Double
}

object ApiResponse {
  @scala.inline
  def apply(body: js.Any, headers: js.Any, statusCode: scala.Double): ApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[ApiResponse]
  }
}


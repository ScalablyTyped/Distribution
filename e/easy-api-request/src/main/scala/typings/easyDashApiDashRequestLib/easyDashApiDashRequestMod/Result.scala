package typings
package easyDashApiDashRequestLib.easyDashApiDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var body: js.Any
  var data: js.UndefOr[js.Any] = js.undefined
  var err: js.UndefOr[js.Any] = js.undefined
  var response: nodeLib.httpMod.IncomingMessage
}

object Result {
  @scala.inline
  def apply(body: js.Any, response: nodeLib.httpMod.IncomingMessage, data: js.Any = null, err: js.Any = null): Result = {
    val __obj = js.Dynamic.literal(body = body, response = response)
    if (data != null) __obj.updateDynamic("data")(data)
    if (err != null) __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[Result]
  }
}


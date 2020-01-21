package typings.easyApiRequest.mod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var body: js.Any
  var data: js.UndefOr[js.Any] = js.undefined
  var err: js.UndefOr[js.Any] = js.undefined
  var response: IncomingMessage
}

object Result {
  @scala.inline
  def apply(body: js.Any, response: IncomingMessage, data: js.Any = null, err: js.Any = null): Result = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}


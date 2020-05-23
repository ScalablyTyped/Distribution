package typings.eggMock.anon

import typings.node.Buffer
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: Buffer | String | JSON
  var headers: js.Any
  var status: Double
}

object Data {
  @scala.inline
  def apply(data: Buffer | String | JSON, headers: js.Any, status: Double): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}


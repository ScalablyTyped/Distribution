package typings.eggMock

import typings.node.Buffer
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: Buffer | String | JSON
  var headers: js.Any
  var status: Double
}

object AnonData {
  @scala.inline
  def apply(data: Buffer | String | JSON, headers: js.Any, status: Double): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}


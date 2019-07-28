package typings.eggDashMock

import typings.node.Buffer
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: Buffer | String | JSON
  var headers: js.Any
  var status: Double
}

object Anon_Data {
  @scala.inline
  def apply(data: Buffer | String | JSON, headers: js.Any, status: Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers, status = status)
  
    __obj.asInstanceOf[Anon_Data]
  }
}


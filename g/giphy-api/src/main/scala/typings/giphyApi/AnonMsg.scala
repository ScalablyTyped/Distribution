package typings.giphyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMsg extends js.Object {
  var msg: String
  var response_id: String
  var status: Double
}

object AnonMsg {
  @scala.inline
  def apply(msg: String, response_id: String, status: Double): AnonMsg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], response_id = response_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMsg]
  }
}


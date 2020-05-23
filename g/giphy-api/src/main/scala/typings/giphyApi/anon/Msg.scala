package typings.giphyApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Msg extends js.Object {
  var msg: String
  var response_id: String
  var status: Double
}

object Msg {
  @scala.inline
  def apply(msg: String, response_id: String, status: Double): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], response_id = response_id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
}


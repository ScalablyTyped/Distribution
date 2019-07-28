package typings.giphyDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Msg extends js.Object {
  var msg: String
  var response_id: String
  var status: Double
}

object Anon_Msg {
  @scala.inline
  def apply(msg: String, response_id: String, status: Double): Anon_Msg = {
    val __obj = js.Dynamic.literal(msg = msg, response_id = response_id, status = status)
  
    __obj.asInstanceOf[Anon_Msg]
  }
}


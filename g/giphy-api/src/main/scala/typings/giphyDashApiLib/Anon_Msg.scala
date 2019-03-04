package typings
package giphyDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Msg extends js.Object {
  var msg: java.lang.String
  var response_id: java.lang.String
  var status: scala.Double
}

object Anon_Msg {
  @scala.inline
  def apply(msg: java.lang.String, response_id: java.lang.String, status: scala.Double): Anon_Msg = {
    val __obj = js.Dynamic.literal(msg = msg, response_id = response_id, status = status)
  
    __obj.asInstanceOf[Anon_Msg]
  }
}


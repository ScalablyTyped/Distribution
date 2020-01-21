package typings.engineIoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.engineIoClient.engineIoClientStrings.polling
  - typings.engineIoClient.engineIoClientStrings.websocket
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def polling: typings.engineIoClient.engineIoClientStrings.polling = this.cast("polling")
  @scala.inline
  def websocket: typings.engineIoClient.engineIoClientStrings.websocket = this.cast("websocket")
}


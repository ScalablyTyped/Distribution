package typings.engineIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.engineIo.engineIoStrings.polling
  - typings.engineIo.engineIoStrings.websocket
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def polling: typings.engineIo.engineIoStrings.polling = this.cast("polling")
  @scala.inline
  def websocket: typings.engineIo.engineIoStrings.websocket = this.cast("websocket")
}


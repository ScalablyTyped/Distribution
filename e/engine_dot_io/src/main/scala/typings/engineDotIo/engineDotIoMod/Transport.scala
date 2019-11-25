package typings.engineDotIo.engineDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.engineDotIo.engineDotIoStrings.polling
  - typings.engineDotIo.engineDotIoStrings.websocket
*/
trait Transport extends js.Object

object Transport {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def polling: typings.engineDotIo.engineDotIoStrings.polling = this.cast("polling")
  @scala.inline
  def websocket: typings.engineDotIo.engineDotIoStrings.websocket = this.cast("websocket")
}


package typings.eventEmitter.pipeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitterPipe extends js.Object {
  def close(): Unit
}

object EmitterPipe {
  @scala.inline
  def apply(close: () => Unit): EmitterPipe = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[EmitterPipe]
  }
}


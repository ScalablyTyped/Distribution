package typings
package eventDashEmitterLib.pipeMod.pipeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitterPipe extends js.Object {
  def close(): scala.Unit
}

object EmitterPipe {
  @scala.inline
  def apply(close: () => scala.Unit): EmitterPipe = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[EmitterPipe]
  }
}


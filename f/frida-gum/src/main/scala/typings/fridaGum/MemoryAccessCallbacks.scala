package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Callbacks to be notified synchronously on memory access.
  */
trait MemoryAccessCallbacks extends js.Object {
  def onAccess(details: MemoryAccessDetails): Unit
}

object MemoryAccessCallbacks {
  @scala.inline
  def apply(onAccess: MemoryAccessDetails => Unit): MemoryAccessCallbacks = {
    val __obj = js.Dynamic.literal(onAccess = js.Any.fromFunction1(onAccess))
    __obj.asInstanceOf[MemoryAccessCallbacks]
  }
}


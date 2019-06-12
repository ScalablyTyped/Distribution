package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Callbacks to be notified synchronously on memory access.
  */
trait MemoryAccessCallbacks extends js.Object {
  def onAccess(details: MemoryAccessDetails): scala.Unit
}

object MemoryAccessCallbacks {
  @scala.inline
  def apply(onAccess: MemoryAccessDetails => scala.Unit): MemoryAccessCallbacks = {
    val __obj = js.Dynamic.literal(onAccess = js.Any.fromFunction1(onAccess))
  
    __obj.asInstanceOf[MemoryAccessCallbacks]
  }
}


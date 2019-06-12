package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryAccessRange extends js.Object {
  /**
    * Base address.
    */
  var base: NativePointer
  /**
    * Size in bytes.
    */
  var size: scala.Double
}

object MemoryAccessRange {
  @scala.inline
  def apply(base: NativePointer, size: scala.Double): MemoryAccessRange = {
    val __obj = js.Dynamic.literal(base = base, size = size)
  
    __obj.asInstanceOf[MemoryAccessRange]
  }
}


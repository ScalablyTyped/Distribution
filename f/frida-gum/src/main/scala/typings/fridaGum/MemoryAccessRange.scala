package typings.fridaGum

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
  var size: Double
}

object MemoryAccessRange {
  @scala.inline
  def apply(base: NativePointer, size: Double): MemoryAccessRange = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryAccessRange]
  }
}


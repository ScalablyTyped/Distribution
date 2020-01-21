package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryRange extends js.Object {
  /**
    * Base address.
    */
  var base: NativePointer
  /**
    * Size in bytes.
    */
  var size: Double
}

object MemoryRange {
  @scala.inline
  def apply(base: NativePointer, size: Double): MemoryRange = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemoryRange]
  }
}


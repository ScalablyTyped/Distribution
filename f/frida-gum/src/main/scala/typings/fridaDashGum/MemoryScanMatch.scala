package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryScanMatch extends js.Object {
  /**
    * Memory address where a match was found.
    */
  var address: NativePointer
  /**
    * Size of this match.
    */
  var size: Double
}

object MemoryScanMatch {
  @scala.inline
  def apply(address: NativePointer, size: Double): MemoryScanMatch = {
    val __obj = js.Dynamic.literal(address = address, size = size)
  
    __obj.asInstanceOf[MemoryScanMatch]
  }
}


package typings.fridaGum

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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemoryScanMatch]
  }
}


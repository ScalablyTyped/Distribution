package typings
package fridaDashGumLib

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
  var size: scala.Double
}

object MemoryScanMatch {
  @scala.inline
  def apply(address: NativePointer, size: scala.Double): MemoryScanMatch = {
    val __obj = js.Dynamic.literal(address = address, size = size)
  
    __obj.asInstanceOf[MemoryScanMatch]
  }
}


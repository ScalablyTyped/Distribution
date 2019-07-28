package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelMemoryScanMatch extends js.Object {
  /**
    * Memory address where a match was found.
    */
  var address: UInt64
  /**
    * Size of this match.
    */
  var size: Double
}

object KernelMemoryScanMatch {
  @scala.inline
  def apply(address: UInt64, size: Double): KernelMemoryScanMatch = {
    val __obj = js.Dynamic.literal(address = address, size = size)
  
    __obj.asInstanceOf[KernelMemoryScanMatch]
  }
}


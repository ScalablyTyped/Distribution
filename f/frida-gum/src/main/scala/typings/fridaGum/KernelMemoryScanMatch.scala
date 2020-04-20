package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelMemoryScanMatch extends js.Object {
  /**
    * Memory address where a match was found.
    */
  var address: UInt64_
  /**
    * Size of this match.
    */
  var size: Double
}

object KernelMemoryScanMatch {
  @scala.inline
  def apply(address: UInt64_, size: Double): KernelMemoryScanMatch = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelMemoryScanMatch]
  }
}


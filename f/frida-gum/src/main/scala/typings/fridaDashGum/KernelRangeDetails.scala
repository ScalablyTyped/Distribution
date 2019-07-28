package typings.fridaDashGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelRangeDetails extends js.Object {
  /**
    * Base address.
    */
  var base: UInt64
  /**
    * Protection.
    */
  var protection: PageProtection
  /**
    * Size in bytes.
    */
  var size: Double
}

object KernelRangeDetails {
  @scala.inline
  def apply(base: UInt64, protection: PageProtection, size: Double): KernelRangeDetails = {
    val __obj = js.Dynamic.literal(base = base, protection = protection, size = size)
  
    __obj.asInstanceOf[KernelRangeDetails]
  }
}


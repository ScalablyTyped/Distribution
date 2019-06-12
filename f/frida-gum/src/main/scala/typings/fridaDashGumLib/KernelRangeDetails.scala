package typings
package fridaDashGumLib

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
  var size: scala.Double
}

object KernelRangeDetails {
  @scala.inline
  def apply(base: UInt64, protection: PageProtection, size: scala.Double): KernelRangeDetails = {
    val __obj = js.Dynamic.literal(base = base, protection = protection, size = size)
  
    __obj.asInstanceOf[KernelRangeDetails]
  }
}


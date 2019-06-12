package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelModuleRangeDetails extends js.Object {
  /**
    * Base address.
    */
  var base: UInt64
  /**
    * Name.
    */
  var name: java.lang.String
  /**
    * Protection.
    */
  var protection: PageProtection
  /**
    * Size in bytes.
    */
  var size: scala.Double
}

object KernelModuleRangeDetails {
  @scala.inline
  def apply(base: UInt64, name: java.lang.String, protection: PageProtection, size: scala.Double): KernelModuleRangeDetails = {
    val __obj = js.Dynamic.literal(base = base, name = name, protection = protection, size = size)
  
    __obj.asInstanceOf[KernelModuleRangeDetails]
  }
}


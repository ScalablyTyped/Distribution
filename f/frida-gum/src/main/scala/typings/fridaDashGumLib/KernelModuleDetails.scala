package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelModuleDetails extends js.Object {
  /**
    * Base address.
    */
  var base: UInt64
  /**
    * Canonical module name.
    */
  var name: java.lang.String
  /**
    * Size in bytes.
    */
  var size: scala.Double
}

object KernelModuleDetails {
  @scala.inline
  def apply(base: UInt64, name: java.lang.String, size: scala.Double): KernelModuleDetails = {
    val __obj = js.Dynamic.literal(base = base, name = name, size = size)
  
    __obj.asInstanceOf[KernelModuleDetails]
  }
}


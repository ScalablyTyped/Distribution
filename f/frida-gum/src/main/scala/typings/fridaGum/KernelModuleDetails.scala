package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelModuleDetails extends js.Object {
  /**
    * Base address.
    */
  var base: UInt64_
  /**
    * Canonical module name.
    */
  var name: String
  /**
    * Size in bytes.
    */
  var size: Double
}

object KernelModuleDetails {
  @scala.inline
  def apply(base: UInt64_, name: String, size: Double): KernelModuleDetails = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KernelModuleDetails]
  }
}


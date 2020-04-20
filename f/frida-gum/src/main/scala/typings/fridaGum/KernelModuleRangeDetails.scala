package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KernelModuleRangeDetails extends js.Object {
  /**
    * Base address.
    */
  var base: UInt64_
  /**
    * Name.
    */
  var name: String
  /**
    * Protection.
    */
  var protection: PageProtection
  /**
    * Size in bytes.
    */
  var size: Double
}

object KernelModuleRangeDetails {
  @scala.inline
  def apply(base: UInt64_, name: String, protection: PageProtection, size: Double): KernelModuleRangeDetails = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelModuleRangeDetails]
  }
}


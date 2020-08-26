package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KernelRangeDetails extends js.Object {
  /**
    * Base address.
    */
  var base: UInt64 = js.native
  /**
    * Protection.
    */
  var protection: PageProtection = js.native
  /**
    * Size in bytes.
    */
  var size: Double = js.native
}

object KernelRangeDetails {
  @scala.inline
  def apply(base: UInt64, protection: PageProtection, size: Double): KernelRangeDetails = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernelRangeDetails]
  }
  @scala.inline
  implicit class KernelRangeDetailsOps[Self <: KernelRangeDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBase(value: UInt64): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtection(value: PageProtection): Self = this.set("protection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}


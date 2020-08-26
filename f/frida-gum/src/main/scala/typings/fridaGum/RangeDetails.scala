package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeDetails extends js.Object {
  /**
    * Base address.
    */
  var base: NativePointer = js.native
  /**
    * File mapping details, if available.
    */
  var file: js.UndefOr[FileMapping] = js.native
  /**
    * Protection.
    */
  var protection: PageProtection = js.native
  /**
    * Size in bytes.
    */
  var size: Double = js.native
}

object RangeDetails {
  @scala.inline
  def apply(base: NativePointer, protection: PageProtection, size: Double): RangeDetails = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeDetails]
  }
  @scala.inline
  implicit class RangeDetailsOps[Self <: RangeDetails] (val x: Self) extends AnyVal {
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
    def setBase(value: NativePointer): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtection(value: PageProtection): Self = this.set("protection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: FileMapping): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
  
}


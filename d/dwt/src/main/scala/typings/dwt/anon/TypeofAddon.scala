package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAddon extends js.Object {
  val OCRPro: TypeofOCRPro = js.native
}

object TypeofAddon {
  @scala.inline
  def apply(OCRPro: TypeofOCRPro): TypeofAddon = {
    val __obj = js.Dynamic.literal(OCRPro = OCRPro.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofAddon]
  }
  @scala.inline
  implicit class TypeofAddonOps[Self <: TypeofAddon] (val x: Self) extends AnyVal {
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
    def setOCRPro(value: TypeofOCRPro): Self = this.set("OCRPro", value.asInstanceOf[js.Any])
  }
  
}


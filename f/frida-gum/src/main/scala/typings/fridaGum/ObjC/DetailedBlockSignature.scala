package typings.fridaGum.ObjC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetailedBlockSignature extends BlockSignature {
  /**
    * Signature.
    */
  var types: String = js.native
}

object DetailedBlockSignature {
  @scala.inline
  def apply(types: String): DetailedBlockSignature = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetailedBlockSignature]
  }
  @scala.inline
  implicit class DetailedBlockSignatureOps[Self <: DetailedBlockSignature] (val x: Self) extends AnyVal {
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
    def setTypes(value: String): Self = this.set("types", value.asInstanceOf[js.Any])
  }
  
}


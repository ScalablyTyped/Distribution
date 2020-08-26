package typings.fileSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bits extends js.Object {
  var fixed: String = js.native
  var result: Double = js.native
}

object Bits {
  @scala.inline
  def apply(fixed: String, result: Double): Bits = {
    val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bits]
  }
  @scala.inline
  implicit class BitsOps[Self <: Bits] (val x: Self) extends AnyVal {
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
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: Double): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}


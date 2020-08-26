package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait X86BaseOperand extends js.Object {
  var size: Double = js.native
}

object X86BaseOperand {
  @scala.inline
  def apply(size: Double): X86BaseOperand = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86BaseOperand]
  }
  @scala.inline
  implicit class X86BaseOperandOps[Self <: X86BaseOperand] (val x: Self) extends AnyVal {
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
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}


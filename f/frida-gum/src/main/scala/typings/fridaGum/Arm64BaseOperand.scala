package typings.fridaGum

import typings.fridaGum.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arm64BaseOperand extends js.Object {
  var ext: js.UndefOr[Arm64Extender] = js.native
  var shift: js.UndefOr[Value] = js.native
  var vas: js.UndefOr[Arm64Vas] = js.native
  var vectorIndex: js.UndefOr[Double] = js.native
}

object Arm64BaseOperand {
  @scala.inline
  def apply(): Arm64BaseOperand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arm64BaseOperand]
  }
  @scala.inline
  implicit class Arm64BaseOperandOps[Self <: Arm64BaseOperand] (val x: Self) extends AnyVal {
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
    def setExt(value: Arm64Extender): Self = this.set("ext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
    @scala.inline
    def setShift(value: Value): Self = this.set("shift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
    @scala.inline
    def setVas(value: Arm64Vas): Self = this.set("vas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVas: Self = this.set("vas", js.undefined)
    @scala.inline
    def setVectorIndex(value: Double): Self = this.set("vectorIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVectorIndex: Self = this.set("vectorIndex", js.undefined)
  }
  
}


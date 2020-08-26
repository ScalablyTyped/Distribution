package typings.fileSize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calculated extends js.Object {
  var bits: Bits = js.native
  var fixed: String = js.native
  var magnitude: Double = js.native
  var result: Double = js.native
  var suffix: String = js.native
}

object Calculated {
  @scala.inline
  def apply(bits: Bits, fixed: String, magnitude: Double, result: Double, suffix: String): Calculated = {
    val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], magnitude = magnitude.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calculated]
  }
  @scala.inline
  implicit class CalculatedOps[Self <: Calculated] (val x: Self) extends AnyVal {
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
    def setBits(value: Bits): Self = this.set("bits", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMagnitude(value: Double): Self = this.set("magnitude", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: Double): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
  }
  
}


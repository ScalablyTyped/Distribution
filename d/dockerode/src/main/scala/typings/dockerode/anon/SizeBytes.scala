package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeBytes extends js.Object {
  var Mode: Double = js.native
  var SizeBytes: Double = js.native
}

object SizeBytes {
  @scala.inline
  def apply(Mode: Double, SizeBytes: Double): SizeBytes = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], SizeBytes = SizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeBytes]
  }
  @scala.inline
  implicit class SizeBytesOps[Self <: SizeBytes] (val x: Self) extends AnyVal {
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
    def setMode(value: Double): Self = this.set("Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSizeBytes(value: Double): Self = this.set("SizeBytes", value.asInstanceOf[js.Any])
  }
  
}


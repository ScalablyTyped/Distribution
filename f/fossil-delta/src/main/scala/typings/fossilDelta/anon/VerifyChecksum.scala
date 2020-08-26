package typings.fossilDelta.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyChecksum extends js.Object {
  var verifyChecksum: Boolean = js.native
}

object VerifyChecksum {
  @scala.inline
  def apply(verifyChecksum: Boolean): VerifyChecksum = {
    val __obj = js.Dynamic.literal(verifyChecksum = verifyChecksum.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyChecksum]
  }
  @scala.inline
  implicit class VerifyChecksumOps[Self <: VerifyChecksum] (val x: Self) extends AnyVal {
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
    def setVerifyChecksum(value: Boolean): Self = this.set("verifyChecksum", value.asInstanceOf[js.Any])
  }
  
}


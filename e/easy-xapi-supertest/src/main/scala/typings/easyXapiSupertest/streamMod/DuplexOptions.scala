package typings.easyXapiSupertest.streamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.easyXapiSupertest.streamMod.WritableOptions because var conflicts: highWaterMark. Inlined decodeStrings */ @js.native
trait DuplexOptions extends ReadableOptions {
  var allowHalfOpen: js.UndefOr[Boolean] = js.native
  var decodeStrings: js.UndefOr[Boolean] = js.native
}

object DuplexOptions {
  @scala.inline
  def apply(): DuplexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DuplexOptions]
  }
  @scala.inline
  implicit class DuplexOptionsOps[Self <: DuplexOptions] (val x: Self) extends AnyVal {
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
    def setAllowHalfOpen(value: Boolean): Self = this.set("allowHalfOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHalfOpen: Self = this.set("allowHalfOpen", js.undefined)
    @scala.inline
    def setDecodeStrings(value: Boolean): Self = this.set("decodeStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecodeStrings: Self = this.set("decodeStrings", js.undefined)
  }
  
}


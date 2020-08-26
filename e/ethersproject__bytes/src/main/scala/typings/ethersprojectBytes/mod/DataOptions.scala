package typings.ethersprojectBytes.mod

import typings.ethersprojectBytes.ethersprojectBytesStrings.left
import typings.ethersprojectBytes.ethersprojectBytesStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataOptions extends js.Object {
  var allowMissingPrefix: js.UndefOr[Boolean] = js.native
  var hexPad: js.UndefOr[left | right | Null] = js.native
}

object DataOptions {
  @scala.inline
  def apply(): DataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataOptions]
  }
  @scala.inline
  implicit class DataOptionsOps[Self <: DataOptions] (val x: Self) extends AnyVal {
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
    def setAllowMissingPrefix(value: Boolean): Self = this.set("allowMissingPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMissingPrefix: Self = this.set("allowMissingPrefix", js.undefined)
    @scala.inline
    def setHexPad(value: left | right): Self = this.set("hexPad", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHexPad: Self = this.set("hexPad", js.undefined)
    @scala.inline
    def setHexPadNull: Self = this.set("hexPad", null)
  }
  
}


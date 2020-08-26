package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientFileWriteOptions extends js.Object {
  var lastVersionTag: js.UndefOr[String] = js.native
  var noOverwrite: js.UndefOr[Boolean] = js.native
  var parentRev: js.UndefOr[String] = js.native
}

object ClientFileWriteOptions {
  @scala.inline
  def apply(): ClientFileWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientFileWriteOptions]
  }
  @scala.inline
  implicit class ClientFileWriteOptionsOps[Self <: ClientFileWriteOptions] (val x: Self) extends AnyVal {
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
    def setLastVersionTag(value: String): Self = this.set("lastVersionTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastVersionTag: Self = this.set("lastVersionTag", js.undefined)
    @scala.inline
    def setNoOverwrite(value: Boolean): Self = this.set("noOverwrite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoOverwrite: Self = this.set("noOverwrite", js.undefined)
    @scala.inline
    def setParentRev(value: String): Self = this.set("parentRev", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentRev: Self = this.set("parentRev", js.undefined)
  }
  
}


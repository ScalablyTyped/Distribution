package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoSetModify extends js.Object {
  var noSetFullAccess: js.UndefOr[Boolean] = js.native
  var noSetModify: js.UndefOr[Boolean] = js.native
  var noSetReadOnly: js.UndefOr[Boolean] = js.native
  var noSetReadPlusActivity: js.UndefOr[Boolean] = js.native
}

object NoSetModify {
  @scala.inline
  def apply(): NoSetModify = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoSetModify]
  }
  @scala.inline
  implicit class NoSetModifyOps[Self <: NoSetModify] (val x: Self) extends AnyVal {
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
    def setNoSetFullAccess(value: Boolean): Self = this.set("noSetFullAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSetFullAccess: Self = this.set("noSetFullAccess", js.undefined)
    @scala.inline
    def setNoSetModify(value: Boolean): Self = this.set("noSetModify", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSetModify: Self = this.set("noSetModify", js.undefined)
    @scala.inline
    def setNoSetReadOnly(value: Boolean): Self = this.set("noSetReadOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSetReadOnly: Self = this.set("noSetReadOnly", js.undefined)
    @scala.inline
    def setNoSetReadPlusActivity(value: Boolean): Self = this.set("noSetReadPlusActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoSetReadPlusActivity: Self = this.set("noSetReadPlusActivity", js.undefined)
  }
  
}


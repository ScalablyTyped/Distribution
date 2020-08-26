package typings.expressSocketIoSession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedSessionOptions extends js.Object {
  var autoSave: js.UndefOr[Boolean] = js.native
  var saveUninitialized: js.UndefOr[Boolean] = js.native
}

object SharedSessionOptions {
  @scala.inline
  def apply(): SharedSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedSessionOptions]
  }
  @scala.inline
  implicit class SharedSessionOptionsOps[Self <: SharedSessionOptions] (val x: Self) extends AnyVal {
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
    def setAutoSave(value: Boolean): Self = this.set("autoSave", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSave: Self = this.set("autoSave", js.undefined)
    @scala.inline
    def setSaveUninitialized(value: Boolean): Self = this.set("saveUninitialized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveUninitialized: Self = this.set("saveUninitialized", js.undefined)
  }
  
}


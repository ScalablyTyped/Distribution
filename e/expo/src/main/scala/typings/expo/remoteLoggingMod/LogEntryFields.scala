package typings.expo.remoteLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogEntryFields extends js.Object {
  var groupCollapsed: js.UndefOr[Boolean] = js.native
  var groupDepth: js.UndefOr[Double] = js.native
  var shouldHide: js.UndefOr[Boolean] = js.native
}

object LogEntryFields {
  @scala.inline
  def apply(): LogEntryFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogEntryFields]
  }
  @scala.inline
  implicit class LogEntryFieldsOps[Self <: LogEntryFields] (val x: Self) extends AnyVal {
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
    def setGroupCollapsed(value: Boolean): Self = this.set("groupCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupCollapsed: Self = this.set("groupCollapsed", js.undefined)
    @scala.inline
    def setGroupDepth(value: Double): Self = this.set("groupDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupDepth: Self = this.set("groupDepth", js.undefined)
    @scala.inline
    def setShouldHide(value: Boolean): Self = this.set("shouldHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShouldHide: Self = this.set("shouldHide", js.undefined)
  }
  
}


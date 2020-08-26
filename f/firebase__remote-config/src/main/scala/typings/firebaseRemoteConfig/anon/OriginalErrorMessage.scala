package typings.firebaseRemoteConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalErrorMessage extends js.Object {
  var originalErrorMessage: js.UndefOr[String] = js.native
}

object OriginalErrorMessage {
  @scala.inline
  def apply(): OriginalErrorMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginalErrorMessage]
  }
  @scala.inline
  implicit class OriginalErrorMessageOps[Self <: OriginalErrorMessage] (val x: Self) extends AnyVal {
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
    def setOriginalErrorMessage(value: String): Self = this.set("originalErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalErrorMessage: Self = this.set("originalErrorMessage", js.undefined)
  }
  
}


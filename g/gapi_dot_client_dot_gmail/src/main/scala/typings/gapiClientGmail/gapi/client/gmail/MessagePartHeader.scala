package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessagePartHeader extends js.Object {
  /** The name of the header before the : separator. For example, To. */
  var name: js.UndefOr[String] = js.native
  /** The value of the header after the : separator. For example, someuser@example.com. */
  var value: js.UndefOr[String] = js.native
}

object MessagePartHeader {
  @scala.inline
  def apply(): MessagePartHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagePartHeader]
  }
  @scala.inline
  implicit class MessagePartHeaderOps[Self <: MessagePartHeader] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}


package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIPostMessageOptions extends js.Object {
  var origin: js.UndefOr[String] = js.native
}

object UIPostMessageOptions {
  @scala.inline
  def apply(): UIPostMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIPostMessageOptions]
  }
  @scala.inline
  implicit class UIPostMessageOptionsOps[Self <: UIPostMessageOptions] (val x: Self) extends AnyVal {
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
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}


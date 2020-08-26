package typings.gestalt.mod

import typings.gestalt.gestaltStrings.`arrow-circle-forward`
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.orange
import typings.gestalt.gestaltStrings.red
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastProps extends js.Object {
  var color: js.UndefOr[darkGray | orange | red] = js.native
  var icon: js.UndefOr[`arrow-circle-forward`] = js.native
  var text: js.UndefOr[String | js.Array[String]] = js.native
  var thumbnail: js.UndefOr[ReactElement] = js.native
}

object ToastProps {
  @scala.inline
  def apply(): ToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastProps]
  }
  @scala.inline
  implicit class ToastPropsOps[Self <: ToastProps] (val x: Self) extends AnyVal {
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
    def setColor(value: darkGray | orange | red): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setIcon(value: `arrow-circle-forward`): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: String | js.Array[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setThumbnail(value: ReactElement): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
  }
  
}


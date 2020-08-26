package typings.devextreme.anon

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.top
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatPosition extends js.Object {
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.native
  var position: js.UndefOr[bottom | top] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object FormatPosition {
  @scala.inline
  def apply(): FormatPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatPosition]
  }
  @scala.inline
  implicit class FormatPositionOps[Self <: FormatPosition] (val x: Self) extends AnyVal {
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
    def setFormatFunction1(value: /* value */ Double | typings.std.Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setPosition(value: bottom | top): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}


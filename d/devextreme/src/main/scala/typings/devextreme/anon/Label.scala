package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  var label: js.UndefOr[CustomizeTextFormat] = js.native
  var separatorHeight: js.UndefOr[Double] = js.native
  var textLeftIndent: js.UndefOr[Double] = js.native
  var textTopIndent: js.UndefOr[Double] = js.native
  var topIndent: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object Label {
  @scala.inline
  def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
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
    def setLabel(value: CustomizeTextFormat): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSeparatorHeight(value: Double): Self = this.set("separatorHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparatorHeight: Self = this.set("separatorHeight", js.undefined)
    @scala.inline
    def setTextLeftIndent(value: Double): Self = this.set("textLeftIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextLeftIndent: Self = this.set("textLeftIndent", js.undefined)
    @scala.inline
    def setTextTopIndent(value: Double): Self = this.set("textTopIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextTopIndent: Self = this.set("textTopIndent", js.undefined)
    @scala.inline
    def setTopIndent(value: Double): Self = this.set("topIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopIndent: Self = this.set("topIndent", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}


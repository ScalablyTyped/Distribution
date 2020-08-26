package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionStyle extends js.Object {
  var border: js.UndefOr[ColorWidth] = js.native
  var color: js.UndefOr[String] = js.native
  var hoverStyle: js.UndefOr[`26`] = js.native
  var label: js.UndefOr[WordWrap] = js.native
  var selectionStyle: js.UndefOr[`26`] = js.native
}

object SelectionStyle {
  @scala.inline
  def apply(): SelectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionStyle]
  }
  @scala.inline
  implicit class SelectionStyleOps[Self <: SelectionStyle] (val x: Self) extends AnyVal {
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
    def setBorder(value: ColorWidth): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setHoverStyle(value: `26`): Self = this.set("hoverStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverStyle: Self = this.set("hoverStyle", js.undefined)
    @scala.inline
    def setLabel(value: WordWrap): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setSelectionStyle(value: `26`): Self = this.set("selectionStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionStyle: Self = this.set("selectionStyle", js.undefined)
  }
  
}


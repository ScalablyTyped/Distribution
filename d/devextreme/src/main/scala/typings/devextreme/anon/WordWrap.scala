package typings.devextreme.anon

import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WordWrap extends js.Object {
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}

object WordWrap {
  @scala.inline
  def apply(): WordWrap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordWrap]
  }
  @scala.inline
  implicit class WordWrapOps[Self <: WordWrap] (val x: Self) extends AnyVal {
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
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setTextOverflow(value: ellipsis | hide | none): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWordWrap(value: normal | breakWord | none): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
  
}


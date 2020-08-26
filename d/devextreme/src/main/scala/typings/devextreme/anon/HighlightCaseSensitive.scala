package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightCaseSensitive extends js.Object {
  var highlightCaseSensitive: js.UndefOr[Boolean] = js.native
  var highlightSearchText: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var searchVisibleColumnsOnly: js.UndefOr[Boolean] = js.native
  var text: js.UndefOr[String] = js.native
  var visible: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object HighlightCaseSensitive {
  @scala.inline
  def apply(): HighlightCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightCaseSensitive]
  }
  @scala.inline
  implicit class HighlightCaseSensitiveOps[Self <: HighlightCaseSensitive] (val x: Self) extends AnyVal {
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
    def setHighlightCaseSensitive(value: Boolean): Self = this.set("highlightCaseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightCaseSensitive: Self = this.set("highlightCaseSensitive", js.undefined)
    @scala.inline
    def setHighlightSearchText(value: Boolean): Self = this.set("highlightSearchText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightSearchText: Self = this.set("highlightSearchText", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setSearchVisibleColumnsOnly(value: Boolean): Self = this.set("searchVisibleColumnsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchVisibleColumnsOnly: Self = this.set("searchVisibleColumnsOnly", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


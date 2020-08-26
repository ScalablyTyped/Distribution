package typings.devextreme.anon

import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AscendingText extends js.Object {
  var ascendingText: js.UndefOr[String] = js.native
  var clearText: js.UndefOr[String] = js.native
  var descendingText: js.UndefOr[String] = js.native
  var mode: js.UndefOr[multiple | none | single_] = js.native
  var showSortIndexes: js.UndefOr[Boolean] = js.native
}

object AscendingText {
  @scala.inline
  def apply(): AscendingText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AscendingText]
  }
  @scala.inline
  implicit class AscendingTextOps[Self <: AscendingText] (val x: Self) extends AnyVal {
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
    def setAscendingText(value: String): Self = this.set("ascendingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAscendingText: Self = this.set("ascendingText", js.undefined)
    @scala.inline
    def setClearText(value: String): Self = this.set("clearText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearText: Self = this.set("clearText", js.undefined)
    @scala.inline
    def setDescendingText(value: String): Self = this.set("descendingText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescendingText: Self = this.set("descendingText", js.undefined)
    @scala.inline
    def setMode(value: multiple | none | single_): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setShowSortIndexes(value: Boolean): Self = this.set("showSortIndexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSortIndexes: Self = this.set("showSortIndexes", js.undefined)
  }
  
}


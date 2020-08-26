package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextElement extends js.Object {
  var autoText: js.UndefOr[AutoText] = js.native
  var endIndex: js.UndefOr[Double] = js.native
  var paragraphMarker: js.UndefOr[ParagraphMarker] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var textRun: js.UndefOr[TextRun] = js.native
}

object TextElement {
  @scala.inline
  def apply(): TextElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextElement]
  }
  @scala.inline
  implicit class TextElementOps[Self <: TextElement] (val x: Self) extends AnyVal {
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
    def setAutoText(value: AutoText): Self = this.set("autoText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoText: Self = this.set("autoText", js.undefined)
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    @scala.inline
    def setParagraphMarker(value: ParagraphMarker): Self = this.set("paragraphMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParagraphMarker: Self = this.set("paragraphMarker", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setTextRun(value: TextRun): Self = this.set("textRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextRun: Self = this.set("textRun", js.undefined)
  }
  
}


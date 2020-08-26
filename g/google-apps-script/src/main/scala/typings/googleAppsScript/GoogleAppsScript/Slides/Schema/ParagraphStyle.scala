package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParagraphStyle extends js.Object {
  var alignment: js.UndefOr[String] = js.native
  var direction: js.UndefOr[String] = js.native
  var indentEnd: js.UndefOr[Dimension] = js.native
  var indentFirstLine: js.UndefOr[Dimension] = js.native
  var indentStart: js.UndefOr[Dimension] = js.native
  var lineSpacing: js.UndefOr[Double] = js.native
  var spaceAbove: js.UndefOr[Dimension] = js.native
  var spaceBelow: js.UndefOr[Dimension] = js.native
  var spacingMode: js.UndefOr[String] = js.native
}

object ParagraphStyle {
  @scala.inline
  def apply(): ParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphStyle]
  }
  @scala.inline
  implicit class ParagraphStyleOps[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
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
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setIndentEnd(value: Dimension): Self = this.set("indentEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentEnd: Self = this.set("indentEnd", js.undefined)
    @scala.inline
    def setIndentFirstLine(value: Dimension): Self = this.set("indentFirstLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentFirstLine: Self = this.set("indentFirstLine", js.undefined)
    @scala.inline
    def setIndentStart(value: Dimension): Self = this.set("indentStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentStart: Self = this.set("indentStart", js.undefined)
    @scala.inline
    def setLineSpacing(value: Double): Self = this.set("lineSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineSpacing: Self = this.set("lineSpacing", js.undefined)
    @scala.inline
    def setSpaceAbove(value: Dimension): Self = this.set("spaceAbove", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceAbove: Self = this.set("spaceAbove", js.undefined)
    @scala.inline
    def setSpaceBelow(value: Dimension): Self = this.set("spaceBelow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpaceBelow: Self = this.set("spaceBelow", js.undefined)
    @scala.inline
    def setSpacingMode(value: String): Self = this.set("spacingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpacingMode: Self = this.set("spacingMode", js.undefined)
  }
  
}


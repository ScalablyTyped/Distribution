package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Footnote extends js.Object {
  var content: js.UndefOr[js.Array[StructuralElement]] = js.native
  var footnoteId: js.UndefOr[String] = js.native
}

object Footnote {
  @scala.inline
  def apply(): Footnote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Footnote]
  }
  @scala.inline
  implicit class FootnoteOps[Self <: Footnote] (val x: Self) extends AnyVal {
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
    def setContentVarargs(value: StructuralElement*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: js.Array[StructuralElement]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setFootnoteId(value: String): Self = this.set("footnoteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFootnoteId: Self = this.set("footnoteId", js.undefined)
  }
  
}


package typings.exceljs.mod

import typings.exceljs.anon.PartialCommentMargins
import typings.exceljs.anon.PartialCommentProtection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  var editAs: js.UndefOr[CommentEditAs] = js.native
  var margins: js.UndefOr[PartialCommentMargins] = js.native
  var protection: js.UndefOr[PartialCommentProtection] = js.native
  var texts: js.UndefOr[js.Array[RichText]] = js.native
}

object Comment {
  @scala.inline
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def setEditAs(value: CommentEditAs): Self = this.set("editAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditAs: Self = this.set("editAs", js.undefined)
    @scala.inline
    def setMargins(value: PartialCommentMargins): Self = this.set("margins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargins: Self = this.set("margins", js.undefined)
    @scala.inline
    def setProtection(value: PartialCommentProtection): Self = this.set("protection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection: Self = this.set("protection", js.undefined)
    @scala.inline
    def setTextsVarargs(value: RichText*): Self = this.set("texts", js.Array(value :_*))
    @scala.inline
    def setTexts(value: js.Array[RichText]): Self = this.set("texts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTexts: Self = this.set("texts", js.undefined)
  }
  
}


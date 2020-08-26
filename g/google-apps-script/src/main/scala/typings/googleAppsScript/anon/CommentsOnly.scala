package typings.googleAppsScript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentsOnly extends js.Object {
  var commentsOnly: js.UndefOr[Boolean] = js.native
  var contentsOnly: js.UndefOr[Boolean] = js.native
  var formatOnly: js.UndefOr[Boolean] = js.native
  var skipFilteredRows: js.UndefOr[Boolean] = js.native
  var validationsOnly: js.UndefOr[Boolean] = js.native
}

object CommentsOnly {
  @scala.inline
  def apply(): CommentsOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsOnly]
  }
  @scala.inline
  implicit class CommentsOnlyOps[Self <: CommentsOnly] (val x: Self) extends AnyVal {
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
    def setCommentsOnly(value: Boolean): Self = this.set("commentsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentsOnly: Self = this.set("commentsOnly", js.undefined)
    @scala.inline
    def setContentsOnly(value: Boolean): Self = this.set("contentsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentsOnly: Self = this.set("contentsOnly", js.undefined)
    @scala.inline
    def setFormatOnly(value: Boolean): Self = this.set("formatOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatOnly: Self = this.set("formatOnly", js.undefined)
    @scala.inline
    def setSkipFilteredRows(value: Boolean): Self = this.set("skipFilteredRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipFilteredRows: Self = this.set("skipFilteredRows", js.undefined)
    @scala.inline
    def setValidationsOnly(value: Boolean): Self = this.set("validationsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationsOnly: Self = this.set("validationsOnly", js.undefined)
  }
  
}


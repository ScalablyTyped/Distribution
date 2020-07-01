package typings.exceljs.mod

import typings.exceljs.anon.PartialCommentMargins
import typings.exceljs.anon.PartialCommentProtection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var editAs: js.UndefOr[CommentEditAs] = js.undefined
  var margins: js.UndefOr[PartialCommentMargins] = js.undefined
  var protection: js.UndefOr[PartialCommentProtection] = js.undefined
  var texts: js.UndefOr[js.Array[RichText]] = js.undefined
}

object Comment {
  @scala.inline
  def apply(
    editAs: CommentEditAs = null,
    margins: PartialCommentMargins = null,
    protection: PartialCommentProtection = null,
    texts: js.Array[RichText] = null
  ): Comment = {
    val __obj = js.Dynamic.literal()
    if (editAs != null) __obj.updateDynamic("editAs")(editAs.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}


package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FootnoteReference extends js.Object {
  var footnoteId: js.UndefOr[String] = js.native
  var footnoteNumber: js.UndefOr[String] = js.native
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  var suggestedTextStyleChanges: js.UndefOr[js.Object] = js.native
  var textStyle: js.UndefOr[TextStyle] = js.native
}

object FootnoteReference {
  @scala.inline
  def apply(): FootnoteReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FootnoteReference]
  }
  @scala.inline
  implicit class FootnoteReferenceOps[Self <: FootnoteReference] (val x: Self) extends AnyVal {
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
    def setFootnoteId(value: String): Self = this.set("footnoteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFootnoteId: Self = this.set("footnoteId", js.undefined)
    @scala.inline
    def setFootnoteNumber(value: String): Self = this.set("footnoteNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFootnoteNumber: Self = this.set("footnoteNumber", js.undefined)
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = this.set("suggestedInsertionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = this.set("suggestedInsertionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedInsertionIds: Self = this.set("suggestedInsertionIds", js.undefined)
    @scala.inline
    def setSuggestedTextStyleChanges(value: js.Object): Self = this.set("suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedTextStyleChanges: Self = this.set("suggestedTextStyleChanges", js.undefined)
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
  }
  
}


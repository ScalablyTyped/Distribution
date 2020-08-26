package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineObject extends js.Object {
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.native
  var objectId: js.UndefOr[String] = js.native
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  var suggestedInlineObjectPropertiesChanges: js.UndefOr[js.Object] = js.native
  var suggestedInsertionId: js.UndefOr[String] = js.native
}

object InlineObject {
  @scala.inline
  def apply(): InlineObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObject]
  }
  @scala.inline
  implicit class InlineObjectOps[Self <: InlineObject] (val x: Self) extends AnyVal {
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
    def setInlineObjectProperties(value: InlineObjectProperties): Self = this.set("inlineObjectProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInlineObjectProperties: Self = this.set("inlineObjectProperties", js.undefined)
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    @scala.inline
    def setSuggestedInlineObjectPropertiesChanges(value: js.Object): Self = this.set("suggestedInlineObjectPropertiesChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedInlineObjectPropertiesChanges: Self = this.set("suggestedInlineObjectPropertiesChanges", js.undefined)
    @scala.inline
    def setSuggestedInsertionId(value: String): Self = this.set("suggestedInsertionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedInsertionId: Self = this.set("suggestedInsertionId", js.undefined)
  }
  
}


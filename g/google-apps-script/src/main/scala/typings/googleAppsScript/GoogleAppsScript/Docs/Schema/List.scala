package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List extends js.Object {
  var listProperties: js.UndefOr[ListProperties] = js.native
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  var suggestedInsertionId: js.UndefOr[String] = js.native
  var suggestedListPropertiesChanges: js.UndefOr[js.Object] = js.native
}

object List {
  @scala.inline
  def apply(): List = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[List]
  }
  @scala.inline
  implicit class ListOps[Self <: List] (val x: Self) extends AnyVal {
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
    def setListProperties(value: ListProperties): Self = this.set("listProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListProperties: Self = this.set("listProperties", js.undefined)
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    @scala.inline
    def setSuggestedInsertionId(value: String): Self = this.set("suggestedInsertionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedInsertionId: Self = this.set("suggestedInsertionId", js.undefined)
    @scala.inline
    def setSuggestedListPropertiesChanges(value: js.Object): Self = this.set("suggestedListPropertiesChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuggestedListPropertiesChanges: Self = this.set("suggestedListPropertiesChanges", js.undefined)
  }
  
}


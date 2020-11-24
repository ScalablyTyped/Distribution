package typings.googleAppsScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListContactGroupsResponse extends js.Object {
  
  var contactGroups: js.UndefOr[js.Array[ContactGroup]] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var nextSyncToken: js.UndefOr[String] = js.native
  
  var totalItems: js.UndefOr[Double] = js.native
}
object ListContactGroupsResponse {
  
  @scala.inline
  def apply(): ListContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListContactGroupsResponse]
  }
  
  @scala.inline
  implicit class ListContactGroupsResponseOps[Self <: ListContactGroupsResponse] (val x: Self) extends AnyVal {
    
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
    def setContactGroupsVarargs(value: ContactGroup*): Self = this.set("contactGroups", js.Array(value :_*))
    
    @scala.inline
    def setContactGroups(value: js.Array[ContactGroup]): Self = this.set("contactGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactGroups: Self = this.set("contactGroups", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setNextSyncToken(value: String): Self = this.set("nextSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSyncToken: Self = this.set("nextSyncToken", js.undefined)
    
    @scala.inline
    def setTotalItems(value: Double): Self = this.set("totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalItems: Self = this.set("totalItems", js.undefined)
  }
}

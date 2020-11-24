package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarListListParameters extends js.Object {
  
  var maxResults: js.UndefOr[integer] = js.native
  
  // The minimum access role for the user in the returned entries. Optional. The default is no restriction. Acceptable values are:
  var minAccessRole: js.UndefOr[AccessRoleWithoutNone] = js.native
  
  var pageToken: js.UndefOr[String] = js.native
  
  var showDeleted: js.UndefOr[Boolean] = js.native
  
  var showHidden: js.UndefOr[Boolean] = js.native
  
  var syncToken: js.UndefOr[String] = js.native
}
object CalendarListListParameters {
  
  @scala.inline
  def apply(): CalendarListListParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarListListParameters]
  }
  
  @scala.inline
  implicit class CalendarListListParametersOps[Self <: CalendarListListParameters] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setMinAccessRole(value: AccessRoleWithoutNone): Self = this.set("minAccessRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinAccessRole: Self = this.set("minAccessRole", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setShowDeleted(value: Boolean): Self = this.set("showDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDeleted: Self = this.set("showDeleted", js.undefined)
    
    @scala.inline
    def setShowHidden(value: Boolean): Self = this.set("showHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHidden: Self = this.set("showHidden", js.undefined)
    
    @scala.inline
    def setSyncToken(value: String): Self = this.set("syncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyncToken: Self = this.set("syncToken", js.undefined)
  }
}

package typings.gapiCalendar.gapi.client.calendar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarListListParameters extends StObject {
  
  var maxResults: js.UndefOr[integer] = js.undefined
  
  // The minimum access role for the user in the returned entries. Optional. The default is no restriction. Acceptable values are:
  var minAccessRole: js.UndefOr[AccessRoleWithoutNone] = js.undefined
  
  var pageToken: js.UndefOr[String] = js.undefined
  
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  
  var showHidden: js.UndefOr[Boolean] = js.undefined
  
  var syncToken: js.UndefOr[String] = js.undefined
}
object CalendarListListParameters {
  
  @scala.inline
  def apply(): CalendarListListParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarListListParameters]
  }
  
  @scala.inline
  implicit class CalendarListListParametersMutableBuilder[Self <: CalendarListListParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setMinAccessRole(value: AccessRoleWithoutNone): Self = StObject.set(x, "minAccessRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAccessRoleUndefined: Self = StObject.set(x, "minAccessRole", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setShowDeleted(value: Boolean): Self = StObject.set(x, "showDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDeletedUndefined: Self = StObject.set(x, "showDeleted", js.undefined)
    
    @scala.inline
    def setShowHidden(value: Boolean): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
    
    @scala.inline
    def setSyncToken(value: String): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncTokenUndefined: Self = StObject.set(x, "syncToken", js.undefined)
  }
}

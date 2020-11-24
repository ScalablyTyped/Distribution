package typings.gapiCalendar.gapi.client.calendar

import typings.gapiCalendar.gapiCalendarStrings.calendarNumbersigncalendarList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarList_ extends js.Object {
  
  var etag: typings.gapiCalendar.gapi.client.calendar.etag = js.native
  
  var items: js.Array[CalendarListEntry] = js.native
  
  var kind: calendarNumbersigncalendarList = js.native
  
  /**
    * Token used to access the next page of this result.
    * Omitted if no further results are available, in which case nextSyncToken is provided.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Token used at a later point in time to retrieve only the entries that have changed since this result was returned.
    * Omitted if further results are available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String] = js.native
}
object CalendarList_ {
  
  @scala.inline
  def apply(etag: etag, items: js.Array[CalendarListEntry], kind: calendarNumbersigncalendarList): CalendarList_ = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarList_]
  }
  
  @scala.inline
  implicit class CalendarList_Ops[Self <: CalendarList_] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: etag): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: CalendarListEntry*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[CalendarListEntry]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: calendarNumbersigncalendarList): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setNextSyncToken(value: String): Self = this.set("nextSyncToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSyncToken: Self = this.set("nextSyncToken", js.undefined)
  }
}

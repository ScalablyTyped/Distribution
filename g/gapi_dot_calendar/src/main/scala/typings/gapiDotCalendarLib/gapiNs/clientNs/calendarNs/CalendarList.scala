package typings
package gapiDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CalendarList extends js.Object {
  var etag: etag
  var items: js.Array[CalendarListEntry]
  var kind: gapiDotCalendarLib.gapiDotCalendarLibStrings.`calendar#calendarList`
  /**
       * Token used to access the next page of this result.
       * Omitted if no further results are available, in which case nextSyncToken is provided.
       */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Token used at a later point in time to retrieve only the entries that have changed since this result was returned.
       * Omitted if further results are available, in which case nextPageToken is provided.
       */
  var nextSyncToken: js.UndefOr[java.lang.String] = js.undefined
}

@JSGlobal("gapi.client.calendar.calendarList")
@js.native
class calendarList () extends js.Object

@JSGlobal("gapi.client.calendar.calendarList")
@js.native
object calendarList extends js.Object {
  def insert(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.CalendarListInsertParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.CalendarListEntry] = js.native
  def list(): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.CalendarList] = js.native
  def list(parameters: gapiDotCalendarLib.gapiNs.clientNs.calendarNs.CalendarListListParameters): gapiLib.gapiNs.clientNs.HttpRequest[gapiDotCalendarLib.gapiNs.clientNs.calendarNs.CalendarList] = js.native
}


package typings.gapiCalendar

import typings.gapiCalendar.gapi.client.calendar.AccessRole
import typings.gapiCalendar.gapi.client.calendar.AccessRoleWithoutNone
import typings.gapiCalendar.gapi.client.calendar.AttendeeResponseStatus
import typings.gapiCalendar.gapi.client.calendar.EventStatus
import typings.gapiCalendar.gapi.client.calendar.EventTransparency
import typings.gapiCalendar.gapi.client.calendar.EventVisibility
import typings.gapiCalendar.gapi.client.calendar.EventsOrder
import typings.gapiCalendar.gapi.client.calendar.GadgetDisplayMode
import typings.gapiCalendar.gapi.client.calendar.NotificationType
import typings.gapiCalendar.gapi.client.calendar.ReminderMethod
import typings.gapiCalendar.gapi.client.calendar.ScopeType
import typings.gapiCalendar.gapi.client.calendar.SyncToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapiCalendarStrings {
  
  @js.native
  sealed trait default
    extends EventVisibility
       with ScopeType
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait accepted extends AttendeeResponseStatus
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait agenda extends NotificationType
  @scala.inline
  def agenda: agenda = "agenda".asInstanceOf[agenda]
  
  @js.native
  sealed trait calendarNumbersignaclRule extends StObject
  @scala.inline
  def calendarNumbersignaclRule: calendarNumbersignaclRule = "calendar#aclRule".asInstanceOf[calendarNumbersignaclRule]
  
  @js.native
  sealed trait calendarNumbersigncalendar extends StObject
  @scala.inline
  def calendarNumbersigncalendar: calendarNumbersigncalendar = "calendar#calendar".asInstanceOf[calendarNumbersigncalendar]
  
  @js.native
  sealed trait calendarNumbersigncalendarList extends StObject
  @scala.inline
  def calendarNumbersigncalendarList: calendarNumbersigncalendarList = "calendar#calendarList".asInstanceOf[calendarNumbersigncalendarList]
  
  @js.native
  sealed trait calendarNumbersigncalendarListEntry extends StObject
  @scala.inline
  def calendarNumbersigncalendarListEntry: calendarNumbersigncalendarListEntry = "calendar#calendarListEntry".asInstanceOf[calendarNumbersigncalendarListEntry]
  
  @js.native
  sealed trait calendarNumbersignevent extends StObject
  @scala.inline
  def calendarNumbersignevent: calendarNumbersignevent = "calendar#event".asInstanceOf[calendarNumbersignevent]
  
  @js.native
  sealed trait calendarNumbersignevents extends StObject
  @scala.inline
  def calendarNumbersignevents: calendarNumbersignevents = "calendar#events".asInstanceOf[calendarNumbersignevents]
  
  @js.native
  sealed trait calendarNumbersignfreeBusy extends StObject
  @scala.inline
  def calendarNumbersignfreeBusy: calendarNumbersignfreeBusy = "calendar#freeBusy".asInstanceOf[calendarNumbersignfreeBusy]
  
  @js.native
  sealed trait cancelled extends EventStatus
  @scala.inline
  def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait chip extends GadgetDisplayMode
  @scala.inline
  def chip: chip = "chip".asInstanceOf[chip]
  
  @js.native
  sealed trait confidential extends EventVisibility
  @scala.inline
  def confidential: confidential = "confidential".asInstanceOf[confidential]
  
  @js.native
  sealed trait confirmed extends EventStatus
  @scala.inline
  def confirmed: confirmed = "confirmed".asInstanceOf[confirmed]
  
  @js.native
  sealed trait declined extends AttendeeResponseStatus
  @scala.inline
  def declined: declined = "declined".asInstanceOf[declined]
  
  @js.native
  sealed trait domain extends ScopeType
  @scala.inline
  def domain: domain = "domain".asInstanceOf[domain]
  
  @js.native
  sealed trait email extends ReminderMethod
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait eventCancellation extends NotificationType
  @scala.inline
  def eventCancellation: eventCancellation = "eventCancellation".asInstanceOf[eventCancellation]
  
  @js.native
  sealed trait eventChange extends NotificationType
  @scala.inline
  def eventChange: eventChange = "eventChange".asInstanceOf[eventChange]
  
  @js.native
  sealed trait eventCreation extends NotificationType
  @scala.inline
  def eventCreation: eventCreation = "eventCreation".asInstanceOf[eventCreation]
  
  @js.native
  sealed trait eventResponse extends NotificationType
  @scala.inline
  def eventResponse: eventResponse = "eventResponse".asInstanceOf[eventResponse]
  
  @js.native
  sealed trait freeBusyReader
    extends AccessRole
       with AccessRoleWithoutNone
  @scala.inline
  def freeBusyReader: freeBusyReader = "freeBusyReader".asInstanceOf[freeBusyReader]
  
  @js.native
  sealed trait group extends ScopeType
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait iCalUID extends SyncToken
  @scala.inline
  def iCalUID: iCalUID = "iCalUID".asInstanceOf[iCalUID]
  
  @js.native
  sealed trait icon extends GadgetDisplayMode
  @scala.inline
  def icon: icon = "icon".asInstanceOf[icon]
  
  @js.native
  sealed trait needsAction extends AttendeeResponseStatus
  @scala.inline
  def needsAction: needsAction = "needsAction".asInstanceOf[needsAction]
  
  @js.native
  sealed trait none extends AccessRole
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait opaque extends EventTransparency
  @scala.inline
  def opaque: opaque = "opaque".asInstanceOf[opaque]
  
  @js.native
  sealed trait orderBy extends SyncToken
  @scala.inline
  def orderBy: orderBy = "orderBy".asInstanceOf[orderBy]
  
  @js.native
  sealed trait owner
    extends AccessRole
       with AccessRoleWithoutNone
  @scala.inline
  def owner: owner = "owner".asInstanceOf[owner]
  
  @js.native
  sealed trait popup extends ReminderMethod
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait `private` extends EventVisibility
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait privateExtendedProperty extends SyncToken
  @scala.inline
  def privateExtendedProperty: privateExtendedProperty = "privateExtendedProperty".asInstanceOf[privateExtendedProperty]
  
  @js.native
  sealed trait public extends EventVisibility
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait q extends SyncToken
  @scala.inline
  def q: q = "q".asInstanceOf[q]
  
  @js.native
  sealed trait reader
    extends AccessRole
       with AccessRoleWithoutNone
  @scala.inline
  def reader: reader = "reader".asInstanceOf[reader]
  
  @js.native
  sealed trait sharedExtendedProperty extends SyncToken
  @scala.inline
  def sharedExtendedProperty: sharedExtendedProperty = "sharedExtendedProperty".asInstanceOf[sharedExtendedProperty]
  
  @js.native
  sealed trait sms extends ReminderMethod
  @scala.inline
  def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait startTime extends EventsOrder
  @scala.inline
  def startTime: startTime = "startTime".asInstanceOf[startTime]
  
  @js.native
  sealed trait tentative
    extends AttendeeResponseStatus
       with EventStatus
  @scala.inline
  def tentative: tentative = "tentative".asInstanceOf[tentative]
  
  @js.native
  sealed trait timeMax extends SyncToken
  @scala.inline
  def timeMax: timeMax = "timeMax".asInstanceOf[timeMax]
  
  @js.native
  sealed trait timeMin extends SyncToken
  @scala.inline
  def timeMin: timeMin = "timeMin".asInstanceOf[timeMin]
  
  @js.native
  sealed trait transparent extends EventTransparency
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait updated extends EventsOrder
  @scala.inline
  def updated: updated = "updated".asInstanceOf[updated]
  
  @js.native
  sealed trait updatedMin extends SyncToken
  @scala.inline
  def updatedMin: updatedMin = "updatedMin".asInstanceOf[updatedMin]
  
  @js.native
  sealed trait user extends ScopeType
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait writer
    extends AccessRole
       with AccessRoleWithoutNone
  @scala.inline
  def writer: writer = "writer".asInstanceOf[writer]
}

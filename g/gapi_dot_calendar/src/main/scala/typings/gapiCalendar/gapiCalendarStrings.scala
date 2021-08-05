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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapiCalendarStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with EventVisibility
       with ScopeType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait accepted
    extends StObject
       with AttendeeResponseStatus
  inline def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait agenda
    extends StObject
       with NotificationType
  inline def agenda: agenda = "agenda".asInstanceOf[agenda]
  
  @js.native
  sealed trait calendarNumbersignaclRule extends StObject
  inline def calendarNumbersignaclRule: calendarNumbersignaclRule = "calendar#aclRule".asInstanceOf[calendarNumbersignaclRule]
  
  @js.native
  sealed trait calendarNumbersigncalendar extends StObject
  inline def calendarNumbersigncalendar: calendarNumbersigncalendar = "calendar#calendar".asInstanceOf[calendarNumbersigncalendar]
  
  @js.native
  sealed trait calendarNumbersigncalendarList extends StObject
  inline def calendarNumbersigncalendarList: calendarNumbersigncalendarList = "calendar#calendarList".asInstanceOf[calendarNumbersigncalendarList]
  
  @js.native
  sealed trait calendarNumbersigncalendarListEntry extends StObject
  inline def calendarNumbersigncalendarListEntry: calendarNumbersigncalendarListEntry = "calendar#calendarListEntry".asInstanceOf[calendarNumbersigncalendarListEntry]
  
  @js.native
  sealed trait calendarNumbersignevent extends StObject
  inline def calendarNumbersignevent: calendarNumbersignevent = "calendar#event".asInstanceOf[calendarNumbersignevent]
  
  @js.native
  sealed trait calendarNumbersignevents extends StObject
  inline def calendarNumbersignevents: calendarNumbersignevents = "calendar#events".asInstanceOf[calendarNumbersignevents]
  
  @js.native
  sealed trait calendarNumbersignfreeBusy extends StObject
  inline def calendarNumbersignfreeBusy: calendarNumbersignfreeBusy = "calendar#freeBusy".asInstanceOf[calendarNumbersignfreeBusy]
  
  @js.native
  sealed trait cancelled
    extends StObject
       with EventStatus
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait chip
    extends StObject
       with GadgetDisplayMode
  inline def chip: chip = "chip".asInstanceOf[chip]
  
  @js.native
  sealed trait confidential
    extends StObject
       with EventVisibility
  inline def confidential: confidential = "confidential".asInstanceOf[confidential]
  
  @js.native
  sealed trait confirmed
    extends StObject
       with EventStatus
  inline def confirmed: confirmed = "confirmed".asInstanceOf[confirmed]
  
  @js.native
  sealed trait declined
    extends StObject
       with AttendeeResponseStatus
  inline def declined: declined = "declined".asInstanceOf[declined]
  
  @js.native
  sealed trait domain
    extends StObject
       with ScopeType
  inline def domain: domain = "domain".asInstanceOf[domain]
  
  @js.native
  sealed trait email
    extends StObject
       with ReminderMethod
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait eventCancellation
    extends StObject
       with NotificationType
  inline def eventCancellation: eventCancellation = "eventCancellation".asInstanceOf[eventCancellation]
  
  @js.native
  sealed trait eventChange
    extends StObject
       with NotificationType
  inline def eventChange: eventChange = "eventChange".asInstanceOf[eventChange]
  
  @js.native
  sealed trait eventCreation
    extends StObject
       with NotificationType
  inline def eventCreation: eventCreation = "eventCreation".asInstanceOf[eventCreation]
  
  @js.native
  sealed trait eventResponse
    extends StObject
       with NotificationType
  inline def eventResponse: eventResponse = "eventResponse".asInstanceOf[eventResponse]
  
  @js.native
  sealed trait freeBusyReader
    extends StObject
       with AccessRole
       with AccessRoleWithoutNone
  inline def freeBusyReader: freeBusyReader = "freeBusyReader".asInstanceOf[freeBusyReader]
  
  @js.native
  sealed trait group
    extends StObject
       with ScopeType
  inline def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait iCalUID
    extends StObject
       with SyncToken
  inline def iCalUID: iCalUID = "iCalUID".asInstanceOf[iCalUID]
  
  @js.native
  sealed trait icon
    extends StObject
       with GadgetDisplayMode
  inline def icon: icon = "icon".asInstanceOf[icon]
  
  @js.native
  sealed trait needsAction
    extends StObject
       with AttendeeResponseStatus
  inline def needsAction: needsAction = "needsAction".asInstanceOf[needsAction]
  
  @js.native
  sealed trait none
    extends StObject
       with AccessRole
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait opaque
    extends StObject
       with EventTransparency
  inline def opaque: opaque = "opaque".asInstanceOf[opaque]
  
  @js.native
  sealed trait orderBy
    extends StObject
       with SyncToken
  inline def orderBy: orderBy = "orderBy".asInstanceOf[orderBy]
  
  @js.native
  sealed trait owner
    extends StObject
       with AccessRole
       with AccessRoleWithoutNone
  inline def owner: owner = "owner".asInstanceOf[owner]
  
  @js.native
  sealed trait popup
    extends StObject
       with ReminderMethod
  inline def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait `private`
    extends StObject
       with EventVisibility
  inline def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait privateExtendedProperty
    extends StObject
       with SyncToken
  inline def privateExtendedProperty: privateExtendedProperty = "privateExtendedProperty".asInstanceOf[privateExtendedProperty]
  
  @js.native
  sealed trait public
    extends StObject
       with EventVisibility
  inline def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait q
    extends StObject
       with SyncToken
  inline def q: q = "q".asInstanceOf[q]
  
  @js.native
  sealed trait reader
    extends StObject
       with AccessRole
       with AccessRoleWithoutNone
  inline def reader: reader = "reader".asInstanceOf[reader]
  
  @js.native
  sealed trait sharedExtendedProperty
    extends StObject
       with SyncToken
  inline def sharedExtendedProperty: sharedExtendedProperty = "sharedExtendedProperty".asInstanceOf[sharedExtendedProperty]
  
  @js.native
  sealed trait sms
    extends StObject
       with ReminderMethod
  inline def sms: sms = "sms".asInstanceOf[sms]
  
  @js.native
  sealed trait startTime
    extends StObject
       with EventsOrder
  inline def startTime: startTime = "startTime".asInstanceOf[startTime]
  
  @js.native
  sealed trait tentative
    extends StObject
       with AttendeeResponseStatus
       with EventStatus
  inline def tentative: tentative = "tentative".asInstanceOf[tentative]
  
  @js.native
  sealed trait timeMax
    extends StObject
       with SyncToken
  inline def timeMax: timeMax = "timeMax".asInstanceOf[timeMax]
  
  @js.native
  sealed trait timeMin
    extends StObject
       with SyncToken
  inline def timeMin: timeMin = "timeMin".asInstanceOf[timeMin]
  
  @js.native
  sealed trait transparent
    extends StObject
       with EventTransparency
  inline def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait updated
    extends StObject
       with EventsOrder
  inline def updated: updated = "updated".asInstanceOf[updated]
  
  @js.native
  sealed trait updatedMin
    extends StObject
       with SyncToken
  inline def updatedMin: updatedMin = "updatedMin".asInstanceOf[updatedMin]
  
  @js.native
  sealed trait user
    extends StObject
       with ScopeType
  inline def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait writer
    extends StObject
       with AccessRole
       with AccessRoleWithoutNone
  inline def writer: writer = "writer".asInstanceOf[writer]
}

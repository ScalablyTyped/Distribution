package typings.gapiDotCalendar

import typings.gapiDotCalendar.gapi.client.calendar.AccessRole
import typings.gapiDotCalendar.gapi.client.calendar.AccessRoleWithoutNone
import typings.gapiDotCalendar.gapi.client.calendar.AttendeeResponseStatus
import typings.gapiDotCalendar.gapi.client.calendar.EventStatus
import typings.gapiDotCalendar.gapi.client.calendar.EventTransparency
import typings.gapiDotCalendar.gapi.client.calendar.EventVisibility
import typings.gapiDotCalendar.gapi.client.calendar.EventsOrder
import typings.gapiDotCalendar.gapi.client.calendar.GadgetDisplayMode
import typings.gapiDotCalendar.gapi.client.calendar.NotificationType
import typings.gapiDotCalendar.gapi.client.calendar.ReminderMethod
import typings.gapiDotCalendar.gapi.client.calendar.ScopeType
import typings.gapiDotCalendar.gapi.client.calendar.SyncToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object gapiDotCalendarStrings {
  @js.native
  sealed trait accepted extends AttendeeResponseStatus
  
  @js.native
  sealed trait agenda extends NotificationType
  
  @js.native
  sealed trait `calendar#aclRule` extends js.Object
  
  @js.native
  sealed trait `calendar#calendar` extends js.Object
  
  @js.native
  sealed trait `calendar#calendarList` extends js.Object
  
  @js.native
  sealed trait `calendar#calendarListEntry` extends js.Object
  
  @js.native
  sealed trait `calendar#event` extends js.Object
  
  @js.native
  sealed trait `calendar#events` extends js.Object
  
  @js.native
  sealed trait `calendar#freeBusy` extends js.Object
  
  @js.native
  sealed trait cancelled extends EventStatus
  
  @js.native
  sealed trait chip extends GadgetDisplayMode
  
  @js.native
  sealed trait confidential extends EventVisibility
  
  @js.native
  sealed trait confirmed extends EventStatus
  
  @js.native
  sealed trait declined extends AttendeeResponseStatus
  
  @js.native
  sealed trait default
    extends EventVisibility
       with ScopeType
  
  @js.native
  sealed trait domain extends ScopeType
  
  @js.native
  sealed trait email extends ReminderMethod
  
  @js.native
  sealed trait eventCancellation extends NotificationType
  
  @js.native
  sealed trait eventChange extends NotificationType
  
  @js.native
  sealed trait eventCreation extends NotificationType
  
  @js.native
  sealed trait eventResponse extends NotificationType
  
  @js.native
  sealed trait freeBusyReader extends AccessRoleWithoutNone
  
  @js.native
  sealed trait group extends ScopeType
  
  @js.native
  sealed trait iCalUID extends SyncToken
  
  @js.native
  sealed trait icon extends GadgetDisplayMode
  
  @js.native
  sealed trait needsAction extends AttendeeResponseStatus
  
  @js.native
  sealed trait none extends AccessRole
  
  @js.native
  sealed trait opaque extends EventTransparency
  
  @js.native
  sealed trait orderBy extends SyncToken
  
  @js.native
  sealed trait owner extends AccessRoleWithoutNone
  
  @js.native
  sealed trait popup extends ReminderMethod
  
  @js.native
  sealed trait `private` extends EventVisibility
  
  @js.native
  sealed trait privateExtendedProperty extends SyncToken
  
  @js.native
  sealed trait public extends EventVisibility
  
  @js.native
  sealed trait q extends SyncToken
  
  @js.native
  sealed trait reader extends AccessRoleWithoutNone
  
  @js.native
  sealed trait sharedExtendedProperty extends SyncToken
  
  @js.native
  sealed trait sms extends ReminderMethod
  
  @js.native
  sealed trait startTime extends EventsOrder
  
  @js.native
  sealed trait tentative
    extends AttendeeResponseStatus
       with EventStatus
  
  @js.native
  sealed trait timeMax extends SyncToken
  
  @js.native
  sealed trait timeMin extends SyncToken
  
  @js.native
  sealed trait transparent extends EventTransparency
  
  @js.native
  sealed trait updated extends EventsOrder
  
  @js.native
  sealed trait updatedMin extends SyncToken
  
  @js.native
  sealed trait user extends ScopeType
  
  @js.native
  sealed trait writer extends AccessRoleWithoutNone
  
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  @scala.inline
  def agenda: agenda = "agenda".asInstanceOf[agenda]
  @scala.inline
  def `calendar#aclRule`: `calendar#aclRule` = "calendar#aclRule".asInstanceOf[`calendar#aclRule`]
  @scala.inline
  def `calendar#calendar`: `calendar#calendar` = "calendar#calendar".asInstanceOf[`calendar#calendar`]
  @scala.inline
  def `calendar#calendarList`: `calendar#calendarList` = "calendar#calendarList".asInstanceOf[`calendar#calendarList`]
  @scala.inline
  def `calendar#calendarListEntry`: `calendar#calendarListEntry` = "calendar#calendarListEntry".asInstanceOf[`calendar#calendarListEntry`]
  @scala.inline
  def `calendar#event`: `calendar#event` = "calendar#event".asInstanceOf[`calendar#event`]
  @scala.inline
  def `calendar#events`: `calendar#events` = "calendar#events".asInstanceOf[`calendar#events`]
  @scala.inline
  def `calendar#freeBusy`: `calendar#freeBusy` = "calendar#freeBusy".asInstanceOf[`calendar#freeBusy`]
  @scala.inline
  def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  @scala.inline
  def chip: chip = "chip".asInstanceOf[chip]
  @scala.inline
  def confidential: confidential = "confidential".asInstanceOf[confidential]
  @scala.inline
  def confirmed: confirmed = "confirmed".asInstanceOf[confirmed]
  @scala.inline
  def declined: declined = "declined".asInstanceOf[declined]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def domain: domain = "domain".asInstanceOf[domain]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def eventCancellation: eventCancellation = "eventCancellation".asInstanceOf[eventCancellation]
  @scala.inline
  def eventChange: eventChange = "eventChange".asInstanceOf[eventChange]
  @scala.inline
  def eventCreation: eventCreation = "eventCreation".asInstanceOf[eventCreation]
  @scala.inline
  def eventResponse: eventResponse = "eventResponse".asInstanceOf[eventResponse]
  @scala.inline
  def freeBusyReader: freeBusyReader = "freeBusyReader".asInstanceOf[freeBusyReader]
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  @scala.inline
  def iCalUID: iCalUID = "iCalUID".asInstanceOf[iCalUID]
  @scala.inline
  def icon: icon = "icon".asInstanceOf[icon]
  @scala.inline
  def needsAction: needsAction = "needsAction".asInstanceOf[needsAction]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def opaque: opaque = "opaque".asInstanceOf[opaque]
  @scala.inline
  def orderBy: orderBy = "orderBy".asInstanceOf[orderBy]
  @scala.inline
  def owner: owner = "owner".asInstanceOf[owner]
  @scala.inline
  def popup: popup = "popup".asInstanceOf[popup]
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  @scala.inline
  def privateExtendedProperty: privateExtendedProperty = "privateExtendedProperty".asInstanceOf[privateExtendedProperty]
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  @scala.inline
  def q: q = "q".asInstanceOf[q]
  @scala.inline
  def reader: reader = "reader".asInstanceOf[reader]
  @scala.inline
  def sharedExtendedProperty: sharedExtendedProperty = "sharedExtendedProperty".asInstanceOf[sharedExtendedProperty]
  @scala.inline
  def sms: sms = "sms".asInstanceOf[sms]
  @scala.inline
  def startTime: startTime = "startTime".asInstanceOf[startTime]
  @scala.inline
  def tentative: tentative = "tentative".asInstanceOf[tentative]
  @scala.inline
  def timeMax: timeMax = "timeMax".asInstanceOf[timeMax]
  @scala.inline
  def timeMin: timeMin = "timeMin".asInstanceOf[timeMin]
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
  @scala.inline
  def updated: updated = "updated".asInstanceOf[updated]
  @scala.inline
  def updatedMin: updatedMin = "updatedMin".asInstanceOf[updatedMin]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  @scala.inline
  def writer: writer = "writer".asInstanceOf[writer]
}


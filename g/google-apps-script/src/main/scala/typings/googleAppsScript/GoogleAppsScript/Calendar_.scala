package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.AclCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.CalendarListCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.CalendarsCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.ChannelsCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.ColorsCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.EventsCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.FreebusyCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.SettingsCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.AclRule
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.AclRuleScope
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarListEntry
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarListEntryNotificationSettings
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarNotification
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Channel
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceParameters
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceParametersAddOnParameters
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceProperties
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceRequestStatus
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceSolution
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceSolutionKey
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.CreateConferenceRequest
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EntryPoint
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Event
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventAttachment
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventAttendee
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventCreator
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventDateTime
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventExtendedProperties
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventGadget
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventOrganizer
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventReminder
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventReminders
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.EventSource
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.FreeBusyRequest
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.FreeBusyRequestItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calendar_ extends js.Object {
  
  var Acl: js.UndefOr[AclCollection] = js.native
  
  var CalendarList: js.UndefOr[CalendarListCollection] = js.native
  
  var Calendars: js.UndefOr[CalendarsCollection] = js.native
  
  var Channels: js.UndefOr[ChannelsCollection] = js.native
  
  var Colors: js.UndefOr[ColorsCollection] = js.native
  
  var Events: js.UndefOr[EventsCollection] = js.native
  
  var Freebusy: js.UndefOr[FreebusyCollection] = js.native
  
  var Settings: js.UndefOr[SettingsCollection] = js.native
  
  // Create a new instance of AclRule
  def newAclRule(): AclRule = js.native
  
  // Create a new instance of AclRuleScope
  def newAclRuleScope(): AclRuleScope = js.native
  
  // Create a new instance of Calendar
  def newCalendar(): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
  
  // Create a new instance of CalendarListEntry
  def newCalendarListEntry(): CalendarListEntry = js.native
  
  // Create a new instance of CalendarListEntryNotificationSettings
  def newCalendarListEntryNotificationSettings(): CalendarListEntryNotificationSettings = js.native
  
  // Create a new instance of CalendarNotification
  def newCalendarNotification(): CalendarNotification = js.native
  
  // Create a new instance of Channel
  def newChannel(): Channel = js.native
  
  // Create a new instance of ConferenceData
  def newConferenceData(): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData = js.native
  
  // Create a new instance of ConferenceParameters
  def newConferenceParameters(): ConferenceParameters = js.native
  
  // Create a new instance of ConferenceParametersAddOnParameters
  def newConferenceParametersAddOnParameters(): ConferenceParametersAddOnParameters = js.native
  
  // Create a new instance of ConferenceProperties
  def newConferenceProperties(): ConferenceProperties = js.native
  
  // Create a new instance of ConferenceRequestStatus
  def newConferenceRequestStatus(): ConferenceRequestStatus = js.native
  
  // Create a new instance of ConferenceSolution
  def newConferenceSolution(): ConferenceSolution = js.native
  
  // Create a new instance of ConferenceSolutionKey
  def newConferenceSolutionKey(): ConferenceSolutionKey = js.native
  
  // Create a new instance of CreateConferenceRequest
  def newCreateConferenceRequest(): CreateConferenceRequest = js.native
  
  // Create a new instance of EntryPoint
  def newEntryPoint(): EntryPoint = js.native
  
  // Create a new instance of Event
  def newEvent(): Event = js.native
  
  // Create a new instance of EventAttachment
  def newEventAttachment(): EventAttachment = js.native
  
  // Create a new instance of EventAttendee
  def newEventAttendee(): EventAttendee = js.native
  
  // Create a new instance of EventCreator
  def newEventCreator(): EventCreator = js.native
  
  // Create a new instance of EventDateTime
  def newEventDateTime(): EventDateTime = js.native
  
  // Create a new instance of EventExtendedProperties
  def newEventExtendedProperties(): EventExtendedProperties = js.native
  
  // Create a new instance of EventGadget
  def newEventGadget(): EventGadget = js.native
  
  // Create a new instance of EventOrganizer
  def newEventOrganizer(): EventOrganizer = js.native
  
  // Create a new instance of EventReminder
  def newEventReminder(): EventReminder = js.native
  
  // Create a new instance of EventReminders
  def newEventReminders(): EventReminders = js.native
  
  // Create a new instance of EventSource
  def newEventSource(): EventSource = js.native
  
  // Create a new instance of FreeBusyRequest
  def newFreeBusyRequest(): FreeBusyRequest = js.native
  
  // Create a new instance of FreeBusyRequestItem
  def newFreeBusyRequestItem(): FreeBusyRequestItem = js.native
}
object Calendar_ {
  
  @scala.inline
  def apply(
    newAclRule: () => AclRule,
    newAclRuleScope: () => AclRuleScope,
    newCalendar: () => typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar,
    newCalendarListEntry: () => CalendarListEntry,
    newCalendarListEntryNotificationSettings: () => CalendarListEntryNotificationSettings,
    newCalendarNotification: () => CalendarNotification,
    newChannel: () => Channel,
    newConferenceData: () => typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData,
    newConferenceParameters: () => ConferenceParameters,
    newConferenceParametersAddOnParameters: () => ConferenceParametersAddOnParameters,
    newConferenceProperties: () => ConferenceProperties,
    newConferenceRequestStatus: () => ConferenceRequestStatus,
    newConferenceSolution: () => ConferenceSolution,
    newConferenceSolutionKey: () => ConferenceSolutionKey,
    newCreateConferenceRequest: () => CreateConferenceRequest,
    newEntryPoint: () => EntryPoint,
    newEvent: () => Event,
    newEventAttachment: () => EventAttachment,
    newEventAttendee: () => EventAttendee,
    newEventCreator: () => EventCreator,
    newEventDateTime: () => EventDateTime,
    newEventExtendedProperties: () => EventExtendedProperties,
    newEventGadget: () => EventGadget,
    newEventOrganizer: () => EventOrganizer,
    newEventReminder: () => EventReminder,
    newEventReminders: () => EventReminders,
    newEventSource: () => EventSource,
    newFreeBusyRequest: () => FreeBusyRequest,
    newFreeBusyRequestItem: () => FreeBusyRequestItem
  ): Calendar_ = {
    val __obj = js.Dynamic.literal(newAclRule = js.Any.fromFunction0(newAclRule), newAclRuleScope = js.Any.fromFunction0(newAclRuleScope), newCalendar = js.Any.fromFunction0(newCalendar), newCalendarListEntry = js.Any.fromFunction0(newCalendarListEntry), newCalendarListEntryNotificationSettings = js.Any.fromFunction0(newCalendarListEntryNotificationSettings), newCalendarNotification = js.Any.fromFunction0(newCalendarNotification), newChannel = js.Any.fromFunction0(newChannel), newConferenceData = js.Any.fromFunction0(newConferenceData), newConferenceParameters = js.Any.fromFunction0(newConferenceParameters), newConferenceParametersAddOnParameters = js.Any.fromFunction0(newConferenceParametersAddOnParameters), newConferenceProperties = js.Any.fromFunction0(newConferenceProperties), newConferenceRequestStatus = js.Any.fromFunction0(newConferenceRequestStatus), newConferenceSolution = js.Any.fromFunction0(newConferenceSolution), newConferenceSolutionKey = js.Any.fromFunction0(newConferenceSolutionKey), newCreateConferenceRequest = js.Any.fromFunction0(newCreateConferenceRequest), newEntryPoint = js.Any.fromFunction0(newEntryPoint), newEvent = js.Any.fromFunction0(newEvent), newEventAttachment = js.Any.fromFunction0(newEventAttachment), newEventAttendee = js.Any.fromFunction0(newEventAttendee), newEventCreator = js.Any.fromFunction0(newEventCreator), newEventDateTime = js.Any.fromFunction0(newEventDateTime), newEventExtendedProperties = js.Any.fromFunction0(newEventExtendedProperties), newEventGadget = js.Any.fromFunction0(newEventGadget), newEventOrganizer = js.Any.fromFunction0(newEventOrganizer), newEventReminder = js.Any.fromFunction0(newEventReminder), newEventReminders = js.Any.fromFunction0(newEventReminders), newEventSource = js.Any.fromFunction0(newEventSource), newFreeBusyRequest = js.Any.fromFunction0(newFreeBusyRequest), newFreeBusyRequestItem = js.Any.fromFunction0(newFreeBusyRequestItem))
    __obj.asInstanceOf[Calendar_]
  }
  
  @scala.inline
  implicit class Calendar_Ops[Self <: Calendar_] (val x: Self) extends AnyVal {
    
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
    def setNewAclRule(value: () => AclRule): Self = this.set("newAclRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAclRuleScope(value: () => AclRuleScope): Self = this.set("newAclRuleScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCalendar(value: () => typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar): Self = this.set("newCalendar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCalendarListEntry(value: () => CalendarListEntry): Self = this.set("newCalendarListEntry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCalendarListEntryNotificationSettings(value: () => CalendarListEntryNotificationSettings): Self = this.set("newCalendarListEntryNotificationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCalendarNotification(value: () => CalendarNotification): Self = this.set("newCalendarNotification", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewChannel(value: () => Channel): Self = this.set("newChannel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceData(value: () => typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData): Self = this.set("newConferenceData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceParameters(value: () => ConferenceParameters): Self = this.set("newConferenceParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceParametersAddOnParameters(value: () => ConferenceParametersAddOnParameters): Self = this.set("newConferenceParametersAddOnParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceProperties(value: () => ConferenceProperties): Self = this.set("newConferenceProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceRequestStatus(value: () => ConferenceRequestStatus): Self = this.set("newConferenceRequestStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceSolution(value: () => ConferenceSolution): Self = this.set("newConferenceSolution", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceSolutionKey(value: () => ConferenceSolutionKey): Self = this.set("newConferenceSolutionKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateConferenceRequest(value: () => CreateConferenceRequest): Self = this.set("newCreateConferenceRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEntryPoint(value: () => EntryPoint): Self = this.set("newEntryPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEvent(value: () => Event): Self = this.set("newEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventAttachment(value: () => EventAttachment): Self = this.set("newEventAttachment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventAttendee(value: () => EventAttendee): Self = this.set("newEventAttendee", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventCreator(value: () => EventCreator): Self = this.set("newEventCreator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventDateTime(value: () => EventDateTime): Self = this.set("newEventDateTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventExtendedProperties(value: () => EventExtendedProperties): Self = this.set("newEventExtendedProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventGadget(value: () => EventGadget): Self = this.set("newEventGadget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventOrganizer(value: () => EventOrganizer): Self = this.set("newEventOrganizer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventReminder(value: () => EventReminder): Self = this.set("newEventReminder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventReminders(value: () => EventReminders): Self = this.set("newEventReminders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventSource(value: () => EventSource): Self = this.set("newEventSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFreeBusyRequest(value: () => FreeBusyRequest): Self = this.set("newFreeBusyRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFreeBusyRequestItem(value: () => FreeBusyRequestItem): Self = this.set("newFreeBusyRequestItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAcl(value: AclCollection): Self = this.set("Acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("Acl", js.undefined)
    
    @scala.inline
    def setCalendarList(value: CalendarListCollection): Self = this.set("CalendarList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarList: Self = this.set("CalendarList", js.undefined)
    
    @scala.inline
    def setCalendars(value: CalendarsCollection): Self = this.set("Calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendars: Self = this.set("Calendars", js.undefined)
    
    @scala.inline
    def setChannels(value: ChannelsCollection): Self = this.set("Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
    
    @scala.inline
    def setColors(value: ColorsCollection): Self = this.set("Colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("Colors", js.undefined)
    
    @scala.inline
    def setEvents(value: EventsCollection): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    
    @scala.inline
    def setFreebusy(value: FreebusyCollection): Self = this.set("Freebusy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreebusy: Self = this.set("Freebusy", js.undefined)
    
    @scala.inline
    def setSettings(value: SettingsCollection): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
  }
}

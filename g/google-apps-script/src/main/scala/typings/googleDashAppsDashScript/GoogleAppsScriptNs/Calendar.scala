package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs.AclCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs.CalendarListCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs.CalendarsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs.ChannelsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs.ColorsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs.EventsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs.FreebusyCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.CollectionNs.SettingsCollection
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRule
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.AclRuleScope
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntry
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarListEntryNotificationSettings
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.CalendarNotification
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Channel
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.ConferenceData
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.ConferenceParameters
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.ConferenceParametersAddOnParameters
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.ConferenceProperties
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.ConferenceRequestStatus
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.ConferenceSolution
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.ConferenceSolutionKey
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.CreateConferenceRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EntryPoint
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Event
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EventAttachment
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EventAttendee
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EventCreator
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EventDateTime
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EventExtendedProperties
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EventGadget
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EventOrganizer
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EventReminder
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EventReminders
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.EventSource
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.FreeBusyRequest
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.FreeBusyRequestItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Calendar extends js.Object {
  var Acl: js.UndefOr[AclCollection] = js.undefined
  var CalendarList: js.UndefOr[CalendarListCollection] = js.undefined
  var Calendars: js.UndefOr[CalendarsCollection] = js.undefined
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  var Colors: js.UndefOr[ColorsCollection] = js.undefined
  var Events: js.UndefOr[EventsCollection] = js.undefined
  var Freebusy: js.UndefOr[FreebusyCollection] = js.undefined
  var Settings: js.UndefOr[SettingsCollection] = js.undefined
  // Create a new instance of AclRule
  def newAclRule(): AclRule
  // Create a new instance of AclRuleScope
  def newAclRuleScope(): AclRuleScope
  // Create a new instance of Calendar
  def newCalendar(): typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar
  // Create a new instance of CalendarListEntry
  def newCalendarListEntry(): CalendarListEntry
  // Create a new instance of CalendarListEntryNotificationSettings
  def newCalendarListEntryNotificationSettings(): CalendarListEntryNotificationSettings
  // Create a new instance of CalendarNotification
  def newCalendarNotification(): CalendarNotification
  // Create a new instance of Channel
  def newChannel(): Channel
  // Create a new instance of ConferenceData
  def newConferenceData(): ConferenceData
  // Create a new instance of ConferenceParameters
  def newConferenceParameters(): ConferenceParameters
  // Create a new instance of ConferenceParametersAddOnParameters
  def newConferenceParametersAddOnParameters(): ConferenceParametersAddOnParameters
  // Create a new instance of ConferenceProperties
  def newConferenceProperties(): ConferenceProperties
  // Create a new instance of ConferenceRequestStatus
  def newConferenceRequestStatus(): ConferenceRequestStatus
  // Create a new instance of ConferenceSolution
  def newConferenceSolution(): ConferenceSolution
  // Create a new instance of ConferenceSolutionKey
  def newConferenceSolutionKey(): ConferenceSolutionKey
  // Create a new instance of CreateConferenceRequest
  def newCreateConferenceRequest(): CreateConferenceRequest
  // Create a new instance of EntryPoint
  def newEntryPoint(): EntryPoint
  // Create a new instance of Event
  def newEvent(): Event
  // Create a new instance of EventAttachment
  def newEventAttachment(): EventAttachment
  // Create a new instance of EventAttendee
  def newEventAttendee(): EventAttendee
  // Create a new instance of EventCreator
  def newEventCreator(): EventCreator
  // Create a new instance of EventDateTime
  def newEventDateTime(): EventDateTime
  // Create a new instance of EventExtendedProperties
  def newEventExtendedProperties(): EventExtendedProperties
  // Create a new instance of EventGadget
  def newEventGadget(): EventGadget
  // Create a new instance of EventOrganizer
  def newEventOrganizer(): EventOrganizer
  // Create a new instance of EventReminder
  def newEventReminder(): EventReminder
  // Create a new instance of EventReminders
  def newEventReminders(): EventReminders
  // Create a new instance of EventSource
  def newEventSource(): EventSource
  // Create a new instance of FreeBusyRequest
  def newFreeBusyRequest(): FreeBusyRequest
  // Create a new instance of FreeBusyRequestItem
  def newFreeBusyRequestItem(): FreeBusyRequestItem
}

object Calendar {
  @scala.inline
  def apply(
    newAclRule: () => AclRule,
    newAclRuleScope: () => AclRuleScope,
    newCalendar: () => typings.googleDashAppsDashScript.GoogleAppsScriptNs.CalendarNs.SchemaNs.Calendar,
    newCalendarListEntry: () => CalendarListEntry,
    newCalendarListEntryNotificationSettings: () => CalendarListEntryNotificationSettings,
    newCalendarNotification: () => CalendarNotification,
    newChannel: () => Channel,
    newConferenceData: () => ConferenceData,
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
    newFreeBusyRequestItem: () => FreeBusyRequestItem,
    Acl: AclCollection = null,
    CalendarList: CalendarListCollection = null,
    Calendars: CalendarsCollection = null,
    Channels: ChannelsCollection = null,
    Colors: ColorsCollection = null,
    Events: EventsCollection = null,
    Freebusy: FreebusyCollection = null,
    Settings: SettingsCollection = null
  ): Calendar = {
    val __obj = js.Dynamic.literal(newAclRule = js.Any.fromFunction0(newAclRule), newAclRuleScope = js.Any.fromFunction0(newAclRuleScope), newCalendar = js.Any.fromFunction0(newCalendar), newCalendarListEntry = js.Any.fromFunction0(newCalendarListEntry), newCalendarListEntryNotificationSettings = js.Any.fromFunction0(newCalendarListEntryNotificationSettings), newCalendarNotification = js.Any.fromFunction0(newCalendarNotification), newChannel = js.Any.fromFunction0(newChannel), newConferenceData = js.Any.fromFunction0(newConferenceData), newConferenceParameters = js.Any.fromFunction0(newConferenceParameters), newConferenceParametersAddOnParameters = js.Any.fromFunction0(newConferenceParametersAddOnParameters), newConferenceProperties = js.Any.fromFunction0(newConferenceProperties), newConferenceRequestStatus = js.Any.fromFunction0(newConferenceRequestStatus), newConferenceSolution = js.Any.fromFunction0(newConferenceSolution), newConferenceSolutionKey = js.Any.fromFunction0(newConferenceSolutionKey), newCreateConferenceRequest = js.Any.fromFunction0(newCreateConferenceRequest), newEntryPoint = js.Any.fromFunction0(newEntryPoint), newEvent = js.Any.fromFunction0(newEvent), newEventAttachment = js.Any.fromFunction0(newEventAttachment), newEventAttendee = js.Any.fromFunction0(newEventAttendee), newEventCreator = js.Any.fromFunction0(newEventCreator), newEventDateTime = js.Any.fromFunction0(newEventDateTime), newEventExtendedProperties = js.Any.fromFunction0(newEventExtendedProperties), newEventGadget = js.Any.fromFunction0(newEventGadget), newEventOrganizer = js.Any.fromFunction0(newEventOrganizer), newEventReminder = js.Any.fromFunction0(newEventReminder), newEventReminders = js.Any.fromFunction0(newEventReminders), newEventSource = js.Any.fromFunction0(newEventSource), newFreeBusyRequest = js.Any.fromFunction0(newFreeBusyRequest), newFreeBusyRequestItem = js.Any.fromFunction0(newFreeBusyRequestItem))
    if (Acl != null) __obj.updateDynamic("Acl")(Acl)
    if (CalendarList != null) __obj.updateDynamic("CalendarList")(CalendarList)
    if (Calendars != null) __obj.updateDynamic("Calendars")(Calendars)
    if (Channels != null) __obj.updateDynamic("Channels")(Channels)
    if (Colors != null) __obj.updateDynamic("Colors")(Colors)
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (Freebusy != null) __obj.updateDynamic("Freebusy")(Freebusy)
    if (Settings != null) __obj.updateDynamic("Settings")(Settings)
    __obj.asInstanceOf[Calendar]
  }
}


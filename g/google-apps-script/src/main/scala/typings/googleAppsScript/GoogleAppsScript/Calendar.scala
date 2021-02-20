package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Base.Date
import typings.googleAppsScript.GoogleAppsScript.Base.Month
import typings.googleAppsScript.GoogleAppsScript.Base.Weekday
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.AclCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.CalendarListCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.CalendarsCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.ChannelsCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.ColorsCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.EventsCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.FreebusyCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Collection.SettingsCollection
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Acl
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.AclRule
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.AclRuleScope
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarList
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarListEntry
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarListEntryNotificationSettings
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.CalendarNotification
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Channel
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Colors
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
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.FreeBusyResponse
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Setting
import typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Settings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Calendar extends StObject {
  
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
object Calendar {
  
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
  ): typings.googleAppsScript.GoogleAppsScript.Calendar = {
    val __obj = js.Dynamic.literal(newAclRule = js.Any.fromFunction0(newAclRule), newAclRuleScope = js.Any.fromFunction0(newAclRuleScope), newCalendar = js.Any.fromFunction0(newCalendar), newCalendarListEntry = js.Any.fromFunction0(newCalendarListEntry), newCalendarListEntryNotificationSettings = js.Any.fromFunction0(newCalendarListEntryNotificationSettings), newCalendarNotification = js.Any.fromFunction0(newCalendarNotification), newChannel = js.Any.fromFunction0(newChannel), newConferenceData = js.Any.fromFunction0(newConferenceData), newConferenceParameters = js.Any.fromFunction0(newConferenceParameters), newConferenceParametersAddOnParameters = js.Any.fromFunction0(newConferenceParametersAddOnParameters), newConferenceProperties = js.Any.fromFunction0(newConferenceProperties), newConferenceRequestStatus = js.Any.fromFunction0(newConferenceRequestStatus), newConferenceSolution = js.Any.fromFunction0(newConferenceSolution), newConferenceSolutionKey = js.Any.fromFunction0(newConferenceSolutionKey), newCreateConferenceRequest = js.Any.fromFunction0(newCreateConferenceRequest), newEntryPoint = js.Any.fromFunction0(newEntryPoint), newEvent = js.Any.fromFunction0(newEvent), newEventAttachment = js.Any.fromFunction0(newEventAttachment), newEventAttendee = js.Any.fromFunction0(newEventAttendee), newEventCreator = js.Any.fromFunction0(newEventCreator), newEventDateTime = js.Any.fromFunction0(newEventDateTime), newEventExtendedProperties = js.Any.fromFunction0(newEventExtendedProperties), newEventGadget = js.Any.fromFunction0(newEventGadget), newEventOrganizer = js.Any.fromFunction0(newEventOrganizer), newEventReminder = js.Any.fromFunction0(newEventReminder), newEventReminders = js.Any.fromFunction0(newEventReminders), newEventSource = js.Any.fromFunction0(newEventSource), newFreeBusyRequest = js.Any.fromFunction0(newFreeBusyRequest), newFreeBusyRequestItem = js.Any.fromFunction0(newFreeBusyRequestItem))
    __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Calendar]
  }
  
  @js.native
  sealed trait Color extends StObject
  /**
    * An enum representing the named colors available in the Calendar service.
    */
  @JSGlobal("GoogleAppsScript.Calendar.Color")
  @js.native
  object Color extends StObject {
    
    @js.native
    sealed trait BLUE extends Color
    
    @js.native
    sealed trait BROWN extends Color
    
    @js.native
    sealed trait CHARCOAL extends Color
    
    @js.native
    sealed trait CHESTNUT extends Color
    
    @js.native
    sealed trait GRAY extends Color
    
    @js.native
    sealed trait GREEN extends Color
    
    @js.native
    sealed trait INDIGO extends Color
    
    @js.native
    sealed trait LIME extends Color
    
    @js.native
    sealed trait MUSTARD extends Color
    
    @js.native
    sealed trait OLIVE extends Color
    
    @js.native
    sealed trait ORANGE extends Color
    
    @js.native
    sealed trait PINK extends Color
    
    @js.native
    sealed trait PLUM extends Color
    
    @js.native
    sealed trait PURPLE extends Color
    
    @js.native
    sealed trait RED extends Color
    
    @js.native
    sealed trait RED_ORANGE extends Color
    
    @js.native
    sealed trait SEA_BLUE extends Color
    
    @js.native
    sealed trait SLATE extends Color
    
    @js.native
    sealed trait TEAL extends Color
    
    @js.native
    sealed trait TURQOISE extends Color
    
    @js.native
    sealed trait YELLOW extends Color
  }
  
  @js.native
  sealed trait EventColor extends StObject
  /**
    * An enum representing the named event colors available in the Calendar service.
    */
  @JSGlobal("GoogleAppsScript.Calendar.EventColor")
  @js.native
  object EventColor extends StObject {
    
    @js.native
    sealed trait BLUE extends EventColor
    
    @js.native
    sealed trait CYAN extends EventColor
    
    @js.native
    sealed trait GRAY extends EventColor
    
    @js.native
    sealed trait GREEN extends EventColor
    
    @js.native
    sealed trait MAUVE extends EventColor
    
    @js.native
    sealed trait ORANGE extends EventColor
    
    @js.native
    sealed trait PALE_BLUE extends EventColor
    
    @js.native
    sealed trait PALE_GREEN extends EventColor
    
    @js.native
    sealed trait PALE_RED extends EventColor
    
    @js.native
    sealed trait RED extends EventColor
    
    @js.native
    sealed trait YELLOW extends EventColor
  }
  
  @js.native
  sealed trait GuestStatus extends StObject
  /**
    * An enum representing the statuses a guest can have for an event.
    */
  @JSGlobal("GoogleAppsScript.Calendar.GuestStatus")
  @js.native
  object GuestStatus extends StObject {
    
    @js.native
    sealed trait INVITED extends GuestStatus
    
    @js.native
    sealed trait MAYBE extends GuestStatus
    
    @js.native
    sealed trait NO extends GuestStatus
    
    @js.native
    sealed trait OWNER extends GuestStatus
    
    @js.native
    sealed trait YES extends GuestStatus
  }
  
  @js.native
  sealed trait Visibility extends StObject
  /**
    * An enum representing the visibility of an event.
    */
  @JSGlobal("GoogleAppsScript.Calendar.Visibility")
  @js.native
  object Visibility extends StObject {
    
    @js.native
    sealed trait CONFIDENTIAL extends Visibility
    
    @js.native
    sealed trait DEFAULT extends Visibility
    
    @js.native
    sealed trait PRIVATE extends Visibility
    
    @js.native
    sealed trait PUBLIC extends Visibility
  }
  
  /**
    * Represents a calendar that the user owns or is subscribed to.
    */
  @js.native
  trait Calendar extends StObject {
    
    def createAllDayEvent(title: String, date: Date): CalendarEvent = js.native
    def createAllDayEvent(title: String, date: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
    def createAllDayEvent(title: String, startDate: Date, endDate: Date): CalendarEvent = js.native
    def createAllDayEvent(title: String, startDate: Date, endDate: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
    
    def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
    def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence, options: StringDictionary[js.Any]): CalendarEventSeries = js.native
    
    def createEvent(title: String, startTime: Date, endTime: Date): CalendarEvent = js.native
    def createEvent(title: String, startTime: Date, endTime: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
    
    def createEventFromDescription(description: String): CalendarEvent = js.native
    
    def createEventSeries(title: String, startTime: Date, endTime: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
    def createEventSeries(
      title: String,
      startTime: Date,
      endTime: Date,
      recurrence: EventRecurrence,
      options: StringDictionary[js.Any]
    ): CalendarEventSeries = js.native
    
    def deleteCalendar(): Unit = js.native
    
    def getColor(): String = js.native
    
    def getDescription(): String = js.native
    
    def getEventById(iCalId: String): CalendarEvent = js.native
    
    def getEventSeriesById(iCalId: String): CalendarEventSeries = js.native
    
    def getEvents(startTime: Date, endTime: Date): js.Array[CalendarEvent] = js.native
    def getEvents(startTime: Date, endTime: Date, options: StringDictionary[js.Any]): js.Array[CalendarEvent] = js.native
    
    def getEventsForDay(date: Date): js.Array[CalendarEvent] = js.native
    def getEventsForDay(date: Date, options: StringDictionary[js.Any]): js.Array[CalendarEvent] = js.native
    
    def getId(): String = js.native
    
    def getName(): String = js.native
    
    def getTimeZone(): String = js.native
    
    def isHidden(): Boolean = js.native
    
    def isMyPrimaryCalendar(): Boolean = js.native
    
    def isOwnedByMe(): Boolean = js.native
    
    def isSelected(): Boolean = js.native
    
    def setColor(color: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def setDescription(description: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def setHidden(hidden: Boolean): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def setName(name: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def setSelected(selected: Boolean): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def setTimeZone(timeZone: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def unsubscribeFromCalendar(): Unit = js.native
  }
  
  /**
    * Allows a script to read and update the user's Google Calendar. This class provides direct access
    * to the user's default calendar, as well as the ability to retrieve additional calendars that the
    * user owns or is subscribed to.
    */
  @js.native
  trait CalendarApp extends StObject {
    
    var Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ js.Any = js.native
    
    var EventColor: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventColor */ js.Any = js.native
    
    var GuestStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GuestStatus */ js.Any = js.native
    
    var Month: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Month */ js.Any = js.native
    
    var Visibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Visibility */ js.Any = js.native
    
    var Weekday: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Weekday */ js.Any = js.native
    
    def createAllDayEvent(title: String, date: Date): CalendarEvent = js.native
    def createAllDayEvent(title: String, date: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
    def createAllDayEvent(title: String, startDate: Date, endDate: Date): CalendarEvent = js.native
    def createAllDayEvent(title: String, startDate: Date, endDate: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
    
    def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
    def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence, options: StringDictionary[js.Any]): CalendarEventSeries = js.native
    
    def createCalendar(name: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    def createCalendar(name: String, options: StringDictionary[js.Any]): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def createEvent(title: String, startTime: Date, endTime: Date): CalendarEvent = js.native
    def createEvent(title: String, startTime: Date, endTime: Date, options: StringDictionary[js.Any]): CalendarEvent = js.native
    
    def createEventFromDescription(description: String): CalendarEvent = js.native
    
    def createEventSeries(title: String, startTime: Date, endTime: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
    def createEventSeries(
      title: String,
      startTime: Date,
      endTime: Date,
      recurrence: EventRecurrence,
      options: StringDictionary[js.Any]
    ): CalendarEventSeries = js.native
    
    def getAllCalendars(): js.Array[typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar] = js.native
    
    def getAllOwnedCalendars(): js.Array[typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar] = js.native
    
    def getCalendarById(id: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def getCalendarsByName(name: String): js.Array[typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar] = js.native
    
    def getColor(): String = js.native
    
    def getDefaultCalendar(): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def getDescription(): String = js.native
    
    def getEventById(iCalId: String): CalendarEvent = js.native
    
    def getEventSeriesById(iCalId: String): CalendarEventSeries = js.native
    
    def getEvents(startTime: Date, endTime: Date): js.Array[CalendarEvent] = js.native
    def getEvents(startTime: Date, endTime: Date, options: StringDictionary[js.Any]): js.Array[CalendarEvent] = js.native
    
    def getEventsForDay(date: Date): js.Array[CalendarEvent] = js.native
    def getEventsForDay(date: Date, options: StringDictionary[js.Any]): js.Array[CalendarEvent] = js.native
    
    def getId(): String = js.native
    
    def getName(): String = js.native
    
    def getOwnedCalendarById(id: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def getOwnedCalendarsByName(name: String): js.Array[typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar] = js.native
    
    def getTimeZone(): String = js.native
    
    def isHidden(): Boolean = js.native
    
    def isMyPrimaryCalendar(): Boolean = js.native
    
    def isOwnedByMe(): Boolean = js.native
    
    def isSelected(): Boolean = js.native
    
    def newRecurrence(): EventRecurrence = js.native
    
    def setColor(color: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def setDescription(description: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def setHidden(hidden: Boolean): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def setName(name: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def setSelected(selected: Boolean): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def setTimeZone(timeZone: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def subscribeToCalendar(id: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    def subscribeToCalendar(id: String, options: StringDictionary[js.Any]): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
  }
  
  /**
    * Represents a single calendar event.
    */
  @js.native
  trait CalendarEvent extends StObject {
    
    def addEmailReminder(minutesBefore: Integer): CalendarEvent = js.native
    
    def addGuest(email: String): CalendarEvent = js.native
    
    def addPopupReminder(minutesBefore: Integer): CalendarEvent = js.native
    
    def addSmsReminder(minutesBefore: Integer): CalendarEvent = js.native
    
    def anyoneCanAddSelf(): Boolean = js.native
    
    def deleteEvent(): Unit = js.native
    
    def deleteTag(key: String): CalendarEvent = js.native
    
    def getAllDayEndDate(): Date = js.native
    
    def getAllDayStartDate(): Date = js.native
    
    def getAllTagKeys(): js.Array[String] = js.native
    
    def getColor(): String = js.native
    
    def getCreators(): js.Array[String] = js.native
    
    def getDateCreated(): Date = js.native
    
    def getDescription(): String = js.native
    
    def getEmailReminders(): js.Array[Integer] = js.native
    
    def getEndTime(): Date = js.native
    
    def getEventSeries(): CalendarEventSeries = js.native
    
    def getGuestByEmail(email: String): EventGuest = js.native
    
    def getGuestList(): js.Array[EventGuest] = js.native
    def getGuestList(includeOwner: Boolean): js.Array[EventGuest] = js.native
    
    def getId(): String = js.native
    
    def getLastUpdated(): Date = js.native
    
    def getLocation(): String = js.native
    
    def getMyStatus(): GuestStatus = js.native
    
    def getOriginalCalendarId(): String = js.native
    
    def getPopupReminders(): js.Array[Integer] = js.native
    
    def getSmsReminders(): js.Array[Integer] = js.native
    
    def getStartTime(): Date = js.native
    
    def getTag(key: String): String = js.native
    
    def getTitle(): String = js.native
    
    def getVisibility(): Visibility = js.native
    
    def guestsCanInviteOthers(): Boolean = js.native
    
    def guestsCanModify(): Boolean = js.native
    
    def guestsCanSeeGuests(): Boolean = js.native
    
    def isAllDayEvent(): Boolean = js.native
    
    def isOwnedByMe(): Boolean = js.native
    
    def isRecurringEvent(): Boolean = js.native
    
    def removeAllReminders(): CalendarEvent = js.native
    
    def removeGuest(email: String): CalendarEvent = js.native
    
    def resetRemindersToDefault(): CalendarEvent = js.native
    
    def setAllDayDate(date: Date): CalendarEvent = js.native
    
    def setAllDayDates(startDate: Date, endDate: Date): CalendarEvent = js.native
    
    def setAnyoneCanAddSelf(anyoneCanAddSelf: Boolean): CalendarEvent = js.native
    
    def setColor(color: String): CalendarEvent = js.native
    
    def setDescription(description: String): CalendarEvent = js.native
    
    def setGuestsCanInviteOthers(guestsCanInviteOthers: Boolean): CalendarEvent = js.native
    
    def setGuestsCanModify(guestsCanModify: Boolean): CalendarEvent = js.native
    
    def setGuestsCanSeeGuests(guestsCanSeeGuests: Boolean): CalendarEvent = js.native
    
    def setLocation(location: String): CalendarEvent = js.native
    
    def setMyStatus(status: GuestStatus): CalendarEvent = js.native
    
    def setTag(key: String, value: String): CalendarEvent = js.native
    
    def setTime(startTime: Date, endTime: Date): CalendarEvent = js.native
    
    def setTitle(title: String): CalendarEvent = js.native
    
    def setVisibility(visibility: Visibility): CalendarEvent = js.native
  }
  
  /**
    * Represents a series of events (a recurring event).
    */
  @js.native
  trait CalendarEventSeries extends StObject {
    
    def addEmailReminder(minutesBefore: Integer): CalendarEventSeries = js.native
    
    def addGuest(email: String): CalendarEventSeries = js.native
    
    def addPopupReminder(minutesBefore: Integer): CalendarEventSeries = js.native
    
    def addSmsReminder(minutesBefore: Integer): CalendarEventSeries = js.native
    
    def anyoneCanAddSelf(): Boolean = js.native
    
    def deleteEventSeries(): Unit = js.native
    
    def deleteTag(key: String): CalendarEventSeries = js.native
    
    def getAllTagKeys(): js.Array[String] = js.native
    
    def getColor(): String = js.native
    
    def getCreators(): js.Array[String] = js.native
    
    def getDateCreated(): Date = js.native
    
    def getDescription(): String = js.native
    
    def getEmailReminders(): js.Array[Integer] = js.native
    
    def getGuestByEmail(email: String): EventGuest = js.native
    
    def getGuestList(): js.Array[EventGuest] = js.native
    def getGuestList(includeOwner: Boolean): js.Array[EventGuest] = js.native
    
    def getId(): String = js.native
    
    def getLastUpdated(): Date = js.native
    
    def getLocation(): String = js.native
    
    def getMyStatus(): GuestStatus = js.native
    
    def getOriginalCalendarId(): String = js.native
    
    def getPopupReminders(): js.Array[Integer] = js.native
    
    def getSmsReminders(): js.Array[Integer] = js.native
    
    def getTag(key: String): String = js.native
    
    def getTitle(): String = js.native
    
    def getVisibility(): Visibility = js.native
    
    def guestsCanInviteOthers(): Boolean = js.native
    
    def guestsCanModify(): Boolean = js.native
    
    def guestsCanSeeGuests(): Boolean = js.native
    
    def isOwnedByMe(): Boolean = js.native
    
    def removeAllReminders(): CalendarEventSeries = js.native
    
    def removeGuest(email: String): CalendarEventSeries = js.native
    
    def resetRemindersToDefault(): CalendarEventSeries = js.native
    
    def setAnyoneCanAddSelf(anyoneCanAddSelf: Boolean): CalendarEventSeries = js.native
    
    def setColor(color: String): CalendarEventSeries = js.native
    
    def setDescription(description: String): CalendarEventSeries = js.native
    
    def setGuestsCanInviteOthers(guestsCanInviteOthers: Boolean): CalendarEventSeries = js.native
    
    def setGuestsCanModify(guestsCanModify: Boolean): CalendarEventSeries = js.native
    
    def setGuestsCanSeeGuests(guestsCanSeeGuests: Boolean): CalendarEventSeries = js.native
    
    def setLocation(location: String): CalendarEventSeries = js.native
    
    def setMyStatus(status: GuestStatus): CalendarEventSeries = js.native
    
    def setRecurrence(recurrence: EventRecurrence, startDate: Date): CalendarEventSeries = js.native
    def setRecurrence(recurrence: EventRecurrence, startTime: Date, endTime: Date): CalendarEventSeries = js.native
    
    def setTag(key: String, value: String): CalendarEventSeries = js.native
    
    def setTitle(title: String): CalendarEventSeries = js.native
    
    def setVisibility(visibility: Visibility): CalendarEventSeries = js.native
  }
  
  @scala.inline
  implicit class CalendarMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.Calendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: AclCollection): Self = StObject.set(x, "Acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "Acl", js.undefined)
    
    @scala.inline
    def setCalendarList(value: CalendarListCollection): Self = StObject.set(x, "CalendarList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarListUndefined: Self = StObject.set(x, "CalendarList", js.undefined)
    
    @scala.inline
    def setCalendars(value: CalendarsCollection): Self = StObject.set(x, "Calendars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarsUndefined: Self = StObject.set(x, "Calendars", js.undefined)
    
    @scala.inline
    def setChannels(value: ChannelsCollection): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    @scala.inline
    def setColors(value: ColorsCollection): Self = StObject.set(x, "Colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "Colors", js.undefined)
    
    @scala.inline
    def setEvents(value: EventsCollection): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    @scala.inline
    def setFreebusy(value: FreebusyCollection): Self = StObject.set(x, "Freebusy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreebusyUndefined: Self = StObject.set(x, "Freebusy", js.undefined)
    
    @scala.inline
    def setNewAclRule(value: () => AclRule): Self = StObject.set(x, "newAclRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewAclRuleScope(value: () => AclRuleScope): Self = StObject.set(x, "newAclRuleScope", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCalendar(value: () => typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar): Self = StObject.set(x, "newCalendar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCalendarListEntry(value: () => CalendarListEntry): Self = StObject.set(x, "newCalendarListEntry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCalendarListEntryNotificationSettings(value: () => CalendarListEntryNotificationSettings): Self = StObject.set(x, "newCalendarListEntryNotificationSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCalendarNotification(value: () => CalendarNotification): Self = StObject.set(x, "newCalendarNotification", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewChannel(value: () => Channel): Self = StObject.set(x, "newChannel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceData(value: () => typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData): Self = StObject.set(x, "newConferenceData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceParameters(value: () => ConferenceParameters): Self = StObject.set(x, "newConferenceParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceParametersAddOnParameters(value: () => ConferenceParametersAddOnParameters): Self = StObject.set(x, "newConferenceParametersAddOnParameters", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceProperties(value: () => ConferenceProperties): Self = StObject.set(x, "newConferenceProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceRequestStatus(value: () => ConferenceRequestStatus): Self = StObject.set(x, "newConferenceRequestStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceSolution(value: () => ConferenceSolution): Self = StObject.set(x, "newConferenceSolution", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewConferenceSolutionKey(value: () => ConferenceSolutionKey): Self = StObject.set(x, "newConferenceSolutionKey", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewCreateConferenceRequest(value: () => CreateConferenceRequest): Self = StObject.set(x, "newCreateConferenceRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEntryPoint(value: () => EntryPoint): Self = StObject.set(x, "newEntryPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEvent(value: () => Event): Self = StObject.set(x, "newEvent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventAttachment(value: () => EventAttachment): Self = StObject.set(x, "newEventAttachment", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventAttendee(value: () => EventAttendee): Self = StObject.set(x, "newEventAttendee", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventCreator(value: () => EventCreator): Self = StObject.set(x, "newEventCreator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventDateTime(value: () => EventDateTime): Self = StObject.set(x, "newEventDateTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventExtendedProperties(value: () => EventExtendedProperties): Self = StObject.set(x, "newEventExtendedProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventGadget(value: () => EventGadget): Self = StObject.set(x, "newEventGadget", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventOrganizer(value: () => EventOrganizer): Self = StObject.set(x, "newEventOrganizer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventReminder(value: () => EventReminder): Self = StObject.set(x, "newEventReminder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventReminders(value: () => EventReminders): Self = StObject.set(x, "newEventReminders", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewEventSource(value: () => EventSource): Self = StObject.set(x, "newEventSource", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFreeBusyRequest(value: () => FreeBusyRequest): Self = StObject.set(x, "newFreeBusyRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewFreeBusyRequestItem(value: () => FreeBusyRequestItem): Self = StObject.set(x, "newFreeBusyRequestItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSettings(value: SettingsCollection): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
  }
  
  object Collection {
    
    @js.native
    trait AclCollection extends StObject {
      
      // Returns an access control rule.
      def get(calendarId: String, ruleId: String): AclRule = js.native
      // Returns an access control rule.
      def get(calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
      
      // Creates an access control rule.
      def insert(resource: AclRule, calendarId: String): AclRule = js.native
      // Creates an access control rule.
      def insert(resource: AclRule, calendarId: String, optionalArgs: js.Object): AclRule = js.native
      // Creates an access control rule.
      def insert(resource: AclRule, calendarId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
      
      // Returns the rules in the access control list for the calendar.
      def list(calendarId: String): Acl = js.native
      // Returns the rules in the access control list for the calendar.
      def list(calendarId: String, optionalArgs: js.Object): Acl = js.native
      // Returns the rules in the access control list for the calendar.
      def list(calendarId: String, optionalArgs: js.Object, headers: js.Object): Acl = js.native
      
      // Updates an access control rule. This method supports patch semantics.
      def patch(resource: AclRule, calendarId: String, ruleId: String): AclRule = js.native
      // Updates an access control rule. This method supports patch semantics.
      def patch(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object): AclRule = js.native
      // Updates an access control rule. This method supports patch semantics.
      def patch(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
      
      // Deletes an access control rule.
      def remove(calendarId: String, ruleId: String): Unit = js.native
      // Deletes an access control rule.
      def remove(calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
      
      // Updates an access control rule.
      def update(resource: AclRule, calendarId: String, ruleId: String): AclRule = js.native
      // Updates an access control rule.
      def update(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object): AclRule = js.native
      // Updates an access control rule.
      def update(resource: AclRule, calendarId: String, ruleId: String, optionalArgs: js.Object, headers: js.Object): AclRule = js.native
      
      // Watch for changes to ACL resources.
      def watch(resource: Channel, calendarId: String): Channel = js.native
      // Watch for changes to ACL resources.
      def watch(resource: Channel, calendarId: String, optionalArgs: js.Object): Channel = js.native
      // Watch for changes to ACL resources.
      def watch(resource: Channel, calendarId: String, optionalArgs: js.Object, headers: js.Object): Channel = js.native
    }
    
    @js.native
    trait CalendarListCollection extends StObject {
      
      // Returns a calendar from the user's calendar list.
      def get(calendarId: String): CalendarListEntry = js.native
      // Returns a calendar from the user's calendar list.
      def get(calendarId: String, optionalArgs: js.Object, headers: js.Object): CalendarListEntry = js.native
      
      // Inserts an existing calendar into the user's calendar list.
      def insert(resource: CalendarListEntry): CalendarListEntry = js.native
      // Inserts an existing calendar into the user's calendar list.
      def insert(resource: CalendarListEntry, optionalArgs: js.Object): CalendarListEntry = js.native
      // Inserts an existing calendar into the user's calendar list.
      def insert(resource: CalendarListEntry, optionalArgs: js.Object, headers: js.Object): CalendarListEntry = js.native
      
      // Returns the calendars on the user's calendar list.
      def list(): CalendarList = js.native
      // Returns the calendars on the user's calendar list.
      def list(optionalArgs: js.Object): CalendarList = js.native
      // Returns the calendars on the user's calendar list.
      def list(optionalArgs: js.Object, headers: js.Object): CalendarList = js.native
      
      // Updates an existing calendar on the user's calendar list. This method supports patch semantics.
      def patch(resource: CalendarListEntry, calendarId: String): CalendarListEntry = js.native
      // Updates an existing calendar on the user's calendar list. This method supports patch semantics.
      def patch(resource: CalendarListEntry, calendarId: String, optionalArgs: js.Object): CalendarListEntry = js.native
      // Updates an existing calendar on the user's calendar list. This method supports patch semantics.
      def patch(resource: CalendarListEntry, calendarId: String, optionalArgs: js.Object, headers: js.Object): CalendarListEntry = js.native
      
      // Removes a calendar from the user's calendar list.
      def remove(calendarId: String): Unit = js.native
      // Removes a calendar from the user's calendar list.
      def remove(calendarId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
      
      // Updates an existing calendar on the user's calendar list.
      def update(resource: CalendarListEntry, calendarId: String): CalendarListEntry = js.native
      // Updates an existing calendar on the user's calendar list.
      def update(resource: CalendarListEntry, calendarId: String, optionalArgs: js.Object): CalendarListEntry = js.native
      // Updates an existing calendar on the user's calendar list.
      def update(resource: CalendarListEntry, calendarId: String, optionalArgs: js.Object, headers: js.Object): CalendarListEntry = js.native
      
      // Watch for changes to CalendarList resources.
      def watch(resource: Channel): Channel = js.native
      // Watch for changes to CalendarList resources.
      def watch(resource: Channel, optionalArgs: js.Object): Channel = js.native
      // Watch for changes to CalendarList resources.
      def watch(resource: Channel, optionalArgs: js.Object, headers: js.Object): Channel = js.native
    }
    
    @js.native
    trait CalendarsCollection extends StObject {
      
      // Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account.
      def clear(calendarId: String): Unit = js.native
      // Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account.
      def clear(calendarId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
      
      // Returns metadata for a calendar.
      def get(calendarId: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
      // Returns metadata for a calendar.
      def get(calendarId: String, optionalArgs: js.Object, headers: js.Object): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
      
      // Creates a secondary calendar.
      def insert(resource: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
      // Creates a secondary calendar.
      def insert(
        resource: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar,
        optionalArgs: js.Object,
        headers: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
      
      // Updates metadata for a calendar. This method supports patch semantics.
      def patch(resource: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar, calendarId: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
      // Updates metadata for a calendar. This method supports patch semantics.
      def patch(
        resource: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar,
        calendarId: String,
        optionalArgs: js.Object,
        headers: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
      
      // Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars.
      def remove(calendarId: String): Unit = js.native
      // Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars.
      def remove(calendarId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
      
      // Updates metadata for a calendar.
      def update(resource: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar, calendarId: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
      // Updates metadata for a calendar.
      def update(
        resource: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar,
        calendarId: String,
        optionalArgs: js.Object,
        headers: js.Object
      ): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = js.native
    }
    
    @js.native
    trait ChannelsCollection extends StObject {
      
      // Stop watching resources through this channel
      def stop(resource: Channel): Unit = js.native
      // Stop watching resources through this channel
      def stop(resource: Channel, optionalArgs: js.Object, headers: js.Object): Unit = js.native
    }
    
    @js.native
    trait ColorsCollection extends StObject {
      
      // Returns the color definitions for calendars and events.
      def get(): Colors = js.native
      // Returns the color definitions for calendars and events.
      def get(optionalArgs: js.Object, headers: js.Object): Colors = js.native
    }
    
    @js.native
    trait EventsCollection extends StObject {
      
      // Returns an event.
      def get(calendarId: String, eventId: String): Event = js.native
      // Returns an event.
      def get(calendarId: String, eventId: String, optionalArgs: js.Object): Event = js.native
      // Returns an event.
      def get(calendarId: String, eventId: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
      
      // Imports an event. This operation is used to add a private copy of an existing event to a calendar.
      def `import`(resource: Event, calendarId: String): Event = js.native
      // Imports an event. This operation is used to add a private copy of an existing event to a calendar.
      def `import`(resource: Event, calendarId: String, optionalArgs: js.Object): Event = js.native
      // Imports an event. This operation is used to add a private copy of an existing event to a calendar.
      def `import`(resource: Event, calendarId: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
      
      // Creates an event.
      def insert(resource: Event, calendarId: String): Event = js.native
      // Creates an event.
      def insert(resource: Event, calendarId: String, optionalArgs: js.Object): Event = js.native
      // Creates an event.
      def insert(resource: Event, calendarId: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
      
      // Returns instances of the specified recurring event.
      def instances(calendarId: String, eventId: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events = js.native
      // Returns instances of the specified recurring event.
      def instances(calendarId: String, eventId: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events = js.native
      // Returns instances of the specified recurring event.
      def instances(calendarId: String, eventId: String, optionalArgs: js.Object, headers: js.Object): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events = js.native
      
      // Returns events on the specified calendar.
      def list(calendarId: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events = js.native
      // Returns events on the specified calendar.
      def list(calendarId: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events = js.native
      // Returns events on the specified calendar.
      def list(calendarId: String, optionalArgs: js.Object, headers: js.Object): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events = js.native
      
      // Moves an event to another calendar, i.e. changes an event's organizer.
      def move(calendarId: String, eventId: String, destination: String): Event = js.native
      // Moves an event to another calendar, i.e. changes an event's organizer.
      def move(calendarId: String, eventId: String, destination: String, optionalArgs: js.Object): Event = js.native
      // Moves an event to another calendar, i.e. changes an event's organizer.
      def move(
        calendarId: String,
        eventId: String,
        destination: String,
        optionalArgs: js.Object,
        headers: js.Object
      ): Event = js.native
      
      // Updates an event. This method supports patch semantics.
      def patch(resource: Event, calendarId: String, eventId: String): Event = js.native
      // Updates an event. This method supports patch semantics.
      def patch(resource: Event, calendarId: String, eventId: String, optionalArgs: js.Object): Event = js.native
      // Updates an event. This method supports patch semantics.
      def patch(resource: Event, calendarId: String, eventId: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
      
      // Creates an event based on a simple text string.
      def quickAdd(calendarId: String, text: String): Event = js.native
      // Creates an event based on a simple text string.
      def quickAdd(calendarId: String, text: String, optionalArgs: js.Object): Event = js.native
      // Creates an event based on a simple text string.
      def quickAdd(calendarId: String, text: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
      
      // Deletes an event.
      def remove(calendarId: String, eventId: String): Unit = js.native
      // Deletes an event.
      def remove(calendarId: String, eventId: String, optionalArgs: js.Object): Unit = js.native
      // Deletes an event.
      def remove(calendarId: String, eventId: String, optionalArgs: js.Object, headers: js.Object): Unit = js.native
      
      // Updates an event.
      def update(resource: Event, calendarId: String, eventId: String): Event = js.native
      // Updates an event.
      def update(resource: Event, calendarId: String, eventId: String, optionalArgs: js.Object): Event = js.native
      // Updates an event.
      def update(resource: Event, calendarId: String, eventId: String, optionalArgs: js.Object, headers: js.Object): Event = js.native
      
      // Watch for changes to Events resources.
      def watch(resource: Channel, calendarId: String): Channel = js.native
      // Watch for changes to Events resources.
      def watch(resource: Channel, calendarId: String, optionalArgs: js.Object): Channel = js.native
      // Watch for changes to Events resources.
      def watch(resource: Channel, calendarId: String, optionalArgs: js.Object, headers: js.Object): Channel = js.native
    }
    
    @js.native
    trait FreebusyCollection extends StObject {
      
      // Returns free/busy information for a set of calendars.
      def query(resource: FreeBusyRequest): FreeBusyResponse = js.native
      // Returns free/busy information for a set of calendars.
      def query(resource: FreeBusyRequest, optionalArgs: js.Object, headers: js.Object): FreeBusyResponse = js.native
    }
    
    @js.native
    trait SettingsCollection extends StObject {
      
      // Returns a single user setting.
      def get(setting: String): Setting = js.native
      // Returns a single user setting.
      def get(setting: String, optionalArgs: js.Object, headers: js.Object): Setting = js.native
      
      // Returns all user settings for the authenticated user.
      def list(): Settings = js.native
      // Returns all user settings for the authenticated user.
      def list(optionalArgs: js.Object): Settings = js.native
      // Returns all user settings for the authenticated user.
      def list(optionalArgs: js.Object, headers: js.Object): Settings = js.native
      
      // Watch for changes to Settings resources.
      def watch(resource: Channel): Channel = js.native
      // Watch for changes to Settings resources.
      def watch(resource: Channel, optionalArgs: js.Object): Channel = js.native
      // Watch for changes to Settings resources.
      def watch(resource: Channel, optionalArgs: js.Object, headers: js.Object): Channel = js.native
    }
  }
  
  /**
    * Represents a guest of an event.
    */
  @js.native
  trait EventGuest extends StObject {
    
    def getAdditionalGuests(): Integer = js.native
    
    def getEmail(): String = js.native
    
    def getGuestStatus(): GuestStatus = js.native
    
    def getName(): String = js.native
    
    /** @deprecated DO NOT USE */ def getStatus(): String = js.native
  }
  object EventGuest {
    
    @scala.inline
    def apply(
      getAdditionalGuests: () => Integer,
      getEmail: () => String,
      getGuestStatus: () => GuestStatus,
      getName: () => String,
      getStatus: () => String
    ): EventGuest = {
      val __obj = js.Dynamic.literal(getAdditionalGuests = js.Any.fromFunction0(getAdditionalGuests), getEmail = js.Any.fromFunction0(getEmail), getGuestStatus = js.Any.fromFunction0(getGuestStatus), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus))
      __obj.asInstanceOf[EventGuest]
    }
    
    @scala.inline
    implicit class EventGuestMutableBuilder[Self <: EventGuest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetAdditionalGuests(value: () => Integer): Self = StObject.set(x, "getAdditionalGuests", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEmail(value: () => String): Self = StObject.set(x, "getEmail", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetGuestStatus(value: () => GuestStatus): Self = StObject.set(x, "getGuestStatus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetStatus(value: () => String): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Represents the recurrence settings for an event series.
    */
  @js.native
  trait EventRecurrence extends StObject {
    
    def addDailyExclusion(): RecurrenceRule = js.native
    
    def addDailyRule(): RecurrenceRule = js.native
    
    def addDate(date: Date): EventRecurrence = js.native
    
    def addDateExclusion(date: Date): EventRecurrence = js.native
    
    def addMonthlyExclusion(): RecurrenceRule = js.native
    
    def addMonthlyRule(): RecurrenceRule = js.native
    
    def addWeeklyExclusion(): RecurrenceRule = js.native
    
    def addWeeklyRule(): RecurrenceRule = js.native
    
    def addYearlyExclusion(): RecurrenceRule = js.native
    
    def addYearlyRule(): RecurrenceRule = js.native
    
    def setTimeZone(timeZone: String): EventRecurrence = js.native
  }
  object EventRecurrence {
    
    @scala.inline
    def apply(
      addDailyExclusion: () => RecurrenceRule,
      addDailyRule: () => RecurrenceRule,
      addDate: Date => EventRecurrence,
      addDateExclusion: Date => EventRecurrence,
      addMonthlyExclusion: () => RecurrenceRule,
      addMonthlyRule: () => RecurrenceRule,
      addWeeklyExclusion: () => RecurrenceRule,
      addWeeklyRule: () => RecurrenceRule,
      addYearlyExclusion: () => RecurrenceRule,
      addYearlyRule: () => RecurrenceRule,
      setTimeZone: String => EventRecurrence
    ): EventRecurrence = {
      val __obj = js.Dynamic.literal(addDailyExclusion = js.Any.fromFunction0(addDailyExclusion), addDailyRule = js.Any.fromFunction0(addDailyRule), addDate = js.Any.fromFunction1(addDate), addDateExclusion = js.Any.fromFunction1(addDateExclusion), addMonthlyExclusion = js.Any.fromFunction0(addMonthlyExclusion), addMonthlyRule = js.Any.fromFunction0(addMonthlyRule), addWeeklyExclusion = js.Any.fromFunction0(addWeeklyExclusion), addWeeklyRule = js.Any.fromFunction0(addWeeklyRule), addYearlyExclusion = js.Any.fromFunction0(addYearlyExclusion), addYearlyRule = js.Any.fromFunction0(addYearlyRule), setTimeZone = js.Any.fromFunction1(setTimeZone))
      __obj.asInstanceOf[EventRecurrence]
    }
    
    @scala.inline
    implicit class EventRecurrenceMutableBuilder[Self <: EventRecurrence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDailyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addDailyExclusion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddDailyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addDailyRule", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddDate(value: Date => EventRecurrence): Self = StObject.set(x, "addDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddDateExclusion(value: Date => EventRecurrence): Self = StObject.set(x, "addDateExclusion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddMonthlyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addMonthlyExclusion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddMonthlyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addMonthlyRule", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddWeeklyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addWeeklyExclusion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddWeeklyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addWeeklyRule", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddYearlyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addYearlyExclusion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddYearlyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addYearlyRule", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetTimeZone(value: String => EventRecurrence): Self = StObject.set(x, "setTimeZone", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Represents a recurrence rule for an event series.
    *
    * Note that this class also behaves like the EventRecurrence that it belongs to,
    * allowing you to chain rule creation together like so:
    *
    *     recurrence.addDailyRule().times(3).interval(2).addWeeklyExclusion().times(2);
    *
    * times(times)
    * interval(interval)
    */
  @js.native
  trait RecurrenceRule extends StObject {
    
    def addDailyExclusion(): RecurrenceRule = js.native
    
    def addDailyRule(): RecurrenceRule = js.native
    
    def addDate(date: Date): EventRecurrence = js.native
    
    def addDateExclusion(date: Date): EventRecurrence = js.native
    
    def addMonthlyExclusion(): RecurrenceRule = js.native
    
    def addMonthlyRule(): RecurrenceRule = js.native
    
    def addWeeklyExclusion(): RecurrenceRule = js.native
    
    def addWeeklyRule(): RecurrenceRule = js.native
    
    def addYearlyExclusion(): RecurrenceRule = js.native
    
    def addYearlyRule(): RecurrenceRule = js.native
    
    def interval(interval: Integer): RecurrenceRule = js.native
    
    def onlyInMonth(month: Month): RecurrenceRule = js.native
    
    def onlyInMonths(months: js.Array[Month]): RecurrenceRule = js.native
    
    def onlyOnMonthDay(day: Integer): RecurrenceRule = js.native
    
    def onlyOnMonthDays(days: js.Array[Integer]): RecurrenceRule = js.native
    
    def onlyOnWeek(week: Integer): RecurrenceRule = js.native
    
    def onlyOnWeekday(day: Weekday): RecurrenceRule = js.native
    
    def onlyOnWeekdays(days: js.Array[Weekday]): RecurrenceRule = js.native
    
    def onlyOnWeeks(weeks: js.Array[Integer]): RecurrenceRule = js.native
    
    def onlyOnYearDay(day: Integer): RecurrenceRule = js.native
    
    def onlyOnYearDays(days: js.Array[Integer]): RecurrenceRule = js.native
    
    def setTimeZone(timeZone: String): EventRecurrence = js.native
    
    def times(times: Integer): RecurrenceRule = js.native
    
    def until(endDate: Date): RecurrenceRule = js.native
    
    def weekStartsOn(day: Weekday): RecurrenceRule = js.native
  }
  object RecurrenceRule {
    
    @scala.inline
    def apply(
      addDailyExclusion: () => RecurrenceRule,
      addDailyRule: () => RecurrenceRule,
      addDate: Date => EventRecurrence,
      addDateExclusion: Date => EventRecurrence,
      addMonthlyExclusion: () => RecurrenceRule,
      addMonthlyRule: () => RecurrenceRule,
      addWeeklyExclusion: () => RecurrenceRule,
      addWeeklyRule: () => RecurrenceRule,
      addYearlyExclusion: () => RecurrenceRule,
      addYearlyRule: () => RecurrenceRule,
      interval: Integer => RecurrenceRule,
      onlyInMonth: Month => RecurrenceRule,
      onlyInMonths: js.Array[Month] => RecurrenceRule,
      onlyOnMonthDay: Integer => RecurrenceRule,
      onlyOnMonthDays: js.Array[Integer] => RecurrenceRule,
      onlyOnWeek: Integer => RecurrenceRule,
      onlyOnWeekday: Weekday => RecurrenceRule,
      onlyOnWeekdays: js.Array[Weekday] => RecurrenceRule,
      onlyOnWeeks: js.Array[Integer] => RecurrenceRule,
      onlyOnYearDay: Integer => RecurrenceRule,
      onlyOnYearDays: js.Array[Integer] => RecurrenceRule,
      setTimeZone: String => EventRecurrence,
      times: Integer => RecurrenceRule,
      until: Date => RecurrenceRule,
      weekStartsOn: Weekday => RecurrenceRule
    ): RecurrenceRule = {
      val __obj = js.Dynamic.literal(addDailyExclusion = js.Any.fromFunction0(addDailyExclusion), addDailyRule = js.Any.fromFunction0(addDailyRule), addDate = js.Any.fromFunction1(addDate), addDateExclusion = js.Any.fromFunction1(addDateExclusion), addMonthlyExclusion = js.Any.fromFunction0(addMonthlyExclusion), addMonthlyRule = js.Any.fromFunction0(addMonthlyRule), addWeeklyExclusion = js.Any.fromFunction0(addWeeklyExclusion), addWeeklyRule = js.Any.fromFunction0(addWeeklyRule), addYearlyExclusion = js.Any.fromFunction0(addYearlyExclusion), addYearlyRule = js.Any.fromFunction0(addYearlyRule), interval = js.Any.fromFunction1(interval), onlyInMonth = js.Any.fromFunction1(onlyInMonth), onlyInMonths = js.Any.fromFunction1(onlyInMonths), onlyOnMonthDay = js.Any.fromFunction1(onlyOnMonthDay), onlyOnMonthDays = js.Any.fromFunction1(onlyOnMonthDays), onlyOnWeek = js.Any.fromFunction1(onlyOnWeek), onlyOnWeekday = js.Any.fromFunction1(onlyOnWeekday), onlyOnWeekdays = js.Any.fromFunction1(onlyOnWeekdays), onlyOnWeeks = js.Any.fromFunction1(onlyOnWeeks), onlyOnYearDay = js.Any.fromFunction1(onlyOnYearDay), onlyOnYearDays = js.Any.fromFunction1(onlyOnYearDays), setTimeZone = js.Any.fromFunction1(setTimeZone), times = js.Any.fromFunction1(times), until = js.Any.fromFunction1(until), weekStartsOn = js.Any.fromFunction1(weekStartsOn))
      __obj.asInstanceOf[RecurrenceRule]
    }
    
    @scala.inline
    implicit class RecurrenceRuleMutableBuilder[Self <: RecurrenceRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddDailyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addDailyExclusion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddDailyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addDailyRule", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddDate(value: Date => EventRecurrence): Self = StObject.set(x, "addDate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddDateExclusion(value: Date => EventRecurrence): Self = StObject.set(x, "addDateExclusion", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddMonthlyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addMonthlyExclusion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddMonthlyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addMonthlyRule", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddWeeklyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addWeeklyExclusion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddWeeklyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addWeeklyRule", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddYearlyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addYearlyExclusion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddYearlyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addYearlyRule", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInterval(value: Integer => RecurrenceRule): Self = StObject.set(x, "interval", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyInMonth(value: Month => RecurrenceRule): Self = StObject.set(x, "onlyInMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyInMonths(value: js.Array[Month] => RecurrenceRule): Self = StObject.set(x, "onlyInMonths", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyOnMonthDay(value: Integer => RecurrenceRule): Self = StObject.set(x, "onlyOnMonthDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyOnMonthDays(value: js.Array[Integer] => RecurrenceRule): Self = StObject.set(x, "onlyOnMonthDays", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyOnWeek(value: Integer => RecurrenceRule): Self = StObject.set(x, "onlyOnWeek", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyOnWeekday(value: Weekday => RecurrenceRule): Self = StObject.set(x, "onlyOnWeekday", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyOnWeekdays(value: js.Array[Weekday] => RecurrenceRule): Self = StObject.set(x, "onlyOnWeekdays", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyOnWeeks(value: js.Array[Integer] => RecurrenceRule): Self = StObject.set(x, "onlyOnWeeks", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyOnYearDay(value: Integer => RecurrenceRule): Self = StObject.set(x, "onlyOnYearDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyOnYearDays(value: js.Array[Integer] => RecurrenceRule): Self = StObject.set(x, "onlyOnYearDays", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTimeZone(value: String => EventRecurrence): Self = StObject.set(x, "setTimeZone", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimes(value: Integer => RecurrenceRule): Self = StObject.set(x, "times", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUntil(value: Date => RecurrenceRule): Self = StObject.set(x, "until", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWeekStartsOn(value: Weekday => RecurrenceRule): Self = StObject.set(x, "weekStartsOn", js.Any.fromFunction1(value))
    }
  }
  
  object Schema {
    
    @js.native
    trait Acl extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[AclRule]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var nextSyncToken: js.UndefOr[String] = js.native
    }
    object Acl {
      
      @scala.inline
      def apply(): Acl = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Acl]
      }
      
      @scala.inline
      implicit class AclMutableBuilder[Self <: Acl] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[AclRule]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: AclRule*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
      }
    }
    
    @js.native
    trait AclRule extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var role: js.UndefOr[String] = js.native
      
      var scope: js.UndefOr[AclRuleScope] = js.native
    }
    object AclRule {
      
      @scala.inline
      def apply(): AclRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AclRule]
      }
      
      @scala.inline
      implicit class AclRuleMutableBuilder[Self <: AclRule] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        @scala.inline
        def setScope(value: AclRuleScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      }
    }
    
    @js.native
    trait AclRuleScope extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object AclRuleScope {
      
      @scala.inline
      def apply(): AclRuleScope = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AclRuleScope]
      }
      
      @scala.inline
      implicit class AclRuleScopeMutableBuilder[Self <: AclRuleScope] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Calendar extends StObject {
      
      var conferenceProperties: js.UndefOr[ConferenceProperties] = js.native
      
      var description: js.UndefOr[String] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var location: js.UndefOr[String] = js.native
      
      var summary: js.UndefOr[String] = js.native
      
      var timeZone: js.UndefOr[String] = js.native
    }
    object Calendar {
      
      @scala.inline
      def apply(): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar]
      }
      
      @scala.inline
      implicit class CalendarMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConferenceProperties(value: ConferenceProperties): Self = StObject.set(x, "conferenceProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConferencePropertiesUndefined: Self = StObject.set(x, "conferenceProperties", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        @scala.inline
        def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      }
    }
    
    @js.native
    trait CalendarList extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[CalendarListEntry]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var nextSyncToken: js.UndefOr[String] = js.native
    }
    object CalendarList {
      
      @scala.inline
      def apply(): CalendarList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CalendarList]
      }
      
      @scala.inline
      implicit class CalendarListMutableBuilder[Self <: CalendarList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[CalendarListEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: CalendarListEntry*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
      }
    }
    
    @js.native
    trait CalendarListEntry extends StObject {
      
      var accessRole: js.UndefOr[String] = js.native
      
      var backgroundColor: js.UndefOr[String] = js.native
      
      var colorId: js.UndefOr[String] = js.native
      
      var conferenceProperties: js.UndefOr[ConferenceProperties] = js.native
      
      var defaultReminders: js.UndefOr[js.Array[EventReminder]] = js.native
      
      var deleted: js.UndefOr[Boolean] = js.native
      
      var description: js.UndefOr[String] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var foregroundColor: js.UndefOr[String] = js.native
      
      var hidden: js.UndefOr[Boolean] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var location: js.UndefOr[String] = js.native
      
      var notificationSettings: js.UndefOr[CalendarListEntryNotificationSettings] = js.native
      
      var primary: js.UndefOr[Boolean] = js.native
      
      var selected: js.UndefOr[Boolean] = js.native
      
      var summary: js.UndefOr[String] = js.native
      
      var summaryOverride: js.UndefOr[String] = js.native
      
      var timeZone: js.UndefOr[String] = js.native
    }
    object CalendarListEntry {
      
      @scala.inline
      def apply(): CalendarListEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CalendarListEntry]
      }
      
      @scala.inline
      implicit class CalendarListEntryMutableBuilder[Self <: CalendarListEntry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessRole(value: String): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccessRoleUndefined: Self = StObject.set(x, "accessRole", js.undefined)
        
        @scala.inline
        def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        @scala.inline
        def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
        
        @scala.inline
        def setConferenceProperties(value: ConferenceProperties): Self = StObject.set(x, "conferenceProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConferencePropertiesUndefined: Self = StObject.set(x, "conferenceProperties", js.undefined)
        
        @scala.inline
        def setDefaultReminders(value: js.Array[EventReminder]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultRemindersUndefined: Self = StObject.set(x, "defaultReminders", js.undefined)
        
        @scala.inline
        def setDefaultRemindersVarargs(value: EventReminder*): Self = StObject.set(x, "defaultReminders", js.Array(value :_*))
        
        @scala.inline
        def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
        
        @scala.inline
        def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setNotificationSettings(value: CalendarListEntryNotificationSettings): Self = StObject.set(x, "notificationSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotificationSettingsUndefined: Self = StObject.set(x, "notificationSettings", js.undefined)
        
        @scala.inline
        def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
        
        @scala.inline
        def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
        
        @scala.inline
        def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummaryOverride(value: String): Self = StObject.set(x, "summaryOverride", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummaryOverrideUndefined: Self = StObject.set(x, "summaryOverride", js.undefined)
        
        @scala.inline
        def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        @scala.inline
        def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      }
    }
    
    @js.native
    trait CalendarListEntryNotificationSettings extends StObject {
      
      var notifications: js.UndefOr[js.Array[CalendarNotification]] = js.native
    }
    object CalendarListEntryNotificationSettings {
      
      @scala.inline
      def apply(): CalendarListEntryNotificationSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CalendarListEntryNotificationSettings]
      }
      
      @scala.inline
      implicit class CalendarListEntryNotificationSettingsMutableBuilder[Self <: CalendarListEntryNotificationSettings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setNotifications(value: js.Array[CalendarNotification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
        
        @scala.inline
        def setNotificationsVarargs(value: CalendarNotification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      }
    }
    
    @js.native
    trait CalendarNotification extends StObject {
      
      var method: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object CalendarNotification {
      
      @scala.inline
      def apply(): CalendarNotification = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CalendarNotification]
      }
      
      @scala.inline
      implicit class CalendarNotificationMutableBuilder[Self <: CalendarNotification] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Channel extends StObject {
      
      var address: js.UndefOr[String] = js.native
      
      var expiration: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var params: js.UndefOr[js.Object] = js.native
      
      var payload: js.UndefOr[Boolean] = js.native
      
      var resourceId: js.UndefOr[String] = js.native
      
      var resourceUri: js.UndefOr[String] = js.native
      
      var token: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object Channel {
      
      @scala.inline
      def apply(): Channel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Channel]
      }
      
      @scala.inline
      implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        @scala.inline
        def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        @scala.inline
        def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        @scala.inline
        def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
        
        @scala.inline
        def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
        
        @scala.inline
        def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait ColorDefinition extends StObject {
      
      var background: js.UndefOr[String] = js.native
      
      var foreground: js.UndefOr[String] = js.native
    }
    object ColorDefinition {
      
      @scala.inline
      def apply(): ColorDefinition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ColorDefinition]
      }
      
      @scala.inline
      implicit class ColorDefinitionMutableBuilder[Self <: ColorDefinition] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
        
        @scala.inline
        def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      }
    }
    
    @js.native
    trait Colors extends StObject {
      
      var calendar: js.UndefOr[js.Object] = js.native
      
      var event: js.UndefOr[js.Object] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var updated: js.UndefOr[String] = js.native
    }
    object Colors {
      
      @scala.inline
      def apply(): Colors = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Colors]
      }
      
      @scala.inline
      implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCalendar(value: js.Object): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
        
        @scala.inline
        def setEvent(value: js.Object): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      }
    }
    
    @js.native
    trait ConferenceData extends StObject {
      
      var conferenceId: js.UndefOr[String] = js.native
      
      var conferenceSolution: js.UndefOr[ConferenceSolution] = js.native
      
      var createRequest: js.UndefOr[CreateConferenceRequest] = js.native
      
      var entryPoints: js.UndefOr[js.Array[EntryPoint]] = js.native
      
      var notes: js.UndefOr[String] = js.native
      
      var parameters: js.UndefOr[ConferenceParameters] = js.native
      
      var signature: js.UndefOr[String] = js.native
    }
    object ConferenceData {
      
      @scala.inline
      def apply(): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData]
      }
      
      @scala.inline
      implicit class ConferenceDataMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConferenceId(value: String): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConferenceIdUndefined: Self = StObject.set(x, "conferenceId", js.undefined)
        
        @scala.inline
        def setConferenceSolution(value: ConferenceSolution): Self = StObject.set(x, "conferenceSolution", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConferenceSolutionUndefined: Self = StObject.set(x, "conferenceSolution", js.undefined)
        
        @scala.inline
        def setCreateRequest(value: CreateConferenceRequest): Self = StObject.set(x, "createRequest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreateRequestUndefined: Self = StObject.set(x, "createRequest", js.undefined)
        
        @scala.inline
        def setEntryPoints(value: js.Array[EntryPoint]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
        
        @scala.inline
        def setEntryPointsVarargs(value: EntryPoint*): Self = StObject.set(x, "entryPoints", js.Array(value :_*))
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setParameters(value: ConferenceParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
        
        @scala.inline
        def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      }
    }
    
    @js.native
    trait ConferenceParameters extends StObject {
      
      var addOnParameters: js.UndefOr[ConferenceParametersAddOnParameters] = js.native
    }
    object ConferenceParameters {
      
      @scala.inline
      def apply(): ConferenceParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceParameters]
      }
      
      @scala.inline
      implicit class ConferenceParametersMutableBuilder[Self <: ConferenceParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAddOnParameters(value: ConferenceParametersAddOnParameters): Self = StObject.set(x, "addOnParameters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAddOnParametersUndefined: Self = StObject.set(x, "addOnParameters", js.undefined)
      }
    }
    
    @js.native
    trait ConferenceParametersAddOnParameters extends StObject {
      
      var parameters: js.UndefOr[Record[String, String]] = js.native
    }
    object ConferenceParametersAddOnParameters {
      
      @scala.inline
      def apply(): ConferenceParametersAddOnParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceParametersAddOnParameters]
      }
      
      @scala.inline
      implicit class ConferenceParametersAddOnParametersMutableBuilder[Self <: ConferenceParametersAddOnParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      }
    }
    
    @js.native
    trait ConferenceProperties extends StObject {
      
      var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String]] = js.native
    }
    object ConferenceProperties {
      
      @scala.inline
      def apply(): ConferenceProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceProperties]
      }
      
      @scala.inline
      implicit class ConferencePropertiesMutableBuilder[Self <: ConferenceProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAllowedConferenceSolutionTypes(value: js.Array[String]): Self = StObject.set(x, "allowedConferenceSolutionTypes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAllowedConferenceSolutionTypesUndefined: Self = StObject.set(x, "allowedConferenceSolutionTypes", js.undefined)
        
        @scala.inline
        def setAllowedConferenceSolutionTypesVarargs(value: String*): Self = StObject.set(x, "allowedConferenceSolutionTypes", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ConferenceRequestStatus extends StObject {
      
      var statusCode: js.UndefOr[String] = js.native
    }
    object ConferenceRequestStatus {
      
      @scala.inline
      def apply(): ConferenceRequestStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceRequestStatus]
      }
      
      @scala.inline
      implicit class ConferenceRequestStatusMutableBuilder[Self <: ConferenceRequestStatus] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      }
    }
    
    @js.native
    trait ConferenceSolution extends StObject {
      
      var iconUri: js.UndefOr[String] = js.native
      
      var key: js.UndefOr[ConferenceSolutionKey] = js.native
      
      var name: js.UndefOr[String] = js.native
    }
    object ConferenceSolution {
      
      @scala.inline
      def apply(): ConferenceSolution = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceSolution]
      }
      
      @scala.inline
      implicit class ConferenceSolutionMutableBuilder[Self <: ConferenceSolution] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconUriUndefined: Self = StObject.set(x, "iconUri", js.undefined)
        
        @scala.inline
        def setKey(value: ConferenceSolutionKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait ConferenceSolutionKey extends StObject {
      
      var `type`: js.UndefOr[String] = js.native
    }
    object ConferenceSolutionKey {
      
      @scala.inline
      def apply(): ConferenceSolutionKey = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceSolutionKey]
      }
      
      @scala.inline
      implicit class ConferenceSolutionKeyMutableBuilder[Self <: ConferenceSolutionKey] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait CreateConferenceRequest extends StObject {
      
      var conferenceSolutionKey: js.UndefOr[ConferenceSolutionKey] = js.native
      
      var requestId: js.UndefOr[String] = js.native
      
      var status: js.UndefOr[ConferenceRequestStatus] = js.native
    }
    object CreateConferenceRequest {
      
      @scala.inline
      def apply(): CreateConferenceRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateConferenceRequest]
      }
      
      @scala.inline
      implicit class CreateConferenceRequestMutableBuilder[Self <: CreateConferenceRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConferenceSolutionKey(value: ConferenceSolutionKey): Self = StObject.set(x, "conferenceSolutionKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConferenceSolutionKeyUndefined: Self = StObject.set(x, "conferenceSolutionKey", js.undefined)
        
        @scala.inline
        def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
        
        @scala.inline
        def setStatus(value: ConferenceRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    @js.native
    trait EntryPoint extends StObject {
      
      var accessCode: js.UndefOr[String] = js.native
      
      var entryPointFeatures: js.UndefOr[js.Array[String]] = js.native
      
      var entryPointType: js.UndefOr[String] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var meetingCode: js.UndefOr[String] = js.native
      
      var passcode: js.UndefOr[String] = js.native
      
      var password: js.UndefOr[String] = js.native
      
      var pin: js.UndefOr[String] = js.native
      
      var regionCode: js.UndefOr[String] = js.native
      
      var uri: js.UndefOr[String] = js.native
    }
    object EntryPoint {
      
      @scala.inline
      def apply(): EntryPoint = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EntryPoint]
      }
      
      @scala.inline
      implicit class EntryPointMutableBuilder[Self <: EntryPoint] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessCode(value: String): Self = StObject.set(x, "accessCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccessCodeUndefined: Self = StObject.set(x, "accessCode", js.undefined)
        
        @scala.inline
        def setEntryPointFeatures(value: js.Array[String]): Self = StObject.set(x, "entryPointFeatures", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntryPointFeaturesUndefined: Self = StObject.set(x, "entryPointFeatures", js.undefined)
        
        @scala.inline
        def setEntryPointFeaturesVarargs(value: String*): Self = StObject.set(x, "entryPointFeatures", js.Array(value :_*))
        
        @scala.inline
        def setEntryPointType(value: String): Self = StObject.set(x, "entryPointType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntryPointTypeUndefined: Self = StObject.set(x, "entryPointType", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setMeetingCode(value: String): Self = StObject.set(x, "meetingCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMeetingCodeUndefined: Self = StObject.set(x, "meetingCode", js.undefined)
        
        @scala.inline
        def setPasscode(value: String): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasscodeUndefined: Self = StObject.set(x, "passcode", js.undefined)
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        @scala.inline
        def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
        
        @scala.inline
        def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
        
        @scala.inline
        def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      }
    }
    
    @js.native
    trait Error extends StObject {
      
      var domain: js.UndefOr[String] = js.native
      
      var reason: js.UndefOr[String] = js.native
    }
    object Error {
      
      @scala.inline
      def apply(): Error = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Error]
      }
      
      @scala.inline
      implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      }
    }
    
    @js.native
    trait Event extends StObject {
      
      var anyoneCanAddSelf: js.UndefOr[Boolean] = js.native
      
      var attachments: js.UndefOr[js.Array[EventAttachment]] = js.native
      
      var attendees: js.UndefOr[js.Array[EventAttendee]] = js.native
      
      var attendeesOmitted: js.UndefOr[Boolean] = js.native
      
      var colorId: js.UndefOr[String] = js.native
      
      var conferenceData: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData] = js.native
      
      var created: js.UndefOr[String] = js.native
      
      var creator: js.UndefOr[EventCreator] = js.native
      
      var description: js.UndefOr[String] = js.native
      
      var end: js.UndefOr[EventDateTime] = js.native
      
      var endTimeUnspecified: js.UndefOr[Boolean] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var extendedProperties: js.UndefOr[EventExtendedProperties] = js.native
      
      var gadget: js.UndefOr[EventGadget] = js.native
      
      var guestsCanInviteOthers: js.UndefOr[Boolean] = js.native
      
      var guestsCanModify: js.UndefOr[Boolean] = js.native
      
      var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.native
      
      var hangoutLink: js.UndefOr[String] = js.native
      
      var htmlLink: js.UndefOr[String] = js.native
      
      var iCalUID: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var location: js.UndefOr[String] = js.native
      
      var locked: js.UndefOr[Boolean] = js.native
      
      var organizer: js.UndefOr[EventOrganizer] = js.native
      
      var originalStartTime: js.UndefOr[EventDateTime] = js.native
      
      var privateCopy: js.UndefOr[Boolean] = js.native
      
      var recurrence: js.UndefOr[js.Array[String]] = js.native
      
      var recurringEventId: js.UndefOr[String] = js.native
      
      var reminders: js.UndefOr[EventReminders] = js.native
      
      var sequence: js.UndefOr[Double] = js.native
      
      var source: js.UndefOr[EventSource] = js.native
      
      var start: js.UndefOr[EventDateTime] = js.native
      
      var status: js.UndefOr[String] = js.native
      
      var summary: js.UndefOr[String] = js.native
      
      var transparency: js.UndefOr[String] = js.native
      
      var updated: js.UndefOr[String] = js.native
      
      var visibility: js.UndefOr[String] = js.native
    }
    object Event {
      
      @scala.inline
      def apply(): Event = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Event]
      }
      
      @scala.inline
      implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnyoneCanAddSelf(value: Boolean): Self = StObject.set(x, "anyoneCanAddSelf", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAnyoneCanAddSelfUndefined: Self = StObject.set(x, "anyoneCanAddSelf", js.undefined)
        
        @scala.inline
        def setAttachments(value: js.Array[EventAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
        
        @scala.inline
        def setAttachmentsVarargs(value: EventAttachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
        
        @scala.inline
        def setAttendees(value: js.Array[EventAttendee]): Self = StObject.set(x, "attendees", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttendeesOmitted(value: Boolean): Self = StObject.set(x, "attendeesOmitted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttendeesOmittedUndefined: Self = StObject.set(x, "attendeesOmitted", js.undefined)
        
        @scala.inline
        def setAttendeesUndefined: Self = StObject.set(x, "attendees", js.undefined)
        
        @scala.inline
        def setAttendeesVarargs(value: EventAttendee*): Self = StObject.set(x, "attendees", js.Array(value :_*))
        
        @scala.inline
        def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
        
        @scala.inline
        def setConferenceData(value: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData): Self = StObject.set(x, "conferenceData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConferenceDataUndefined: Self = StObject.set(x, "conferenceData", js.undefined)
        
        @scala.inline
        def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
        
        @scala.inline
        def setCreator(value: EventCreator): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEnd(value: EventDateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndTimeUnspecified(value: Boolean): Self = StObject.set(x, "endTimeUnspecified", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndTimeUnspecifiedUndefined: Self = StObject.set(x, "endTimeUnspecified", js.undefined)
        
        @scala.inline
        def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setExtendedProperties(value: EventExtendedProperties): Self = StObject.set(x, "extendedProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExtendedPropertiesUndefined: Self = StObject.set(x, "extendedProperties", js.undefined)
        
        @scala.inline
        def setGadget(value: EventGadget): Self = StObject.set(x, "gadget", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGadgetUndefined: Self = StObject.set(x, "gadget", js.undefined)
        
        @scala.inline
        def setGuestsCanInviteOthers(value: Boolean): Self = StObject.set(x, "guestsCanInviteOthers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuestsCanInviteOthersUndefined: Self = StObject.set(x, "guestsCanInviteOthers", js.undefined)
        
        @scala.inline
        def setGuestsCanModify(value: Boolean): Self = StObject.set(x, "guestsCanModify", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuestsCanModifyUndefined: Self = StObject.set(x, "guestsCanModify", js.undefined)
        
        @scala.inline
        def setGuestsCanSeeOtherGuests(value: Boolean): Self = StObject.set(x, "guestsCanSeeOtherGuests", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGuestsCanSeeOtherGuestsUndefined: Self = StObject.set(x, "guestsCanSeeOtherGuests", js.undefined)
        
        @scala.inline
        def setHangoutLink(value: String): Self = StObject.set(x, "hangoutLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHangoutLinkUndefined: Self = StObject.set(x, "hangoutLink", js.undefined)
        
        @scala.inline
        def setHtmlLink(value: String): Self = StObject.set(x, "htmlLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHtmlLinkUndefined: Self = StObject.set(x, "htmlLink", js.undefined)
        
        @scala.inline
        def setICalUID(value: String): Self = StObject.set(x, "iCalUID", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setICalUIDUndefined: Self = StObject.set(x, "iCalUID", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        @scala.inline
        def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
        
        @scala.inline
        def setOrganizer(value: EventOrganizer): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
        
        @scala.inline
        def setOriginalStartTime(value: EventDateTime): Self = StObject.set(x, "originalStartTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOriginalStartTimeUndefined: Self = StObject.set(x, "originalStartTime", js.undefined)
        
        @scala.inline
        def setPrivateCopy(value: Boolean): Self = StObject.set(x, "privateCopy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrivateCopyUndefined: Self = StObject.set(x, "privateCopy", js.undefined)
        
        @scala.inline
        def setRecurrence(value: js.Array[String]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
        
        @scala.inline
        def setRecurrenceVarargs(value: String*): Self = StObject.set(x, "recurrence", js.Array(value :_*))
        
        @scala.inline
        def setRecurringEventId(value: String): Self = StObject.set(x, "recurringEventId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRecurringEventIdUndefined: Self = StObject.set(x, "recurringEventId", js.undefined)
        
        @scala.inline
        def setReminders(value: EventReminders): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
        
        @scala.inline
        def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
        
        @scala.inline
        def setSource(value: EventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        @scala.inline
        def setStart(value: EventDateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        @scala.inline
        def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        @scala.inline
        def setTransparency(value: String): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
        
        @scala.inline
        def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
        
        @scala.inline
        def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      }
    }
    
    @js.native
    trait EventAttachment extends StObject {
      
      var fileId: js.UndefOr[String] = js.native
      
      var fileUrl: js.UndefOr[String] = js.native
      
      var iconLink: js.UndefOr[String] = js.native
      
      var mimeType: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
    }
    object EventAttachment {
      
      @scala.inline
      def apply(): EventAttachment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventAttachment]
      }
      
      @scala.inline
      implicit class EventAttachmentMutableBuilder[Self <: EventAttachment] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
        
        @scala.inline
        def setFileUrl(value: String): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileUrlUndefined: Self = StObject.set(x, "fileUrl", js.undefined)
        
        @scala.inline
        def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconLinkUndefined: Self = StObject.set(x, "iconLink", js.undefined)
        
        @scala.inline
        def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait EventAttendee extends StObject {
      
      var additionalGuests: js.UndefOr[Double] = js.native
      
      var comment: js.UndefOr[String] = js.native
      
      var displayName: js.UndefOr[String] = js.native
      
      var email: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var optional: js.UndefOr[Boolean] = js.native
      
      var organizer: js.UndefOr[Boolean] = js.native
      
      var resource: js.UndefOr[Boolean] = js.native
      
      var responseStatus: js.UndefOr[String] = js.native
      
      var self: js.UndefOr[Boolean] = js.native
    }
    object EventAttendee {
      
      @scala.inline
      def apply(): EventAttendee = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventAttendee]
      }
      
      @scala.inline
      implicit class EventAttendeeMutableBuilder[Self <: EventAttendee] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAdditionalGuests(value: Double): Self = StObject.set(x, "additionalGuests", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAdditionalGuestsUndefined: Self = StObject.set(x, "additionalGuests", js.undefined)
        
        @scala.inline
        def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
        
        @scala.inline
        def setOrganizer(value: Boolean): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
        
        @scala.inline
        def setResource(value: Boolean): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        @scala.inline
        def setResponseStatus(value: String): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
        
        @scala.inline
        def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
      }
    }
    
    @js.native
    trait EventCreator extends StObject {
      
      var displayName: js.UndefOr[String] = js.native
      
      var email: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var self: js.UndefOr[Boolean] = js.native
    }
    object EventCreator {
      
      @scala.inline
      def apply(): EventCreator = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventCreator]
      }
      
      @scala.inline
      implicit class EventCreatorMutableBuilder[Self <: EventCreator] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
      }
    }
    
    @js.native
    trait EventDateTime extends StObject {
      
      var date: js.UndefOr[String] = js.native
      
      var dateTime: js.UndefOr[String] = js.native
      
      var timeZone: js.UndefOr[String] = js.native
    }
    object EventDateTime {
      
      @scala.inline
      def apply(): EventDateTime = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventDateTime]
      }
      
      @scala.inline
      implicit class EventDateTimeMutableBuilder[Self <: EventDateTime] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
        
        @scala.inline
        def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        @scala.inline
        def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      }
    }
    
    @js.native
    trait EventExtendedProperties extends StObject {
      
      var `private`: js.UndefOr[Record[String, String]] = js.native
      
      var shared: js.UndefOr[Record[String, String]] = js.native
    }
    object EventExtendedProperties {
      
      @scala.inline
      def apply(): EventExtendedProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventExtendedProperties]
      }
      
      @scala.inline
      implicit class EventExtendedPropertiesMutableBuilder[Self <: EventExtendedProperties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPrivate(value: Record[String, String]): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
        
        @scala.inline
        def setShared(value: Record[String, String]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      }
    }
    
    @js.native
    trait EventGadget extends StObject {
      
      var display: js.UndefOr[String] = js.native
      
      var height: js.UndefOr[Double] = js.native
      
      var iconLink: js.UndefOr[String] = js.native
      
      var link: js.UndefOr[String] = js.native
      
      var preferences: js.UndefOr[js.Object] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
      
      var width: js.UndefOr[Double] = js.native
    }
    object EventGadget {
      
      @scala.inline
      def apply(): EventGadget = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventGadget]
      }
      
      @scala.inline
      implicit class EventGadgetMutableBuilder[Self <: EventGadget] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconLinkUndefined: Self = StObject.set(x, "iconLink", js.undefined)
        
        @scala.inline
        def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setPreferences(value: js.Object): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreferencesUndefined: Self = StObject.set(x, "preferences", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    @js.native
    trait EventOrganizer extends StObject {
      
      var displayName: js.UndefOr[String] = js.native
      
      var email: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var self: js.UndefOr[Boolean] = js.native
    }
    object EventOrganizer {
      
      @scala.inline
      def apply(): EventOrganizer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventOrganizer]
      }
      
      @scala.inline
      implicit class EventOrganizerMutableBuilder[Self <: EventOrganizer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        @scala.inline
        def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
      }
    }
    
    @js.native
    trait EventReminder extends StObject {
      
      var method: js.UndefOr[String] = js.native
      
      var minutes: js.UndefOr[Double] = js.native
    }
    object EventReminder {
      
      @scala.inline
      def apply(): EventReminder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventReminder]
      }
      
      @scala.inline
      implicit class EventReminderMutableBuilder[Self <: EventReminder] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      }
    }
    
    @js.native
    trait EventReminders extends StObject {
      
      var overrides: js.UndefOr[js.Array[EventReminder]] = js.native
      
      var useDefault: js.UndefOr[Boolean] = js.native
    }
    object EventReminders {
      
      @scala.inline
      def apply(): EventReminders = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventReminders]
      }
      
      @scala.inline
      implicit class EventRemindersMutableBuilder[Self <: EventReminders] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOverrides(value: js.Array[EventReminder]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
        
        @scala.inline
        def setOverridesVarargs(value: EventReminder*): Self = StObject.set(x, "overrides", js.Array(value :_*))
        
        @scala.inline
        def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
      }
    }
    
    @js.native
    trait EventSource extends StObject {
      
      var title: js.UndefOr[String] = js.native
      
      var url: js.UndefOr[String] = js.native
    }
    object EventSource {
      
      @scala.inline
      def apply(): EventSource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventSource]
      }
      
      @scala.inline
      implicit class EventSourceMutableBuilder[Self <: EventSource] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    @js.native
    trait Events extends StObject {
      
      var accessRole: js.UndefOr[String] = js.native
      
      var defaultReminders: js.UndefOr[js.Array[EventReminder]] = js.native
      
      var description: js.UndefOr[String] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[Event]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var nextSyncToken: js.UndefOr[String] = js.native
      
      var summary: js.UndefOr[String] = js.native
      
      var timeZone: js.UndefOr[String] = js.native
      
      var updated: js.UndefOr[String] = js.native
    }
    object Events {
      
      @scala.inline
      def apply(): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events]
      }
      
      @scala.inline
      implicit class EventsMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccessRole(value: String): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAccessRoleUndefined: Self = StObject.set(x, "accessRole", js.undefined)
        
        @scala.inline
        def setDefaultReminders(value: js.Array[EventReminder]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDefaultRemindersUndefined: Self = StObject.set(x, "defaultReminders", js.undefined)
        
        @scala.inline
        def setDefaultRemindersVarargs(value: EventReminder*): Self = StObject.set(x, "defaultReminders", js.Array(value :_*))
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[Event]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: Event*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
        
        @scala.inline
        def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        @scala.inline
        def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
        
        @scala.inline
        def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      }
    }
    
    @js.native
    trait FreeBusyCalendar extends StObject {
      
      var busy: js.UndefOr[js.Array[TimePeriod]] = js.native
      
      var errors: js.UndefOr[js.Array[Error]] = js.native
    }
    object FreeBusyCalendar {
      
      @scala.inline
      def apply(): FreeBusyCalendar = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FreeBusyCalendar]
      }
      
      @scala.inline
      implicit class FreeBusyCalendarMutableBuilder[Self <: FreeBusyCalendar] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBusy(value: js.Array[TimePeriod]): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
        
        @scala.inline
        def setBusyVarargs(value: TimePeriod*): Self = StObject.set(x, "busy", js.Array(value :_*))
        
        @scala.inline
        def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
      }
    }
    
    @js.native
    trait FreeBusyGroup extends StObject {
      
      var calendars: js.UndefOr[js.Array[String]] = js.native
      
      var errors: js.UndefOr[js.Array[Error]] = js.native
    }
    object FreeBusyGroup {
      
      @scala.inline
      def apply(): FreeBusyGroup = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FreeBusyGroup]
      }
      
      @scala.inline
      implicit class FreeBusyGroupMutableBuilder[Self <: FreeBusyGroup] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCalendars(value: js.Array[String]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
        
        @scala.inline
        def setCalendarsVarargs(value: String*): Self = StObject.set(x, "calendars", js.Array(value :_*))
        
        @scala.inline
        def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value :_*))
      }
    }
    
    @js.native
    trait FreeBusyRequest extends StObject {
      
      var calendarExpansionMax: js.UndefOr[Double] = js.native
      
      var groupExpansionMax: js.UndefOr[Double] = js.native
      
      var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.native
      
      var timeMax: js.UndefOr[String] = js.native
      
      var timeMin: js.UndefOr[String] = js.native
      
      var timeZone: js.UndefOr[String] = js.native
    }
    object FreeBusyRequest {
      
      @scala.inline
      def apply(): FreeBusyRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FreeBusyRequest]
      }
      
      @scala.inline
      implicit class FreeBusyRequestMutableBuilder[Self <: FreeBusyRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCalendarExpansionMax(value: Double): Self = StObject.set(x, "calendarExpansionMax", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCalendarExpansionMaxUndefined: Self = StObject.set(x, "calendarExpansionMax", js.undefined)
        
        @scala.inline
        def setGroupExpansionMax(value: Double): Self = StObject.set(x, "groupExpansionMax", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupExpansionMaxUndefined: Self = StObject.set(x, "groupExpansionMax", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[FreeBusyRequestItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: FreeBusyRequestItem*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
        
        @scala.inline
        def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
        
        @scala.inline
        def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      }
    }
    
    @js.native
    trait FreeBusyRequestItem extends StObject {
      
      var id: js.UndefOr[String] = js.native
    }
    object FreeBusyRequestItem {
      
      @scala.inline
      def apply(): FreeBusyRequestItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FreeBusyRequestItem]
      }
      
      @scala.inline
      implicit class FreeBusyRequestItemMutableBuilder[Self <: FreeBusyRequestItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    @js.native
    trait FreeBusyResponse extends StObject {
      
      var calendars: js.UndefOr[js.Object] = js.native
      
      var groups: js.UndefOr[js.Object] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var timeMax: js.UndefOr[String] = js.native
      
      var timeMin: js.UndefOr[String] = js.native
    }
    object FreeBusyResponse {
      
      @scala.inline
      def apply(): FreeBusyResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FreeBusyResponse]
      }
      
      @scala.inline
      implicit class FreeBusyResponseMutableBuilder[Self <: FreeBusyResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCalendars(value: js.Object): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
        
        @scala.inline
        def setGroups(value: js.Object): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
        
        @scala.inline
        def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
      }
    }
    
    @js.native
    trait Setting extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var value: js.UndefOr[String] = js.native
    }
    object Setting {
      
      @scala.inline
      def apply(): Setting = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Setting]
      }
      
      @scala.inline
      implicit class SettingMutableBuilder[Self <: Setting] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    @js.native
    trait Settings extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[Setting]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
      
      var nextSyncToken: js.UndefOr[String] = js.native
    }
    object Settings {
      
      @scala.inline
      def apply(): Settings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Settings]
      }
      
      @scala.inline
      implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[Setting]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: Setting*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        @scala.inline
        def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
      }
    }
    
    @js.native
    trait TimePeriod extends StObject {
      
      var end: js.UndefOr[String] = js.native
      
      var start: js.UndefOr[String] = js.native
    }
    object TimePeriod {
      
      @scala.inline
      def apply(): TimePeriod = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimePeriod]
      }
      
      @scala.inline
      implicit class TimePeriodMutableBuilder[Self <: TimePeriod] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        @scala.inline
        def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
  }
}

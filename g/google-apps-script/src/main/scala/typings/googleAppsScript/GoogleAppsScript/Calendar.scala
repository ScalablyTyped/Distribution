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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calendar extends StObject {
  
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
  def newCalendar(): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar
  
  // Create a new instance of CalendarListEntry
  def newCalendarListEntry(): CalendarListEntry
  
  // Create a new instance of CalendarListEntryNotificationSettings
  def newCalendarListEntryNotificationSettings(): CalendarListEntryNotificationSettings
  
  // Create a new instance of CalendarNotification
  def newCalendarNotification(): CalendarNotification
  
  // Create a new instance of Channel
  def newChannel(): Channel
  
  // Create a new instance of ConferenceData
  def newConferenceData(): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData
  
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
  
  inline def apply(
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
    sealed trait BLUE
      extends StObject
         with Color
    
    @js.native
    sealed trait BROWN
      extends StObject
         with Color
    
    @js.native
    sealed trait CHARCOAL
      extends StObject
         with Color
    
    @js.native
    sealed trait CHESTNUT
      extends StObject
         with Color
    
    @js.native
    sealed trait GRAY
      extends StObject
         with Color
    
    @js.native
    sealed trait GREEN
      extends StObject
         with Color
    
    @js.native
    sealed trait INDIGO
      extends StObject
         with Color
    
    @js.native
    sealed trait LIME
      extends StObject
         with Color
    
    @js.native
    sealed trait MUSTARD
      extends StObject
         with Color
    
    @js.native
    sealed trait OLIVE
      extends StObject
         with Color
    
    @js.native
    sealed trait ORANGE
      extends StObject
         with Color
    
    @js.native
    sealed trait PINK
      extends StObject
         with Color
    
    @js.native
    sealed trait PLUM
      extends StObject
         with Color
    
    @js.native
    sealed trait PURPLE
      extends StObject
         with Color
    
    @js.native
    sealed trait RED
      extends StObject
         with Color
    
    @js.native
    sealed trait RED_ORANGE
      extends StObject
         with Color
    
    @js.native
    sealed trait SEA_BLUE
      extends StObject
         with Color
    
    @js.native
    sealed trait SLATE
      extends StObject
         with Color
    
    @js.native
    sealed trait TEAL
      extends StObject
         with Color
    
    @js.native
    sealed trait TURQOISE
      extends StObject
         with Color
    
    @js.native
    sealed trait YELLOW
      extends StObject
         with Color
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
    sealed trait BLUE
      extends StObject
         with EventColor
    
    @js.native
    sealed trait CYAN
      extends StObject
         with EventColor
    
    @js.native
    sealed trait GRAY
      extends StObject
         with EventColor
    
    @js.native
    sealed trait GREEN
      extends StObject
         with EventColor
    
    @js.native
    sealed trait MAUVE
      extends StObject
         with EventColor
    
    @js.native
    sealed trait ORANGE
      extends StObject
         with EventColor
    
    @js.native
    sealed trait PALE_BLUE
      extends StObject
         with EventColor
    
    @js.native
    sealed trait PALE_GREEN
      extends StObject
         with EventColor
    
    @js.native
    sealed trait PALE_RED
      extends StObject
         with EventColor
    
    @js.native
    sealed trait RED
      extends StObject
         with EventColor
    
    @js.native
    sealed trait YELLOW
      extends StObject
         with EventColor
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
    sealed trait INVITED
      extends StObject
         with GuestStatus
    
    @js.native
    sealed trait MAYBE
      extends StObject
         with GuestStatus
    
    @js.native
    sealed trait NO
      extends StObject
         with GuestStatus
    
    @js.native
    sealed trait OWNER
      extends StObject
         with GuestStatus
    
    @js.native
    sealed trait YES
      extends StObject
         with GuestStatus
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
    sealed trait CONFIDENTIAL
      extends StObject
         with Visibility
    
    @js.native
    sealed trait DEFAULT
      extends StObject
         with Visibility
    
    @js.native
    sealed trait PRIVATE
      extends StObject
         with Visibility
    
    @js.native
    sealed trait PUBLIC
      extends StObject
         with Visibility
  }
  
  /**
    * Represents a calendar that the user owns or is subscribed to.
    */
  @js.native
  trait Calendar extends StObject {
    
    def createAllDayEvent(title: String, date: Date): CalendarEvent = js.native
    def createAllDayEvent(title: String, date: Date, options: StringDictionary[Any]): CalendarEvent = js.native
    def createAllDayEvent(title: String, startDate: Date, endDate: Date): CalendarEvent = js.native
    def createAllDayEvent(title: String, startDate: Date, endDate: Date, options: StringDictionary[Any]): CalendarEvent = js.native
    
    def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
    def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence, options: StringDictionary[Any]): CalendarEventSeries = js.native
    
    def createEvent(title: String, startTime: Date, endTime: Date): CalendarEvent = js.native
    def createEvent(title: String, startTime: Date, endTime: Date, options: StringDictionary[Any]): CalendarEvent = js.native
    
    def createEventFromDescription(description: String): CalendarEvent = js.native
    
    def createEventSeries(title: String, startTime: Date, endTime: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
    def createEventSeries(
      title: String,
      startTime: Date,
      endTime: Date,
      recurrence: EventRecurrence,
      options: StringDictionary[Any]
    ): CalendarEventSeries = js.native
    
    def deleteCalendar(): Unit = js.native
    
    def getColor(): String = js.native
    
    def getDescription(): String = js.native
    
    def getEventById(iCalId: String): CalendarEvent = js.native
    
    def getEventSeriesById(iCalId: String): CalendarEventSeries = js.native
    
    def getEvents(startTime: Date, endTime: Date): js.Array[CalendarEvent] = js.native
    def getEvents(startTime: Date, endTime: Date, options: StringDictionary[Any]): js.Array[CalendarEvent] = js.native
    
    def getEventsForDay(date: Date): js.Array[CalendarEvent] = js.native
    def getEventsForDay(date: Date, options: StringDictionary[Any]): js.Array[CalendarEvent] = js.native
    
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
    
    var Color: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color */ Any = js.native
    
    var EventColor: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventColor */ Any = js.native
    
    var GuestStatus: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GuestStatus */ Any = js.native
    
    var Month: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Month */ Any = js.native
    
    var Visibility: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Visibility */ Any = js.native
    
    var Weekday: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Base.Weekday */ Any = js.native
    
    def createAllDayEvent(title: String, date: Date): CalendarEvent = js.native
    def createAllDayEvent(title: String, date: Date, options: StringDictionary[Any]): CalendarEvent = js.native
    def createAllDayEvent(title: String, startDate: Date, endDate: Date): CalendarEvent = js.native
    def createAllDayEvent(title: String, startDate: Date, endDate: Date, options: StringDictionary[Any]): CalendarEvent = js.native
    
    def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
    def createAllDayEventSeries(title: String, startDate: Date, recurrence: EventRecurrence, options: StringDictionary[Any]): CalendarEventSeries = js.native
    
    def createCalendar(name: String): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    def createCalendar(name: String, options: StringDictionary[Any]): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
    
    def createEvent(title: String, startTime: Date, endTime: Date): CalendarEvent = js.native
    def createEvent(title: String, startTime: Date, endTime: Date, options: StringDictionary[Any]): CalendarEvent = js.native
    
    def createEventFromDescription(description: String): CalendarEvent = js.native
    
    def createEventSeries(title: String, startTime: Date, endTime: Date, recurrence: EventRecurrence): CalendarEventSeries = js.native
    def createEventSeries(
      title: String,
      startTime: Date,
      endTime: Date,
      recurrence: EventRecurrence,
      options: StringDictionary[Any]
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
    def getEvents(startTime: Date, endTime: Date, options: StringDictionary[Any]): js.Array[CalendarEvent] = js.native
    
    def getEventsForDay(date: Date): js.Array[CalendarEvent] = js.native
    def getEventsForDay(date: Date, options: StringDictionary[Any]): js.Array[CalendarEvent] = js.native
    
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
    def subscribeToCalendar(id: String, options: StringDictionary[Any]): typings.googleAppsScript.GoogleAppsScript.Calendar.Calendar = js.native
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
  trait EventGuest extends StObject {
    
    def getAdditionalGuests(): Integer
    
    def getEmail(): String
    
    def getGuestStatus(): GuestStatus
    
    def getName(): String
    
    /** @deprecated DO NOT USE */ def getStatus(): String
  }
  object EventGuest {
    
    inline def apply(
      getAdditionalGuests: () => Integer,
      getEmail: () => String,
      getGuestStatus: () => GuestStatus,
      getName: () => String,
      getStatus: () => String
    ): EventGuest = {
      val __obj = js.Dynamic.literal(getAdditionalGuests = js.Any.fromFunction0(getAdditionalGuests), getEmail = js.Any.fromFunction0(getEmail), getGuestStatus = js.Any.fromFunction0(getGuestStatus), getName = js.Any.fromFunction0(getName), getStatus = js.Any.fromFunction0(getStatus))
      __obj.asInstanceOf[EventGuest]
    }
    
    extension [Self <: EventGuest](x: Self) {
      
      inline def setGetAdditionalGuests(value: () => Integer): Self = StObject.set(x, "getAdditionalGuests", js.Any.fromFunction0(value))
      
      inline def setGetEmail(value: () => String): Self = StObject.set(x, "getEmail", js.Any.fromFunction0(value))
      
      inline def setGetGuestStatus(value: () => GuestStatus): Self = StObject.set(x, "getGuestStatus", js.Any.fromFunction0(value))
      
      inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      inline def setGetStatus(value: () => String): Self = StObject.set(x, "getStatus", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Represents the recurrence settings for an event series.
    */
  trait EventRecurrence extends StObject {
    
    def addDailyExclusion(): RecurrenceRule
    
    def addDailyRule(): RecurrenceRule
    
    def addDate(date: Date): EventRecurrence
    
    def addDateExclusion(date: Date): EventRecurrence
    
    def addMonthlyExclusion(): RecurrenceRule
    
    def addMonthlyRule(): RecurrenceRule
    
    def addWeeklyExclusion(): RecurrenceRule
    
    def addWeeklyRule(): RecurrenceRule
    
    def addYearlyExclusion(): RecurrenceRule
    
    def addYearlyRule(): RecurrenceRule
    
    def setTimeZone(timeZone: String): EventRecurrence
  }
  object EventRecurrence {
    
    inline def apply(
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
    
    extension [Self <: EventRecurrence](x: Self) {
      
      inline def setAddDailyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addDailyExclusion", js.Any.fromFunction0(value))
      
      inline def setAddDailyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addDailyRule", js.Any.fromFunction0(value))
      
      inline def setAddDate(value: Date => EventRecurrence): Self = StObject.set(x, "addDate", js.Any.fromFunction1(value))
      
      inline def setAddDateExclusion(value: Date => EventRecurrence): Self = StObject.set(x, "addDateExclusion", js.Any.fromFunction1(value))
      
      inline def setAddMonthlyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addMonthlyExclusion", js.Any.fromFunction0(value))
      
      inline def setAddMonthlyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addMonthlyRule", js.Any.fromFunction0(value))
      
      inline def setAddWeeklyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addWeeklyExclusion", js.Any.fromFunction0(value))
      
      inline def setAddWeeklyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addWeeklyRule", js.Any.fromFunction0(value))
      
      inline def setAddYearlyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addYearlyExclusion", js.Any.fromFunction0(value))
      
      inline def setAddYearlyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addYearlyRule", js.Any.fromFunction0(value))
      
      inline def setSetTimeZone(value: String => EventRecurrence): Self = StObject.set(x, "setTimeZone", js.Any.fromFunction1(value))
    }
  }
  
  extension [Self <: typings.googleAppsScript.GoogleAppsScript.Calendar](x: Self) {
    
    inline def setAcl(value: AclCollection): Self = StObject.set(x, "Acl", value.asInstanceOf[js.Any])
    
    inline def setAclUndefined: Self = StObject.set(x, "Acl", js.undefined)
    
    inline def setCalendarList(value: CalendarListCollection): Self = StObject.set(x, "CalendarList", value.asInstanceOf[js.Any])
    
    inline def setCalendarListUndefined: Self = StObject.set(x, "CalendarList", js.undefined)
    
    inline def setCalendars(value: CalendarsCollection): Self = StObject.set(x, "Calendars", value.asInstanceOf[js.Any])
    
    inline def setCalendarsUndefined: Self = StObject.set(x, "Calendars", js.undefined)
    
    inline def setChannels(value: ChannelsCollection): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setColors(value: ColorsCollection): Self = StObject.set(x, "Colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "Colors", js.undefined)
    
    inline def setEvents(value: EventsCollection): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setFreebusy(value: FreebusyCollection): Self = StObject.set(x, "Freebusy", value.asInstanceOf[js.Any])
    
    inline def setFreebusyUndefined: Self = StObject.set(x, "Freebusy", js.undefined)
    
    inline def setNewAclRule(value: () => AclRule): Self = StObject.set(x, "newAclRule", js.Any.fromFunction0(value))
    
    inline def setNewAclRuleScope(value: () => AclRuleScope): Self = StObject.set(x, "newAclRuleScope", js.Any.fromFunction0(value))
    
    inline def setNewCalendar(value: () => typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar): Self = StObject.set(x, "newCalendar", js.Any.fromFunction0(value))
    
    inline def setNewCalendarListEntry(value: () => CalendarListEntry): Self = StObject.set(x, "newCalendarListEntry", js.Any.fromFunction0(value))
    
    inline def setNewCalendarListEntryNotificationSettings(value: () => CalendarListEntryNotificationSettings): Self = StObject.set(x, "newCalendarListEntryNotificationSettings", js.Any.fromFunction0(value))
    
    inline def setNewCalendarNotification(value: () => CalendarNotification): Self = StObject.set(x, "newCalendarNotification", js.Any.fromFunction0(value))
    
    inline def setNewChannel(value: () => Channel): Self = StObject.set(x, "newChannel", js.Any.fromFunction0(value))
    
    inline def setNewConferenceData(value: () => typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData): Self = StObject.set(x, "newConferenceData", js.Any.fromFunction0(value))
    
    inline def setNewConferenceParameters(value: () => ConferenceParameters): Self = StObject.set(x, "newConferenceParameters", js.Any.fromFunction0(value))
    
    inline def setNewConferenceParametersAddOnParameters(value: () => ConferenceParametersAddOnParameters): Self = StObject.set(x, "newConferenceParametersAddOnParameters", js.Any.fromFunction0(value))
    
    inline def setNewConferenceProperties(value: () => ConferenceProperties): Self = StObject.set(x, "newConferenceProperties", js.Any.fromFunction0(value))
    
    inline def setNewConferenceRequestStatus(value: () => ConferenceRequestStatus): Self = StObject.set(x, "newConferenceRequestStatus", js.Any.fromFunction0(value))
    
    inline def setNewConferenceSolution(value: () => ConferenceSolution): Self = StObject.set(x, "newConferenceSolution", js.Any.fromFunction0(value))
    
    inline def setNewConferenceSolutionKey(value: () => ConferenceSolutionKey): Self = StObject.set(x, "newConferenceSolutionKey", js.Any.fromFunction0(value))
    
    inline def setNewCreateConferenceRequest(value: () => CreateConferenceRequest): Self = StObject.set(x, "newCreateConferenceRequest", js.Any.fromFunction0(value))
    
    inline def setNewEntryPoint(value: () => EntryPoint): Self = StObject.set(x, "newEntryPoint", js.Any.fromFunction0(value))
    
    inline def setNewEvent(value: () => Event): Self = StObject.set(x, "newEvent", js.Any.fromFunction0(value))
    
    inline def setNewEventAttachment(value: () => EventAttachment): Self = StObject.set(x, "newEventAttachment", js.Any.fromFunction0(value))
    
    inline def setNewEventAttendee(value: () => EventAttendee): Self = StObject.set(x, "newEventAttendee", js.Any.fromFunction0(value))
    
    inline def setNewEventCreator(value: () => EventCreator): Self = StObject.set(x, "newEventCreator", js.Any.fromFunction0(value))
    
    inline def setNewEventDateTime(value: () => EventDateTime): Self = StObject.set(x, "newEventDateTime", js.Any.fromFunction0(value))
    
    inline def setNewEventExtendedProperties(value: () => EventExtendedProperties): Self = StObject.set(x, "newEventExtendedProperties", js.Any.fromFunction0(value))
    
    inline def setNewEventGadget(value: () => EventGadget): Self = StObject.set(x, "newEventGadget", js.Any.fromFunction0(value))
    
    inline def setNewEventOrganizer(value: () => EventOrganizer): Self = StObject.set(x, "newEventOrganizer", js.Any.fromFunction0(value))
    
    inline def setNewEventReminder(value: () => EventReminder): Self = StObject.set(x, "newEventReminder", js.Any.fromFunction0(value))
    
    inline def setNewEventReminders(value: () => EventReminders): Self = StObject.set(x, "newEventReminders", js.Any.fromFunction0(value))
    
    inline def setNewEventSource(value: () => EventSource): Self = StObject.set(x, "newEventSource", js.Any.fromFunction0(value))
    
    inline def setNewFreeBusyRequest(value: () => FreeBusyRequest): Self = StObject.set(x, "newFreeBusyRequest", js.Any.fromFunction0(value))
    
    inline def setNewFreeBusyRequestItem(value: () => FreeBusyRequestItem): Self = StObject.set(x, "newFreeBusyRequestItem", js.Any.fromFunction0(value))
    
    inline def setSettings(value: SettingsCollection): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
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
  trait RecurrenceRule extends StObject {
    
    def addDailyExclusion(): RecurrenceRule
    
    def addDailyRule(): RecurrenceRule
    
    def addDate(date: Date): EventRecurrence
    
    def addDateExclusion(date: Date): EventRecurrence
    
    def addMonthlyExclusion(): RecurrenceRule
    
    def addMonthlyRule(): RecurrenceRule
    
    def addWeeklyExclusion(): RecurrenceRule
    
    def addWeeklyRule(): RecurrenceRule
    
    def addYearlyExclusion(): RecurrenceRule
    
    def addYearlyRule(): RecurrenceRule
    
    def interval(interval: Integer): RecurrenceRule
    
    def onlyInMonth(month: Month): RecurrenceRule
    
    def onlyInMonths(months: js.Array[Month]): RecurrenceRule
    
    def onlyOnMonthDay(day: Integer): RecurrenceRule
    
    def onlyOnMonthDays(days: js.Array[Integer]): RecurrenceRule
    
    def onlyOnWeek(week: Integer): RecurrenceRule
    
    def onlyOnWeekday(day: Weekday): RecurrenceRule
    
    def onlyOnWeekdays(days: js.Array[Weekday]): RecurrenceRule
    
    def onlyOnWeeks(weeks: js.Array[Integer]): RecurrenceRule
    
    def onlyOnYearDay(day: Integer): RecurrenceRule
    
    def onlyOnYearDays(days: js.Array[Integer]): RecurrenceRule
    
    def setTimeZone(timeZone: String): EventRecurrence
    
    def times(times: Integer): RecurrenceRule
    
    def until(endDate: Date): RecurrenceRule
    
    def weekStartsOn(day: Weekday): RecurrenceRule
  }
  object RecurrenceRule {
    
    inline def apply(
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
    
    extension [Self <: RecurrenceRule](x: Self) {
      
      inline def setAddDailyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addDailyExclusion", js.Any.fromFunction0(value))
      
      inline def setAddDailyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addDailyRule", js.Any.fromFunction0(value))
      
      inline def setAddDate(value: Date => EventRecurrence): Self = StObject.set(x, "addDate", js.Any.fromFunction1(value))
      
      inline def setAddDateExclusion(value: Date => EventRecurrence): Self = StObject.set(x, "addDateExclusion", js.Any.fromFunction1(value))
      
      inline def setAddMonthlyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addMonthlyExclusion", js.Any.fromFunction0(value))
      
      inline def setAddMonthlyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addMonthlyRule", js.Any.fromFunction0(value))
      
      inline def setAddWeeklyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addWeeklyExclusion", js.Any.fromFunction0(value))
      
      inline def setAddWeeklyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addWeeklyRule", js.Any.fromFunction0(value))
      
      inline def setAddYearlyExclusion(value: () => RecurrenceRule): Self = StObject.set(x, "addYearlyExclusion", js.Any.fromFunction0(value))
      
      inline def setAddYearlyRule(value: () => RecurrenceRule): Self = StObject.set(x, "addYearlyRule", js.Any.fromFunction0(value))
      
      inline def setInterval(value: Integer => RecurrenceRule): Self = StObject.set(x, "interval", js.Any.fromFunction1(value))
      
      inline def setOnlyInMonth(value: Month => RecurrenceRule): Self = StObject.set(x, "onlyInMonth", js.Any.fromFunction1(value))
      
      inline def setOnlyInMonths(value: js.Array[Month] => RecurrenceRule): Self = StObject.set(x, "onlyInMonths", js.Any.fromFunction1(value))
      
      inline def setOnlyOnMonthDay(value: Integer => RecurrenceRule): Self = StObject.set(x, "onlyOnMonthDay", js.Any.fromFunction1(value))
      
      inline def setOnlyOnMonthDays(value: js.Array[Integer] => RecurrenceRule): Self = StObject.set(x, "onlyOnMonthDays", js.Any.fromFunction1(value))
      
      inline def setOnlyOnWeek(value: Integer => RecurrenceRule): Self = StObject.set(x, "onlyOnWeek", js.Any.fromFunction1(value))
      
      inline def setOnlyOnWeekday(value: Weekday => RecurrenceRule): Self = StObject.set(x, "onlyOnWeekday", js.Any.fromFunction1(value))
      
      inline def setOnlyOnWeekdays(value: js.Array[Weekday] => RecurrenceRule): Self = StObject.set(x, "onlyOnWeekdays", js.Any.fromFunction1(value))
      
      inline def setOnlyOnWeeks(value: js.Array[Integer] => RecurrenceRule): Self = StObject.set(x, "onlyOnWeeks", js.Any.fromFunction1(value))
      
      inline def setOnlyOnYearDay(value: Integer => RecurrenceRule): Self = StObject.set(x, "onlyOnYearDay", js.Any.fromFunction1(value))
      
      inline def setOnlyOnYearDays(value: js.Array[Integer] => RecurrenceRule): Self = StObject.set(x, "onlyOnYearDays", js.Any.fromFunction1(value))
      
      inline def setSetTimeZone(value: String => EventRecurrence): Self = StObject.set(x, "setTimeZone", js.Any.fromFunction1(value))
      
      inline def setTimes(value: Integer => RecurrenceRule): Self = StObject.set(x, "times", js.Any.fromFunction1(value))
      
      inline def setUntil(value: Date => RecurrenceRule): Self = StObject.set(x, "until", js.Any.fromFunction1(value))
      
      inline def setWeekStartsOn(value: Weekday => RecurrenceRule): Self = StObject.set(x, "weekStartsOn", js.Any.fromFunction1(value))
    }
  }
  
  object Schema {
    
    trait Acl extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[AclRule]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var nextSyncToken: js.UndefOr[String] = js.undefined
    }
    object Acl {
      
      inline def apply(): Acl = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Acl]
      }
      
      extension [Self <: Acl](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[AclRule]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: AclRule*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
      }
    }
    
    trait AclRule extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var role: js.UndefOr[String] = js.undefined
      
      var scope: js.UndefOr[AclRuleScope] = js.undefined
    }
    object AclRule {
      
      inline def apply(): AclRule = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AclRule]
      }
      
      extension [Self <: AclRule](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
        
        inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
        
        inline def setScope(value: AclRuleScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      }
    }
    
    trait AclRuleScope extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object AclRuleScope {
      
      inline def apply(): AclRuleScope = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AclRuleScope]
      }
      
      extension [Self <: AclRuleScope](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Calendar extends StObject {
      
      var conferenceProperties: js.UndefOr[ConferenceProperties] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var summary: js.UndefOr[String] = js.undefined
      
      var timeZone: js.UndefOr[String] = js.undefined
    }
    object Calendar {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Calendar](x: Self) {
        
        inline def setConferenceProperties(value: ConferenceProperties): Self = StObject.set(x, "conferenceProperties", value.asInstanceOf[js.Any])
        
        inline def setConferencePropertiesUndefined: Self = StObject.set(x, "conferenceProperties", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      }
    }
    
    trait CalendarList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[CalendarListEntry]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var nextSyncToken: js.UndefOr[String] = js.undefined
    }
    object CalendarList {
      
      inline def apply(): CalendarList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CalendarList]
      }
      
      extension [Self <: CalendarList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[CalendarListEntry]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: CalendarListEntry*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
      }
    }
    
    trait CalendarListEntry extends StObject {
      
      var accessRole: js.UndefOr[String] = js.undefined
      
      var backgroundColor: js.UndefOr[String] = js.undefined
      
      var colorId: js.UndefOr[String] = js.undefined
      
      var conferenceProperties: js.UndefOr[ConferenceProperties] = js.undefined
      
      var defaultReminders: js.UndefOr[js.Array[EventReminder]] = js.undefined
      
      var deleted: js.UndefOr[Boolean] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var foregroundColor: js.UndefOr[String] = js.undefined
      
      var hidden: js.UndefOr[Boolean] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var notificationSettings: js.UndefOr[CalendarListEntryNotificationSettings] = js.undefined
      
      var primary: js.UndefOr[Boolean] = js.undefined
      
      var selected: js.UndefOr[Boolean] = js.undefined
      
      var summary: js.UndefOr[String] = js.undefined
      
      var summaryOverride: js.UndefOr[String] = js.undefined
      
      var timeZone: js.UndefOr[String] = js.undefined
    }
    object CalendarListEntry {
      
      inline def apply(): CalendarListEntry = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CalendarListEntry]
      }
      
      extension [Self <: CalendarListEntry](x: Self) {
        
        inline def setAccessRole(value: String): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
        
        inline def setAccessRoleUndefined: Self = StObject.set(x, "accessRole", js.undefined)
        
        inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
        
        inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
        
        inline def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
        
        inline def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
        
        inline def setConferenceProperties(value: ConferenceProperties): Self = StObject.set(x, "conferenceProperties", value.asInstanceOf[js.Any])
        
        inline def setConferencePropertiesUndefined: Self = StObject.set(x, "conferenceProperties", js.undefined)
        
        inline def setDefaultReminders(value: js.Array[EventReminder]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
        
        inline def setDefaultRemindersUndefined: Self = StObject.set(x, "defaultReminders", js.undefined)
        
        inline def setDefaultRemindersVarargs(value: EventReminder*): Self = StObject.set(x, "defaultReminders", js.Array(value*))
        
        inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
        
        inline def setForegroundColorUndefined: Self = StObject.set(x, "foregroundColor", js.undefined)
        
        inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setNotificationSettings(value: CalendarListEntryNotificationSettings): Self = StObject.set(x, "notificationSettings", value.asInstanceOf[js.Any])
        
        inline def setNotificationSettingsUndefined: Self = StObject.set(x, "notificationSettings", js.undefined)
        
        inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
        
        inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
        
        inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
        
        inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
        
        inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSummaryOverride(value: String): Self = StObject.set(x, "summaryOverride", value.asInstanceOf[js.Any])
        
        inline def setSummaryOverrideUndefined: Self = StObject.set(x, "summaryOverride", js.undefined)
        
        inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      }
    }
    
    trait CalendarListEntryNotificationSettings extends StObject {
      
      var notifications: js.UndefOr[js.Array[CalendarNotification]] = js.undefined
    }
    object CalendarListEntryNotificationSettings {
      
      inline def apply(): CalendarListEntryNotificationSettings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CalendarListEntryNotificationSettings]
      }
      
      extension [Self <: CalendarListEntryNotificationSettings](x: Self) {
        
        inline def setNotifications(value: js.Array[CalendarNotification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
        
        inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
        
        inline def setNotificationsVarargs(value: CalendarNotification*): Self = StObject.set(x, "notifications", js.Array(value*))
      }
    }
    
    trait CalendarNotification extends StObject {
      
      var method: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object CalendarNotification {
      
      inline def apply(): CalendarNotification = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CalendarNotification]
      }
      
      extension [Self <: CalendarNotification](x: Self) {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait Channel extends StObject {
      
      var address: js.UndefOr[String] = js.undefined
      
      var expiration: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var params: js.UndefOr[js.Object] = js.undefined
      
      var payload: js.UndefOr[Boolean] = js.undefined
      
      var resourceId: js.UndefOr[String] = js.undefined
      
      var resourceUri: js.UndefOr[String] = js.undefined
      
      var token: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object Channel {
      
      inline def apply(): Channel = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Channel]
      }
      
      extension [Self <: Channel](x: Self) {
        
        inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
        
        inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
        
        inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
        
        inline def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
        
        inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
        
        inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
        
        inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
        
        inline def setResourceUri(value: String): Self = StObject.set(x, "resourceUri", value.asInstanceOf[js.Any])
        
        inline def setResourceUriUndefined: Self = StObject.set(x, "resourceUri", js.undefined)
        
        inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        
        inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait ColorDefinition extends StObject {
      
      var background: js.UndefOr[String] = js.undefined
      
      var foreground: js.UndefOr[String] = js.undefined
    }
    object ColorDefinition {
      
      inline def apply(): ColorDefinition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ColorDefinition]
      }
      
      extension [Self <: ColorDefinition](x: Self) {
        
        inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
        
        inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
        
        inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
        
        inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      }
    }
    
    trait Colors extends StObject {
      
      var calendar: js.UndefOr[js.Object] = js.undefined
      
      var event: js.UndefOr[js.Object] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var updated: js.UndefOr[String] = js.undefined
    }
    object Colors {
      
      inline def apply(): Colors = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Colors]
      }
      
      extension [Self <: Colors](x: Self) {
        
        inline def setCalendar(value: js.Object): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
        
        inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
        
        inline def setEvent(value: js.Object): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
        
        inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      }
    }
    
    trait ConferenceData extends StObject {
      
      var conferenceId: js.UndefOr[String] = js.undefined
      
      var conferenceSolution: js.UndefOr[ConferenceSolution] = js.undefined
      
      var createRequest: js.UndefOr[CreateConferenceRequest] = js.undefined
      
      var entryPoints: js.UndefOr[js.Array[EntryPoint]] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
      
      var parameters: js.UndefOr[ConferenceParameters] = js.undefined
      
      var signature: js.UndefOr[String] = js.undefined
    }
    object ConferenceData {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData](x: Self) {
        
        inline def setConferenceId(value: String): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
        
        inline def setConferenceIdUndefined: Self = StObject.set(x, "conferenceId", js.undefined)
        
        inline def setConferenceSolution(value: ConferenceSolution): Self = StObject.set(x, "conferenceSolution", value.asInstanceOf[js.Any])
        
        inline def setConferenceSolutionUndefined: Self = StObject.set(x, "conferenceSolution", js.undefined)
        
        inline def setCreateRequest(value: CreateConferenceRequest): Self = StObject.set(x, "createRequest", value.asInstanceOf[js.Any])
        
        inline def setCreateRequestUndefined: Self = StObject.set(x, "createRequest", js.undefined)
        
        inline def setEntryPoints(value: js.Array[EntryPoint]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
        
        inline def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
        
        inline def setEntryPointsVarargs(value: EntryPoint*): Self = StObject.set(x, "entryPoints", js.Array(value*))
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        inline def setParameters(value: ConferenceParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
        
        inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
        
        inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
      }
    }
    
    trait ConferenceParameters extends StObject {
      
      var addOnParameters: js.UndefOr[ConferenceParametersAddOnParameters] = js.undefined
    }
    object ConferenceParameters {
      
      inline def apply(): ConferenceParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceParameters]
      }
      
      extension [Self <: ConferenceParameters](x: Self) {
        
        inline def setAddOnParameters(value: ConferenceParametersAddOnParameters): Self = StObject.set(x, "addOnParameters", value.asInstanceOf[js.Any])
        
        inline def setAddOnParametersUndefined: Self = StObject.set(x, "addOnParameters", js.undefined)
      }
    }
    
    trait ConferenceParametersAddOnParameters extends StObject {
      
      var parameters: js.UndefOr[Record[String, String]] = js.undefined
    }
    object ConferenceParametersAddOnParameters {
      
      inline def apply(): ConferenceParametersAddOnParameters = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceParametersAddOnParameters]
      }
      
      extension [Self <: ConferenceParametersAddOnParameters](x: Self) {
        
        inline def setParameters(value: Record[String, String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
        
        inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
      }
    }
    
    trait ConferenceProperties extends StObject {
      
      var allowedConferenceSolutionTypes: js.UndefOr[js.Array[String]] = js.undefined
    }
    object ConferenceProperties {
      
      inline def apply(): ConferenceProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceProperties]
      }
      
      extension [Self <: ConferenceProperties](x: Self) {
        
        inline def setAllowedConferenceSolutionTypes(value: js.Array[String]): Self = StObject.set(x, "allowedConferenceSolutionTypes", value.asInstanceOf[js.Any])
        
        inline def setAllowedConferenceSolutionTypesUndefined: Self = StObject.set(x, "allowedConferenceSolutionTypes", js.undefined)
        
        inline def setAllowedConferenceSolutionTypesVarargs(value: String*): Self = StObject.set(x, "allowedConferenceSolutionTypes", js.Array(value*))
      }
    }
    
    trait ConferenceRequestStatus extends StObject {
      
      var statusCode: js.UndefOr[String] = js.undefined
    }
    object ConferenceRequestStatus {
      
      inline def apply(): ConferenceRequestStatus = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceRequestStatus]
      }
      
      extension [Self <: ConferenceRequestStatus](x: Self) {
        
        inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
        
        inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      }
    }
    
    trait ConferenceSolution extends StObject {
      
      var iconUri: js.UndefOr[String] = js.undefined
      
      var key: js.UndefOr[ConferenceSolutionKey] = js.undefined
      
      var name: js.UndefOr[String] = js.undefined
    }
    object ConferenceSolution {
      
      inline def apply(): ConferenceSolution = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceSolution]
      }
      
      extension [Self <: ConferenceSolution](x: Self) {
        
        inline def setIconUri(value: String): Self = StObject.set(x, "iconUri", value.asInstanceOf[js.Any])
        
        inline def setIconUriUndefined: Self = StObject.set(x, "iconUri", js.undefined)
        
        inline def setKey(value: ConferenceSolutionKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    trait ConferenceSolutionKey extends StObject {
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object ConferenceSolutionKey {
      
      inline def apply(): ConferenceSolutionKey = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConferenceSolutionKey]
      }
      
      extension [Self <: ConferenceSolutionKey](x: Self) {
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait CreateConferenceRequest extends StObject {
      
      var conferenceSolutionKey: js.UndefOr[ConferenceSolutionKey] = js.undefined
      
      var requestId: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[ConferenceRequestStatus] = js.undefined
    }
    object CreateConferenceRequest {
      
      inline def apply(): CreateConferenceRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateConferenceRequest]
      }
      
      extension [Self <: CreateConferenceRequest](x: Self) {
        
        inline def setConferenceSolutionKey(value: ConferenceSolutionKey): Self = StObject.set(x, "conferenceSolutionKey", value.asInstanceOf[js.Any])
        
        inline def setConferenceSolutionKeyUndefined: Self = StObject.set(x, "conferenceSolutionKey", js.undefined)
        
        inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
        
        inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
        
        inline def setStatus(value: ConferenceRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      }
    }
    
    trait EntryPoint extends StObject {
      
      var accessCode: js.UndefOr[String] = js.undefined
      
      var entryPointFeatures: js.UndefOr[js.Array[String]] = js.undefined
      
      var entryPointType: js.UndefOr[String] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var meetingCode: js.UndefOr[String] = js.undefined
      
      var passcode: js.UndefOr[String] = js.undefined
      
      var password: js.UndefOr[String] = js.undefined
      
      var pin: js.UndefOr[String] = js.undefined
      
      var regionCode: js.UndefOr[String] = js.undefined
      
      var uri: js.UndefOr[String] = js.undefined
    }
    object EntryPoint {
      
      inline def apply(): EntryPoint = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EntryPoint]
      }
      
      extension [Self <: EntryPoint](x: Self) {
        
        inline def setAccessCode(value: String): Self = StObject.set(x, "accessCode", value.asInstanceOf[js.Any])
        
        inline def setAccessCodeUndefined: Self = StObject.set(x, "accessCode", js.undefined)
        
        inline def setEntryPointFeatures(value: js.Array[String]): Self = StObject.set(x, "entryPointFeatures", value.asInstanceOf[js.Any])
        
        inline def setEntryPointFeaturesUndefined: Self = StObject.set(x, "entryPointFeatures", js.undefined)
        
        inline def setEntryPointFeaturesVarargs(value: String*): Self = StObject.set(x, "entryPointFeatures", js.Array(value*))
        
        inline def setEntryPointType(value: String): Self = StObject.set(x, "entryPointType", value.asInstanceOf[js.Any])
        
        inline def setEntryPointTypeUndefined: Self = StObject.set(x, "entryPointType", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setMeetingCode(value: String): Self = StObject.set(x, "meetingCode", value.asInstanceOf[js.Any])
        
        inline def setMeetingCodeUndefined: Self = StObject.set(x, "meetingCode", js.undefined)
        
        inline def setPasscode(value: String): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
        
        inline def setPasscodeUndefined: Self = StObject.set(x, "passcode", js.undefined)
        
        inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        inline def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
        
        inline def setPinUndefined: Self = StObject.set(x, "pin", js.undefined)
        
        inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
        
        inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
        
        inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
        
        inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
      }
    }
    
    trait Error extends StObject {
      
      var domain: js.UndefOr[String] = js.undefined
      
      var reason: js.UndefOr[String] = js.undefined
    }
    object Error {
      
      inline def apply(): Error = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Error]
      }
      
      extension [Self <: Error](x: Self) {
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
        
        inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      }
    }
    
    trait Event extends StObject {
      
      var anyoneCanAddSelf: js.UndefOr[Boolean] = js.undefined
      
      var attachments: js.UndefOr[js.Array[EventAttachment]] = js.undefined
      
      var attendees: js.UndefOr[js.Array[EventAttendee]] = js.undefined
      
      var attendeesOmitted: js.UndefOr[Boolean] = js.undefined
      
      var colorId: js.UndefOr[String] = js.undefined
      
      var conferenceData: js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData] = js.undefined
      
      var created: js.UndefOr[String] = js.undefined
      
      var creator: js.UndefOr[EventCreator] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var end: js.UndefOr[EventDateTime] = js.undefined
      
      var endTimeUnspecified: js.UndefOr[Boolean] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var extendedProperties: js.UndefOr[EventExtendedProperties] = js.undefined
      
      var gadget: js.UndefOr[EventGadget] = js.undefined
      
      var guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined
      
      var guestsCanModify: js.UndefOr[Boolean] = js.undefined
      
      var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.undefined
      
      var hangoutLink: js.UndefOr[String] = js.undefined
      
      var htmlLink: js.UndefOr[String] = js.undefined
      
      var iCalUID: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var location: js.UndefOr[String] = js.undefined
      
      var locked: js.UndefOr[Boolean] = js.undefined
      
      var organizer: js.UndefOr[EventOrganizer] = js.undefined
      
      var originalStartTime: js.UndefOr[EventDateTime] = js.undefined
      
      var privateCopy: js.UndefOr[Boolean] = js.undefined
      
      var recurrence: js.UndefOr[js.Array[String]] = js.undefined
      
      var recurringEventId: js.UndefOr[String] = js.undefined
      
      var reminders: js.UndefOr[EventReminders] = js.undefined
      
      var sequence: js.UndefOr[Double] = js.undefined
      
      var source: js.UndefOr[EventSource] = js.undefined
      
      var start: js.UndefOr[EventDateTime] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
      
      var summary: js.UndefOr[String] = js.undefined
      
      var transparency: js.UndefOr[String] = js.undefined
      
      var updated: js.UndefOr[String] = js.undefined
      
      var visibility: js.UndefOr[String] = js.undefined
    }
    object Event {
      
      inline def apply(): Event = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Event]
      }
      
      extension [Self <: Event](x: Self) {
        
        inline def setAnyoneCanAddSelf(value: Boolean): Self = StObject.set(x, "anyoneCanAddSelf", value.asInstanceOf[js.Any])
        
        inline def setAnyoneCanAddSelfUndefined: Self = StObject.set(x, "anyoneCanAddSelf", js.undefined)
        
        inline def setAttachments(value: js.Array[EventAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
        
        inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
        
        inline def setAttachmentsVarargs(value: EventAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
        
        inline def setAttendees(value: js.Array[EventAttendee]): Self = StObject.set(x, "attendees", value.asInstanceOf[js.Any])
        
        inline def setAttendeesOmitted(value: Boolean): Self = StObject.set(x, "attendeesOmitted", value.asInstanceOf[js.Any])
        
        inline def setAttendeesOmittedUndefined: Self = StObject.set(x, "attendeesOmitted", js.undefined)
        
        inline def setAttendeesUndefined: Self = StObject.set(x, "attendees", js.undefined)
        
        inline def setAttendeesVarargs(value: EventAttendee*): Self = StObject.set(x, "attendees", js.Array(value*))
        
        inline def setColorId(value: String): Self = StObject.set(x, "colorId", value.asInstanceOf[js.Any])
        
        inline def setColorIdUndefined: Self = StObject.set(x, "colorId", js.undefined)
        
        inline def setConferenceData(value: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.ConferenceData): Self = StObject.set(x, "conferenceData", value.asInstanceOf[js.Any])
        
        inline def setConferenceDataUndefined: Self = StObject.set(x, "conferenceData", js.undefined)
        
        inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
        
        inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
        
        inline def setCreator(value: EventCreator): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
        
        inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEnd(value: EventDateTime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUnspecified(value: Boolean): Self = StObject.set(x, "endTimeUnspecified", value.asInstanceOf[js.Any])
        
        inline def setEndTimeUnspecifiedUndefined: Self = StObject.set(x, "endTimeUnspecified", js.undefined)
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setExtendedProperties(value: EventExtendedProperties): Self = StObject.set(x, "extendedProperties", value.asInstanceOf[js.Any])
        
        inline def setExtendedPropertiesUndefined: Self = StObject.set(x, "extendedProperties", js.undefined)
        
        inline def setGadget(value: EventGadget): Self = StObject.set(x, "gadget", value.asInstanceOf[js.Any])
        
        inline def setGadgetUndefined: Self = StObject.set(x, "gadget", js.undefined)
        
        inline def setGuestsCanInviteOthers(value: Boolean): Self = StObject.set(x, "guestsCanInviteOthers", value.asInstanceOf[js.Any])
        
        inline def setGuestsCanInviteOthersUndefined: Self = StObject.set(x, "guestsCanInviteOthers", js.undefined)
        
        inline def setGuestsCanModify(value: Boolean): Self = StObject.set(x, "guestsCanModify", value.asInstanceOf[js.Any])
        
        inline def setGuestsCanModifyUndefined: Self = StObject.set(x, "guestsCanModify", js.undefined)
        
        inline def setGuestsCanSeeOtherGuests(value: Boolean): Self = StObject.set(x, "guestsCanSeeOtherGuests", value.asInstanceOf[js.Any])
        
        inline def setGuestsCanSeeOtherGuestsUndefined: Self = StObject.set(x, "guestsCanSeeOtherGuests", js.undefined)
        
        inline def setHangoutLink(value: String): Self = StObject.set(x, "hangoutLink", value.asInstanceOf[js.Any])
        
        inline def setHangoutLinkUndefined: Self = StObject.set(x, "hangoutLink", js.undefined)
        
        inline def setHtmlLink(value: String): Self = StObject.set(x, "htmlLink", value.asInstanceOf[js.Any])
        
        inline def setHtmlLinkUndefined: Self = StObject.set(x, "htmlLink", js.undefined)
        
        inline def setICalUID(value: String): Self = StObject.set(x, "iCalUID", value.asInstanceOf[js.Any])
        
        inline def setICalUIDUndefined: Self = StObject.set(x, "iCalUID", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
        
        inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
        
        inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
        
        inline def setOrganizer(value: EventOrganizer): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
        
        inline def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
        
        inline def setOriginalStartTime(value: EventDateTime): Self = StObject.set(x, "originalStartTime", value.asInstanceOf[js.Any])
        
        inline def setOriginalStartTimeUndefined: Self = StObject.set(x, "originalStartTime", js.undefined)
        
        inline def setPrivateCopy(value: Boolean): Self = StObject.set(x, "privateCopy", value.asInstanceOf[js.Any])
        
        inline def setPrivateCopyUndefined: Self = StObject.set(x, "privateCopy", js.undefined)
        
        inline def setRecurrence(value: js.Array[String]): Self = StObject.set(x, "recurrence", value.asInstanceOf[js.Any])
        
        inline def setRecurrenceUndefined: Self = StObject.set(x, "recurrence", js.undefined)
        
        inline def setRecurrenceVarargs(value: String*): Self = StObject.set(x, "recurrence", js.Array(value*))
        
        inline def setRecurringEventId(value: String): Self = StObject.set(x, "recurringEventId", value.asInstanceOf[js.Any])
        
        inline def setRecurringEventIdUndefined: Self = StObject.set(x, "recurringEventId", js.undefined)
        
        inline def setReminders(value: EventReminders): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
        
        inline def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
        
        inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
        
        inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
        
        inline def setSource(value: EventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
        
        inline def setStart(value: EventDateTime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        inline def setTransparency(value: String): Self = StObject.set(x, "transparency", value.asInstanceOf[js.Any])
        
        inline def setTransparencyUndefined: Self = StObject.set(x, "transparency", js.undefined)
        
        inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
        
        inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
        
        inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      }
    }
    
    trait EventAttachment extends StObject {
      
      var fileId: js.UndefOr[String] = js.undefined
      
      var fileUrl: js.UndefOr[String] = js.undefined
      
      var iconLink: js.UndefOr[String] = js.undefined
      
      var mimeType: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
    }
    object EventAttachment {
      
      inline def apply(): EventAttachment = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventAttachment]
      }
      
      extension [Self <: EventAttachment](x: Self) {
        
        inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
        
        inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
        
        inline def setFileUrl(value: String): Self = StObject.set(x, "fileUrl", value.asInstanceOf[js.Any])
        
        inline def setFileUrlUndefined: Self = StObject.set(x, "fileUrl", js.undefined)
        
        inline def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
        
        inline def setIconLinkUndefined: Self = StObject.set(x, "iconLink", js.undefined)
        
        inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
        
        inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    trait EventAttendee extends StObject {
      
      var additionalGuests: js.UndefOr[Double] = js.undefined
      
      var comment: js.UndefOr[String] = js.undefined
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var email: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var optional: js.UndefOr[Boolean] = js.undefined
      
      var organizer: js.UndefOr[Boolean] = js.undefined
      
      var resource: js.UndefOr[Boolean] = js.undefined
      
      var responseStatus: js.UndefOr[String] = js.undefined
      
      var self: js.UndefOr[Boolean] = js.undefined
    }
    object EventAttendee {
      
      inline def apply(): EventAttendee = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventAttendee]
      }
      
      extension [Self <: EventAttendee](x: Self) {
        
        inline def setAdditionalGuests(value: Double): Self = StObject.set(x, "additionalGuests", value.asInstanceOf[js.Any])
        
        inline def setAdditionalGuestsUndefined: Self = StObject.set(x, "additionalGuests", js.undefined)
        
        inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
        
        inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
        
        inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
        
        inline def setOrganizer(value: Boolean): Self = StObject.set(x, "organizer", value.asInstanceOf[js.Any])
        
        inline def setOrganizerUndefined: Self = StObject.set(x, "organizer", js.undefined)
        
        inline def setResource(value: Boolean): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
        
        inline def setResponseStatus(value: String): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
        
        inline def setResponseStatusUndefined: Self = StObject.set(x, "responseStatus", js.undefined)
        
        inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
        
        inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
      }
    }
    
    trait EventCreator extends StObject {
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var email: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var self: js.UndefOr[Boolean] = js.undefined
    }
    object EventCreator {
      
      inline def apply(): EventCreator = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventCreator]
      }
      
      extension [Self <: EventCreator](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
        
        inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
      }
    }
    
    trait EventDateTime extends StObject {
      
      var date: js.UndefOr[String] = js.undefined
      
      var dateTime: js.UndefOr[String] = js.undefined
      
      var timeZone: js.UndefOr[String] = js.undefined
    }
    object EventDateTime {
      
      inline def apply(): EventDateTime = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventDateTime]
      }
      
      extension [Self <: EventDateTime](x: Self) {
        
        inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
        
        inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
        
        inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
        
        inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
        
        inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      }
    }
    
    trait EventExtendedProperties extends StObject {
      
      var `private`: js.UndefOr[Record[String, String]] = js.undefined
      
      var shared: js.UndefOr[Record[String, String]] = js.undefined
    }
    object EventExtendedProperties {
      
      inline def apply(): EventExtendedProperties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventExtendedProperties]
      }
      
      extension [Self <: EventExtendedProperties](x: Self) {
        
        inline def setPrivate(value: Record[String, String]): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
        
        inline def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
        
        inline def setShared(value: Record[String, String]): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
        
        inline def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      }
    }
    
    trait EventGadget extends StObject {
      
      var display: js.UndefOr[String] = js.undefined
      
      var height: js.UndefOr[Double] = js.undefined
      
      var iconLink: js.UndefOr[String] = js.undefined
      
      var link: js.UndefOr[String] = js.undefined
      
      var preferences: js.UndefOr[js.Object] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
      
      var width: js.UndefOr[Double] = js.undefined
    }
    object EventGadget {
      
      inline def apply(): EventGadget = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventGadget]
      }
      
      extension [Self <: EventGadget](x: Self) {
        
        inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
        
        inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
        
        inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        inline def setIconLink(value: String): Self = StObject.set(x, "iconLink", value.asInstanceOf[js.Any])
        
        inline def setIconLinkUndefined: Self = StObject.set(x, "iconLink", js.undefined)
        
        inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setPreferences(value: js.Object): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
        
        inline def setPreferencesUndefined: Self = StObject.set(x, "preferences", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
        
        inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait EventOrganizer extends StObject {
      
      var displayName: js.UndefOr[String] = js.undefined
      
      var email: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var self: js.UndefOr[Boolean] = js.undefined
    }
    object EventOrganizer {
      
      inline def apply(): EventOrganizer = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventOrganizer]
      }
      
      extension [Self <: EventOrganizer](x: Self) {
        
        inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
        
        inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
        
        inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
        
        inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setSelf(value: Boolean): Self = StObject.set(x, "self", value.asInstanceOf[js.Any])
        
        inline def setSelfUndefined: Self = StObject.set(x, "self", js.undefined)
      }
    }
    
    trait EventReminder extends StObject {
      
      var method: js.UndefOr[String] = js.undefined
      
      var minutes: js.UndefOr[Double] = js.undefined
    }
    object EventReminder {
      
      inline def apply(): EventReminder = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventReminder]
      }
      
      extension [Self <: EventReminder](x: Self) {
        
        inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
        
        inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      }
    }
    
    trait EventReminders extends StObject {
      
      var overrides: js.UndefOr[js.Array[EventReminder]] = js.undefined
      
      var useDefault: js.UndefOr[Boolean] = js.undefined
    }
    object EventReminders {
      
      inline def apply(): EventReminders = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventReminders]
      }
      
      extension [Self <: EventReminders](x: Self) {
        
        inline def setOverrides(value: js.Array[EventReminder]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
        
        inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
        
        inline def setOverridesVarargs(value: EventReminder*): Self = StObject.set(x, "overrides", js.Array(value*))
        
        inline def setUseDefault(value: Boolean): Self = StObject.set(x, "useDefault", value.asInstanceOf[js.Any])
        
        inline def setUseDefaultUndefined: Self = StObject.set(x, "useDefault", js.undefined)
      }
    }
    
    trait EventSource extends StObject {
      
      var title: js.UndefOr[String] = js.undefined
      
      var url: js.UndefOr[String] = js.undefined
    }
    object EventSource {
      
      inline def apply(): EventSource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EventSource]
      }
      
      extension [Self <: EventSource](x: Self) {
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      }
    }
    
    trait Events extends StObject {
      
      var accessRole: js.UndefOr[String] = js.undefined
      
      var defaultReminders: js.UndefOr[js.Array[EventReminder]] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Event]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var nextSyncToken: js.UndefOr[String] = js.undefined
      
      var summary: js.UndefOr[String] = js.undefined
      
      var timeZone: js.UndefOr[String] = js.undefined
      
      var updated: js.UndefOr[String] = js.undefined
    }
    object Events {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.Calendar.Schema.Events](x: Self) {
        
        inline def setAccessRole(value: String): Self = StObject.set(x, "accessRole", value.asInstanceOf[js.Any])
        
        inline def setAccessRoleUndefined: Self = StObject.set(x, "accessRole", js.undefined)
        
        inline def setDefaultReminders(value: js.Array[EventReminder]): Self = StObject.set(x, "defaultReminders", value.asInstanceOf[js.Any])
        
        inline def setDefaultRemindersUndefined: Self = StObject.set(x, "defaultReminders", js.undefined)
        
        inline def setDefaultRemindersVarargs(value: EventReminder*): Self = StObject.set(x, "defaultReminders", js.Array(value*))
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[Event]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Event*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
        
        inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
        
        inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
        
        inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
        
        inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      }
    }
    
    trait FreeBusyCalendar extends StObject {
      
      var busy: js.UndefOr[js.Array[TimePeriod]] = js.undefined
      
      var errors: js.UndefOr[js.Array[Error]] = js.undefined
    }
    object FreeBusyCalendar {
      
      inline def apply(): FreeBusyCalendar = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FreeBusyCalendar]
      }
      
      extension [Self <: FreeBusyCalendar](x: Self) {
        
        inline def setBusy(value: js.Array[TimePeriod]): Self = StObject.set(x, "busy", value.asInstanceOf[js.Any])
        
        inline def setBusyUndefined: Self = StObject.set(x, "busy", js.undefined)
        
        inline def setBusyVarargs(value: TimePeriod*): Self = StObject.set(x, "busy", js.Array(value*))
        
        inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
      }
    }
    
    trait FreeBusyGroup extends StObject {
      
      var calendars: js.UndefOr[js.Array[String]] = js.undefined
      
      var errors: js.UndefOr[js.Array[Error]] = js.undefined
    }
    object FreeBusyGroup {
      
      inline def apply(): FreeBusyGroup = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FreeBusyGroup]
      }
      
      extension [Self <: FreeBusyGroup](x: Self) {
        
        inline def setCalendars(value: js.Array[String]): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
        
        inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
        
        inline def setCalendarsVarargs(value: String*): Self = StObject.set(x, "calendars", js.Array(value*))
        
        inline def setErrors(value: js.Array[Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        inline def setErrorsVarargs(value: Error*): Self = StObject.set(x, "errors", js.Array(value*))
      }
    }
    
    trait FreeBusyRequest extends StObject {
      
      var calendarExpansionMax: js.UndefOr[Double] = js.undefined
      
      var groupExpansionMax: js.UndefOr[Double] = js.undefined
      
      var items: js.UndefOr[js.Array[FreeBusyRequestItem]] = js.undefined
      
      var timeMax: js.UndefOr[String] = js.undefined
      
      var timeMin: js.UndefOr[String] = js.undefined
      
      var timeZone: js.UndefOr[String] = js.undefined
    }
    object FreeBusyRequest {
      
      inline def apply(): FreeBusyRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FreeBusyRequest]
      }
      
      extension [Self <: FreeBusyRequest](x: Self) {
        
        inline def setCalendarExpansionMax(value: Double): Self = StObject.set(x, "calendarExpansionMax", value.asInstanceOf[js.Any])
        
        inline def setCalendarExpansionMaxUndefined: Self = StObject.set(x, "calendarExpansionMax", js.undefined)
        
        inline def setGroupExpansionMax(value: Double): Self = StObject.set(x, "groupExpansionMax", value.asInstanceOf[js.Any])
        
        inline def setGroupExpansionMaxUndefined: Self = StObject.set(x, "groupExpansionMax", js.undefined)
        
        inline def setItems(value: js.Array[FreeBusyRequestItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: FreeBusyRequestItem*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
        
        inline def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
        
        inline def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
        
        inline def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
        
        inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
        
        inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
      }
    }
    
    trait FreeBusyRequestItem extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
    }
    object FreeBusyRequestItem {
      
      inline def apply(): FreeBusyRequestItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FreeBusyRequestItem]
      }
      
      extension [Self <: FreeBusyRequestItem](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      }
    }
    
    trait FreeBusyResponse extends StObject {
      
      var calendars: js.UndefOr[js.Object] = js.undefined
      
      var groups: js.UndefOr[js.Object] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var timeMax: js.UndefOr[String] = js.undefined
      
      var timeMin: js.UndefOr[String] = js.undefined
    }
    object FreeBusyResponse {
      
      inline def apply(): FreeBusyResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FreeBusyResponse]
      }
      
      extension [Self <: FreeBusyResponse](x: Self) {
        
        inline def setCalendars(value: js.Object): Self = StObject.set(x, "calendars", value.asInstanceOf[js.Any])
        
        inline def setCalendarsUndefined: Self = StObject.set(x, "calendars", js.undefined)
        
        inline def setGroups(value: js.Object): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
        
        inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setTimeMax(value: String): Self = StObject.set(x, "timeMax", value.asInstanceOf[js.Any])
        
        inline def setTimeMaxUndefined: Self = StObject.set(x, "timeMax", js.undefined)
        
        inline def setTimeMin(value: String): Self = StObject.set(x, "timeMin", value.asInstanceOf[js.Any])
        
        inline def setTimeMinUndefined: Self = StObject.set(x, "timeMin", js.undefined)
      }
    }
    
    trait Setting extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var value: js.UndefOr[String] = js.undefined
    }
    object Setting {
      
      inline def apply(): Setting = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Setting]
      }
      
      extension [Self <: Setting](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      }
    }
    
    trait Settings extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Setting]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
      
      var nextSyncToken: js.UndefOr[String] = js.undefined
    }
    object Settings {
      
      inline def apply(): Settings = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Settings]
      }
      
      extension [Self <: Settings](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[Setting]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Setting*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        
        inline def setNextSyncToken(value: String): Self = StObject.set(x, "nextSyncToken", value.asInstanceOf[js.Any])
        
        inline def setNextSyncTokenUndefined: Self = StObject.set(x, "nextSyncToken", js.undefined)
      }
    }
    
    trait TimePeriod extends StObject {
      
      var end: js.UndefOr[String] = js.undefined
      
      var start: js.UndefOr[String] = js.undefined
    }
    object TimePeriod {
      
      inline def apply(): TimePeriod = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TimePeriod]
      }
      
      extension [Self <: TimePeriod](x: Self) {
        
        inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
        
        inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      }
    }
  }
}

package typings.expo.expoMod

import typings.expo.Anon_Coords
import typings.expo.expoMod.CalendarNs.Alarm
import typings.expo.expoMod.CalendarNs.AlarmMethod
import typings.expo.expoMod.CalendarNs.Attendee
import typings.expo.expoMod.CalendarNs.AttendeeRole
import typings.expo.expoMod.CalendarNs.AttendeeStatus
import typings.expo.expoMod.CalendarNs.AttendeeType
import typings.expo.expoMod.CalendarNs.Availability
import typings.expo.expoMod.CalendarNs.Calendar
import typings.expo.expoMod.CalendarNs.CalendarAccessLevel
import typings.expo.expoMod.CalendarNs.CalendarType
import typings.expo.expoMod.CalendarNs.EntityTypes
import typings.expo.expoMod.CalendarNs.Event
import typings.expo.expoMod.CalendarNs.EventAccessLevel
import typings.expo.expoMod.CalendarNs.EventStatus
import typings.expo.expoMod.CalendarNs.Frequency
import typings.expo.expoMod.CalendarNs.RecurrenceRule
import typings.expo.expoMod.CalendarNs.RecurringEventOptions
import typings.expo.expoMod.CalendarNs.Reminder
import typings.expo.expoMod.CalendarNs.ReminderStatus
import typings.expo.expoMod.CalendarNs.Source
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Calendar")
@js.native
object CalendarNs extends js.Object {
  trait Alarm extends js.Object {
    /** Date object or string representing an absolute time the alarm should occur; overrides relativeOffset and structuredLocation if specified alongside either */
    var absoluteDate: js.UndefOr[String] = js.undefined
    /** Method of alerting the user that this alarm should use; on iOS this is always a notification */
    var method: js.UndefOr[AlarmMethod] = js.undefined
     // iOS
    /** Number of minutes from the startDate of the calendar item that the alarm should occur; use negative values to have the alarm occur before the startDate */
    var relativeOffset: js.UndefOr[String] = js.undefined
    var structuredLocation: js.UndefOr[Anon_Coords] = js.undefined
  }
  
  @js.native
  sealed trait AlarmMethod extends js.Object
  
  trait Attendee extends js.Object {
     // iOS
    /** Email address of the attendee */
    var email: js.UndefOr[String] = js.undefined
    /** Internal ID that represents this attendee on the device */
    var id: js.UndefOr[String] = js.undefined
     // Android
    /** Indicates whether or not this attendee is the current OS user */
    var isCurrentUser: js.UndefOr[Boolean] = js.undefined
     // iOS
    /** Displayed name of the attendee */
    var name: js.UndefOr[String] = js.undefined
    /** Role of the attendee at the event */
    var role: js.UndefOr[AttendeeRole] = js.undefined
    /** Status of the attendee in relation to the event */
    var status: js.UndefOr[AttendeeStatus] = js.undefined
    /** Type of the attendee */
    var `type`: js.UndefOr[AttendeeType] = js.undefined
    /** URL for the attendee */
    var url: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  sealed trait AttendeeRole extends js.Object
  
  @js.native
  sealed trait AttendeeStatus extends js.Object
  
  @js.native
  sealed trait AttendeeType extends js.Object
  
  @js.native
  sealed trait Availability extends js.Object
  
  trait Calendar extends js.Object {
     // Android
    /** Level of access that the user has for the calendar */
    var accessLevel: js.UndefOr[CalendarAccessLevel] = js.undefined
     // Android
    /** Attendee types that this calendar supports */
    var allowedAttendeeTypes: js.UndefOr[js.Array[AttendeeType]] = js.undefined
    /** Availability types that this calendar supports */
    var allowedAvailabilities: js.UndefOr[js.Array[Availability]] = js.undefined
     // Android
    /** Alarm methods that this calendar supports */
    var allowedReminders: js.UndefOr[js.Array[AlarmMethod]] = js.undefined
     // iOS
    /** Boolean value that determines whether this calendar can be modified */
    var allowsModifications: js.UndefOr[Boolean] = js.undefined
     // iOS
    /** Color used to display this calendar’s events */
    var color: js.UndefOr[String] = js.undefined
    /** Whether the calendar is used in the Calendar or Reminders OS app */
    var entityType: js.UndefOr[EntityTypes] = js.undefined
    /** Internal ID that represents this calendar on the device */
    var id: js.UndefOr[String] = js.undefined
    /** Boolean value indicating whether this is the device’s primary calendar */
    var isPrimary: js.UndefOr[Boolean] = js.undefined
     // Android
    /** Indicates whether this calendar is synced and its events stored on the device */
    var isSynced: js.UndefOr[Boolean] = js.undefined
     // Android
    /** Indicates whether the OS displays events on this calendar */
    var isVisible: js.UndefOr[Boolean] = js.undefined
     // Android
    /** Internal system name of the calendar */
    var name: js.UndefOr[String] = js.undefined
     // Android
    /** Name for the account that owns this calendar */
    var ownerAccount: js.UndefOr[String] = js.undefined
     // iOS
    /** Object representing the source to be used for the calendar */
    var source: js.UndefOr[Source] = js.undefined
    var sourceId: js.UndefOr[String] = js.undefined
     // Android
    /** Time zone for the calendar */
    var timeZone: js.UndefOr[String] = js.undefined
    /** Visible name of the calendar */
    var title: js.UndefOr[String] = js.undefined
    /** Type of calendar this object represents */
    var `type`: js.UndefOr[CalendarType] = js.undefined
  }
  
  @js.native
  sealed trait CalendarAccessLevel extends js.Object
  
  @js.native
  sealed trait CalendarType extends js.Object
  
  @js.native
  sealed trait EntityTypes extends js.Object
  
  trait Event extends js.Object {
     // Android
    /** User’s access level for the event */
    var accessLevel: js.UndefOr[EventAccessLevel] = js.undefined
    /** Array of Alarm objects which control automated reminders to the user */
    var alarms: js.UndefOr[js.Array[Alarm]] = js.undefined
     // iOS
    /** Whether the event is displayed as an all-day event on the calendar */
    var allDay: js.UndefOr[Boolean] = js.undefined
    /** The availability setting for the event */
    var availability: js.UndefOr[Availability] = js.undefined
    /** ID of the calendar that contains this event */
    var calendarId: js.UndefOr[String] = js.undefined
    /** Date when the event record was created */
    var creationDate: js.UndefOr[String] = js.undefined
    /** Date object or string representing the time when the event ends */
    var endDate: js.UndefOr[String | Date] = js.undefined
    /** Time zone for the event end time */
    var endTimeZone: js.UndefOr[String] = js.undefined
     // Android,
    /** Whether invited guests can invite other guests */
    var guestsCanInviteOthers: js.UndefOr[Boolean] = js.undefined
     // Android,
    /** Whether invited guests can modify the details of the event */
    var guestsCanModify: js.UndefOr[Boolean] = js.undefined
     // Android
    /** Whether invited guests can see other guests */
    var guestsCanSeeGuests: js.UndefOr[Boolean] = js.undefined
    /** Internal ID that represents this event on the device */
    var id: js.UndefOr[String] = js.undefined
     // Android
    /** For instances of recurring events, volatile ID representing this instance; not guaranteed to always refer to the same instance */
    var instanceId: js.UndefOr[String] = js.undefined
     // iOS
    /** Boolean value indicating whether or not the event is a detached (modified) instance of a recurring event */
    var isDetached: js.UndefOr[Boolean] = js.undefined
     // iOS
    /** Date when the event record was last modified */
    var lastModifiedDate: js.UndefOr[String] = js.undefined
    /** Location field of the event */
    var location: js.UndefOr[String] = js.undefined
     // iOS
    /** Description or notes saved with the event */
    var notes: js.UndefOr[String] = js.undefined
     // Status
    /** Organizer of the event, as an Attendee object */
    var organizer: js.UndefOr[String] = js.undefined
     // Organizer - iOS
    /** Email address of the organizer of the event */
    var organizerEmail: js.UndefOr[String] = js.undefined
     // Android
    /** For detached (modified) instances of recurring events, the ID of the original recurring event */
    var originalId: js.UndefOr[String] = js.undefined
    /** For recurring events, the start date for the first (original) instance of the event */
    var originalStartDate: js.UndefOr[String] = js.undefined
    /** Object representing rules for recurring or repeating events. Null for one-time events. */
    var recurrenceRule: js.UndefOr[RecurrenceRule] = js.undefined
    /** Date object or string representing the time when the event starts */
    var startDate: js.UndefOr[String | Date] = js.undefined
     // Availability
    /** Status of the event */
    var status: js.UndefOr[EventStatus] = js.undefined
     // iOS
    /** Time zone the event is scheduled in */
    var timeZone: js.UndefOr[String] = js.undefined
    /** Visible name of the event */
    var title: js.UndefOr[String] = js.undefined
     // Android
    /** URL for the event */
    var url: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  sealed trait EventAccessLevel extends js.Object
  
  @js.native
  sealed trait EventStatus extends js.Object
  
  @js.native
  sealed trait Frequency extends js.Object
  
  trait RecurrenceRule extends js.Object {
    /** Date on which the calendar item should stop recurring; overrides occurrence if both are specified */
    var endDate: js.UndefOr[String] = js.undefined
    /** How often the calendar item should recur */
    var frequency: Frequency
     // Frequency
    /** Interval at which the calendar item should recur. For example, an interval: 2 with frequency: DAILY would yield an event that recurs every other day. Defaults to 1 . */
    var interval: js.UndefOr[Double] = js.undefined
    /** Number of times the calendar item should recur before stopping */
    var occurrence: js.UndefOr[Double] = js.undefined
  }
  
  trait RecurringEventOptions extends js.Object {
    var futureEvents: js.UndefOr[Boolean] = js.undefined
    var instanceStartDate: js.UndefOr[String] = js.undefined
  }
  
  trait Reminder extends js.Object {
    /** Array of Alarm objects which control automated alarms to the user about the task */
    var alarms: js.UndefOr[js.Array[Alarm]] = js.undefined
    /** ID of the calendar that contains this reminder */
    var calendarId: js.UndefOr[String] = js.undefined
    /** Indicates whether or not the task has been completed */
    var completed: js.UndefOr[Boolean] = js.undefined
    /** Date object or string representing the date of completion, if completed is true */
    var completionDate: js.UndefOr[String] = js.undefined
    /** Date when the reminder record was created */
    var creationDate: js.UndefOr[String] = js.undefined
    /** Date object or string representing the time when the reminder task is due */
    var dueDate: js.UndefOr[String] = js.undefined
    /** Internal ID that represents this reminder on the device */
    var id: js.UndefOr[String] = js.undefined
    /** Date when the reminder record was last modified */
    var lastModifiedDate: js.UndefOr[String] = js.undefined
    /** Location field of the reminder */
    var location: js.UndefOr[String] = js.undefined
    /** Description or notes saved with the reminder */
    var notes: js.UndefOr[String] = js.undefined
    /** Object representing rules for recurring or repeated reminders. Null for one-time tasks. */
    var recurrenceRule: js.UndefOr[RecurrenceRule] = js.undefined
    /** Date object or string representing the start date of the reminder task */
    var startDate: js.UndefOr[String] = js.undefined
    /** Time zone the reminder is scheduled in */
    var timeZone: js.UndefOr[String] = js.undefined
    /** Visible name of the reminder */
    var title: js.UndefOr[String] = js.undefined
    /** URL for the reminder */
    var url: js.UndefOr[String] = js.undefined
  }
  
  @js.native
  sealed trait ReminderStatus extends js.Object
  
  trait Source extends js.Object {
    /** Internal ID that represents this source on the device */
    var id: js.UndefOr[String] = js.undefined
    /** Whether this source is the local phone account */
    var isLocalAccount: js.UndefOr[Boolean] = js.undefined
    /** Name for the account that owns this calendar */
    var name: js.UndefOr[String] = js.undefined
     // iOS only ??
    /** Type of account that owns this calendar */
    var `type`: js.UndefOr[String] = js.undefined
  }
  
  /** Available on Android only. Creates a new attendee record and adds it to the specified event. Note that if eventId specifies a recurring event, this will add the attendee to every instance of the event. */
  def createAttendeeAsync(/**  ID of the event to add this attendee to. Required. */
  eventId: String): js.Promise[String] = js.native
  def createAttendeeAsync(
    /**  ID of the event to add this attendee to. Required. */
  eventId: String,
    /** A map of details for the attendee to be created  */
  details: Attendee
  ): js.Promise[String] = js.native
  /** Creates a new calendar on the device, allowing events to be added later and displayed. */
  def createCalendarAsync(details: Calendar): js.Promise[String] = js.native
  /** Creates a new event on the specified calendar. */
  def createEventAsync(/** ID of the calendar to create this event in. Required. */
  calendarId: String): js.Promise[String] = js.native
  def createEventAsync(/** ID of the calendar to create this event in. Required. */
  calendarId: String, details: Event): js.Promise[String] = js.native
  /** Available on iOS only. Creates a new reminder on the specified calendar. */
  def createReminderAsync(/** ID of the calendar to create this reminder in. Required. */
  calendarId: String): js.Promise[String] = js.native
  def createReminderAsync(
    /** ID of the calendar to create this reminder in. Required. */
  calendarId: String,
    /** A map of details for the reminder to be created */
  details: Reminder
  ): js.Promise[String] = js.native
  /** Available on Android only. Deletes an existing attendee record from the device. Use with caution. */
  def deleteAttendeeAsync(id: String): js.Promise[Unit] = js.native
  /** Deletes an existing calendar and all associated events/reminders/attendees from the device. Use with caution. */
  def deleteCalendarAsync(id: String): js.Promise[Unit] = js.native
  /** Deletes an existing event from the device. Use with caution. */
  def deleteEventAsync(/** ID of the event to be deleted. Required. */
  id: String): js.Promise[Unit] = js.native
  def deleteEventAsync(
    /** ID of the event to be deleted. Required. */
  id: String,
    /** A map of options for recurring events */
  recurringEventOptions: RecurringEventOptions
  ): js.Promise[Unit] = js.native
  /** Available on iOS only. Deletes an existing reminder from the device. Use with caution. */
  def deleteReminderAsync(id: String): js.Promise[Unit] = js.native
  /** Gets all attendees for a given event (or instance of a recurring event). */
  def getAttendeesForEventAsync(/** ID of the event to return attendees for. Required. */
  eventId: String): js.Promise[js.Array[Attendee]] = js.native
  def getAttendeesForEventAsync(
    /** ID of the event to return attendees for. Required. */
  eventId: String,
    /** A map of options for recurring events */
  recurrentEventOptions: RecurringEventOptions
  ): js.Promise[js.Array[Attendee]] = js.native
  /** Gets an array of calendar objects with details about the different calendars stored on the device. */
  def getCalendarsAsync(): js.Promise[js.Array[Calendar]] = js.native
  def getCalendarsAsync(
    /** (iOS only) Not required, but if defined, filters the returned calendars to a specific entity type.  */
  entityType: EntityTypes
  ): js.Promise[js.Array[Calendar]] = js.native
  /** Returns a specific event selected by ID. If a specific instance of a recurring event is desired, the start date of this instance must also be provided, as instances of recurring events do not have their own unique and stable IDs on either iOS or Android. */
  def getEventAsync(/** ID of the event to return. Required. */
  id: String): js.Promise[Event] = js.native
  def getEventAsync(
    /** ID of the event to return. Required. */
  id: String,
    /** A map of options for recurring events */
  recurringEventOptions: RecurringEventOptions
  ): js.Promise[Event] = js.native
  /** Returns all events in a given set of calendars over a specified time period. */
  def getEventsAsync(
    /** Array of IDs of calendars to search for events in. Required. */
  calendarIds: js.Array[String],
    /** Beginning of time period to search for events in. Required. */
  startDate: Date,
    /** End of time period to search for events in. Required. */
  endDate: Date
  ): js.Promise[js.Array[Event]] = js.native
  /** Available on iOS only. Returns a specific reminder selected by ID. */
  def getReminderAsync(id: String): js.Promise[Reminder] = js.native
  /** Available on iOS only. Returns a list of reminders matching the provided criteria. */
  def getRemindersAsync(
    /**  Array of IDs of calendars to search for reminders in. Required. */
  calendarIds: js.Array[String]
  ): js.Promise[js.Array[Reminder]] = js.native
  def getRemindersAsync(
    /**  Array of IDs of calendars to search for reminders in. Required. */
  calendarIds: js.Array[String],
    status: ReminderStatus
  ): js.Promise[js.Array[Reminder]] = js.native
  def getRemindersAsync(
    /**  Array of IDs of calendars to search for reminders in. Required. */
  calendarIds: js.Array[String],
    status: ReminderStatus,
    /** Beginning of time period to search for reminders in. Required if status is defined. */
  startDate: Date
  ): js.Promise[js.Array[Reminder]] = js.native
  def getRemindersAsync(
    /**  Array of IDs of calendars to search for reminders in. Required. */
  calendarIds: js.Array[String],
    status: ReminderStatus,
    /** Beginning of time period to search for reminders in. Required if status is defined. */
  startDate: Date,
    /** End of time period to search for reminders in. Required if status is defined. */
  endDate: Date
  ): js.Promise[js.Array[Reminder]] = js.native
  /** Available on iOS only. Returns a specific source selected by ID. */
  def getSourceAsync(id: String): js.Promise[Source] = js.native
  /** Available on iOS only. */
  def getSourcesAsync(): js.Promise[js.Array[Source]] = js.native
  /** Available on Android only. Sends an intent to open the specified event in the OS Calendar app. */
  def openEventInCalendar(/** ID of the event to open. Required. */
  id: String): Unit = js.native
  /** Available on Android only. Updates an existing attendee record. To remove a property, explicitly set it to null in details. */
  def updateAttendeeAsync(/** ID of the attendee record to be updated. Required. */
  id: String): js.Promise[String] = js.native
  def updateAttendeeAsync(
    /** ID of the attendee record to be updated. Required. */
  id: String,
    /** A map of properties to be updated  */
  details: Attendee
  ): js.Promise[String] = js.native
  /** Updates the provided details of an existing calendar stored on the device. To remove a property, explicitly set it to null in details */
  def updateCalendarAsync(id: String): js.Promise[String] = js.native
  def updateCalendarAsync(id: String, details: Calendar): js.Promise[String] = js.native
  /** Updates the provided details of an existing calendar stored on the device. To remove a property, explicitly set it to null in details */
  def updateEventAsync(/** ID of the event to be updated. Required. */
  id: String): js.Promise[String] = js.native
  def updateEventAsync(
    /** ID of the event to be updated. Required. */
  id: String,
    /** A map of properties to be updated  */
  details: Null,
    /** A map of options for recurring events */
  recurrentEventOptions: RecurringEventOptions
  ): js.Promise[String] = js.native
  def updateEventAsync(
    /** ID of the event to be updated. Required. */
  id: String,
    /** A map of properties to be updated  */
  details: Event
  ): js.Promise[String] = js.native
  def updateEventAsync(
    /** ID of the event to be updated. Required. */
  id: String,
    /** A map of properties to be updated  */
  details: Event,
    /** A map of options for recurring events */
  recurrentEventOptions: RecurringEventOptions
  ): js.Promise[String] = js.native
  /** Available on iOS only. Updates the provided details of an existing reminder stored on the device. To remove a property, explicitly set it to null in details. */
  def updateReminderAsync(/** ID of the reminder to be updated. Required. */
  id: String): js.Promise[String] = js.native
  def updateReminderAsync(
    /** ID of the reminder to be updated. Required. */
  id: String,
    /** A map of properties to be updated */
  details: Reminder
  ): js.Promise[String] = js.native
  @js.native
  object AlarmMethod extends js.Object {
    @js.native
    sealed trait ALARM extends AlarmMethod
    
    @js.native
    sealed trait ALERT extends AlarmMethod
    
    @js.native
    sealed trait DEFAULT extends AlarmMethod
    
    @js.native
    sealed trait EMAIL extends AlarmMethod
    
    @js.native
    sealed trait SMS extends AlarmMethod
    
    /* "alarm" */ val ALARM: typings.expo.expoMod.CalendarNs.AlarmMethod.ALARM with String = js.native
    /* "alert" */ val ALERT: typings.expo.expoMod.CalendarNs.AlarmMethod.ALERT with String = js.native
    /* "default" */ val DEFAULT: typings.expo.expoMod.CalendarNs.AlarmMethod.DEFAULT with String = js.native
    /* "email" */ val EMAIL: typings.expo.expoMod.CalendarNs.AlarmMethod.EMAIL with String = js.native
    /* "sms" */ val SMS: typings.expo.expoMod.CalendarNs.AlarmMethod.SMS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AlarmMethod with String] = js.native
  }
  
  @js.native
  object AttendeeRole extends js.Object {
     // Android
    @js.native
    sealed trait ATTENDEE extends AttendeeRole
    
     // iOS
    @js.native
    sealed trait CHAIR extends AttendeeRole
    
    @js.native
    sealed trait NONE extends AttendeeRole
    
     // iOS
    @js.native
    sealed trait NON_PARTICIPANT extends AttendeeRole
    
     // iOS
    @js.native
    sealed trait OPTIONAL extends AttendeeRole
    
     // Android
    @js.native
    sealed trait ORGANIZER extends AttendeeRole
    
     // Android
    @js.native
    sealed trait PERFORMER extends AttendeeRole
    
     // iOS
    @js.native
    sealed trait REQUIRED extends AttendeeRole
    
     // Android
    @js.native
    sealed trait SPEAKER extends AttendeeRole
    
     // iOS
    @js.native
    sealed trait UNKNOWN extends AttendeeRole
    
    /* "attendee" */ val ATTENDEE: typings.expo.expoMod.CalendarNs.AttendeeRole.ATTENDEE with String = js.native
    /* "chair" */ val CHAIR: typings.expo.expoMod.CalendarNs.AttendeeRole.CHAIR with String = js.native
    /* "none" */ val NONE: typings.expo.expoMod.CalendarNs.AttendeeRole.NONE with String = js.native
    /* "nonParticipant" */ val NON_PARTICIPANT: typings.expo.expoMod.CalendarNs.AttendeeRole.NON_PARTICIPANT with String = js.native
    /* "optional" */ val OPTIONAL: typings.expo.expoMod.CalendarNs.AttendeeRole.OPTIONAL with String = js.native
    /* "organizer" */ val ORGANIZER: typings.expo.expoMod.CalendarNs.AttendeeRole.ORGANIZER with String = js.native
    /* "performer" */ val PERFORMER: typings.expo.expoMod.CalendarNs.AttendeeRole.PERFORMER with String = js.native
    /* "required" */ val REQUIRED: typings.expo.expoMod.CalendarNs.AttendeeRole.REQUIRED with String = js.native
    /* "speaker" */ val SPEAKER: typings.expo.expoMod.CalendarNs.AttendeeRole.SPEAKER with String = js.native
    /* "unknown" */ val UNKNOWN: typings.expo.expoMod.CalendarNs.AttendeeRole.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AttendeeRole with String] = js.native
  }
  
  @js.native
  object AttendeeStatus extends js.Object {
    @js.native
    sealed trait ACCEPTED extends AttendeeStatus
    
     // iOS
    @js.native
    sealed trait COMPLETED extends AttendeeStatus
    
    @js.native
    sealed trait DECLINED extends AttendeeStatus
    
     // iOS
    @js.native
    sealed trait DELEGATED extends AttendeeStatus
    
     // Android
    @js.native
    sealed trait INVITED extends AttendeeStatus
    
     // iOS
    @js.native
    sealed trait IN_PROCESS extends AttendeeStatus
    
    @js.native
    sealed trait NONE extends AttendeeStatus
    
     // iOS
    @js.native
    sealed trait PENDING extends AttendeeStatus
    
    @js.native
    sealed trait TENTATIVE extends AttendeeStatus
    
     // iOS
    @js.native
    sealed trait UNKNOWN extends AttendeeStatus
    
    /* "accepted" */ val ACCEPTED: typings.expo.expoMod.CalendarNs.AttendeeStatus.ACCEPTED with String = js.native
    /* "completed" */ val COMPLETED: typings.expo.expoMod.CalendarNs.AttendeeStatus.COMPLETED with String = js.native
    /* "declined" */ val DECLINED: typings.expo.expoMod.CalendarNs.AttendeeStatus.DECLINED with String = js.native
    /* "delegated" */ val DELEGATED: typings.expo.expoMod.CalendarNs.AttendeeStatus.DELEGATED with String = js.native
    /* "invited" */ val INVITED: typings.expo.expoMod.CalendarNs.AttendeeStatus.INVITED with String = js.native
    /* "inProcess" */ val IN_PROCESS: typings.expo.expoMod.CalendarNs.AttendeeStatus.IN_PROCESS with String = js.native
    /* "none" */ val NONE: typings.expo.expoMod.CalendarNs.AttendeeStatus.NONE with String = js.native
    /* "pending" */ val PENDING: typings.expo.expoMod.CalendarNs.AttendeeStatus.PENDING with String = js.native
    /* "tentative" */ val TENTATIVE: typings.expo.expoMod.CalendarNs.AttendeeStatus.TENTATIVE with String = js.native
    /* "unknown" */ val UNKNOWN: typings.expo.expoMod.CalendarNs.AttendeeStatus.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AttendeeStatus with String] = js.native
  }
  
  @js.native
  object AttendeeType extends js.Object {
     // iOS
    @js.native
    sealed trait GROUP extends AttendeeType
    
    @js.native
    sealed trait NONE extends AttendeeType
    
     // Android
    @js.native
    sealed trait OPTIONAL extends AttendeeType
    
     // iOS
    @js.native
    sealed trait PERSON extends AttendeeType
    
     // Android
    @js.native
    sealed trait REQUIRED extends AttendeeType
    
    @js.native
    sealed trait RESOURCE extends AttendeeType
    
     // iOS
    @js.native
    sealed trait ROOM extends AttendeeType
    
     // iOS
    @js.native
    sealed trait UNKNOWN extends AttendeeType
    
    /* "group" */ val GROUP: typings.expo.expoMod.CalendarNs.AttendeeType.GROUP with String = js.native
    /* "none" */ val NONE: typings.expo.expoMod.CalendarNs.AttendeeType.NONE with String = js.native
    /* "optional" */ val OPTIONAL: typings.expo.expoMod.CalendarNs.AttendeeType.OPTIONAL with String = js.native
    /* "person" */ val PERSON: typings.expo.expoMod.CalendarNs.AttendeeType.PERSON with String = js.native
    /* "required" */ val REQUIRED: typings.expo.expoMod.CalendarNs.AttendeeType.REQUIRED with String = js.native
    /* "resource" */ val RESOURCE: typings.expo.expoMod.CalendarNs.AttendeeType.RESOURCE with String = js.native
    /* "room" */ val ROOM: typings.expo.expoMod.CalendarNs.AttendeeType.ROOM with String = js.native
    /* "unknown" */ val UNKNOWN: typings.expo.expoMod.CalendarNs.AttendeeType.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[AttendeeType with String] = js.native
  }
  
  @js.native
  object Availability extends js.Object {
    @js.native
    sealed trait BUSY extends Availability
    
    @js.native
    sealed trait FREE extends Availability
    
     // iOS
    @js.native
    sealed trait NOT_SUPPORTED extends Availability
    
    @js.native
    sealed trait TENTATIVE extends Availability
    
    @js.native
    sealed trait UNAVAILABLE extends Availability
    
    /* "busy" */ val BUSY: typings.expo.expoMod.CalendarNs.Availability.BUSY with String = js.native
    /* "free" */ val FREE: typings.expo.expoMod.CalendarNs.Availability.FREE with String = js.native
    /* "notSupported" */ val NOT_SUPPORTED: typings.expo.expoMod.CalendarNs.Availability.NOT_SUPPORTED with String = js.native
    /* "tentative" */ val TENTATIVE: typings.expo.expoMod.CalendarNs.Availability.TENTATIVE with String = js.native
    /* "unavailable" */ val UNAVAILABLE: typings.expo.expoMod.CalendarNs.Availability.UNAVAILABLE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Availability with String] = js.native
  }
  
  @js.native
  object CalendarAccessLevel extends js.Object {
    @js.native
    sealed trait CONTRIBUTOR extends CalendarAccessLevel
    
    @js.native
    sealed trait EDITOR extends CalendarAccessLevel
    
    @js.native
    sealed trait FREEBUSY extends CalendarAccessLevel
    
    @js.native
    sealed trait NONE extends CalendarAccessLevel
    
    @js.native
    sealed trait OVERRIDE extends CalendarAccessLevel
    
    @js.native
    sealed trait OWNER extends CalendarAccessLevel
    
    @js.native
    sealed trait READ extends CalendarAccessLevel
    
    @js.native
    sealed trait RESPOND extends CalendarAccessLevel
    
    @js.native
    sealed trait ROOT extends CalendarAccessLevel
    
    /* "contributor" */ val CONTRIBUTOR: typings.expo.expoMod.CalendarNs.CalendarAccessLevel.CONTRIBUTOR with String = js.native
    /* "editor" */ val EDITOR: typings.expo.expoMod.CalendarNs.CalendarAccessLevel.EDITOR with String = js.native
    /* "freebusy" */ val FREEBUSY: typings.expo.expoMod.CalendarNs.CalendarAccessLevel.FREEBUSY with String = js.native
    /* "none" */ val NONE: typings.expo.expoMod.CalendarNs.CalendarAccessLevel.NONE with String = js.native
    /* "override" */ val OVERRIDE: typings.expo.expoMod.CalendarNs.CalendarAccessLevel.OVERRIDE with String = js.native
    /* "owner" */ val OWNER: typings.expo.expoMod.CalendarNs.CalendarAccessLevel.OWNER with String = js.native
    /* "read" */ val READ: typings.expo.expoMod.CalendarNs.CalendarAccessLevel.READ with String = js.native
    /* "respond" */ val RESPOND: typings.expo.expoMod.CalendarNs.CalendarAccessLevel.RESPOND with String = js.native
    /* "root" */ val ROOT: typings.expo.expoMod.CalendarNs.CalendarAccessLevel.ROOT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalendarAccessLevel with String] = js.native
  }
  
  @js.native
  object CalendarType extends js.Object {
    @js.native
    sealed trait BIRTHDAYS extends CalendarType
    
    @js.native
    sealed trait CALDAV extends CalendarType
    
    @js.native
    sealed trait EXCHANGE extends CalendarType
    
    @js.native
    sealed trait LOCAL extends CalendarType
    
    @js.native
    sealed trait SUBSCRIBED extends CalendarType
    
    /* "birthdays" */ val BIRTHDAYS: typings.expo.expoMod.CalendarNs.CalendarType.BIRTHDAYS with String = js.native
    /* "caldav" */ val CALDAV: typings.expo.expoMod.CalendarNs.CalendarType.CALDAV with String = js.native
    /* "exchange" */ val EXCHANGE: typings.expo.expoMod.CalendarNs.CalendarType.EXCHANGE with String = js.native
    /* "local" */ val LOCAL: typings.expo.expoMod.CalendarNs.CalendarType.LOCAL with String = js.native
    /* "subscribed" */ val SUBSCRIBED: typings.expo.expoMod.CalendarNs.CalendarType.SUBSCRIBED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalendarType with String] = js.native
  }
  
  @js.native
  object EntityTypes extends js.Object {
    @js.native
    sealed trait EVENT extends EntityTypes
    
    @js.native
    sealed trait REMINDER extends EntityTypes
    
    /* "event" */ val EVENT: typings.expo.expoMod.CalendarNs.EntityTypes.EVENT with String = js.native
    /* "reminder" */ val REMINDER: typings.expo.expoMod.CalendarNs.EntityTypes.REMINDER with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EntityTypes with String] = js.native
  }
  
  @js.native
  object EventAccessLevel extends js.Object {
    @js.native
    sealed trait CONFIDENTIAL extends EventAccessLevel
    
    @js.native
    sealed trait DEFAULT extends EventAccessLevel
    
    @js.native
    sealed trait PRIVATE extends EventAccessLevel
    
    @js.native
    sealed trait PUBLIC extends EventAccessLevel
    
    /* "confidential" */ val CONFIDENTIAL: typings.expo.expoMod.CalendarNs.EventAccessLevel.CONFIDENTIAL with String = js.native
    /* "default" */ val DEFAULT: typings.expo.expoMod.CalendarNs.EventAccessLevel.DEFAULT with String = js.native
    /* "private" */ val PRIVATE: typings.expo.expoMod.CalendarNs.EventAccessLevel.PRIVATE with String = js.native
    /* "public" */ val PUBLIC: typings.expo.expoMod.CalendarNs.EventAccessLevel.PUBLIC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventAccessLevel with String] = js.native
  }
  
  @js.native
  object EventStatus extends js.Object {
    @js.native
    sealed trait CANCELED extends EventStatus
    
    @js.native
    sealed trait CONFIRMED extends EventStatus
    
    @js.native
    sealed trait NONE extends EventStatus
    
    @js.native
    sealed trait TENTATIVE extends EventStatus
    
    /* "canceled" */ val CANCELED: typings.expo.expoMod.CalendarNs.EventStatus.CANCELED with String = js.native
    /* "confirmed" */ val CONFIRMED: typings.expo.expoMod.CalendarNs.EventStatus.CONFIRMED with String = js.native
    /* "none" */ val NONE: typings.expo.expoMod.CalendarNs.EventStatus.NONE with String = js.native
    /* "tentative" */ val TENTATIVE: typings.expo.expoMod.CalendarNs.EventStatus.TENTATIVE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventStatus with String] = js.native
  }
  
  @js.native
  object Frequency extends js.Object {
    @js.native
    sealed trait DAILY extends Frequency
    
    @js.native
    sealed trait MONTHLY extends Frequency
    
    @js.native
    sealed trait WEEKLY extends Frequency
    
    @js.native
    sealed trait YEARLY extends Frequency
    
    /* "daily" */ val DAILY: typings.expo.expoMod.CalendarNs.Frequency.DAILY with String = js.native
    /* "monthly" */ val MONTHLY: typings.expo.expoMod.CalendarNs.Frequency.MONTHLY with String = js.native
    /* "weekly" */ val WEEKLY: typings.expo.expoMod.CalendarNs.Frequency.WEEKLY with String = js.native
    /* "yearly" */ val YEARLY: typings.expo.expoMod.CalendarNs.Frequency.YEARLY with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Frequency with String] = js.native
  }
  
  @js.native
  object ReminderStatus extends js.Object {
    @js.native
    sealed trait COMPLETED extends ReminderStatus
    
    @js.native
    sealed trait INCOMPLETE extends ReminderStatus
    
    /* "completed" */ val COMPLETED: typings.expo.expoMod.CalendarNs.ReminderStatus.COMPLETED with String = js.native
    /* "incomplete" */ val INCOMPLETE: typings.expo.expoMod.CalendarNs.ReminderStatus.INCOMPLETE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ReminderStatus with String] = js.native
  }
  
}


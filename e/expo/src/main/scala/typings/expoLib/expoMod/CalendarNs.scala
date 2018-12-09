package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Calendar")
@js.native
object CalendarNs extends js.Object {
  
  trait Alarm extends js.Object {
    /** Date object or string representing an absolute time the alarm should occur; overrides relativeOffset and structuredLocation if specified alongside either */
    var absoluteDate: js.UndefOr[java.lang.String] = js.undefined
    /** Method of alerting the user that this alarm should use; on iOS this is always a notification */
    var method: js.UndefOr[AlarmMethod] = js.undefined
     // iOS
    /** Number of minutes from the startDate of the calendar item that the alarm should occur; use negative values to have the alarm occur before the startDate */
    var relativeOffset: js.UndefOr[java.lang.String] = js.undefined
    var structuredLocation: js.UndefOr[expoLib.Anon_Proximity] = js.undefined
  }
  
  @js.native
  sealed trait AlarmMethod extends js.Object
  
  
  trait Attendee extends js.Object {
     // iOS
    /** Email address of the attendee */
    var email: js.UndefOr[java.lang.String] = js.undefined
    /** Internal ID that represents this attendee on the device */
    var id: js.UndefOr[java.lang.String] = js.undefined
     // Android
    /** Indicates whether or not this attendee is the current OS user */
    var isCurrentUser: js.UndefOr[scala.Boolean] = js.undefined
     // iOS
    /** Displayed name of the attendee */
    var name: js.UndefOr[java.lang.String] = js.undefined
    /** Role of the attendee at the event */
    var role: js.UndefOr[AttendeeRole] = js.undefined
    /** Status of the attendee in relation to the event */
    var status: js.UndefOr[AttendeeStatus] = js.undefined
    /** Type of the attendee */
    var `type`: js.UndefOr[AttendeeType] = js.undefined
    /** URL for the attendee */
    var url: js.UndefOr[java.lang.String] = js.undefined
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
    var allowsModifications: js.UndefOr[scala.Boolean] = js.undefined
     // iOS
    /** Color used to display this calendar’s events */
    var color: js.UndefOr[java.lang.String] = js.undefined
    /** Whether the calendar is used in the Calendar or Reminders OS app */
    var entityType: js.UndefOr[EntityTypes] = js.undefined
    /** Internal ID that represents this calendar on the device */
    var id: js.UndefOr[java.lang.String] = js.undefined
    /** Boolean value indicating whether this is the device’s primary calendar */
    var isPrimary: js.UndefOr[scala.Boolean] = js.undefined
     // Android
    /** Indicates whether this calendar is synced and its events stored on the device */
    var isSynced: js.UndefOr[scala.Boolean] = js.undefined
     // Android
    /** Indicates whether the OS displays events on this calendar */
    var isVisible: js.UndefOr[scala.Boolean] = js.undefined
     // Android
    /** Internal system name of the calendar */
    var name: js.UndefOr[java.lang.String] = js.undefined
     // Android
    /** Name for the account that owns this calendar */
    var ownerAccount: js.UndefOr[java.lang.String] = js.undefined
     // iOS
    /** Object representing the source to be used for the calendar */
    var source: js.UndefOr[Source] = js.undefined
    var sourceId: js.UndefOr[java.lang.String] = js.undefined
     // Android
    /** Time zone for the calendar */
    var timeZone: js.UndefOr[java.lang.String] = js.undefined
    /** Visible name of the calendar */
    var title: js.UndefOr[java.lang.String] = js.undefined
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
    var allDay: js.UndefOr[scala.Boolean] = js.undefined
    /** The availability setting for the event */
    var availability: js.UndefOr[Availability] = js.undefined
    /** ID of the calendar that contains this event */
    var calendarId: js.UndefOr[java.lang.String] = js.undefined
    /** Date when the event record was created */
    var creationDate: js.UndefOr[java.lang.String] = js.undefined
    /** Date object or string representing the time when the event ends */
    var endDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
    /** Time zone for the event end time */
    var endTimeZone: js.UndefOr[java.lang.String] = js.undefined
     // Android,
    /** Whether invited guests can invite other guests */
    var guestsCanInviteOthers: js.UndefOr[scala.Boolean] = js.undefined
     // Android,
    /** Whether invited guests can modify the details of the event */
    var guestsCanModify: js.UndefOr[scala.Boolean] = js.undefined
     // Android
    /** Whether invited guests can see other guests */
    var guestsCanSeeGuests: js.UndefOr[scala.Boolean] = js.undefined
    /** Internal ID that represents this event on the device */
    var id: js.UndefOr[java.lang.String] = js.undefined
     // Android
    /** For instances of recurring events, volatile ID representing this instance; not guaranteed to always refer to the same instance */
    var instanceId: js.UndefOr[java.lang.String] = js.undefined
     // iOS
    /** Boolean value indicating whether or not the event is a detached (modified) instance of a recurring event */
    var isDetached: js.UndefOr[scala.Boolean] = js.undefined
     // iOS
    /** Date when the event record was last modified */
    var lastModifiedDate: js.UndefOr[java.lang.String] = js.undefined
    /** Location field of the event */
    var location: js.UndefOr[java.lang.String] = js.undefined
     // iOS
    /** Description or notes saved with the event */
    var notes: js.UndefOr[java.lang.String] = js.undefined
     // Status
    /** Organizer of the event, as an Attendee object */
    var organizer: js.UndefOr[java.lang.String] = js.undefined
     // Organizer - iOS
    /** Email address of the organizer of the event */
    var organizerEmail: js.UndefOr[java.lang.String] = js.undefined
     // Android
    /** For detached (modified) instances of recurring events, the ID of the original recurring event */
    var originalId: js.UndefOr[java.lang.String] = js.undefined
    /** For recurring events, the start date for the first (original) instance of the event */
    var originalStartDate: js.UndefOr[java.lang.String] = js.undefined
    /** Object representing rules for recurring or repeating events. Null for one-time events. */
    var recurrenceRule: js.UndefOr[RecurrenceRule] = js.undefined
    /** Date object or string representing the time when the event starts */
    var startDate: js.UndefOr[java.lang.String | stdLib.Date] = js.undefined
     // Availability
    /** Status of the event */
    var status: js.UndefOr[EventStatus] = js.undefined
     // iOS
    /** Time zone the event is scheduled in */
    var timeZone: js.UndefOr[java.lang.String] = js.undefined
    /** Visible name of the event */
    var title: js.UndefOr[java.lang.String] = js.undefined
     // Android
    /** URL for the event */
    var url: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  sealed trait EventAccessLevel extends js.Object
  
  @js.native
  sealed trait EventStatus extends js.Object
  
  @js.native
  sealed trait Frequency extends js.Object
  
  
  trait RecurrenceRule extends js.Object {
    /** Date on which the calendar item should stop recurring; overrides occurrence if both are specified */
    var endDate: js.UndefOr[java.lang.String] = js.undefined
    /** How often the calendar item should recur */
    var frequency: Frequency
     // Frequency
    /** Interval at which the calendar item should recur. For example, an interval: 2 with frequency: DAILY would yield an event that recurs every other day. Defaults to 1 . */
    var interval: js.UndefOr[scala.Double] = js.undefined
    /** Number of times the calendar item should recur before stopping */
    var occurrence: js.UndefOr[scala.Double] = js.undefined
  }
  
  
  trait RecurringEventOptions extends js.Object {
    var futureEvents: js.UndefOr[scala.Boolean] = js.undefined
    var instanceStartDate: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait Reminder extends js.Object {
    /** Array of Alarm objects which control automated alarms to the user about the task */
    var alarms: js.UndefOr[js.Array[Alarm]] = js.undefined
    /** ID of the calendar that contains this reminder */
    var calendarId: js.UndefOr[java.lang.String] = js.undefined
    /** Indicates whether or not the task has been completed */
    var completed: js.UndefOr[scala.Boolean] = js.undefined
    /** Date object or string representing the date of completion, if completed is true */
    var completionDate: js.UndefOr[java.lang.String] = js.undefined
    /** Date when the reminder record was created */
    var creationDate: js.UndefOr[java.lang.String] = js.undefined
    /** Date object or string representing the time when the reminder task is due */
    var dueDate: js.UndefOr[java.lang.String] = js.undefined
    /** Internal ID that represents this reminder on the device */
    var id: js.UndefOr[java.lang.String] = js.undefined
    /** Date when the reminder record was last modified */
    var lastModifiedDate: js.UndefOr[java.lang.String] = js.undefined
    /** Location field of the reminder */
    var location: js.UndefOr[java.lang.String] = js.undefined
    /** Description or notes saved with the reminder */
    var notes: js.UndefOr[java.lang.String] = js.undefined
    /** Object representing rules for recurring or repeated reminders. Null for one-time tasks. */
    var recurrenceRule: js.UndefOr[RecurrenceRule] = js.undefined
    /** Date object or string representing the start date of the reminder task */
    var startDate: js.UndefOr[java.lang.String] = js.undefined
    /** Time zone the reminder is scheduled in */
    var timeZone: js.UndefOr[java.lang.String] = js.undefined
    /** Visible name of the reminder */
    var title: js.UndefOr[java.lang.String] = js.undefined
    /** URL for the reminder */
    var url: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  sealed trait ReminderStatus extends js.Object
  
  
  trait Source extends js.Object {
    /** Internal ID that represents this source on the device */
    var id: js.UndefOr[java.lang.String] = js.undefined
    /** Whether this source is the local phone account */
    var isLocalAccount: js.UndefOr[scala.Boolean] = js.undefined
    /** Name for the account that owns this calendar */
    var name: js.UndefOr[java.lang.String] = js.undefined
     // iOS only ??
    /** Type of account that owns this calendar */
    var `type`: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /** Available on Android only. Creates a new attendee record and adds it to the specified event. Note that if eventId specifies a recurring event, this will add the attendee to every instance of the event. */
  def createAttendeeAsync(/**  ID of the event to add this attendee to. Required. */
  eventId: java.lang.String): js.Promise[java.lang.String] = js.native
  /** Available on Android only. Creates a new attendee record and adds it to the specified event. Note that if eventId specifies a recurring event, this will add the attendee to every instance of the event. */
  def createAttendeeAsync(
    /**  ID of the event to add this attendee to. Required. */
  eventId: java.lang.String,
    /** A map of details for the attendee to be created  */
  details: Attendee
  ): js.Promise[java.lang.String] = js.native
  /** Creates a new calendar on the device, allowing events to be added later and displayed. */
  def createCalendarAsync(details: Calendar): js.Promise[java.lang.String] = js.native
  /** Creates a new event on the specified calendar. */
  def createEventAsync(/** ID of the calendar to create this event in. Required. */
  calendarId: java.lang.String): js.Promise[java.lang.String] = js.native
  /** Creates a new event on the specified calendar. */
  def createEventAsync(
    /** ID of the calendar to create this event in. Required. */
  calendarId: java.lang.String,
    details: Event
  ): js.Promise[java.lang.String] = js.native
  /** Available on iOS only. Creates a new reminder on the specified calendar. */
  def createReminderAsync(/** ID of the calendar to create this reminder in. Required. */
  calendarId: java.lang.String): js.Promise[java.lang.String] = js.native
  /** Available on iOS only. Creates a new reminder on the specified calendar. */
  def createReminderAsync(
    /** ID of the calendar to create this reminder in. Required. */
  calendarId: java.lang.String,
    /** A map of details for the reminder to be created */
  details: Reminder
  ): js.Promise[java.lang.String] = js.native
  /** Available on Android only. Deletes an existing attendee record from the device. Use with caution. */
  def deleteAttendeeAsync(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Deletes an existing calendar and all associated events/reminders/attendees from the device. Use with caution. */
  def deleteCalendarAsync(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Deletes an existing event from the device. Use with caution. */
  def deleteEventAsync(/** ID of the event to be deleted. Required. */
  id: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Deletes an existing event from the device. Use with caution. */
  def deleteEventAsync(
    /** ID of the event to be deleted. Required. */
  id: java.lang.String,
    /** A map of options for recurring events */
  recurringEventOptions: RecurringEventOptions
  ): js.Promise[scala.Unit] = js.native
  /** Available on iOS only. Deletes an existing reminder from the device. Use with caution. */
  def deleteReminderAsync(id: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Gets all attendees for a given event (or instance of a recurring event). */
  def getAttendeesForEventAsync(/** ID of the event to return attendees for. Required. */
  eventId: java.lang.String): js.Promise[js.Array[Attendee]] = js.native
  /** Gets all attendees for a given event (or instance of a recurring event). */
  def getAttendeesForEventAsync(
    /** ID of the event to return attendees for. Required. */
  eventId: java.lang.String,
    /** A map of options for recurring events */
  recurrentEventOptions: RecurringEventOptions
  ): js.Promise[js.Array[Attendee]] = js.native
  /** Gets an array of calendar objects with details about the different calendars stored on the device. */
  def getCalendarsAsync(): js.Promise[js.Array[Calendar]] = js.native
  /** Gets an array of calendar objects with details about the different calendars stored on the device. */
  def getCalendarsAsync(
    /** (iOS only) Not required, but if defined, filters the returned calendars to a specific entity type.  */
  entityType: EntityTypes
  ): js.Promise[js.Array[Calendar]] = js.native
  /** Returns a specific event selected by ID. If a specific instance of a recurring event is desired, the start date of this instance must also be provided, as instances of recurring events do not have their own unique and stable IDs on either iOS or Android. */
  def getEventAsync(/** ID of the event to return. Required. */
  id: java.lang.String): js.Promise[Event] = js.native
  /** Returns a specific event selected by ID. If a specific instance of a recurring event is desired, the start date of this instance must also be provided, as instances of recurring events do not have their own unique and stable IDs on either iOS or Android. */
  def getEventAsync(
    /** ID of the event to return. Required. */
  id: java.lang.String,
    /** A map of options for recurring events */
  recurringEventOptions: RecurringEventOptions
  ): js.Promise[Event] = js.native
  /** Returns all events in a given set of calendars over a specified time period. */
  def getEventsAsync(
    /** Array of IDs of calendars to search for events in. Required. */
  calendarIds: js.Array[java.lang.String],
    /** Beginning of time period to search for events in. Required. */
  startDate: stdLib.Date,
    /** End of time period to search for events in. Required. */
  endDate: stdLib.Date
  ): js.Promise[js.Array[Event]] = js.native
  /** Available on iOS only. Returns a specific reminder selected by ID. */
  def getReminderAsync(id: java.lang.String): js.Promise[Reminder] = js.native
  /** Available on iOS only. Returns a list of reminders matching the provided criteria. */
  def getRemindersAsync(
    /**  Array of IDs of calendars to search for reminders in. Required. */
  calendarIds: js.Array[java.lang.String]
  ): js.Promise[js.Array[Reminder]] = js.native
  /** Available on iOS only. Returns a list of reminders matching the provided criteria. */
  def getRemindersAsync(
    /**  Array of IDs of calendars to search for reminders in. Required. */
  calendarIds: js.Array[java.lang.String],
    status: ReminderStatus
  ): js.Promise[js.Array[Reminder]] = js.native
  /** Available on iOS only. Returns a list of reminders matching the provided criteria. */
  def getRemindersAsync(
    /**  Array of IDs of calendars to search for reminders in. Required. */
  calendarIds: js.Array[java.lang.String],
    status: ReminderStatus,
    /** Beginning of time period to search for reminders in. Required if status is defined. */
  startDate: stdLib.Date
  ): js.Promise[js.Array[Reminder]] = js.native
  /** Available on iOS only. Returns a list of reminders matching the provided criteria. */
  def getRemindersAsync(
    /**  Array of IDs of calendars to search for reminders in. Required. */
  calendarIds: js.Array[java.lang.String],
    status: ReminderStatus,
    /** Beginning of time period to search for reminders in. Required if status is defined. */
  startDate: stdLib.Date,
    /** End of time period to search for reminders in. Required if status is defined. */
  endDate: stdLib.Date
  ): js.Promise[js.Array[Reminder]] = js.native
  /** Available on iOS only. Returns a specific source selected by ID. */
  def getSourceAsync(id: java.lang.String): js.Promise[Source] = js.native
  /** Available on iOS only. */
  def getSourcesAsync(): js.Promise[js.Array[Source]] = js.native
  /** Available on Android only. Sends an intent to open the specified event in the OS Calendar app. */
  def openEventInCalendar(/** ID of the event to open. Required. */
  id: java.lang.String): scala.Unit = js.native
  /** Available on Android only. Updates an existing attendee record. To remove a property, explicitly set it to null in details. */
  def updateAttendeeAsync(/** ID of the attendee record to be updated. Required. */
  id: java.lang.String): js.Promise[java.lang.String] = js.native
  /** Available on Android only. Updates an existing attendee record. To remove a property, explicitly set it to null in details. */
  def updateAttendeeAsync(
    /** ID of the attendee record to be updated. Required. */
  id: java.lang.String,
    /** A map of properties to be updated  */
  details: Attendee
  ): js.Promise[java.lang.String] = js.native
  /** Updates the provided details of an existing calendar stored on the device. To remove a property, explicitly set it to null in details */
  def updateCalendarAsync(id: java.lang.String): js.Promise[java.lang.String] = js.native
  /** Updates the provided details of an existing calendar stored on the device. To remove a property, explicitly set it to null in details */
  def updateCalendarAsync(id: java.lang.String, details: Calendar): js.Promise[java.lang.String] = js.native
  /** Updates the provided details of an existing calendar stored on the device. To remove a property, explicitly set it to null in details */
  def updateEventAsync(/** ID of the event to be updated. Required. */
  id: java.lang.String): js.Promise[java.lang.String] = js.native
  /** Updates the provided details of an existing calendar stored on the device. To remove a property, explicitly set it to null in details */
  def updateEventAsync(
    /** ID of the event to be updated. Required. */
  id: java.lang.String,
    /** A map of properties to be updated  */
  details: Event
  ): js.Promise[java.lang.String] = js.native
  /** Updates the provided details of an existing calendar stored on the device. To remove a property, explicitly set it to null in details */
  def updateEventAsync(
    /** ID of the event to be updated. Required. */
  id: java.lang.String,
    /** A map of properties to be updated  */
  details: Event,
    /** A map of options for recurring events */
  recurrentEventOptions: RecurringEventOptions
  ): js.Promise[java.lang.String] = js.native
  /** Updates the provided details of an existing calendar stored on the device. To remove a property, explicitly set it to null in details */
  def updateEventAsync(
    /** ID of the event to be updated. Required. */
  id: java.lang.String,
    /** A map of properties to be updated  */
  details: scala.Null,
    /** A map of options for recurring events */
  recurrentEventOptions: RecurringEventOptions
  ): js.Promise[java.lang.String] = js.native
  /** Available on iOS only. Updates the provided details of an existing reminder stored on the device. To remove a property, explicitly set it to null in details. */
  def updateReminderAsync(/** ID of the reminder to be updated. Required. */
  id: java.lang.String): js.Promise[java.lang.String] = js.native
  /** Available on iOS only. Updates the provided details of an existing reminder stored on the device. To remove a property, explicitly set it to null in details. */
  def updateReminderAsync(
    /** ID of the reminder to be updated. Required. */
  id: java.lang.String,
    /** A map of properties to be updated */
  details: Reminder
  ): js.Promise[java.lang.String] = js.native
  @js.native
  object AlarmMethod extends js.Object {
    @js.native
    sealed trait ALARM
      extends expoLib.expoMod.CalendarNs.AlarmMethod
    
    @js.native
    sealed trait ALERT
      extends expoLib.expoMod.CalendarNs.AlarmMethod
    
    @js.native
    sealed trait DEFAULT
      extends expoLib.expoMod.CalendarNs.AlarmMethod
    
    @js.native
    sealed trait EMAIL
      extends expoLib.expoMod.CalendarNs.AlarmMethod
    
    @js.native
    sealed trait SMS
      extends expoLib.expoMod.CalendarNs.AlarmMethod
    
    /* "alarm" */ val ALARM: ALARM with java.lang.String = js.native
    /* "alert" */ val ALERT: ALERT with java.lang.String = js.native
    /* "default" */ val DEFAULT: DEFAULT with java.lang.String = js.native
    /* "email" */ val EMAIL: EMAIL with java.lang.String = js.native
    /* "sms" */ val SMS: SMS with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.AlarmMethod with java.lang.String] = js.native
  }
  
  @js.native
  object AttendeeRole extends js.Object {
     // Android
    @js.native
    sealed trait ATTENDEE
      extends expoLib.expoMod.CalendarNs.AttendeeRole
    
     // iOS
    @js.native
    sealed trait CHAIR
      extends expoLib.expoMod.CalendarNs.AttendeeRole
    
    @js.native
    sealed trait NONE
      extends expoLib.expoMod.CalendarNs.AttendeeRole
    
     // iOS
    @js.native
    sealed trait NON_PARTICIPANT
      extends expoLib.expoMod.CalendarNs.AttendeeRole
    
     // iOS
    @js.native
    sealed trait OPTIONAL
      extends expoLib.expoMod.CalendarNs.AttendeeRole
    
     // Android
    @js.native
    sealed trait ORGANIZER
      extends expoLib.expoMod.CalendarNs.AttendeeRole
    
     // Android
    @js.native
    sealed trait PERFORMER
      extends expoLib.expoMod.CalendarNs.AttendeeRole
    
     // iOS
    @js.native
    sealed trait REQUIRED
      extends expoLib.expoMod.CalendarNs.AttendeeRole
    
     // Android
    @js.native
    sealed trait SPEAKER
      extends expoLib.expoMod.CalendarNs.AttendeeRole
    
     // iOS
    @js.native
    sealed trait UNKNOWN
      extends expoLib.expoMod.CalendarNs.AttendeeRole
    
    /* "attendee" */ val ATTENDEE: ATTENDEE with java.lang.String = js.native
    /* "chair" */ val CHAIR: CHAIR with java.lang.String = js.native
    /* "none" */ val NONE: NONE with java.lang.String = js.native
    /* "nonParticipant" */ val NON_PARTICIPANT: NON_PARTICIPANT with java.lang.String = js.native
    /* "optional" */ val OPTIONAL: OPTIONAL with java.lang.String = js.native
    /* "organizer" */ val ORGANIZER: ORGANIZER with java.lang.String = js.native
    /* "performer" */ val PERFORMER: PERFORMER with java.lang.String = js.native
    /* "required" */ val REQUIRED: REQUIRED with java.lang.String = js.native
    /* "speaker" */ val SPEAKER: SPEAKER with java.lang.String = js.native
    /* "unknown" */ val UNKNOWN: UNKNOWN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.AttendeeRole with java.lang.String] = js.native
  }
  
  @js.native
  object AttendeeStatus extends js.Object {
    @js.native
    sealed trait ACCEPTED
      extends expoLib.expoMod.CalendarNs.AttendeeStatus
    
     // iOS
    @js.native
    sealed trait COMPLETED
      extends expoLib.expoMod.CalendarNs.AttendeeStatus
    
    @js.native
    sealed trait DECLINED
      extends expoLib.expoMod.CalendarNs.AttendeeStatus
    
     // iOS
    @js.native
    sealed trait DELEGATED
      extends expoLib.expoMod.CalendarNs.AttendeeStatus
    
     // Android
    @js.native
    sealed trait INVITED
      extends expoLib.expoMod.CalendarNs.AttendeeStatus
    
     // iOS
    @js.native
    sealed trait IN_PROCESS
      extends expoLib.expoMod.CalendarNs.AttendeeStatus
    
    @js.native
    sealed trait NONE
      extends expoLib.expoMod.CalendarNs.AttendeeStatus
    
     // iOS
    @js.native
    sealed trait PENDING
      extends expoLib.expoMod.CalendarNs.AttendeeStatus
    
    @js.native
    sealed trait TENTATIVE
      extends expoLib.expoMod.CalendarNs.AttendeeStatus
    
     // iOS
    @js.native
    sealed trait UNKNOWN
      extends expoLib.expoMod.CalendarNs.AttendeeStatus
    
    /* "accepted" */ val ACCEPTED: ACCEPTED with java.lang.String = js.native
    /* "completed" */ val COMPLETED: COMPLETED with java.lang.String = js.native
    /* "declined" */ val DECLINED: DECLINED with java.lang.String = js.native
    /* "delegated" */ val DELEGATED: DELEGATED with java.lang.String = js.native
    /* "invited" */ val INVITED: INVITED with java.lang.String = js.native
    /* "inProcess" */ val IN_PROCESS: IN_PROCESS with java.lang.String = js.native
    /* "none" */ val NONE: NONE with java.lang.String = js.native
    /* "pending" */ val PENDING: PENDING with java.lang.String = js.native
    /* "tentative" */ val TENTATIVE: TENTATIVE with java.lang.String = js.native
    /* "unknown" */ val UNKNOWN: UNKNOWN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.AttendeeStatus with java.lang.String] = js.native
  }
  
  @js.native
  object AttendeeType extends js.Object {
     // iOS
    @js.native
    sealed trait GROUP
      extends expoLib.expoMod.CalendarNs.AttendeeType
    
    @js.native
    sealed trait NONE
      extends expoLib.expoMod.CalendarNs.AttendeeType
    
     // Android
    @js.native
    sealed trait OPTIONAL
      extends expoLib.expoMod.CalendarNs.AttendeeType
    
     // iOS
    @js.native
    sealed trait PERSON
      extends expoLib.expoMod.CalendarNs.AttendeeType
    
     // Android
    @js.native
    sealed trait REQUIRED
      extends expoLib.expoMod.CalendarNs.AttendeeType
    
    @js.native
    sealed trait RESOURCE
      extends expoLib.expoMod.CalendarNs.AttendeeType
    
     // iOS
    @js.native
    sealed trait ROOM
      extends expoLib.expoMod.CalendarNs.AttendeeType
    
     // iOS
    @js.native
    sealed trait UNKNOWN
      extends expoLib.expoMod.CalendarNs.AttendeeType
    
    /* "group" */ val GROUP: GROUP with java.lang.String = js.native
    /* "none" */ val NONE: NONE with java.lang.String = js.native
    /* "optional" */ val OPTIONAL: OPTIONAL with java.lang.String = js.native
    /* "person" */ val PERSON: PERSON with java.lang.String = js.native
    /* "required" */ val REQUIRED: REQUIRED with java.lang.String = js.native
    /* "resource" */ val RESOURCE: RESOURCE with java.lang.String = js.native
    /* "room" */ val ROOM: ROOM with java.lang.String = js.native
    /* "unknown" */ val UNKNOWN: UNKNOWN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.AttendeeType with java.lang.String] = js.native
  }
  
  @js.native
  object Availability extends js.Object {
    @js.native
    sealed trait BUSY
      extends expoLib.expoMod.CalendarNs.Availability
    
    @js.native
    sealed trait FREE
      extends expoLib.expoMod.CalendarNs.Availability
    
     // iOS
    @js.native
    sealed trait NOT_SUPPORTED
      extends expoLib.expoMod.CalendarNs.Availability
    
    @js.native
    sealed trait TENTATIVE
      extends expoLib.expoMod.CalendarNs.Availability
    
    @js.native
    sealed trait UNAVAILABLE
      extends expoLib.expoMod.CalendarNs.Availability
    
    /* "busy" */ val BUSY: BUSY with java.lang.String = js.native
    /* "free" */ val FREE: FREE with java.lang.String = js.native
    /* "notSupported" */ val NOT_SUPPORTED: NOT_SUPPORTED with java.lang.String = js.native
    /* "tentative" */ val TENTATIVE: TENTATIVE with java.lang.String = js.native
    /* "unavailable" */ val UNAVAILABLE: UNAVAILABLE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.Availability with java.lang.String] = js.native
  }
  
  @js.native
  object CalendarAccessLevel extends js.Object {
    @js.native
    sealed trait CONTRIBUTOR
      extends expoLib.expoMod.CalendarNs.CalendarAccessLevel
    
    @js.native
    sealed trait EDITOR
      extends expoLib.expoMod.CalendarNs.CalendarAccessLevel
    
    @js.native
    sealed trait FREEBUSY
      extends expoLib.expoMod.CalendarNs.CalendarAccessLevel
    
    @js.native
    sealed trait NONE
      extends expoLib.expoMod.CalendarNs.CalendarAccessLevel
    
    @js.native
    sealed trait OVERRIDE
      extends expoLib.expoMod.CalendarNs.CalendarAccessLevel
    
    @js.native
    sealed trait OWNER
      extends expoLib.expoMod.CalendarNs.CalendarAccessLevel
    
    @js.native
    sealed trait READ
      extends expoLib.expoMod.CalendarNs.CalendarAccessLevel
    
    @js.native
    sealed trait RESPOND
      extends expoLib.expoMod.CalendarNs.CalendarAccessLevel
    
    @js.native
    sealed trait ROOT
      extends expoLib.expoMod.CalendarNs.CalendarAccessLevel
    
    /* "contributor" */ val CONTRIBUTOR: CONTRIBUTOR with java.lang.String = js.native
    /* "editor" */ val EDITOR: EDITOR with java.lang.String = js.native
    /* "freebusy" */ val FREEBUSY: FREEBUSY with java.lang.String = js.native
    /* "none" */ val NONE: NONE with java.lang.String = js.native
    /* "override" */ val OVERRIDE: OVERRIDE with java.lang.String = js.native
    /* "owner" */ val OWNER: OWNER with java.lang.String = js.native
    /* "read" */ val READ: READ with java.lang.String = js.native
    /* "respond" */ val RESPOND: RESPOND with java.lang.String = js.native
    /* "root" */ val ROOT: ROOT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.CalendarAccessLevel with java.lang.String] = js.native
  }
  
  @js.native
  object CalendarType extends js.Object {
    @js.native
    sealed trait BIRTHDAYS
      extends expoLib.expoMod.CalendarNs.CalendarType
    
    @js.native
    sealed trait CALDAV
      extends expoLib.expoMod.CalendarNs.CalendarType
    
    @js.native
    sealed trait EXCHANGE
      extends expoLib.expoMod.CalendarNs.CalendarType
    
    @js.native
    sealed trait LOCAL
      extends expoLib.expoMod.CalendarNs.CalendarType
    
    @js.native
    sealed trait SUBSCRIBED
      extends expoLib.expoMod.CalendarNs.CalendarType
    
    /* "birthdays" */ val BIRTHDAYS: BIRTHDAYS with java.lang.String = js.native
    /* "caldav" */ val CALDAV: CALDAV with java.lang.String = js.native
    /* "exchange" */ val EXCHANGE: EXCHANGE with java.lang.String = js.native
    /* "local" */ val LOCAL: LOCAL with java.lang.String = js.native
    /* "subscribed" */ val SUBSCRIBED: SUBSCRIBED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.CalendarType with java.lang.String] = js.native
  }
  
  @js.native
  object EntityTypes extends js.Object {
    @js.native
    sealed trait EVENT
      extends expoLib.expoMod.CalendarNs.EntityTypes
    
    @js.native
    sealed trait REMINDER
      extends expoLib.expoMod.CalendarNs.EntityTypes
    
    /* "event" */ val EVENT: EVENT with java.lang.String = js.native
    /* "reminder" */ val REMINDER: REMINDER with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.EntityTypes with java.lang.String] = js.native
  }
  
  @js.native
  object EventAccessLevel extends js.Object {
    @js.native
    sealed trait CONFIDENTIAL
      extends expoLib.expoMod.CalendarNs.EventAccessLevel
    
    @js.native
    sealed trait DEFAULT
      extends expoLib.expoMod.CalendarNs.EventAccessLevel
    
    @js.native
    sealed trait PRIVATE
      extends expoLib.expoMod.CalendarNs.EventAccessLevel
    
    @js.native
    sealed trait PUBLIC
      extends expoLib.expoMod.CalendarNs.EventAccessLevel
    
    /* "confidential" */ val CONFIDENTIAL: CONFIDENTIAL with java.lang.String = js.native
    /* "default" */ val DEFAULT: DEFAULT with java.lang.String = js.native
    /* "private" */ val PRIVATE: PRIVATE with java.lang.String = js.native
    /* "public" */ val PUBLIC: PUBLIC with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.EventAccessLevel with java.lang.String] = js.native
  }
  
  @js.native
  object EventStatus extends js.Object {
    @js.native
    sealed trait CANCELED
      extends expoLib.expoMod.CalendarNs.EventStatus
    
    @js.native
    sealed trait CONFIRMED
      extends expoLib.expoMod.CalendarNs.EventStatus
    
    @js.native
    sealed trait NONE
      extends expoLib.expoMod.CalendarNs.EventStatus
    
    @js.native
    sealed trait TENTATIVE
      extends expoLib.expoMod.CalendarNs.EventStatus
    
    /* "canceled" */ val CANCELED: CANCELED with java.lang.String = js.native
    /* "confirmed" */ val CONFIRMED: CONFIRMED with java.lang.String = js.native
    /* "none" */ val NONE: NONE with java.lang.String = js.native
    /* "tentative" */ val TENTATIVE: TENTATIVE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.EventStatus with java.lang.String] = js.native
  }
  
  @js.native
  object Frequency extends js.Object {
    @js.native
    sealed trait DAILY
      extends expoLib.expoMod.CalendarNs.Frequency
    
    @js.native
    sealed trait MONTHLY
      extends expoLib.expoMod.CalendarNs.Frequency
    
    @js.native
    sealed trait WEEKLY
      extends expoLib.expoMod.CalendarNs.Frequency
    
    @js.native
    sealed trait YEARLY
      extends expoLib.expoMod.CalendarNs.Frequency
    
    /* "daily" */ val DAILY: DAILY with java.lang.String = js.native
    /* "monthly" */ val MONTHLY: MONTHLY with java.lang.String = js.native
    /* "weekly" */ val WEEKLY: WEEKLY with java.lang.String = js.native
    /* "yearly" */ val YEARLY: YEARLY with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.Frequency with java.lang.String] = js.native
  }
  
  @js.native
  object ReminderStatus extends js.Object {
    @js.native
    sealed trait COMPLETED
      extends expoLib.expoMod.CalendarNs.ReminderStatus
    
    @js.native
    sealed trait INCOMPLETE
      extends expoLib.expoMod.CalendarNs.ReminderStatus
    
    /* "completed" */ val COMPLETED: COMPLETED with java.lang.String = js.native
    /* "incomplete" */ val INCOMPLETE: INCOMPLETE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[expoLib.expoMod.CalendarNs.ReminderStatus with java.lang.String] = js.native
  }
  
}


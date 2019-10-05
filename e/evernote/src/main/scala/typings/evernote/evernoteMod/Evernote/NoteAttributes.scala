package typings.evernote.evernoteMod.Evernote

import org.scalablytyped.runtime.StringDictionary
import typings.evernote.Anon_AltitudeApplicationData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The list of optional attributes that can be stored on a note.
  * <dl>
  * <dt>subjectDate</dt>
  *     <dd>time that the note refers to
  *     </dd>
  *
  * <dt>latitude</dt>
  *     <dd>the latitude where the note was taken
  *     </dd>
  *
  * <dt>longitude</dt>
  *     <dd>the longitude where the note was taken
  *     </dd>
  *
  * <dt>altitude</dt>
  *     <dd>the altitude where the note was taken
  *     </dd>
  *
  * <dt>author</dt>
  *     <dd>the author of the content of the note
  *     <br/>
  *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *     </dd>
  *
  * <dt>source</dt>
  *     <dd>the method that the note was added to the account, if the
  *     note wasn't directly authored in an Evernote desktop client.
  *     <br/>
  *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *     </dd>
  *
  * <dt>sourceURL</dt>
  *     <dd>the original location where the resource was hosted. For web clips,
  *     this will be the URL of the page that was clipped.
  *     <br/>
  *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *     </dd>
  *
  * <dt>sourceApplication</dt>
  *     <dd>an identifying string for the application that
  *     created this note.    This string does not have a guaranteed syntax or
  *     structure -- it is intended for human inspection and tracking.
  *     <br/>
  *     Length:    EDAM_ATTRIBUTE_LEN_MIN - EDAM_ATTRIBUTE_LEN_MAX
  *     </dd>
  *
  * <dt>shareDate</dt>
  *    <dd>The date and time when this note was directly shared via its own URL.
  *    This is only set on notes that were individually shared - it is independent
  *    of any notebook-level sharing of the containing notebook. This field
  *    is treated as "read-only" for clients; the server will ignore changes
  *    to this field from an external client.
  *    </dd>
  *
  * <dt>reminderOrder</dt>
  * <dd>The set of notes with this parameter set are considered
  * "reminders" and are to be treated specially by clients to give them
  * higher UI prominence within a notebook.    The value is used to sort
  * the reminder notes within the notebook with higher values
  * representing greater prominence.    Outside of the context of a
  * notebook, the value of this parameter is undefined.    The value is
  * not intended to be compared to the values of reminder notes in
  * other notebooks.    In order to allow clients to place a note at a
  * higher precedence than other notes, you should never set a value
  * greater than the current time (as defined for a Timetstamp). To
  * place a note at higher precedence than existing notes, set the
  * value to the current time as defined for a timestamp (milliseconds
  * since the epoch).    Synchronizing clients must remember the time when
  * the update was performed, using the local clock on the client,
  * and use that value when they later upload the note to the service.
  * Clients must not set the reminderOrder to the reminderTime as the
  * reminderTime could be in the future.    Those two fields are never
  * intended to be related.    The correct value for reminderOrder field
  * for new notes is the "current" time when the user indicated that
  * the note is a reminder.    Clients may implement a separate
  * "sort by date" feature to show notes ordered by reminderTime.
  * Whenever a reminderDoneTime or reminderTime is set but a
  * reminderOrder is not set, the server will fill in the current
  * server time for the reminderOrder field.</dd>
  *
  * <dt>reminderDoneTime</dt>
  * <dd>The date and time when a user dismissed/"marked done" the reminder
  * on the note.    Users typically do not manually set this value directly
  * as it is set to the time when the user dismissed/"marked done" the
  * reminder.</dd>
  *
  * <dt>reminderTime</dt>
  * <dd>The date and time a user has selected to be reminded of the note.
  * A note with this value set is known as a "reminder" and the user can
  * be reminded, via e-mail or client-specific notifications, of the note
  * when the time is reached or about to be reached.    When a user sets
  * a reminder time on a note that has a reminder done time, and that
  * reminder time is in the future, then the reminder done time should be
  * cleared.    This should happen regardless of any existing reminder time
  * that may have previously existed on the note.</dd>
  *
  * <dt>placeName</dt>
  * <dd>Allows the user to assign a human-readable location name associated
  * with a note. Users may assign values like 'Home' and 'Work'. Place
  * names may also be populated with values from geonames database
  * (e.g., a restaurant name). Applications are encouraged to normalize values
  * so that grouping values by place name provides a useful result. Applications
  * MUST NOT automatically add place name values based on geolocation without
  * confirmation from the user; that is, the value in this field should be
  * more useful than a simple automated lookup based on the note's latitude
  * and longitude.</dd>
  *
  * <dt>contentClass</dt>
  * <dd>The class (or type) of note. This field is used to indicate to
  * clients that special structured information is represented within
  * the note such that special rules apply when making
  * modifications. If contentClass is set and the client
  * application does not specifically support the specified class,
  * the client MUST treat the note as read-only. In this case, the
  * client MAY modify the note's notebook and tags via the
  * Note.notebookGuid and Note.tagGuids fields.    The client MAY also
  * modify the reminderOrder field as well as the reminderTime and
  * reminderDoneTime fields.
  * <p>Applications should set contentClass only when they are creating notes
  * that contain structured information that needs to be maintained in order
  * for the user to be able to use the note within that application.
  * Setting contentClass makes a note read-only in other applications, so
  * there is a trade-off when an application chooses to use contentClass.
  * Applications that set contentClass when creating notes must use a contentClass
  * string of the form <i>CompanyName.ApplicationName</i> to ensure uniqueness.</p>
  * Length restrictions: EDAM_NOTE_CONTENT_CLASS_LEN_MIN, EDAM_NOTE_CONTENT_CLASS_LEN_MAX
  * <br/>
  * Regex: EDAM_NOTE_CONTENT_CLASS_REGEX
  * </dd>
  *
  * <dt>applicationData</dt>
  * <dd>Provides a location for applications to store a relatively small
  * (4kb) blob of data that is not meant to be visible to the user and
  * that is opaque to the Evernote service. A single application may use at most
  * one entry in this map, using its API consumer key as the map key. See the
  * documentation for LazyMap for a description of when the actual map values
  * are returned by the service.
  * <p>To safely add or modify your application's entry in the map, use
  * NoteStore.setNoteApplicationDataEntry. To safely remove your application's
  * entry from the map, use NoteStore.unsetNoteApplicationDataEntry.</p>
  * Minimum length of a name (key): EDAM_APPLICATIONDATA_NAME_LEN_MIN
  * <br/>
  * Sum max size of key and value: EDAM_APPLICATIONDATA_ENTRY_LEN_MAX
  * <br/>
  * Syntax regex for name (key): EDAM_APPLICATIONDATA_NAME_REGEX
  * </dd>
  *
  * <dt>creatorId</dt>
  * <dd>The numeric user ID of the user who originally created the note.</dd>
  *
  * <dt>lastEditedBy</dt>
  * <dd>An indication of who made the last change to the note.    If you are
  * accessing the note via a shared notebook to which you have modification
  * rights, or if you are the owner of the notebook to which the note belongs,
  * then you have access to the value.    In this case, the value will be
  * unset if the owner of the notebook containing the note was the last to
  * make the modification, else it will be a string describing the
  * guest who made the last edit.    If you do not have access to this value,
  * it will be left unset.    This field is read-only by clients.    The server
  * will ignore all values set by clients into this field.</dd>
  *
  * <dt>lastEditorId</dt>
  * <dd>The numeric user ID of the user described in lastEditedBy.</dd>
  *
  * <dt>classifications</dt>
  * <dd>A map of classifications applied to the note by clients or by the
  * Evernote service. The key is the string name of the classification type,
  * and the value is a constant that begins with CLASSIFICATION_.</dd>
  *
  * </dl>
  */
@JSImport("evernote", "Evernote.NoteAttributes")
@js.native
class NoteAttributes () extends js.Object {
  def this(args: Anon_AltitudeApplicationData) = this()
  var altitude: Double = js.native
  var applicationData: LazyMap = js.native
  var author: String = js.native
  var classifications: StringDictionary[String] = js.native
  var contentClass: String = js.native
  var creatorId: Double = js.native
  var lastEditedBy: String = js.native
  var lastEditorId: Double = js.native
  var latitude: Double = js.native
  var longitude: Double = js.native
  var placeName: String = js.native
  var reminderDoneTime: Double = js.native
  var reminderOrder: Double = js.native
  var reminderTime: Double = js.native
  var shareDate: Double = js.native
  var source: String = js.native
  var sourceApplication: String = js.native
  var sourceURL: String = js.native
  var subjectDate: Double = js.native
}


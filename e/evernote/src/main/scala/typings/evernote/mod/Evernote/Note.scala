package typings.evernote.mod.Evernote

import typings.evernote.AnonActiveAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single note in the user's account.
  *
  * <dl>
  * <dt>guid</dt>
  *     <dd>The unique identifier of this note.    Will be set by the
  *     server, but will be omitted by clients calling NoteStore.createNote()
  *     <br/>
  *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_GUID_REGEX
  *     </dd>
  *
  * <dt>title</dt>
  *     <dd>The subject of the note.    Can't begin or end with a space.
  *     <br/>
  *     Length:    EDAM_NOTE_TITLE_LEN_MIN - EDAM_NOTE_TITLE_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_NOTE_TITLE_REGEX
  *     </dd>
  *
  * <dt>content</dt>
  *     <dd>The XHTML block that makes up the note.    This is
  *     the canonical form of the note's contents, so will include abstract
  *     Evernote tags for internal resource references.    A client may create
  *     a separate transformed version of this content for internal presentation,
  *     but the same canonical bytes should be used for transmission and
  *     comparison unless the user chooses to modify their content.
  *     <br/>
  *     Length:    EDAM_NOTE_CONTENT_LEN_MIN - EDAM_NOTE_CONTENT_LEN_MAX
  *     </dd>
  *
  * <dt>contentHash</dt>
  *     <dd>The binary MD5 checksum of the UTF-8 encoded content
  *     body. This will always be set by the server, but clients may choose to omit
  *     this when they submit a note with content.
  *     <br/>
  *     Length:    EDAM_HASH_LEN (exactly)
  *     </dd>
  *
  * <dt>contentLength</dt>
  *     <dd>The number of Unicode characters in the content of
  *     the note.    This will always be set by the service, but clients may choose
  *     to omit this value when they submit a Note.
  *     </dd>
  *
  * <dt>created</dt>
  *     <dd>The date and time when the note was created in one of the
  *     clients.    In most cases, this will match the user's sense of when
  *     the note was created, and ordering between notes will be based on
  *     ordering of this field.    However, this is not a "reliable" timestamp
  *     if a client has an incorrect clock, so it cannot provide a true absolute
  *     ordering between notes.    Notes created directly through the service
  *     (e.g. via the web GUI) will have an absolutely ordered "created" value.
  *     </dd>
  *
  * <dt>updated</dt>
  *     <dd>The date and time when the note was last modified in one of
  *     the clients.    In most cases, this will match the user's sense of when
  *     the note was modified, but this field may not be absolutely reliable
  *     due to the possibility of client clock errors.
  *     </dd>
  *
  * <dt>deleted</dt>
  *     <dd>If present, the note is considered "deleted", and this
  *     stores the date and time when the note was deleted by one of the clients.
  *     In most cases, this will match the user's sense of when the note was
  *     deleted, but this field may be unreliable due to the possibility of
  *     client clock errors.
  *     </dd>
  *
  * <dt>active</dt>
  *     <dd>If the note is available for normal actions and viewing,
  *     this flag will be set to true.
  *     </dd>
  *
  * <dt>updateSequenceNum</dt>
  *     <dd>A number identifying the last transaction to
  *     modify the state of this note (including changes to the note's attributes
  *     or resources).    The USN values are sequential within an account,
  *     and can be used to compare the order of modifications within the service.
  *     </dd>
  *
  * <dt>notebookGuid</dt>
  *     <dd>The unique identifier of the notebook that contains
  *     this note.    If no notebookGuid is provided on a call to createNote(), the
  *     default notebook will be used instead.
  *     <br/>
  *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_GUID_REGEX
  *     </dd>
  *
  * <dt>tagGuids</dt>
  *     <dd>A list of the GUID identifiers for tags that are applied to this note.
  *     This may be provided in a call to createNote() to unambiguously
  *     the tags that should be assigned to the new note.    Alternately, clients
  *     may pass the names of desired tags via the 'tagNames' field during
  *     note creation.
  *     If the list of tags are omitted on a call to createNote(), then
  *     the server will assume that no changes have been made to the resources.
  *     Maximum:    EDAM_NOTE_TAGS_MAX tags per note
  *     </dd>
  *
  * <dt>resources</dt>
  *     <dd>The list of resources that are embedded within this note.
  *     If the list of resources are omitted on a call to updateNote(), then
  *     the server will assume that no changes have been made to the resources.
  *     The binary contents of the resources must be provided when the resource
  *     is first sent to the service, but it will be omitted by the service when
  *     the Note is returned in the future.
  *     Maximum:    EDAM_NOTE_RESOURCES_MAX resources per note
  *     </dd>
  *
  * <dt>attributes</dt>
  *     <dd>A list of the attributes for this note.
  *     If the list of attributes are omitted on a call to updateNote(), then
  *     the server will assume that no changes have been made to the resources.
  *     </dd>
  *
  * <dt>tagNames</dt>
  *     <dd>May be provided by clients during calls to createNote() as an
  *     alternative to providing the tagGuids of existing tags.    If any tagNames
  *     are provided during createNote(), these will be found, or created if they
  *     don't already exist.    Created tags will have no parent (they will be at
  *     the top level of the tag panel).
  *     </dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.Note")
@js.native
class Note () extends js.Object {
  def this(args: AnonActiveAttributes) = this()
  var active: Boolean = js.native
  var attributes: NoteAttributes = js.native
  var content: String = js.native
  var contentHash: String = js.native
  var contentLength: Double = js.native
  var created: Double = js.native
  var deleted: Double = js.native
  var guid: String = js.native
  var notebookGuid: String = js.native
  var resources: js.Array[Resource] = js.native
  var tagGuids: js.Array[String] = js.native
  var tagNames: js.Array[String] = js.native
  var title: String = js.native
  var updateSequenceNum: Double = js.native
  var updated: Double = js.native
}


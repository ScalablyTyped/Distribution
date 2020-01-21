package typings.evernote.mod.Evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Evernote.NoteStoreClient")
@js.native
class NoteStoreClient () extends js.Object {
  var seqid: Double = js.native
  /**
    * Asks the service to produce an authentication token that can be used to
    * access the contents of a single Note which was individually shared
    * from someone's account.
    * This authenticationToken can be used with the various other NoteStore
    * calls to find and retrieve the Note and its directly-referenced children.
    *
    * @param guid
    *     The GUID identifying this Note on this shard.
    *
    * @param noteKey
    *     The 'noteKey' identifier from the Note that was originally created via
    *     a call to shareNote() and then given to a recipient to access.
    *
    * @param authenticationToken
    *     An optional authenticationToken that identifies the user accessing the
    *     shared note. This parameter may be required to access some shared notes.
    *
    * @throws EDAMUserException <ul>
    *     <li> PERMISSION_DENIED "Note" - the Note with that GUID is either not
    *         shared, or the noteKey doesn't match the current key for this note
    *     </li>
    *     <li> PERMISSION_DENIED "authenticationToken" - an authentication token is
    *         required to access this Note, but either no authentication token or a
    *         "non-owner" authentication token was provided.
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "guid" - the note with that GUID is not found
    *     </li>
    * </ul>
    *
    * @throws EDAMSystemException <ul>
    *     <li> TAKEN_DOWN "Note" - The specified shared note is taken down (for
    *         all requesters).
    *     </li>
    *     <li> TAKEN_DOWN "Country" - The specified shared note is taken down
    *         for the requester because of an IP-based country lookup.
    *     </ul>
    * </ul>
    */
  def authenticateToSharedNote(guid: String, noteKey: String, cb: Callback[AuthenticationResult]): Unit = js.native
  /**
    * Asks the service to produce an authentication token that can be used to
    * access the contents of a shared notebook from someone else's account.
    * This authenticationToken can be used with the various other NoteStore
    * calls to find and retrieve notes, and if the permissions in the shared
    * notebook are sufficient, to make changes to the contents of the notebook.
    *
    * @param shareKey
    *     The 'shareKey' identifier from the SharedNotebook that was granted to
    *     some recipient.    This string internally encodes the notebook identifier
    *     and a security signature.
    *
    * @param authenticationToken
    *     If a non-empty string is provided, this is the full user-based
    *     authentication token that identifies the user who is currently logged in
    *     and trying to access the shared notebook.    This may be required if the
    *     notebook was created with 'requireLogin'.
    *     If this string is empty, the service will attempt to authenticate to the
    *     shared notebook without any logged in user.
    *
    * @throws EDAMSystemException <ul>
    *     <li> BAD_DATA_FORMAT "shareKey" - invalid shareKey string
    *     </li>
    *     <li> INVALID_AUTH "shareKey" - bad signature on shareKey string
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "SharedNotebook.id" - the shared notebook no longer exists
    *     </li>
    * </ul>
    *
    * @throws EDAMUserException <ul>
    *     <li> DATA_REQUIRED "authenticationToken" - the share requires login, and
    *                    no valid authentication token was provided.
    *     </li>
    *     <li> PERMISSION_DENIED "SharedNotebook.username" - share requires login,
    *                    and another username has already been bound to this notebook.
    *     </li>
    * </ul>
    */
  def authenticateToSharedNotebook(shareKey: String, cb: Callback[AuthenticationResult]): Unit = js.native
  /**
    * Performs a deep copy of the Note with the provided GUID 'noteGuid' into
    * the Notebook with the provided GUID 'toNotebookGuid'.
    * The caller must be the owner of both the Note and the Notebook.
    * This creates a new Note in the destination Notebook with new content and
    * Resources that match all of the content and Resources from the original
    * Note, but with new GUID identifiers.
    * The original Note is not modified by this operation.
    * The copied note is considered as an "upload" for the purpose of upload
    * transfer limit calculation, so its size is added to the upload count for
    * the owner.
    *
    * @param noteGuid
    *     The GUID of the Note to copy.
    *
    * @param toNotebookGuid
    *     The GUID of the Notebook that should receive the new Note.
    *
    * @return
    *     The metadata for the new Note that was created.    This will include the
    *     new GUID for this Note (and any copied Resources), but will not include
    *     the content body or the binary bodies of any Resources.
    *
    * @throws EDAMUserException <ul>
    *     <li> LIMIT_REACHED "Note" - at max number per account
    *     </li>
    *     <li> PERMISSION_DENIED "Notebook.guid" - destination not owned by user
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - user doesn't own
    *     </li>
    *     <li> QUOTA_REACHED "Accounting.uploadLimit" - note exceeds upload quota
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Notebook.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def copyNote(noteGuid: String, toNotebookGuid: String, cb: Callback[Note]): Unit = js.native
  /**
    * Asks the service to make a linked notebook with the provided name, username
    * of the owner and identifiers provided. A linked notebook can be either a
    * link to a public notebook or to a private shared notebook.
    *
    * @param linkedNotebook
    *     The desired fields for the linked notebook must be provided on this
    *     object.    The name of the linked notebook must be set. Either a username
    *     uri or a shard id and share key must be provided otherwise a
    *     EDAMUserException is thrown.
    *
    * @return
    *     The newly created LinkedNotebook.    The server-side id will be
    *     saved in this object's 'id' field.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "LinkedNotebook.name" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "LinkedNotebook.username" - bad username format
    *     </li>
    *     <li> BAD_DATA_FORMAT "LinkedNotebook.uri" -
    *         if public notebook set but bad uri
    *     </li>
    *     <li> BAD_DATA_FORMAT "LinkedNotebook.shareKey" -
    *         if private notebook set but bad shareKey
    *     </li>
    *     <li> DATA_REQUIRED "LinkedNotebook.shardId" -
    *         if private notebook but shard id not provided
    *     </li>
    * </ul>
    */
  def createLinkedNotebook(linkedNotebook: LinkedNotebook, cb: Callback[LinkedNotebook]): Unit = js.native
  /**
    * Asks the service to make a note with the provided set of information.
    *
    * @param note
    *     A Note object containing the desired fields to be populated on
    *     the service.
    *
    * @return
    *     The newly created Note from the service.    The server-side
    *     GUIDs for the Note and any Resources will be saved in this object.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Note.title" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "Note.content" - invalid length for ENML content
    *     </li>
    *     <li> BAD_DATA_FORMAT "Resource.mime" - invalid resource MIME type
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteAttributes.*" - bad resource string
    *     </li>
    *     <li> BAD_DATA_FORMAT "ResourceAttributes.*" - bad resource string
    *     </li>
    *     <li> DATA_CONFLICT "Note.deleted" - deleted time set on active note
    *     </li>
    *     <li> DATA_REQUIRED "Resource.data" - resource data body missing
    *     </li>
    *     <li> ENML_VALIDATION "*" - note content doesn't validate against DTD
    *     </li>
    *     <li> LIMIT_REACHED "Note" - at max number per account
    *     </li>
    *     <li> LIMIT_REACHED "Note.size" - total note size too large
    *     </li>
    *     <li> LIMIT_REACHED "Note.resources" - too many resources on Note
    *     </li>
    *     <li> LIMIT_REACHED "Note.tagGuids" - too many Tags on Note
    *     </li>
    *     <li> LIMIT_REACHED "Resource.data.size" - resource too large
    *     </li>
    *     <li> LIMIT_REACHED "NoteAttribute.*" - attribute string too long
    *     </li>
    *     <li> LIMIT_REACHED "ResourceAttribute.*" - attribute string too long
    *     </li>
    *     <li> PERMISSION_DENIED "Note.notebookGuid" - NB not owned by user
    *     </li>
    *     <li> QUOTA_REACHED "Accounting.uploadLimit" - note exceeds upload quota
    *     </li>
    *     <li> BAD_DATA_FORMAT "Tag.name" - Note.tagNames was provided, and one
    *         of the specified tags had an invalid length or pattern
    *     </li>
    *     <li> LIMIT_REACHED "Tag" - Note.tagNames was provided, and the required
    *         new tags would exceed the maximum number per account
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.notebookGuid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def createNote(note: Note, cb: Callback[Note]): Unit = js.native
  /**
    * Asks the service to make a notebook with the provided name.
    *
    * @param notebook
    *     The desired fields for the notebook must be provided on this
    *     object.    The name of the notebook must be set, and either the 'active'
    *     or 'defaultNotebook' fields may be set by the client at creation.
    *     If a notebook exists in the account with the same name (via
    *     case-insensitive compare), this will throw an EDAMUserException.
    *
    * @return
    *     The newly created Notebook.    The server-side GUID will be
    *     saved in this object's 'guid' field.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Notebook.name" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "Notebook.stack" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "Publishing.uri" - if publishing set but bad uri
    *     </li>
    *     <li> BAD_DATA_FORMAT "Publishing.publicDescription" - if too long
    *     </li>
    *     <li> DATA_CONFLICT "Notebook.name" - name already in use
    *     </li>
    *     <li> DATA_CONFLICT "Publishing.uri" - if URI already in use
    *     </li>
    *     <li> DATA_REQUIRED "Publishing.uri" - if publishing set but uri missing
    *     </li>
    *     <li> LIMIT_REACHED "Notebook" - at max number of notebooks
    *     </li>
    * </ul>
    */
  def createNotebook(notebook: Notebook, cb: Callback[Notebook]): Unit = js.native
  /**
    * Asks the service to make a saved search with a set of information.
    *
    * @param search
    *     The desired list of fields for the search are specified in this
    *     object. The caller must specify the name and query for the
    *     search, and may optionally specify a search scope.
    *     The SavedSearch.format field is ignored by the service.
    *
    * @return
    *     The newly created SavedSearch.    The server-side GUID will be
    *     saved in this object.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "SavedSearch.name" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "SavedSearch.query" - invalid length
    *     </li>
    *     <li> DATA_CONFLICT "SavedSearch.name" - name already in use
    *     </li>
    *     <li> LIMIT_REACHED "SavedSearch" - at max number of searches
    *     </li>
    * </ul>
    */
  def createSearch(search: SavedSearch, cb: Callback[SavedSearch]): Unit = js.native
  /**
    * Used to construct a shared notebook object. The constructed notebook will
    * contain a "share key" which serve as a unique identifer and access token
    * for a user to access the notebook of the shared notebook owner.
    *
    * @param sharedNotebook
    *     A shared notebook object populated with the email address of the share
    *     recipient, the notebook guid and the access permissions. All other
    *     attributes of the shared object are ignored. The SharedNotebook.allowPreview
    *     field must be explicitly set with either a true or false value.
    *
    * @return
    *     The fully populated SharedNotebook object including the server assigned
    *     share id and shareKey which can both be used to uniquely identify the
    *     SharedNotebook.
    *
    * @throws EDAMUserException <ul>
    *     <li>BAD_DATA_FORMAT "SharedNotebook.email" - if the email was not valid</li>
    *     <li>BAD_DATA_FORMAT "requireLogin" - if the SharedNotebook.allowPreview field was
    *             not set, and the SharedNotebook.requireLogin was also not set or was set to
    *             false.</li>
    *     <li>PERMISSION_DENIED "SharedNotebook.recipientSettings" - if
    *             recipientSettings is set in the sharedNotebook.    Only the recipient
    *             can set these values via the setSharedNotebookRecipientSettings
    *             method.
    *     </li>
    *     </ul>
    * @throws EDAMNotFoundException <ul>
    *     <li>Notebook.guid - if the notebookGuid is not a valid GUID for the user.
    *     </li>
    *     </ul>
    */
  def createSharedNotebook(sharedNotebook: SharedNotebook, cb: Callback[SharedNotebook]): Unit = js.native
  /**
    * Asks the service to make a tag with a set of information.
    *
    * @param tag
    *     The desired list of fields for the tag are specified in this
    *     object.    The caller must specify the tag name, and may provide
    *     the parentGUID.
    *
    * @return
    *     The newly created Tag.    The server-side GUID will be
    *     saved in this object.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Tag.name" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "Tag.parentGuid" - malformed GUID
    *     </li>
    *     <li> DATA_CONFLICT "Tag.name" - name already in use
    *     </li>
    *     <li> LIMIT_REACHED "Tag" - at max number of tags
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Tag.parentGuid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def createTag(tag: Tag, cb: Callback[Tag]): Unit = js.native
  /**
    * Moves the note into the trash. The note may still be undeleted, unless it
    * is expunged.    This is equivalent to calling updateNote() after setting
    * Note.active = false
    *
    * @param guid
    *     The GUID of the note to delete.
    *
    * @return
    *     The Update Sequence Number for this change within the account.
    *
    * @throws EDAMUserException <ul>
    *     <li> PERMISSION_DENIED "Note" - user doesn't have permission to
    *                    update the note.
    *     </li>
    * </ul>
    *
    * @throws EDAMUserException <ul>
    *     <li> DATA_CONFLICT "Note.guid" - the note is already deleted
    *     </li>
    * </ul>
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def deleteNote(guid: String, cb: Callback[Double]): Unit = js.native
  /**
    * Attempts to send a single note to one or more email recipients.
    * <p/>
    * NOTE: This function is generally not available to third party applications.
    * Calls will result in an EDAMUserException with the error code
    * PERMISSION_DENIED.
    *
    * @param authenticationToken
    *        The note will be sent as the user logged in via this token, using that
    *        user's registered email address.    If the authenticated user doesn't
    *        have permission to read that note, the emailing will fail.
    *
    * @param parameters
    *        The note must be specified either by GUID (in which case it will be
    *        sent using the existing data in the service), or else the full Note
    *        must be passed to this call.    This also specifies the additional
    *        email fields that will be used in the email.
    *
    * @throws EDAMUserException <ul>
    *     <li> LIMIT_REACHED "NoteEmailParameters.toAddresses" -
    *         The email can't be sent because this would exceed the user's daily
    *         email limit.
    *     </li>
    *     <li> BAD_DATA_FORMAT "(email address)" -
    *         email address malformed
    *     </li>
    *     <li> DATA_REQUIRED "NoteEmailParameters.toAddresses" -
    *         if there are no To: or Cc: addresses provided.
    *     </li>
    *     <li> DATA_REQUIRED "Note.title" -
    *         if the caller provides a Note parameter with no title
    *     </li>
    *     <li> DATA_REQUIRED "Note.content" -
    *         if the caller provides a Note parameter with no content
    *     </li>
    *     <li> ENML_VALIDATION "*" - note content doesn't validate against DTD
    *     </li>
    *     <li> DATA_REQUIRED "NoteEmailParameters.note" -
    *         if no guid or note provided
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def emailNote(parameters: NoteEmailParameters, cb: Callback[Unit]): Unit = js.native
  /**
    * Permanently removes all of the Notes that are currently marked as
    * inactive.    This is equivalent to "emptying the trash", and these Notes
    * will be gone permanently.
    * <p/>
    * This operation may be relatively slow if the account contains a large
    * number of inactive Notes.
    * <p/>
    * NOTE: This function is not available to third party applications.
    * Calls will result in an EDAMUserException with the error code
    * PERMISSION_DENIED.
    *
    * @return
    *        The number of notes that were expunged.
    */
  def expungeInactiveNotes(cb: Callback[Double]): Unit = js.native
  /**
    * Permanently expunges the linked notebook from the account.
    * <p/>
    * NOTE: This function is generally not available to third party applications.
    * Calls will result in an EDAMUserException with the error code
    * PERMISSION_DENIED.
    *
    * @param guid
    *     The LinkedNotebook.guid field of the LinkedNotebook to permanently remove
    *     from the account.
    */
  def expungeLinkedNotebook(guid: String, cb: Callback[Double]): Unit = js.native
  /**
    * Permanently removes a Note, and all of its Resources,
    * from the service.
    * <p/>
    * NOTE: This function is not available to third party applications.
    * Calls will result in an EDAMUserException with the error code
    * PERMISSION_DENIED.
    *
    * @param guid
    *     The GUID of the note to delete.
    *
    * @return
    *     The Update Sequence Number for this change within the account.
    *
    * @throws EDAMUserException <ul>
    *     <li> PERMISSION_DENIED "Note" - user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def expungeNote(guid: String, cb: Callback[Double]): Unit = js.native
  /**
    * Permanently removes the notebook from the user's account.
    * After this action, the notebook is no longer available for undeletion, etc.
    * If the notebook contains any Notes, they will be moved to the current
    * default notebook and moved into the trash (i.e. Note.active=false).
    * <p/>
    * NOTE: This function is generally not available to third party applications.
    * Calls will result in an EDAMUserException with the error code
    * PERMISSION_DENIED.
    *
    * @param guid
    *     The GUID of the notebook to delete.
    *
    * @return
    *     The Update Sequence Number for this change within the account.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Notebook.guid" - if the parameter is missing
    *     </li>
    *     <li> LIMIT_REACHED "Notebook" - trying to expunge the last Notebook
    *     </li>
    *     <li> PERMISSION_DENIED "Notebook" - private notebook, user doesn't own
    *     </li>
    * </ul>
    */
  def expungeNotebook(guid: String, cb: Callback[Double]): Unit = js.native
  /**
    * Permanently removes a list of Notes, and all of their Resources, from
    * the service.    This should be invoked with a small number of Note GUIDs
    * (e.g. 100 or less) on each call.    To expunge a larger number of notes,
    * call this method multiple times.    This should also be used to reduce the
    * number of Notes in a notebook before calling expungeNotebook() or
    * in the trash before calling expungeInactiveNotes(), since these calls may
    * be prohibitively slow if there are more than a few hundred notes.
    * If an exception is thrown for any of the GUIDs, then none of the notes
    * will be deleted.    I.e. this call can be treated as an atomic transaction.
    * <p/>
    * NOTE: This function is not available to third party applications.
    * Calls will result in an EDAMUserException with the error code
    * PERMISSION_DENIED.
    *
    * @param noteGuids
    *     The list of GUIDs for the Notes to remove.
    *
    * @return
    *     The account's updateCount at the end of this operation
    *
    * @throws EDAMUserException <ul>
    *     <li> PERMISSION_DENIED "Note" - user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def expungeNotes(noteGuids: js.Array[String], cb: Callback[Double]): Unit = js.native
  /**
    * Permanently deletes the saved search with the provided GUID, if present.
    * <p/>
    * NOTE: This function is generally not available to third party applications.
    * Calls will result in an EDAMUserException with the error code
    * PERMISSION_DENIED.
    *
    * @param guid
    *     The GUID of the search to delete.
    *
    * @return
    *     The Update Sequence Number for this change within the account.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "SavedSearch.guid" - if the guid parameter is empty
    *     </li>
    *     <li> PERMISSION_DENIED "SavedSearch" - user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "SavedSearch.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def expungeSearch(guid: String, cb: Callback[Double]): Unit = js.native
  /**
    * Expunges the SharedNotebooks in the user's account using the
    * SharedNotebook.id as the identifier.
    * <p/>
    * NOTE: This function is generally not available to third party applications.
    * Calls will result in an EDAMUserException with the error code
    * PERMISSION_DENIED.
    *
    * @param
    *     sharedNotebookIds - a list of ShardNotebook.id longs identifying the
    *             objects to delete permanently.
    *
    * @return
    *     The account's update sequence number.
    */
  def expungeSharedNotebooks(sharedNotebookIds: js.Array[Double], cb: Callback[Double]): Unit = js.native
  /**
    * Permanently deletes the tag with the provided GUID, if present.
    * <p/>
    * NOTE: This function is generally not available to third party applications.
    * Calls will result in an EDAMUserException with the error code
    * PERMISSION_DENIED.
    *
    * @param guid
    *     The GUID of the tag to delete.
    *
    * @return
    *     The Update Sequence Number for this change within the account.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Tag.guid" - if the guid parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Tag" - user doesn't own tag
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Tag.guid" - tag not found, by GUID
    *     </li>
    * </ul>
    */
  def expungeTag(guid: String, cb: Callback[Double]): Unit = js.native
  /**
    * This function is used to determine how many notes are found for each
    * notebook and tag in the user's account, given a current set of filter
    * parameters that determine the current selection.    This function will
    * return a structure that gives the note count for each notebook and tag
    * that has at least one note under the requested filter.    Any notebook or
    * tag that has zero notes in the filtered set will not be listed in the
    * reply to this function (so they can be assumed to be 0).
    *
    * @param authenticationToken
    *     Must be a valid token for the user's account unless the NoteFilter
    *     'notebookGuid' is the GUID of a public notebook.
    *
    * @param filter
    *     The note selection filter that is currently being applied.    The note
    *     counts are to be calculated with this filter applied to the total set
    *     of notes in the user's account.
    *
    * @param withTrash
    *     If true, then the NoteCollectionCounts.trashCount will be calculated
    *     and supplied in the reply. Otherwise, the trash value will be omitted.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "NoteFilter.notebookGuid" - if malformed
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.notebookGuids" - if any are malformed
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.words" - if search string too long
    *     </li>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Notebook.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def findNoteCounts(filter: NoteFilter, withTrash: Boolean, cb: Callback[NoteCollectionCounts]): Unit = js.native
  /**
    * Finds the position of a note within a sorted subset of all of the user's
    * notes. This may be useful for thin clients that are displaying a paginated
    * listing of a large account, which need to know where a particular note
    * sits in the list without retrieving all notes first.
    *
    * @param authenticationToken
    *     Must be a valid token for the user's account unless the NoteFilter
    *     'notebookGuid' is the GUID of a public notebook.
    *
    * @param filter
    *     The list of criteria that will constrain the notes to be returned.
    *
    * @param guid
    *     The GUID of the note to be retrieved.
    *
    * @return
    *     If the note with the provided GUID is found within the matching note
    *     list, this will return the offset of that note within that list (where
    *     the first offset is 0).    If the note is not found within the set of
    *     notes, this will return -1.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "offset" - not between 0 and EDAM_USER_NOTES_MAX
    *     </li>
    *     <li> BAD_DATA_FORMAT "maxNotes" - not between 0 and EDAM_USER_NOTES_MAX
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.notebookGuid" - if malformed
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.tagGuids" - if any are malformed
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.words" - if search string too long
    *     </li>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Notebook.guid" - not found, by GUID
    *     </li>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def findNoteOffset(filter: NoteFilter, guid: String, cb: Callback[Double]): Unit = js.native
  /**
    * DEPRECATED. Use findNotesMetadata.
    */
  def findNotes(filter: NoteFilter, offset: Double, maxNotes: Double, cb: Callback[NoteList]): Unit = js.native
  /**
    * Used to find the high-level information about a set of the notes from a
    * user's account based on various criteria specified via a NoteFilter object.
    * <p/>
    * Web applications that wish to periodically check for new content in a user's
    * Evernote account should consider using webhooks instead of polling this API.
    * See http://dev.evernote.com/documentation/cloud/chapters/polling_notification.php
    * for more information.
    *
    * @param authenticationToken
    *     Must be a valid token for the user's account unless the NoteFilter
    *     'notebookGuid' is the GUID of a public notebook.
    *
    * @param filter
    *     The list of criteria that will constrain the notes to be returned.
    *
    * @param offset
    *     The numeric index of the first note to show within the sorted
    *     results.    The numbering scheme starts with "0".    This can be used for
    *     pagination.
    *
    * @param maxNotes
    *     The mximum notes to return in this query.    The service will return a set
    *     of notes that is no larger than this number, but may return fewer notes
    *     if needed.    The NoteList.totalNotes field in the return value will
    *     indicate whether there are more values available after the returned set.
    *
    * @param resultSpec
    *     This specifies which information should be returned for each matching
    *     Note. The fields on this structure can be used to eliminate data that
    *     the client doesn't need, which will reduce the time and bandwidth
    *     to receive and process the reply.
    *
    * @return
    *     The list of notes that match the criteria.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "offset" - not between 0 and EDAM_USER_NOTES_MAX
    *     </li>
    *     <li> BAD_DATA_FORMAT "maxNotes" - not between 0 and EDAM_USER_NOTES_MAX
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.notebookGuid" - if malformed
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.tagGuids" - if any are malformed
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.words" - if search string too long
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Notebook.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def findNotesMetadata(
    filter: NoteFilter,
    offset: Double,
    maxNotes: Double,
    resultSpec: NotesMetadataResultSpec,
    cb: Callback[NotesMetadataList]
  ): Unit = js.native
  /**
    * Identify related entities on the service, such as notes,
    * notebooks, and tags related to notes or content.
    *
    * @param query
    *     The information about which we are finding related entities.
    *
    * @param resultSpec
    *     Allows the client to indicate the type and quantity of
    *     information to be returned, allowing a saving of time and
    *     bandwidth.
    *
    * @return
    *     The result of the query, with information considered
    *     to likely be relevantly related to the information
    *     described by the query.
    *
    * @throws EDAMUserException <ul>
    *     <li>BAD_DATA_FORMAT "RelatedQuery.plainText" - If you provided a
    *         a zero-length plain text value.
    *     </li>
    *     <li>BAD_DATA_FORMAT "RelatedQuery.noteGuid" - If you provided an
    *         invalid Note GUID, that is, one that does not match the constraints
    *         defined by EDAM_GUID_LEN_MIN, EDAM_GUID_LEN_MAX, EDAM_GUID_REGEX.
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.notebookGuid" - if malformed
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.tagGuids" - if any are malformed
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteFilter.words" - if search string too long
    *     </li>
    *     <li>PERMISSION_DENIED "Note" - If the caller does not have access to
    *         the note identified by RelatedQuery.noteGuid.
    *     </li>
    *     <li>DATA_REQUIRED "RelatedResultSpec" - If you did not not set any values
    *         in the result spec.
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li>"RelatedQuery.noteGuid" - the note with that GUID is not
    *         found, if that field has been set in the query.
    *     </li>
    * </ul>
    */
  def findRelated(query: RelatedQuery, resultSpec: RelatedResultSpec, cb: Callback[RelatedResult]): Unit = js.native
  /**
    * Returns the notebook that should be used to store new notes in the
    * user's account when no other notebooks are specified.
    */
  def getDefaultNotebook(cb: Callback[Notebook]): Unit = js.native
  /**
    * Asks the NoteStore to provide the state of the account in order of
    * last modification.    This request retrieves one block of the server's
    * state so that a client can make several small requests against a large
    * account rather than getting the entire state in one big message.
    * This call gives fine-grained control of the data that will
    * be received by a client by omitting data elements that a client doesn't
    * need. This may reduce network traffic and sync times.
    *
    * @param afterUSN
    *     The client can pass this value to ask only for objects that
    *     have been updated after a certain point.    This allows the client to
    *     receive updates after its last checkpoint rather than doing a full
    *     synchronization on every pass.    The default value of "0" indicates
    *     that the client wants to get objects from the start of the account.
    *
    * @param maxEntries
    *     The maximum number of modified objects that should be
    *     returned in the result SyncChunk.    This can be used to limit the size
    *     of each individual message to be friendly for network transfer.
    *
    * @param filter
    *     The caller must set some of the flags in this structure to specify which
    *     data types should be returned during the synchronization.    See
    *     the SyncChunkFilter structure for information on each flag.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "afterUSN" - if negative
    *     </li>
    *     <li> BAD_DATA_FORMAT "maxEntries" - if less than 1
    *     </li>
    * </ul>
    */
  def getFilteredSyncChunk(afterUSN: Double, maxEntries: Double, filter: SyncChunkFilter, cb: Callback[SyncState]): Unit = js.native
  /**
    * Asks the NoteStore to provide information about the contents of a linked
    * notebook that has been shared with the caller, or that is public to the
    * world.
    * This will return a result that is similar to getSyncChunk, but will only
    * contain entries that are visible to the caller.    I.e. only that particular
    * Notebook will be visible, along with its Notes, and Tags on those Notes.
    *
    * This function must be called on the shard that owns the referenced
    * notebook.    (I.e. the shardId in /shard/shardId/edam/note must be the
    * same as LinkedNotebook.shardId.)
    *
    * @param authenticationToken
    *     This should be an authenticationToken for the guest who has received
    *     the invitation to the share.    (I.e. this should not be the result of
    *     NoteStore.authenticateToSharedNotebook)
    *
    * @param linkedNotebook
    *     This structure should contain identifying information and permissions
    *     to access the notebook in question.    This must contain the valid fields
    *     for either a shared notebook (e.g. shareKey)
    *     or a public notebook (e.g. username, uri)
    *
    * @param afterUSN
    *     The client can pass this value to ask only for objects that
    *     have been updated after a certain point.    This allows the client to
    *     receive updates after its last checkpoint rather than doing a full
    *     synchronization on every pass.    The default value of "0" indicates
    *     that the client wants to get objects from the start of the account.
    *
    * @param maxEntries
    *     The maximum number of modified objects that should be
    *     returned in the result SyncChunk.    This can be used to limit the size
    *     of each individual message to be friendly for network transfer.
    *     Applications should not request more than 256 objects at a time,
    *     and must handle the case where the service returns less than the
    *     requested number of objects in a given request even though more
    *     objects are available on the service.
    *
    * @param fullSyncOnly
    *     If true, then the client only wants initial data for a full sync.
    *     In this case, the service will not return any expunged objects,
    *     and will not return any Resources, since these are also provided
    *     in their corresponding Notes.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "afterUSN" - if negative
    *     </li>
    *     <li> BAD_DATA_FORMAT "maxEntries" - if less than 1
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "LinkedNotebook" - if the provided information doesn't match any
    *         valid notebook
    *     </li>
    *     <li> "LinkedNotebook.uri" - if the provided public URI doesn't match any
    *         valid notebook
    *     </li>
    *     <li> "SharedNotebook.id" - if the provided information indicates a
    *            shared notebook that no longer exists
    *     </li>
    * </ul>
    */
  def getLinkedNotebookSyncChunk(
    linkedNotebook: LinkedNotebook,
    afterUSN: Double,
    maxEntries: Double,
    fullSyncOnly: Boolean,
    cb: Callback[SyncChunk]
  ): Unit = js.native
  /**
    * Asks the NoteStore to provide information about the status of a linked
    * notebook that has been shared with the caller, or that is public to the
    * world.
    * This will return a result that is similar to getSyncState, but may omit
    * SyncState.uploaded if the caller doesn't have permission to write to
    * the linked notebook.
    *
    * This function must be called on the shard that owns the referenced
    * notebook.    (I.e. the shardId in /shard/shardId/edam/note must be the
    * same as LinkedNotebook.shardId.)
    *
    * @param authenticationToken
    *     This should be an authenticationToken for the guest who has received
    *     the invitation to the share.    (I.e. this should not be the result of
    *     NoteStore.authenticateToSharedNotebook)
    *
    * @param linkedNotebook
    *     This structure should contain identifying information and permissions
    *     to access the notebook in question.
    */
  def getLinkedNotebookSyncState(linkedNotebook: LinkedNotebook, cb: Callback[SyncState]): Unit = js.native
  /**
    * Returns the current state of the note in the service with the provided
    * GUID.    The ENML contents of the note will only be provided if the
    * 'withContent' parameter is true.    The service will include the meta-data
    * for each resource in the note, but the binary contents of the resources
    * and their recognition data will be omitted.
    * If the Note is found in a public notebook, the authenticationToken
    * will be ignored (so it could be an empty string).    The applicationData
    * fields are returned as keysOnly.
    *
    * @param guid
    *     The GUID of the note to be retrieved.
    *
    * @param withContent
    *     If true, the note will include the ENML contents of its
    *     'content' field.
    *
    * @param withResourcesData
    *     If true, any Resource elements in this Note will include the binary
    *     contents of their 'data' field's body.
    *
    * @param withResourcesRecognition
    *     If true, any Resource elements will include the binary contents of the
    *     'recognition' field's body if recognition data is present.
    *
    * @param withResourcesAlternateData
    *     If true, any Resource elements in this Note will include the binary
    *     contents of their 'alternateData' fields' body, if an alternate form
    *     is present.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def getNote(
    guid: String,
    withContent: Boolean,
    withResourcesData: Boolean,
    withResourcesRecognition: Boolean,
    withResourcesAlternateData: Boolean,
    cb: Callback[Note]
  ): Unit = js.native
  /**
    * Get all of the application data for the note identified by GUID,
    * with values returned within the LazyMap fullMap field.
    * If there are no applicationData entries, then a LazyMap
    * with an empty fullMap will be returned. If your application
    * only needs to fetch its own applicationData entry, use
    * getNoteApplicationDataEntry instead.
    */
  def getNoteApplicationData(guid: String, cb: Callback[LazyMap]): Unit = js.native
  /**
    * Get the value of a single entry in the applicationData map
    * for the note identified by GUID.
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - note not found, by GUID</li>
    *     <li> "NoteAttributes.applicationData.key" - note not found, by key</li>
    * </ul>
    */
  def getNoteApplicationDataEntry(guid: String, key: String, cb: Callback[String]): Unit = js.native
  /**
    * Returns XHTML contents of the note with the provided GUID.
    * If the Note is found in a public notebook, the authenticationToken
    * will be ignored (so it could be an empty string).
    *
    * @param guid
    *     The GUID of the note to be retrieved.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def getNoteContent(guid: String, cb: Callback[String]): Unit = js.native
  /**
    * Returns a block of the extracted plain text contents of the note with the
    * provided GUID.    This text can be indexed for search purposes by a light
    * client that doesn't have capabilities to extract all of the searchable
    * text content from the note and its resources.
    *
    * If the Note is found in a public notebook, the authenticationToken
    * will be ignored (so it could be an empty string).
    *
    * @param guid
    *     The GUID of the note to be retrieved.
    *
    * @param noteOnly
    *     If true, this will only return the text extracted from the ENML contents
    *     of the note itself.    If false, this will also include the extracted text
    *     from any text-bearing resources (PDF, recognized images)
    *
    * @param tokenizeForIndexing
    *     If true, this will break the text into cleanly separated and sanitized
    *     tokens.    If false, this will return the more raw text extraction, with
    *     its original punctuation, capitalization, spacing, etc.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def getNoteSearchText(guid: String, noteOnly: Boolean, tokenizeForIndexing: Boolean, cb: Callback[String]): Unit = js.native
  /**
    * Returns a list of the names of the tags for the note with the provided
    * guid.    This can be used with authentication to get the tags for a
    * user's own note, or can be used without valid authentication to retrieve
    * the names of the tags for a note in a public notebook.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def getNoteTagNames(guid: String, cb: Callback[js.Array[String]]): Unit = js.native
  /**
    * This can be used to retrieve a previous version of a Note after it has been
    * updated within the service.    The caller must identify the note (via its
    * guid) and the version (via the updateSequenceNumber of that version).
    * to find a listing of the stored version USNs for a note, call
    * listNoteVersions.
    * This call is only available for notes in Premium accounts.    (I.e. access
    * to past versions of Notes is a Premium-only feature.)
    *
    * @param noteGuid
    *     The GUID of the note to be retrieved.
    *
    * @param updateSequenceNum
    *     The USN of the version of the note that is being retrieved
    *
    * @param withResourcesData
    *     If true, any Resource elements in this Note will include the binary
    *     contents of their 'data' field's body.
    *
    * @param withResourcesRecognition
    *     If true, any Resource elements will include the binary contents of the
    *     'recognition' field's body if recognition data is present.
    *
    * @param withResourcesAlternateData
    *     If true, any Resource elements in this Note will include the binary
    *     contents of their 'alternateData' fields' body, if an alternate form
    *     is present.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
    *     </li>
    *     <li> PERMISSION_DENIED "updateSequenceNum" -
    *         The account isn't permitted to access previous versions of notes.
    *         (i.e. this is a Free account.)
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    *     <li> "Note.updateSequenceNumber" - the Note doesn't have a version with
    *            the corresponding USN.
    *     </li>
    * </ul>
    */
  def getNoteVersion(
    noteGuid: String,
    updateSequenceNum: Double,
    withResourcesData: Boolean,
    withResourcesRecognition: Boolean,
    withResourcesAlternateData: Boolean,
    cb: Callback[Note]
  ): Unit = js.native
  /**
    * Returns the current state of the notebook with the provided GUID.
    * The notebook may be active or deleted (but not expunged).
    *
    * @param guid
    *     The GUID of the notebook to be retrieved.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Notebook.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Notebook" - private notebook, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Notebook.guid" - tag not found, by GUID
    *     </li>
    * </ul>
    */
  def getNotebook(guid: String, cb: Callback[Notebook]): Unit = js.native
  /**
    * <p>
    * Looks for a user account with the provided userId on this NoteStore
    * shard and determines whether that account contains a public notebook
    * with the given URI.    If the account is not found, or no public notebook
    * exists with this URI, this will throw an EDAMNotFoundException,
    * otherwise this will return the information for that Notebook.
    * </p>
    * <p>
    * If a notebook is visible on the web with a full URL like
    * http://www.evernote.com/pub/sethdemo/api
    * Then 'sethdemo' is the username that can be used to look up the userId,
    * and 'api' is the publicUri.
    * </p>
    *
    * @param userId
    *        The numeric identifier for the user who owns the public notebook.
    *        To find this value based on a username string, you can invoke
    *        UserStore.getPublicUserInfo
    *
    * @param publicUri
    *        The uri string for the public notebook, from Notebook.publishing.uri.
    *
    * @throws EDAMNotFoundException <ul>
    *     <li>"Publishing.uri" - not found, by URI</li>
    * </ul>
    *
    * @throws EDAMSystemException <ul>
    *     <li> TAKEN_DOWN "PublicNotebook" - The specified public notebook is
    *         taken down (for all requesters).</li>
    *     <li> TAKEN_DOWN "Country" - The specified public notebook is taken
    *         down for the requester because of an IP-based country lookup.</li>
    * </ul>
    */
  def getPublicNotebook(userId: Double, publicUri: String, cb: Callback[Notebook]): Unit = js.native
  /**
    * Returns the current state of the resource in the service with the
    * provided GUID.
    * If the Resource is found in a public notebook, the authenticationToken
    * will be ignored (so it could be an empty string).    Only the
    * keys for the applicationData will be returned.
    *
    * @param guid
    *     The GUID of the resource to be retrieved.
    *
    * @param withData
    *     If true, the Resource will include the binary contents of the
    *     'data' field's body.
    *
    * @param withRecognition
    *     If true, the Resource will include the binary contents of the
    *     'recognition' field's body if recognition data is present.
    *
    * @param withAttributes
    *     If true, the Resource will include the attributes
    *
    * @param withAlternateData
    *     If true, the Resource will include the binary contents of the
    *     'alternateData' field's body, if an alternate form is present.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Resource.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def getResource(
    guid: String,
    withData: Boolean,
    withRecognition: Boolean,
    withAttributes: Boolean,
    withAlternateData: Boolean,
    cb: Callback[Resource]
  ): Unit = js.native
  /**
    * If the Resource with the provided GUID has an alternate data representation
    * (indicated via the Resource.alternateData field), then this request can
    * be used to retrieve the binary contents of that alternate data file.
    * If the caller asks about a resource that has no alternate data form, this
    * will throw EDAMNotFoundException.
    *
    * @param guid
    *        The GUID of the resource whose recognition data should be retrieved.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Resource.guid" - not found, by GUID
    *     </li>
    *     <li> "Resource.alternateData" - resource has no recognition
    *     </li>
    * </ul>
    */
  def getResourceAlternateData(guid: String, cb: Callback[String]): Unit = js.native
  /**
    * Get all of the application data for the Resource identified by GUID,
    * with values returned within the LazyMap fullMap field.
    * If there are no applicationData entries, then a LazyMap
    * with an empty fullMap will be returned. If your application
    * only needs to fetch its own applicationData entry, use
    * getResourceApplicationDataEntry instead.
    */
  def getResourceApplicationData(guid: String, cb: Callback[LazyMap]): Unit = js.native
  /**
    * Get the value of a single entry in the applicationData map
    * for the Resource identified by GUID.
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Resource.guid" - Resource not found, by GUID</li>
    *     <li> "ResourceAttributes.applicationData.key" - Resource not found, by key</li>
    * </ul>
    */
  def getResourceApplicationDataEntry(guid: String, key: String, cb: Callback[String]): Unit = js.native
  /**
    * Returns the set of attributes for the Resource with the provided GUID.
    * If the Resource is found in a public notebook, the authenticationToken
    * will be ignored (so it could be an empty string).
    *
    * @param guid
    *     The GUID of the resource whose attributes should be retrieved.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Resource.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def getResourceAttributes(guid: String, cb: Callback[ResourceAttributes]): Unit = js.native
  /**
    * Returns the current state of a resource, referenced by containing
    * note GUID and resource content hash.
    *
    * @param noteGuid
    *     The GUID of the note that holds the resource to be retrieved.
    *
    * @param contentHash
    *     The MD5 checksum of the resource within that note. Note that
    *     this is the binary checksum, for example from Resource.data.bodyHash,
    *     and not the hex-encoded checksum that is used within an en-media
    *     tag in a note body.
    *
    * @param withData
    *     If true, the Resource will include the binary contents of the
    *     'data' field's body.
    *
    * @param withRecognition
    *     If true, the Resource will include the binary contents of the
    *     'recognition' field's body.
    *
    * @param withAlternateData
    *     If true, the Resource will include the binary contents of the
    *     'alternateData' field's body, if an alternate form is present.
    *
    * @throws EDAMUserException <ul>
    *     <li> DATA_REQUIRED "Note.guid" - noteGuid param missing
    *     </li>
    *     <li> DATA_REQUIRED "Note.contentHash" - contentHash param missing
    *     </li>
    *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note" - not found, by guid
    *     </li>
    *     <li> "Resource" - not found, by hash
    *     </li>
    * </ul>
    */
  def getResourceByHash(
    noteGuid: String,
    contentHash: String,
    withData: Boolean,
    withRecognition: Boolean,
    withAlternateData: Boolean,
    cb: Callback[Resource]
  ): Unit = js.native
  /**
    * Returns binary data of the resource with the provided GUID.    For
    * example, if this were an image resource, this would contain the
    * raw bits of the image.
    * If the Resource is found in a public notebook, the authenticationToken
    * will be ignored (so it could be an empty string).
    *
    * @param guid
    *     The GUID of the resource to be retrieved.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Resource.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def getResourceData(guid: String, cb: Callback[String]): Unit = js.native
  /**
    * Returns the binary contents of the recognition index for the resource
    * with the provided GUID.    If the caller asks about a resource that has
    * no recognition data, this will throw EDAMNotFoundException.
    * If the Resource is found in a public notebook, the authenticationToken
    * will be ignored (so it could be an empty string).
    *
    * @param guid
    *     The GUID of the resource whose recognition data should be retrieved.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Resource.guid" - not found, by GUID
    *     </li>
    *     <li> "Resource.recognition" - resource has no recognition
    *     </li>
    * </ul>
    */
  def getResourceRecognition(guid: String, cb: Callback[String]): Unit = js.native
  /**
    * Returns a block of the extracted plain text contents of the resource with
    * the provided GUID.    This text can be indexed for search purposes by a light
    * client that doesn't have capability to extract all of the searchable
    * text content from a resource.
    *
    * If the Resource is found in a public notebook, the authenticationToken
    * will be ignored (so it could be an empty string).
    *
    * @param guid
    *     The GUID of the resource to be retrieved.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Resource.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def getResourceSearchText(guid: String, cb: Callback[String]): Unit = js.native
  /**
    * Returns the current state of the search with the provided GUID.
    *
    * @param guid
    *     The GUID of the search to be retrieved.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "SavedSearch.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "SavedSearch" - private Tag, user doesn't own
    *     </li>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "SavedSearch.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def getSearch(guid: String, cb: Callback[SavedSearch]): Unit = js.native
  /**
    * This function is used to retrieve extended information about a shared
    * notebook by a guest who has already authenticated to access that notebook.
    * This requires an 'authenticationToken' parameter which should be the
    * resut of a call to authenticateToSharedNotebook(...).
    * I.e. this is the token that gives access to the particular shared notebook
    * in someone else's account -- it's not the authenticationToken for the
    * owner of the notebook itself.
    *
    * @param authenticationToken
    *     Should be the authentication token retrieved from the reply of
    *     authenticateToSharedNotebook(), proving access to a particular shared
    *     notebook.
    *
    * @throws EDAMUserException <ul>
    *     <li> PERMISSION_DENIED "authenticationToken" -
    *                    authentication token doesn't correspond to a valid shared notebook
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "SharedNotebook.id" - the shared notebook no longer exists
    *     </li>
    * </ul>
    */
  def getSharedNotebookByAuth(cb: Callback[SharedNotebook]): Unit = js.native
  /**
    * Asks the NoteStore to provide information about the status of the user
    * account corresponding to the provided authentication token.
    */
  def getSyncState(cb: Callback[SyncState]): Unit = js.native
  /**
    * Asks the NoteStore to provide information about the status of the user
    * account corresponding to the provided authentication token.
    * This version of 'getSyncState' allows the client to upload coarse-
    * grained usage metrics to the service.
    *
    * @param clientMetrics    see the documentation of the ClientUsageMetrics
    *     structure for an explanation of the fields that clients can pass to
    *     the service.
    */
  def getSyncStateWithMetrics(clientMetrics: ClientUsageMetrics, cb: Callback[SyncState]): Unit = js.native
  /**
    * Returns the current state of the Tag with the provided GUID.
    *
    * @param guid
    *     The GUID of the tag to be retrieved.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Tag.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Tag" - private Tag, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Tag.guid" - tag not found, by GUID
    *     </li>
    * </ul>
    */
  def getTag(guid: String, cb: Callback[Tag]): Unit = js.native
  /**
    * Returns a list of linked notebooks
    */
  def listLinkedNotebooks(cb: Callback[js.Array[LinkedNotebook]]): Unit = js.native
  /**
    * Returns a list of the prior versions of a particular note that are
    * saved within the service.    These prior versions are stored to provide a
    * recovery from unintentional removal of content from a note. The identifiers
    * that are returned by this call can be used with getNoteVersion to retrieve
    * the previous note.
    * The identifiers will be listed from the most recent versions to the oldest.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def listNoteVersions(noteGuid: String, cb: Callback[js.Array[NoteVersionId]]): Unit = js.native
  /**
    * Returns a list of all of the notebooks in the account.
    */
  def listNotebooks(cb: Callback[js.Array[Notebook]]): Unit = js.native
  /**
    * Returns a list of the searches in the account.    Evernote does not support
    * the undeletion of searches, so this will only include active searches.
    */
  def listSearches(cb: Callback[js.Array[SavedSearch]]): Unit = js.native
  /**
    * Lists the collection of shared notebooks for all notebooks in the
    * users account.
    *
    * @return
    *    The list of all SharedNotebooks for the user
    */
  def listSharedNotebooks(cb: Callback[js.Array[SharedNotebook]]): Unit = js.native
  /**
    * Returns a list of the tags in the account.    Evernote does not support
    * the undeletion of tags, so this will only include active tags.
    */
  def listTags(cb: Callback[js.Array[Tag]]): Unit = js.native
  /**
    * Returns a list of the tags that are applied to at least one note within
    * the provided notebook.    If the notebook is public, the authenticationToken
    * may be ignored.
    *
    * @param notebookGuid
    *        the GUID of the notebook to use to find tags
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Notebook.guid" - notebook not found by GUID
    *     </li>
    * </ul>
    */
  def listTagsByNotebook(notebookGuid: String, cb: Callback[js.Array[Tag]]): Unit = js.native
  /**
    * Send a reminder message to some or all of the email addresses that a notebook has been
    * shared with. The message includes the current link to view the notebook.
    * @param authenticationToken
    *     The auth token of the user with permissions to share the notebook
    * @param notebookGuid
    *     The guid of the shared notebook
    * @param messageText
    *    User provided text to include in the email
    * @param recipients
    *    The email addresses of the recipients. If this list is empty then all of the
    *    users that the notebook has been shared with are emailed.
    *    If an email address doesn't correspond to share invite members then that address
    *    is ignored.
    * @return
    *    The number of messages sent
    * @throws EDAMUserException <ul>
    *     <li> LIMIT_REACHED "(recipients)" -
    *         The email can't be sent because this would exceed the user's daily
    *         email limit.
    *     </li>
    *     <li> PERMISSION_DENIED "Notebook.guid" - The user doesn't have permission to
    *         send a message for the specified notebook.
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Notebook.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def sendMessageToSharedNotebookMembers(notebookGuid: String, messageText: String, recipients: js.Array[String], cb: Callback[Double]): Unit = js.native
  /**
    * Update, or create, an entry in the applicationData map for
    * the note identified by guid.
    */
  def setNoteApplicationDataEntry(guid: String, key: String, value: String, cb: Callback[Double]): Unit = js.native
  /**
    * Update, or create, an entry in the applicationData map for
    * the Resource identified by guid.
    */
  def setResourceApplicationDataEntry(guid: String, key: String, value: String, cb: Callback[Double]): Unit = js.native
  /**
    * Set values for the recipient settings associated with a shared notebook.    Having
    * update rights to the shared notebook record itself has no effect on this call;
    * only the recipient of the shared notebook can can the recipient settings.
    *
    * If you do <i>not</i> wish to, or cannot, change one of the reminderNotifyEmail or
    * reminderNotifyInApp fields, you must leave that field unset in recipientSettings.
    * This method will skip that field for updates and leave the existing state as
    * it is.
    *
    * @return The update sequence number of the account to which the shared notebook
    *     belongs, which is the account from which we are sharing a notebook.
    *
    * @throws EDAMNotFoundException "sharedNotebookId" - Thrown if the service does not
    *     have a shared notebook record for the sharedNotebookId on the given shard.    If you
    *     receive this exception, it is probable that the shared notebook record has
    *     been revoked or expired, or that you accessed the wrong shard.
    *
    * @throws EDAMUserException <ul>
    *     <li>PEMISSION_DENIED "authenticationToken" - If you do not have permission to set
    *             the recipient settings for the shared notebook.    Only the recipient has
    *             permission to do this.
    *     <li>DATA_CONFLICT "recipientSettings.reminderNotifyEmail" - Setting whether
    *             or not you want to receive reminder e-mail notifications is possible on
    *             a business notebook in the business to which the user belongs.    All
    *             others can safely unset the reminderNotifyEmail field from the
    *             recipientSettings parameter.
    * </ul>
    */
  def setSharedNotebookRecipientSettings(sharedNotebookId: Double, recipientSettings: SharedNotebookRecipientSettings, cb: Callback[Double]): Unit = js.native
  /**
    * If this note is not already shared (via its own direct URL), then this
    * will start sharing that note.
    * This will return the secret "Note Key" for this note that
    * can currently be used in conjunction with the Note's GUID to gain direct
    * read-only access to the Note.
    * If the note is already shared, then this won't make any changes to the
    * note, and the existing "Note Key" will be returned.    The only way to change
    * the Note Key for an existing note is to stopSharingNote first, and then
    * call this function.
    *
    * @param guid
    *     The GUID of the note to be shared.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def shareNote(guid: String, cb: Callback[String]): Unit = js.native
  /**
    * If this note is not already shared then this will stop sharing that note
    * and invalidate its "Note Key", so any existing URLs to access that Note
    * will stop working.
    * If the Note is not shared, then this function will do nothing.
    *
    * @param guid
    *     The GUID of the note to be un-shared.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Note.guid" - if the parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - private note, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def stopSharingNote(guid: String, cb: Callback[Unit]): Unit = js.native
  /**
    * Remove an entry identified by 'key' from the applicationData map for
    * the note identified by 'guid'. Silently ignores an unset of a
    * non-existing key.
    */
  def unsetNoteApplicationDataEntry(guid: String, key: String, cb: Callback[Double]): Unit = js.native
  /**
    * Remove an entry identified by 'key' from the applicationData map for
    * the Resource identified by 'guid'.
    */
  def unsetResourceApplicationDataEntry(guid: String, key: String, cb: Callback[Double]): Unit = js.native
  /**
    * Removes the provided tag from every note that is currently tagged with
    * this tag.    If this operation is successful, the tag will still be in
    * the account, but it will not be tagged on any notes.
    *
    * This function is not indended for use by full synchronizing clients, since
    * it does not provide enough result information to the client to reconcile
    * the local state without performing a follow-up sync from the service.    This
    * is intended for "thin clients" that need to efficiently support this as
    * a UI operation.
    *
    * @param guid
    *     The GUID of the tag to remove from all notes.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Tag.guid" - if the guid parameter is missing
    *     </li>
    *     <li> PERMISSION_DENIED "Tag" - user doesn't own tag
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Tag.guid" - tag not found, by GUID
    *     </li>
    * </ul>
    */
  def untagAll(guid: String, cb: Callback[Unit]): Unit = js.native
  /**
    * @param linkedNotebook
    *     Updates the name of a linked notebook.
    *
    * @return
    *     The Update Sequence Number for this change within the account.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "LinkedNotebook.name" - invalid length or pattern
    *     </li>
    * </ul>
    */
  def updateLinkedNotebook(linkedNotebook: LinkedNotebook, cb: Callback[Double]): Unit = js.native
  /**
    * Submit a set of changes to a note to the service.    The provided data
    * must include the note's guid field for identification. The note's
    * title must also be set.
    *
    * @param note
    *     A Note object containing the desired fields to be populated on
    *     the service. With the exception of the note's title and guid, fields
    *     that are not being changed do not need to be set. If the content is not
    *     being modified, note.content should be left unset. If the list of
    *     resources is not being modified, note.resources should be left unset.
    *
    * @return
    *     The metadata (no contents) for the Note on the server after the update
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Note.title" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "Note.content" - invalid length for ENML body
    *     </li>
    *     <li> BAD_DATA_FORMAT "NoteAttributes.*" - bad resource string
    *     </li>
    *     <li> BAD_DATA_FORMAT "ResourceAttributes.*" - bad resource string
    *     </li>
    *     <li> BAD_DATA_FORMAT "Resource.mime" - invalid resource MIME type
    *     </li>
    *     <li> DATA_CONFLICT "Note.deleted" - deleted time set on active note
    *     </li>
    *     <li> DATA_REQUIRED "Resource.data" - resource data body missing
    *     </li>
    *     <li> ENML_VALIDATION "*" - note content doesn't validate against DTD
    *     </li>
    *     <li> LIMIT_REACHED "Note.tagGuids" - too many Tags on Note
    *     </li>
    *     <li> LIMIT_REACHED "Note.resources" - too many resources on Note
    *     </li>
    *     <li> LIMIT_REACHED "Note.size" - total note size too large
    *     </li>
    *     <li> LIMIT_REACHED "Resource.data.size" - resource too large
    *     </li>
    *     <li> LIMIT_REACHED "NoteAttribute.*" - attribute string too long
    *     </li>
    *     <li> LIMIT_REACHED "ResourceAttribute.*" - attribute string too long
    *     </li>
    *     <li> PERMISSION_DENIED "Note" - user doesn't own
    *     </li>
    *     <li> PERMISSION_DENIED "Note.notebookGuid" - user doesn't own destination
    *     </li>
    *     <li> QUOTA_REACHED "Accounting.uploadLimit" - note exceeds upload quota
    *     </li>
    *     <li> BAD_DATA_FORMAT "Tag.name" - Note.tagNames was provided, and one
    *         of the specified tags had an invalid length or pattern
    *     </li>
    *     <li> LIMIT_REACHED "Tag" - Note.tagNames was provided, and the required
    *         new tags would exceed the maximum number per account
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Note.guid" - note not found, by GUID
    *     </li>
    *     <li> "Note.notebookGuid" - if notebookGuid provided, but not found
    *     </li>
    * </ul>
    */
  def updateNote(note: Note, cb: Callback[Note]): Unit = js.native
  /**
    * Submits notebook changes to the service.    The provided data must include
    * the notebook's guid field for identification.
    *
    * @param notebook
    *     The notebook object containing the requested changes.
    *
    * @return
    *     The Update Sequence Number for this change within the account.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Notebook.name" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "Notebook.stack" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "Publishing.uri" - if publishing set but bad uri
    *     </li>
    *     <li> BAD_DATA_FORMAT "Publishing.publicDescription" - if too long
    *     </li>
    *     <li> DATA_CONFLICT "Notebook.name" - name already in use
    *     </li>
    *     <li> DATA_CONFLICT "Publishing.uri" - if URI already in use
    *     </li>
    *     <li> DATA_REQUIRED "Publishing.uri" - if publishing set but uri missing
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Notebook.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def updateNotebook(notebook: Notebook, cb: Callback[Double]): Unit = js.native
  /**
    * Submit a set of changes to a resource to the service.    This can be used
    * to update the meta-data about the resource, but cannot be used to change
    * the binary contents of the resource (including the length and hash).    These
    * cannot be changed directly without creating a new resource and removing the
    * old one via updateNote.
    *
    * @param resource
    *     A Resource object containing the desired fields to be populated on
    *     the service.    The service will attempt to update the resource with the
    *     following fields from the client:
    *     <ul>
    *            <li>guid:    must be provided to identify the resource
    *            </li>
    *            <li>mime
    *            </li>
    *            <li>width
    *            </li>
    *            <li>height
    *            </li>
    *            <li>duration
    *            </li>
    *            <li>attributes:    optional.    if present, the set of attributes will
    *                     be replaced.
    *            </li>
    *     </ul>
    *
    * @return
    *     The Update Sequence Number of the resource after the changes have been
    *     applied.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Resource.guid" - if the parameter is missing
    *     </li>
    *     <li> BAD_DATA_FORMAT "Resource.mime" - invalid resource MIME type
    *     </li>
    *     <li> BAD_DATA_FORMAT "ResourceAttributes.*" - bad resource string
    *     </li>
    *     <li> LIMIT_REACHED "ResourceAttribute.*" - attribute string too long
    *     </li>
    *     <li> PERMISSION_DENIED "Resource" - private resource, user doesn't own
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Resource.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def updateResource(resource: Resource, cb: Callback[Double]): Unit = js.native
  /**
    * Submits search changes to the service. The provided data must include
    * the search's guid field for identification. The service will apply
    * updates to the following search fields: name, query, and scope.
    *
    * @param search
    *     The search object containing the requested changes.
    *
    * @return
    *     The Update Sequence Number for this change within the account.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "SavedSearch.name" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "SavedSearch.query" - invalid length
    *     </li>
    *     <li> DATA_CONFLICT "SavedSearch.name" - name already in use
    *     </li>
    *     <li> PERMISSION_DENIED "SavedSearch" - user doesn't own tag
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "SavedSearch.guid" - not found, by GUID
    *     </li>
    * </ul>
    */
  def updateSearch(search: SavedSearch, cb: Callback[Double]): Double = js.native
  /**
    * Update a SharedNotebook object.
    *
    * @param authenticationToken
    *     Must be an authentication token from the owner or a shared notebook
    *     authentication token or business authentication token with sufficient
    *     permissions to change invitations for a notebook.
    *
    * @param sharedNotebook
    *    The SharedNotebook object containing the requested changes.
    *    The "id" of the shared notebook must be set to allow the service
    *    to identify the SharedNotebook to be updated. In addition, you MUST set
    *    the email, permission, and allowPreview fields to the desired values.
    *    All other fields will be ignored if set.
    *
    * @return
    *    The Update Serial Number for this change within the account.
    *
    * @throws EDAMUserException <ul>
    *     <li>UNSUPPORTED_OPERATION "updateSharedNotebook" - if this service instance does not support shared notebooks.</li>
    *     <li>BAD_DATA_FORMAT "SharedNotebook.email" - if the email was not valid.</li>
    *     <li>DATA_REQUIRED "SharedNotebook.id" - if the id field was not set.</li>
    *     <li>DATA_REQUIRED "SharedNotebook.privilege" - if the privilege field was not set.</li>
    *     <li>DATA_REQUIRED "SharedNotebook.allowPreview" - if the allowPreview field was not set.</li>
    *     </ul>
    * @throws EDAMNotFoundException <ul>
    *     <li>SharedNotebook.id - if no shared notebook with the specified ID was found.
    *     </ul>
    */
  def updateSharedNotebook(sharedNotebook: SharedNotebook, cb: Callback[Double]): Unit = js.native
  /**
    * Submits tag changes to the service.    The provided data must include
    * the tag's guid field for identification.    The service will apply
    * updates to the following tag fields:    name, parentGuid
    *
    * @param tag
    *     The tag object containing the requested changes.
    *
    * @return
    *     The Update Sequence Number for this change within the account.
    *
    * @throws EDAMUserException <ul>
    *     <li> BAD_DATA_FORMAT "Tag.name" - invalid length or pattern
    *     </li>
    *     <li> BAD_DATA_FORMAT "Tag.parentGuid" - malformed GUID
    *     </li>
    *     <li> DATA_CONFLICT "Tag.name" - name already in use
    *     </li>
    *     <li> DATA_CONFLICT "Tag.parentGuid" - can't set parent: circular
    *     </li>
    *     <li> PERMISSION_DENIED "Tag" - user doesn't own tag
    *     </li>
    * </ul>
    *
    * @throws EDAMNotFoundException <ul>
    *     <li> "Tag.guid" - tag not found, by GUID
    *     </li>
    *     <li> "Tag.parentGuid" - parent not found, by GUID
    *     </li>
    * </ul>
    */
  def updateTag(tag: Tag, cb: Callback[Double]): Unit = js.native
}


package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_BusinessNotebook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A unique container for a set of notes.
  * <dl>
  * <dt>guid</dt>
  *     <dd>The unique identifier of this notebook.
  *     <br/>
  *     Length:    EDAM_GUID_LEN_MIN - EDAM_GUID_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_GUID_REGEX
  *     </dd>
  *
  * <dt>name</dt>
  *     <dd>A sequence of characters representing the name of the
  *     notebook.    May be changed by clients, but the account may not contain two
  *     notebooks with names that are equal via a case-insensitive comparison.
  *     Can't begin or end with a space.
  *     <br/>
  *     Length:    EDAM_NOTEBOOK_NAME_LEN_MIN - EDAM_NOTEBOOK_NAME_LEN_MAX
  *     <br/>
  *     Regex:    EDAM_NOTEBOOK_NAME_REGEX
  *     </dd>
  *
  * <dt>updateSequenceNum</dt>
  *     <dd>A number identifying the last transaction to
  *     modify the state of this object.    The USN values are sequential within an
  *     account, and can be used to compare the order of modifications within the
  *     service.
  *     </dd>
  *
  * <dt>defaultNotebook</dt>
  *     <dd>If true, this notebook should be used for new notes
  *     whenever the user has not (or cannot) specify a desired target notebook.
  *     For example, if a note is submitted via SMTP email.
  *     The service will maintain at most one defaultNotebook per account.
  *     If a second notebook is created or updated with defaultNotebook set to
  *     true, the service will automatically update the prior notebook's
  *     defaultNotebook field to false.    If the default notebook is deleted
  *     (i.e. "active" set to false), the "defaultNotebook" field will be
  *     set to false by the service.    If the account has no default notebook
  *     set, the service will use the most recent notebook as the default.
  *     </dd>
  *
  * <dt>serviceCreated</dt>
  *     <dd>The time when this notebook was created on the
  *     service. This will be set on the service during creation, and the service
  *     will provide this value when it returns a Notebook to a client.
  *     The service will ignore this value if it is sent by clients.
  *     </dd>
  *
  * <dt>serviceUpdated</dt>
  *     <dd>The time when this notebook was last modified on the
  *     service.    This will be set on the service during creation, and the service
  *     will provide this value when it returns a Notebook to a client.
  *     The service will ignore this value if it is sent by clients.
  *     </dd>
  *
  * <dt>publishing</dt>
  *     <dd>If the Notebook has been opened for public access, or
  *     business users shared with their business (i.e. if 'published' is
  *     set to true), then this will point to the set of publishing
  *     information for the Notebook (URI, description, etc.).    A
  *     Notebook cannot be published without providing this information,
  *     but it will persist for later use if publishing is ever disabled
  *     on the Notebook.    Clients that do not wish to change the
  *     publishing behavior of a Notebook should not set this value when
  *     calling NoteStore.updateNotebook().
  *     </dd>
  *
  * <dt>published</dt>
  *     <dd>If this is set to true, then the Notebook will be
  *     accessible either to the public, or for business users to their business,
  *     via the 'publishing' specification, which must also be set.    If this is set
  *     to false, the Notebook will not be available to the public (or business).
  *     Clients that do not wish to change the publishing behavior of a Notebook
  *     should not set this value when calling NoteStore.updateNotebook().
  *     </dd>
  *
  * <dt>stack</dt>
  *     <dd>If this is set, then the notebook is visually contained within a stack
  *     of notebooks with this name.    All notebooks in the same account with the
  *     same 'stack' field are considered to be in the same stack.
  *     Notebooks with no stack set are "top level" and not contained within a
  *     stack.
  *     </dd>
  *
  * <dt>sharedNotebookIds</dt>
  *     <dd><i>DEPRECATED</i> - replaced by sharedNotebooks.</dd>
  *
  * <dt>sharedNotebooks</dt>
  *     <dd>The list of recipients to whom this notebook has been shared
  *     (one SharedNotebook object per recipient email address). This field will
  *     be unset if you do not have permission to access this data. If you are
  *     accessing the notebook as the owner or via a shared notebook that is
  *     modifiable, then you have access to this data and the value will be set.
  *     This field is read-only. Clients may not make changes to shared notebooks
  *     via this field.
  *     </dd>
  *
  * <dt>businessNotebook</dt>
  *     <dd>If the notebook is part of a business account and has been published to the
  *     business library, this will contain information for the library listing.
  *     The presence or absence of this field is not a reliable test of whether a given
  *     notebook is in fact a business notebook - the field is only used when a notebook is or
  *     has been published to the business library.
  *     </dd>
  *
  * <dt>contact</dt>
  *     <dd>Intended for use with Business accounts, this field identifies the user who
  *     has been designated as the "contact".    For notebooks created in business
  *     accounts, the server will automatically set this value to the user who created
  *     the notebook unless Notebook.contact.username has been set, in which that value
  *     will be used.    When updating a notebook, it is common to leave Notebook.contact
  *     field unset, indicating that no change to the value is being requested and that
  *     the existing value, if any, should be preserved.
  *     </dd>
  *
  * </dl>
  */
@JSImport("evernote", "Evernote.Notebook")
@js.native
class Notebook () extends js.Object {
  def this(args: Anon_BusinessNotebook) = this()
  var businessNotebook: BusinessNotebook = js.native
  var contact: User = js.native
  var defaultNotebook: Boolean = js.native
  var guid: String = js.native
  var name: String = js.native
  var published: Boolean = js.native
  var publishing: Publishing = js.native
  var restrictions: NotebookRestrictions = js.native
  var serviceCreated: Double = js.native
  var serviceUpdated: Double = js.native
  var sharedNotebookIds: js.Array[Double] = js.native
  var sharedNotebooks: js.Array[SharedNotebook] = js.native
  var stack: String = js.native
  var updateSequenceNum: Double = js.native
}


package typings.evernote.mod.Evernote

import typings.evernote.AnonExpungeWhichSharedNotebookRestrictions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This structure captures information about the types of operations
  * that cannot be performed on a given notebook with a type of
  * authenticated access and credentials.    The values filled into this
  * structure are based on then-current values in the server database
  * for shared notebooks and notebook publishing records, as well as
  * information related to the authentication token.    Information from
  * the authentication token includes the application that is accessing
  * the server, as defined by the permissions granted by consumer (api)
  * key, and the method used to obtain the token, for example via
  * authenticateToSharedNotebook, authenticateToBusiness, etc.    Note
  * that changes to values in this structure that are the result of
  * shared notebook or publishing record changes are communicated to
  * the client via a change in the notebook USN during sync.    It is
  * important to use the same access method, parameters, and consumer
  * key in order obtain correct results from the sync engine.
  *
  * The server has the final say on what is allowed as values may
  * change between calls to obtain NotebookRestrictions instances
  * and to operate on data on the service.
  *
  * If the following are set and true, then the given restriction is
  * in effect, as accessed by the same authentication token from which
  * the values were obtained.
  *
  * <dt>noReadNotes</dt>
  *     <dd>The client is not able to read notes from the service and
  *     the notebook is write-only.
  *     </dd>
  * <dt>noCreateNotes</dt>
  *     <dd>The client may not create new notes in the notebook.
  *     </dd>
  * <dt>noUpdateNotes</dt>
  *     <dd>The client may not update notes currently in the notebook.
  *     </dd>
  * <dt>noExpungeNotes</dt>
  *     <dd>The client may not expunge notes currently in the notebook.
  *     </dd>
  * <dt>noShareNotes</dt>
  *     <dd>The client may not share notes in the notebook via the
  *     shareNote method.
  *     </dd>
  * <dt>noEmailNotes</dt>
  *     <dd>The client may not e-mail notes via the Evernote service by
  *     using the emailNote method.
  *     </dd>
  * <dt>noSendMessageToRecipients</dt>
  *     <dd>The client may not send messages to the share recipients of
  *     the notebook.
  *     </dd>
  * <dt>noUpdateNotebook</dt>
  *     <dd>The client may not update the Notebook object itself, for
  *     example, via the updateNotebook method.
  *     </dd>
  * <dt>noExpungeNotebook</dt>
  *     <dd>The client may not expunge the Notebook object itself, for
  *     example, via the expungeNotebook method.
  *     </dd>
  * <dt>noSetDefaultNotebook</dt>
  *     <dd>The client may not set this notebook to be the default notebook.
  *     The caller should leave Notebook.defaultNotebook unset.
  *     </dd>
  * <dt>noSetNotebookStack</dt>
  *     <dd>If the client is able to update the Notebook, the Notebook.stack
  *     value may not be set.
  *     </dd>
  * <dt>noPublishToPublic</dt>
  *     <dd>The client may not change the publish the notebook to the public.
  *     For example, business notebooks may not be shared publicly.
  *     </dd>
  * <dt>noPublishToBusinessLibrary</dt>
  *     <dd>The client may not publish the notebook to the business library.
  *     </dd>
  * <dt>noCreateTags</dt>
  *     <dd>The client may not complete an operation that results in a new tag
  *     being created in the owner's account.
  *     </dd>
  * <dt>noUpdateTags</dt>
  *     <dd>The client may not update tags in the owner's account.
  *     </dd>
  * <dt>noExpungeTags</dt>
  *     <dd>The client may not expunge tags in the owner's account.
  *     </dd>
  * <dt>noSetParentTag</dt>
  *     <dd>If the client is able to create or update tags in the owner's account,
  *     then they will not be able to set the parent tag.    Leave the value unset.
  *     </dd>
  * <dt>noCreateSharedNotebooks</dt>
  *     <dd>The client is unable to create shared notebooks for the notebook.
  *     </dd>
  * <dt>updateWhichSharedNotebookRestrictions</dt>
  *     <dd>Restrictions on which shared notebook instances can be updated.    If the
  *     value is not set or null, then the client can update any of the shared notebooks
  *     associated with the notebook on which the NotebookRestrictions are defined.
  *     See the enumeration for further details.
  *     </dd>
  * <dt>expungeWhichSharedNotebookRestrictions</dt>
  *     <dd>Restrictions on which shared notebook instances can be expunged.    If the
  *     value is not set or null, then the client can expunge any of the shared notebooks
  *     associated with the notebook on which the NotebookRestrictions are defined.
  *     See the enumeration for further details.
  *     </dd>
  */
@JSImport("evernote", "Evernote.NotebookRestrictions")
@js.native
class NotebookRestrictions () extends js.Object {
  def this(args: AnonExpungeWhichSharedNotebookRestrictions) = this()
  var expungeWhichSharedNotebookRestrictions: SharedNotebookInstanceRestrictions = js.native
  var noCreateNotes: Boolean = js.native
  var noCreateSharedNotebooks: Boolean = js.native
  var noCreateTags: Boolean = js.native
  var noEmailNotes: Boolean = js.native
  var noExpungeNotebook: Boolean = js.native
  var noExpungeNotes: Boolean = js.native
  var noExpungeTags: Boolean = js.native
  var noPublishToBusinessLibrary: Boolean = js.native
  var noPublishToPublic: Boolean = js.native
  var noReadNotes: Boolean = js.native
  var noSendMessageToRecipients: Boolean = js.native
  var noSetDefaultNotebook: Boolean = js.native
  var noSetNotebookStack: Boolean = js.native
  var noSetParentTag: Boolean = js.native
  var noShareNotes: Boolean = js.native
  var noUpdateNotebook: Boolean = js.native
  var noUpdateNotes: Boolean = js.native
  var noUpdateTags: Boolean = js.native
  var updateWhichSharedNotebookRestrictions: SharedNotebookInstanceRestrictions = js.native
}


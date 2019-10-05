package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_AllowPreview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Shared notebooks represent a relationship between a notebook and a single
  * share invitation recipient.
  * <dl>
  * <dt>id</dt>
  * <dd>the primary identifier of the share</dd>
  *
  * <dt>userId</dt>
  * <dd>the user id of the owner of the notebook</dd>
  *
  * <dt>notebookGuid</dt>
  * <dd>the GUID of the associated notebook shared.</dd>
  *
  * <dt>email</dt>
  * <dd>the email address of the recipient - used by the notebook
  * owner to identify who they shared with.</dd>
  *
  * <dt>notebookModifiable</dt>
  * <dd>(DEPRECATED) a flag indicating the share is read/write -otherwise it's read
  *         only.    This field is deprecated in favor of the new "privilege" field.</dd>
  *
  * <dt>requireLogin</dt>
  * <dd>(DEPRECATED) indicates that a user must login to access the share.    This
  *         field is deprecated and will be "true" for all new shared notebooks.    It
  *         is read-only and ignored when creating or modifying a shared notebook,
  *         except that a shared notebook can be modified to require login.
  *         See "allowPreview" for information on privileges and shared notebooks.</dd>
  *
  * <dt>serviceCreated</dt>
  * <dd>the date the owner first created the share with the specific email
  *     address</dd>
  *
  * <dt>serviceUpdated</dt>
  * <dd>the date the shared notebook was last updated on the service.    This
  *         will be updated when authenticateToSharedNotebook is called the first
  *         time with a shared notebook requiring login (i.e. when the username is
  *         bound to that shared notebook).</dd>
  *
  * <dt>username</dt>
  * <dd>the username of the user who can access this share.
  *     Once it's assigned it cannot be changed.</dd>
  *
  * <dt>privilege</dt>
  * <dd>The privilege level granted to the notebook, activity stream, and
  *         invitations.    See the corresponding enumeration for details.</dd>
  *
  * <dt>allowPreview</dt>
  * <dd>Whether or not to grant "READ_NOTEBOOK" privilege without an
  *         authentication token, for authenticateToSharedNotebook(...).    With
  *         the change to "requireLogin" always being true for new shared
  *         notebooks, this is the only way to access a shared notebook without
  *         an authorization token.    This setting expires after the first use
  *         of authenticateToSharedNotebook(...) with a valid authentication
  *         token.</dd>
  *
  * <dt>recipientSettings</dt>
  * <dd>Settings intended for use only by the recipient of this shared
  *         notebook.    You should skip setting this value unless you want
  *         to change the value contained inside the structure, and only if
  *         you are the recipient.</dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.SharedNotebook")
@js.native
class SharedNotebook () extends js.Object {
  def this(args: Anon_AllowPreview) = this()
  var allowPreview: Boolean = js.native
  var email: String = js.native
  var id: Double = js.native
  var notebookGuid: String = js.native
  var notebookModifiable: Boolean = js.native
  var privilege: SharedNotebookPrivilegeLevel = js.native
  var recipientSettings: SharedNotebookRecipientSettings = js.native
  var requireLogin: Boolean = js.native
  var serviceCreated: Double = js.native
  var serviceUpdated: Double = js.native
  var shareKey: String = js.native
  var userId: Double = js.native
  var username: String = js.native
}


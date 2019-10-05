package typings.evernote.evernoteMod.Evernote

import typings.evernote.Anon_CcAddresses
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters that must be given to the NoteStore emailNote call. These allow
  * the caller to specify the note to send, the recipient addresses, etc.
  *
  * <dl>
  *    <dt>guid</dt>
  *        <dd>
  *            If set, this must be the GUID of a note within the user's account that
  *            should be retrieved from the service and sent as email.    If not set,
  *            the 'note' field must be provided instead.
  *        </dd>
  *
  *    <dt>note</dt>
  *        <dd>
  *            If the 'guid' field is not set, this field must be provided, including
  *            the full contents of the note note (and all of its Resources) to send.
  *            This can be used for a Note that as not been created in the service,
  *            for example by a local client with local notes.
  *        </dd>
  *
  *    <dt>toAddresses</dt>
  *        <dd>
  *            If provided, this should contain a list of the SMTP email addresses
  *            that should be included in the "To:" line of the email.
  *            Callers must specify at least one "to" or "cc" email address.
  *        </dd>
  *
  *    <dt>ccAddresses</dt>
  *        <dd>
  *            If provided, this should contain a list of the SMTP email addresses
  *            that should be included in the "Cc:" line of the email.
  *            Callers must specify at least one "to" or "cc" email address.
  *        </dd>
  *
  *    <dt>subject</dt>
  *        <dd>
  *            If provided, this should contain the subject line of the email that
  *            will be sent.    If not provided, the title of the note will be used
  *            as the subject of the email.
  *        </dd>
  *
  *    <dt>message</dt>
  *        <dd>
  *            If provided, this is additional personal text that should be included
  *            into the email as a message from the owner to the recipient(s).
  *        </dd>
  * </dl>
  */
@JSImport("evernote", "Evernote.NoteEmailParameters")
@js.native
class NoteEmailParameters () extends js.Object {
  def this(args: Anon_CcAddresses) = this()
  var ccAddresses: js.Array[String] = js.native
  var guid: String = js.native
  var message: String = js.native
  var note: Note = js.native
  var subject: String = js.native
  var toAddresses: js.Array[String] = js.native
}


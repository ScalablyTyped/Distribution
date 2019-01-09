package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraftsResource extends js.Object {
  /** Creates a new draft with the DRAFT label. */
  def create(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Draft]
  /** Immediately and permanently deletes the specified draft. Does not simply trash it. */
  def delete(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the specified draft. */
  def get(request: gapiDotClientDotGmailLib.Anon_AltFieldsFormat): gapiDotClientLib.gapiNs.clientNs.Request[Draft]
  /** Lists the drafts in the user's mailbox. */
  def list(request: gapiDotClientDotGmailLib.Anon_AltFieldsIncludeSpamTrash): gapiDotClientLib.gapiNs.clientNs.Request[ListDraftsResponse]
  /** Sends the specified, existing draft to the recipients in the To, Cc, and Bcc headers. */
  def send(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Message]
  /** Replaces a draft's content. */
  def update(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Draft]
}


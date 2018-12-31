package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsResource extends js.Object {
  /** Creates a new label. */
  def create(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Label]
  /** Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to. */
  def delete(request: gapiDotClientDotGmailLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the specified label. */
  def get(request: gapiDotClientDotGmailLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Label]
  /** Lists all labels in the user's mailbox. */
  def list(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListLabelsResponse]
  /** Updates the specified label. This method supports patch semantics. */
  def patch(request: gapiDotClientDotGmailLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Label]
  /** Updates the specified label. */
  def update(request: gapiDotClientDotGmailLib.Anon_PrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Label]
}


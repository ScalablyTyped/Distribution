package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsResource extends js.Object {
  /** Creates a new label. */
  def create(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Label]
  /** Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to. */
  def delete(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the specified label. */
  def get(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Label]
  /** Lists all labels in the user's mailbox. */
  def list(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ListLabelsResponse]
  /** Updates the specified label. This method supports patch semantics. */
  def patch(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Label]
  /** Updates the specified label. */
  def update(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Label]
}

object LabelsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotGmailLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Label],
    delete: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Label],
    list: gapiDotClientDotGmailLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ListLabelsResponse],
    patch: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Label],
    update: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Label]
  ): LabelsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LabelsResource]
  }
}


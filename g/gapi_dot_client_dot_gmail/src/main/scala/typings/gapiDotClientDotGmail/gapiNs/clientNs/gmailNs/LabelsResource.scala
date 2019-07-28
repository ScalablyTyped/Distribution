package typings.gapiDotClientDotGmail.gapiNs.clientNs.gmailNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGmail.Anon_Alt
import typings.gapiDotClientDotGmail.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsResource extends js.Object {
  /** Creates a new label. */
  def create(request: Anon_Alt): Request[Label]
  /** Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets the specified label. */
  def get(request: Anon_AltFields): Request[Label]
  /** Lists all labels in the user's mailbox. */
  def list(request: Anon_Alt): Request[ListLabelsResponse]
  /** Updates the specified label. This method supports patch semantics. */
  def patch(request: Anon_AltFields): Request[Label]
  /** Updates the specified label. */
  def update(request: Anon_AltFields): Request[Label]
}

object LabelsResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[Label],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[Label],
    list: Anon_Alt => Request[ListLabelsResponse],
    patch: Anon_AltFields => Request[Label],
    update: Anon_AltFields => Request[Label]
  ): LabelsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LabelsResource]
  }
}


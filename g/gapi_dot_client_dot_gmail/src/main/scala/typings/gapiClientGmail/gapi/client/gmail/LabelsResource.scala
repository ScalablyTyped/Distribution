package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import typings.gapiClientGmail.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsResource extends js.Object {
  /** Creates a new label. */
  def create(request: Alt): Request[Label]
  /** Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to. */
  def delete(request: Fields): Request[Unit]
  /** Gets the specified label. */
  def get(request: Fields): Request[Label]
  /** Lists all labels in the user's mailbox. */
  def list(request: Alt): Request[ListLabelsResponse]
  /** Updates the specified label. This method supports patch semantics. */
  def patch(request: Fields): Request[Label]
  /** Updates the specified label. */
  def update(request: Fields): Request[Label]
}

object LabelsResource {
  @scala.inline
  def apply(
    create: Alt => Request[Label],
    delete: Fields => Request[Unit],
    get: Fields => Request[Label],
    list: Alt => Request[ListLabelsResponse],
    patch: Fields => Request[Label],
    update: Fields => Request[Label]
  ): LabelsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[LabelsResource]
  }
}


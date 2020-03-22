package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonAlt
import typings.gapiClientGmail.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelsResource extends js.Object {
  /** Creates a new label. */
  def create(request: AnonAlt): Request_[Label]
  /** Immediately and permanently deletes the specified label and removes it from any messages and threads that it is applied to. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets the specified label. */
  def get(request: AnonFields): Request_[Label]
  /** Lists all labels in the user's mailbox. */
  def list(request: AnonAlt): Request_[ListLabelsResponse]
  /** Updates the specified label. This method supports patch semantics. */
  def patch(request: AnonFields): Request_[Label]
  /** Updates the specified label. */
  def update(request: AnonFields): Request_[Label]
}

object LabelsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Label],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Label],
    list: AnonAlt => Request_[ListLabelsResponse],
    patch: AnonFields => Request_[Label],
    update: AnonFields => Request_[Label]
  ): LabelsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[LabelsResource]
  }
}


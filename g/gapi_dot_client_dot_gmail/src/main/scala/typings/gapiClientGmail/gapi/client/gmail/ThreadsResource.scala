package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonAltFields
import typings.gapiClientGmail.AnonAltFieldsFormatId
import typings.gapiClientGmail.AnonAltFieldsIncludeSpamTrashKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadsResource extends js.Object {
  /** Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets the specified thread. */
  def get(request: AnonAltFieldsFormatId): Request_[Thread]
  /** Lists the threads in the user's mailbox. */
  def list(request: AnonAltFieldsIncludeSpamTrashKey): Request_[ListThreadsResponse]
  /** Modifies the labels applied to the thread. This applies to all messages in the thread. */
  def modify(request: AnonAltFields): Request_[Thread]
  /** Moves the specified thread to the trash. */
  def trash(request: AnonAltFields): Request_[Thread]
  /** Removes the specified thread from the trash. */
  def untrash(request: AnonAltFields): Request_[Thread]
}

object ThreadsResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFieldsFormatId => Request_[Thread],
    list: AnonAltFieldsIncludeSpamTrashKey => Request_[ListThreadsResponse],
    modify: AnonAltFields => Request_[Thread],
    trash: AnonAltFields => Request_[Thread],
    untrash: AnonAltFields => Request_[Thread]
  ): ThreadsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
  
    __obj.asInstanceOf[ThreadsResource]
  }
}


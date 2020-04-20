package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonFields
import typings.gapiClientGmail.AnonKey
import typings.gapiClientGmail.AnonLabelIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadsResource extends js.Object {
  /** Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets the specified thread. */
  def get(request: AnonKey): Request_[Thread]
  /** Lists the threads in the user's mailbox. */
  def list(request: AnonLabelIds): Request_[ListThreadsResponse]
  /** Modifies the labels applied to the thread. This applies to all messages in the thread. */
  def modify(request: AnonFields): Request_[Thread]
  /** Moves the specified thread to the trash. */
  def trash(request: AnonFields): Request_[Thread]
  /** Removes the specified thread from the trash. */
  def untrash(request: AnonFields): Request_[Thread]
}

object ThreadsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonKey => Request_[Thread],
    list: AnonLabelIds => Request_[ListThreadsResponse],
    modify: AnonFields => Request_[Thread],
    trash: AnonFields => Request_[Thread],
    untrash: AnonFields => Request_[Thread]
  ): ThreadsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
    __obj.asInstanceOf[ThreadsResource]
  }
}


package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Fields
import typings.gapiClientGmail.anon.Key
import typings.gapiClientGmail.anon.LabelIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadsResource extends js.Object {
  /** Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead. */
  def delete(request: Fields): Request[Unit]
  /** Gets the specified thread. */
  def get(request: Key): Request[Thread]
  /** Lists the threads in the user's mailbox. */
  def list(request: LabelIds): Request[ListThreadsResponse]
  /** Modifies the labels applied to the thread. This applies to all messages in the thread. */
  def modify(request: Fields): Request[Thread]
  /** Moves the specified thread to the trash. */
  def trash(request: Fields): Request[Thread]
  /** Removes the specified thread from the trash. */
  def untrash(request: Fields): Request[Thread]
}

object ThreadsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Key => Request[Thread],
    list: LabelIds => Request[ListThreadsResponse],
    modify: Fields => Request[Thread],
    trash: Fields => Request[Thread],
    untrash: Fields => Request[Thread]
  ): ThreadsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
    __obj.asInstanceOf[ThreadsResource]
  }
}


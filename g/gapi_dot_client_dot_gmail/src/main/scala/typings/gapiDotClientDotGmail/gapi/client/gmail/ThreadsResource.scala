package typings.gapiDotClientDotGmail.gapi.client.gmail

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotGmail.Anon_AltFields
import typings.gapiDotClientDotGmail.Anon_AltFieldsFormatId
import typings.gapiDotClientDotGmail.Anon_AltFieldsIncludeSpamTrashKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadsResource extends js.Object {
  /** Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets the specified thread. */
  def get(request: Anon_AltFieldsFormatId): Request[Thread]
  /** Lists the threads in the user's mailbox. */
  def list(request: Anon_AltFieldsIncludeSpamTrashKey): Request[ListThreadsResponse]
  /** Modifies the labels applied to the thread. This applies to all messages in the thread. */
  def modify(request: Anon_AltFields): Request[Thread]
  /** Moves the specified thread to the trash. */
  def trash(request: Anon_AltFields): Request[Thread]
  /** Removes the specified thread from the trash. */
  def untrash(request: Anon_AltFields): Request[Thread]
}

object ThreadsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFieldsFormatId => Request[Thread],
    list: Anon_AltFieldsIncludeSpamTrashKey => Request[ListThreadsResponse],
    modify: Anon_AltFields => Request[Thread],
    trash: Anon_AltFields => Request[Thread],
    untrash: Anon_AltFields => Request[Thread]
  ): ThreadsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
  
    __obj.asInstanceOf[ThreadsResource]
  }
}


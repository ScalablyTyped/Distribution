package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadsResource extends js.Object {
  /** Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead. */
  def delete(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the specified thread. */
  def get(request: gapiDotClientDotGmailLib.Anon_AltFieldsFormatId): gapiDotClientLib.gapiNs.clientNs.Request[Thread]
  /** Lists the threads in the user's mailbox. */
  def list(request: gapiDotClientDotGmailLib.Anon_AltFieldsIncludeSpamTrashKey): gapiDotClientLib.gapiNs.clientNs.Request[ListThreadsResponse]
  /** Modifies the labels applied to the thread. This applies to all messages in the thread. */
  def modify(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Thread]
  /** Moves the specified thread to the trash. */
  def trash(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Thread]
  /** Removes the specified thread from the trash. */
  def untrash(request: gapiDotClientDotGmailLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Thread]
}

object ThreadsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotGmailLib.Anon_AltFieldsFormatId => gapiDotClientLib.gapiNs.clientNs.Request[Thread],
    list: gapiDotClientDotGmailLib.Anon_AltFieldsIncludeSpamTrashKey => gapiDotClientLib.gapiNs.clientNs.Request[ListThreadsResponse],
    modify: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Thread],
    trash: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Thread],
    untrash: gapiDotClientDotGmailLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Thread]
  ): ThreadsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), modify = js.Any.fromFunction1(modify), trash = js.Any.fromFunction1(trash), untrash = js.Any.fromFunction1(untrash))
  
    __obj.asInstanceOf[ThreadsResource]
  }
}


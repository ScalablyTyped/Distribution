package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Fields
import typings.gapiClientGmail.anon.Key
import typings.gapiClientGmail.anon.LabelIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadsResource extends js.Object {
  /** Immediately and permanently deletes the specified thread. This operation cannot be undone. Prefer threads.trash instead. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets the specified thread. */
  def get(request: Key): Request[Thread] = js.native
  /** Lists the threads in the user's mailbox. */
  def list(request: LabelIds): Request[ListThreadsResponse] = js.native
  /** Modifies the labels applied to the thread. This applies to all messages in the thread. */
  def modify(request: Fields): Request[Thread] = js.native
  /** Moves the specified thread to the trash. */
  def trash(request: Fields): Request[Thread] = js.native
  /** Removes the specified thread from the trash. */
  def untrash(request: Fields): Request[Thread] = js.native
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
  @scala.inline
  implicit class ThreadsResourceOps[Self <: ThreadsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Key => Request[Thread]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: LabelIds => Request[ListThreadsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setModify(value: Fields => Request[Thread]): Self = this.set("modify", js.Any.fromFunction1(value))
    @scala.inline
    def setTrash(value: Fields => Request[Thread]): Self = this.set("trash", js.Any.fromFunction1(value))
    @scala.inline
    def setUntrash(value: Fields => Request[Thread]): Self = this.set("untrash", js.Any.fromFunction1(value))
  }
  
}


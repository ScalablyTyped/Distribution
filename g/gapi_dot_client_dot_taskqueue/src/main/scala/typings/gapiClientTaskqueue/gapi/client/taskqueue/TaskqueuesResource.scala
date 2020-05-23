package typings.gapiClientTaskqueue.gapi.client.taskqueue

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTaskqueue.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskqueuesResource extends js.Object {
  /** Get detailed information about a TaskQueue. */
  def get(request: Alt): Request[TaskQueue]
}

object TaskqueuesResource {
  @scala.inline
  def apply(get: Alt => Request[TaskQueue]): TaskqueuesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[TaskqueuesResource]
  }
}


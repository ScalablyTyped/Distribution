package typings.gapiDotClientDotTaskqueue.gapiNs.clientNs.taskqueueNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotTaskqueue.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskqueuesResource extends js.Object {
  /** Get detailed information about a TaskQueue. */
  def get(request: Anon_Alt): Request[TaskQueue]
}

object TaskqueuesResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[TaskQueue]): TaskqueuesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[TaskqueuesResource]
  }
}


package typings
package gapiDotClientDotTaskqueueLib.gapiNs.clientNs.taskqueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskqueuesResource extends js.Object {
  /** Get detailed information about a TaskQueue. */
  def get(request: gapiDotClientDotTaskqueueLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TaskQueue]
}

object TaskqueuesResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotTaskqueueLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[TaskQueue]
    ]
  ): TaskqueuesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[TaskqueuesResource]
  }
}


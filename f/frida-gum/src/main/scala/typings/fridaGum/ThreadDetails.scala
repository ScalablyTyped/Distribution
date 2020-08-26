package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadDetails extends js.Object {
  /**
    * Snapshot of CPU registers.
    */
  var context: CpuContext = js.native
  /**
    * OS-specific ID.
    */
  var id: ThreadId = js.native
  /**
    * Snapshot of state.
    */
  var state: ThreadState = js.native
}

object ThreadDetails {
  @scala.inline
  def apply(context: CpuContext, id: ThreadId, state: ThreadState): ThreadDetails = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadDetails]
  }
  @scala.inline
  implicit class ThreadDetailsOps[Self <: ThreadDetails] (val x: Self) extends AnyVal {
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
    def setContext(value: CpuContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: ThreadId): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: ThreadState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}


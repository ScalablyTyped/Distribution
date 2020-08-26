package typings.dropboxjs.Dropbox.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PollResult extends js.Object {
  var hasChanges: Boolean = js.native
  var retryAfter: Double = js.native
}

object PollResult {
  @scala.inline
  def apply(hasChanges: Boolean, retryAfter: Double): PollResult = {
    val __obj = js.Dynamic.literal(hasChanges = hasChanges.asInstanceOf[js.Any], retryAfter = retryAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollResult]
  }
  @scala.inline
  implicit class PollResultOps[Self <: PollResult] (val x: Self) extends AnyVal {
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
    def setHasChanges(value: Boolean): Self = this.set("hasChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetryAfter(value: Double): Self = this.set("retryAfter", value.asInstanceOf[js.Any])
  }
  
}


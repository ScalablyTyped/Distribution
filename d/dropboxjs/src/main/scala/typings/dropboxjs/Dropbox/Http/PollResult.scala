package typings.dropboxjs.Dropbox.Http

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollResult extends js.Object {
  var hasChanges: Boolean
  var retryAfter: Double
}

object PollResult {
  @scala.inline
  def apply(hasChanges: Boolean, retryAfter: Double): PollResult = {
    val __obj = js.Dynamic.literal(hasChanges = hasChanges.asInstanceOf[js.Any], retryAfter = retryAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollResult]
  }
}


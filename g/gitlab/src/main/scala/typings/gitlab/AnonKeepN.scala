package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeepN extends js.Object {
  var keepN: String
  var olderThan: String
}

object AnonKeepN {
  @scala.inline
  def apply(keepN: String, olderThan: String): AnonKeepN = {
    val __obj = js.Dynamic.literal(keepN = keepN.asInstanceOf[js.Any], olderThan = olderThan.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeepN]
  }
}


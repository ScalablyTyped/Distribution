package typings.elliptic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReason extends js.Object {
  val reason: String
  val result: Boolean
}

object AnonReason {
  @scala.inline
  def apply(reason: String, result: Boolean): AnonReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReason]
  }
}


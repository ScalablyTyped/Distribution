package typings.firebaseAnalytics

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReason extends js.Object {
  var reason: Error
}

object AnonReason {
  @scala.inline
  def apply(reason: Error): AnonReason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReason]
  }
}


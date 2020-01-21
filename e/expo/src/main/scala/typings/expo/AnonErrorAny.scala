package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorAny extends js.Object {
  var error: js.Any
}

object AnonErrorAny {
  @scala.inline
  def apply(error: js.Any): AnonErrorAny = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonErrorAny]
  }
}


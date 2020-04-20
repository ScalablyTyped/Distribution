package typings.dropboxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelable extends js.Object {
  var cancelable: Boolean
}

object AnonCancelable {
  @scala.inline
  def apply(cancelable: Boolean): AnonCancelable = {
    val __obj = js.Dynamic.literal(cancelable = cancelable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelable]
  }
}


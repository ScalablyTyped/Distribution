package typings.frctlFractal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonView extends js.Object {
  var handle: String
  var view: String
}

object AnonView {
  @scala.inline
  def apply(handle: String, view: String): AnonView = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonView]
  }
}


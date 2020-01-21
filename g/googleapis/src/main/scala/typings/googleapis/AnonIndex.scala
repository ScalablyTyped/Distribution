package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndex extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var message: js.UndefOr[String] = js.native
}

object AnonIndex {
  @scala.inline
  def apply(index: Int | Double = null, message: String = null): AnonIndex = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}


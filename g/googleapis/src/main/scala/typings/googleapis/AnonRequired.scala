package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRequired extends js.Object {
  var required: js.UndefOr[js.Array[String]] = js.native
}

object AnonRequired {
  @scala.inline
  def apply(required: js.Array[String] = null): AnonRequired = {
    val __obj = js.Dynamic.literal()
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequired]
  }
}


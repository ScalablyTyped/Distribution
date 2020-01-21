package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDetails extends js.Object {
  var details: js.UndefOr[js.Array[String]] = js.native
  var reason: js.UndefOr[String] = js.native
}

object AnonDetails {
  @scala.inline
  def apply(details: js.Array[String] = null, reason: String = null): AnonDetails = {
    val __obj = js.Dynamic.literal()
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDetails]
  }
}


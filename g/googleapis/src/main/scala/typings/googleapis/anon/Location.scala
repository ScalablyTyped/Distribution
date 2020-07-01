package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  var code: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
}

object Location {
  @scala.inline
  def apply(code: String = null, location: String = null, message: String = null): Location = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}


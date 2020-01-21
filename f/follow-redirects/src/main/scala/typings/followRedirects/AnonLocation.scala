package typings.followRedirects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation extends js.Object {
  var location: js.UndefOr[String] = js.undefined
}

object AnonLocation {
  @scala.inline
  def apply(location: String = null): AnonLocation = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation]
  }
}


package typings.followRedirects.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  var location: js.UndefOr[String] = js.undefined
}

object Location {
  @scala.inline
  def apply(location: String = null): Location = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}


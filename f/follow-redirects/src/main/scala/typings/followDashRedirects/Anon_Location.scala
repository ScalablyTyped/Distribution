package typings.followDashRedirects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Location extends js.Object {
  var location: js.UndefOr[String] = js.undefined
}

object Anon_Location {
  @scala.inline
  def apply(location: String = null): Anon_Location = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Location]
  }
}


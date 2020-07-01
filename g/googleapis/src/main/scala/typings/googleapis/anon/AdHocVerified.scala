package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdHocVerified extends js.Object {
  var adHocVerified: js.UndefOr[String] = js.native
}

object AdHocVerified {
  @scala.inline
  def apply(adHocVerified: String = null): AdHocVerified = {
    val __obj = js.Dynamic.literal()
    if (adHocVerified != null) __obj.updateDynamic("adHocVerified")(adHocVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdHocVerified]
  }
}


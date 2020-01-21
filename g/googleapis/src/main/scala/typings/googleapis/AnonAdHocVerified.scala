package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdHocVerified extends js.Object {
  var adHocVerified: js.UndefOr[String] = js.native
}

object AnonAdHocVerified {
  @scala.inline
  def apply(adHocVerified: String = null): AnonAdHocVerified = {
    val __obj = js.Dynamic.literal()
    if (adHocVerified != null) __obj.updateDynamic("adHocVerified")(adHocVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdHocVerified]
  }
}


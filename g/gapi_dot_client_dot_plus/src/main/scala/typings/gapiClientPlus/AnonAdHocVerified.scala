package typings.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdHocVerified extends js.Object {
  /** Verification for one-time or manual processes. */
  var adHocVerified: js.UndefOr[String] = js.undefined
}

object AnonAdHocVerified {
  @scala.inline
  def apply(adHocVerified: String = null): AnonAdHocVerified = {
    val __obj = js.Dynamic.literal()
    if (adHocVerified != null) __obj.updateDynamic("adHocVerified")(adHocVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdHocVerified]
  }
}


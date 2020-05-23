package typings.gapiClientPlusdomains.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdHocVerified extends js.Object {
  /** Verification for one-time or manual processes. */
  var adHocVerified: js.UndefOr[String] = js.undefined
}

object AdHocVerified {
  @scala.inline
  def apply(adHocVerified: String = null): AdHocVerified = {
    val __obj = js.Dynamic.literal()
    if (adHocVerified != null) __obj.updateDynamic("adHocVerified")(adHocVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdHocVerified]
  }
}


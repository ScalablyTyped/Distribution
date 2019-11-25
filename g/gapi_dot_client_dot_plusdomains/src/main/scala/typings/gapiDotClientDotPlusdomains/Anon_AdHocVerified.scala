package typings.gapiDotClientDotPlusdomains

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdHocVerified extends js.Object {
  /** Verification for one-time or manual processes. */
  var adHocVerified: js.UndefOr[String] = js.undefined
}

object Anon_AdHocVerified {
  @scala.inline
  def apply(adHocVerified: String = null): Anon_AdHocVerified = {
    val __obj = js.Dynamic.literal()
    if (adHocVerified != null) __obj.updateDynamic("adHocVerified")(adHocVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdHocVerified]
  }
}


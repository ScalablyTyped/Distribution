package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AdHocVerified extends js.Object {
  var adHocVerified: js.UndefOr[String] = js.native
}

object Anon_AdHocVerified {
  @scala.inline
  def apply(adHocVerified: String = null): Anon_AdHocVerified = {
    val __obj = js.Dynamic.literal()
    if (adHocVerified != null) __obj.updateDynamic("adHocVerified")(adHocVerified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdHocVerified]
  }
}


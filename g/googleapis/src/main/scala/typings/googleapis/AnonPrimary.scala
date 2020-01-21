package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPrimary extends js.Object {
  var primary: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
}

object AnonPrimary {
  @scala.inline
  def apply(primary: js.UndefOr[Boolean] = js.undefined, value: String = null): AnonPrimary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrimary]
  }
}


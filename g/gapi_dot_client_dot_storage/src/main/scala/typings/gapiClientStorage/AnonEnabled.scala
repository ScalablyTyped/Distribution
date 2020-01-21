package typings.gapiClientStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  /** While set to true, versioning is fully enabled for this bucket. */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object AnonEnabled {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): AnonEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnabled]
  }
}


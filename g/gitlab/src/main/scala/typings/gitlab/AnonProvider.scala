package typings.gitlab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProvider extends js.Object {
  var provider: js.UndefOr[String] = js.undefined
}

object AnonProvider {
  @scala.inline
  def apply(provider: String = null): AnonProvider = {
    val __obj = js.Dynamic.literal()
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProvider]
  }
}


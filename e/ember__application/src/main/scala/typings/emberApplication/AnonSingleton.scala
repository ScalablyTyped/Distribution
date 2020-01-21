package typings.emberApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSingleton extends js.Object {
  var singleton: js.UndefOr[Boolean] = js.undefined
}

object AnonSingleton {
  @scala.inline
  def apply(singleton: js.UndefOr[Boolean] = js.undefined): AnonSingleton = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSingleton]
  }
}


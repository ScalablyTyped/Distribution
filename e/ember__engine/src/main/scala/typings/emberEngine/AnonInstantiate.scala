package typings.emberEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInstantiate extends js.Object {
  var instantiate: js.UndefOr[Boolean] = js.undefined
  var singleton: js.UndefOr[Boolean] = js.undefined
}

object AnonInstantiate {
  @scala.inline
  def apply(instantiate: js.UndefOr[Boolean] = js.undefined, singleton: js.UndefOr[Boolean] = js.undefined): AnonInstantiate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(instantiate)) __obj.updateDynamic("instantiate")(instantiate.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInstantiate]
  }
}


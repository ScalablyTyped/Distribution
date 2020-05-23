package typings.emberEngine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instantiate extends js.Object {
  var instantiate: js.UndefOr[Boolean] = js.undefined
  var singleton: js.UndefOr[Boolean] = js.undefined
}

object Instantiate {
  @scala.inline
  def apply(instantiate: js.UndefOr[Boolean] = js.undefined, singleton: js.UndefOr[Boolean] = js.undefined): Instantiate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(instantiate)) __obj.updateDynamic("instantiate")(instantiate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instantiate]
  }
}


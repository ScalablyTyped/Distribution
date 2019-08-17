package typings.atEmberApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Instantiate extends js.Object {
  var instantiate: js.UndefOr[Boolean] = js.undefined
  var singleton: js.UndefOr[Boolean] = js.undefined
}

object Anon_Instantiate {
  @scala.inline
  def apply(instantiate: js.UndefOr[Boolean] = js.undefined, singleton: js.UndefOr[Boolean] = js.undefined): Anon_Instantiate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(instantiate)) __obj.updateDynamic("instantiate")(instantiate)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    __obj.asInstanceOf[Anon_Instantiate]
  }
}


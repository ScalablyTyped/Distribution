package typings.atEmberApplication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Singleton extends js.Object {
  var singleton: js.UndefOr[Boolean] = js.undefined
}

object Anon_Singleton {
  @scala.inline
  def apply(singleton: js.UndefOr[Boolean] = js.undefined): Anon_Singleton = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    __obj.asInstanceOf[Anon_Singleton]
  }
}


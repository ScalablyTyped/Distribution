package typings.emberApplication.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Singleton extends js.Object {
  var singleton: js.UndefOr[Boolean] = js.undefined
}

object Singleton {
  @scala.inline
  def apply(singleton: js.UndefOr[Boolean] = js.undefined): Singleton = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Singleton]
  }
}


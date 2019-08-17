package typings.atEmberRouting.routerMod.atEmberServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Registry extends js.Object {
  var router: typings.atEmberRouting.routerDashServiceMod.default
}

object Registry {
  @scala.inline
  def apply(router: typings.atEmberRouting.routerDashServiceMod.default): Registry = {
    val __obj = js.Dynamic.literal(router = router)
  
    __obj.asInstanceOf[Registry]
  }
}


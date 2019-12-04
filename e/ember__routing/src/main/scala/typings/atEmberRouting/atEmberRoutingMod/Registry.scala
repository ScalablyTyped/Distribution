package typings.atEmberRouting.atEmberRoutingMod

import typings.atEmberRouting.routerDashServiceMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
trait Registry extends js.Object {
  var router: default
}

object Registry {
  @scala.inline
  def apply(router: default): Registry = {
    val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Registry]
  }
}


package typings.atEmberTestDashHelpers

import typings.atEmberApplication.resolverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Resolver extends js.Object {
  var resolver: js.UndefOr[default] = js.undefined
}

object Anon_Resolver {
  @scala.inline
  def apply(resolver: default = null): Anon_Resolver = {
    val __obj = js.Dynamic.literal()
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Resolver]
  }
}


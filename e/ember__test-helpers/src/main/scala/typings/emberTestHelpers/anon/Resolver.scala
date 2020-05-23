package typings.emberTestHelpers.anon

import typings.emberApplication.resolverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resolver extends js.Object {
  var resolver: js.UndefOr[default] = js.undefined
}

object Resolver {
  @scala.inline
  def apply(resolver: default = null): Resolver = {
    val __obj = js.Dynamic.literal()
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolver]
  }
}


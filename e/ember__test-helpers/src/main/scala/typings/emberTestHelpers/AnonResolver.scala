package typings.emberTestHelpers

import typings.emberApplication.resolverMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResolver extends js.Object {
  var resolver: js.UndefOr[default] = js.undefined
}

object AnonResolver {
  @scala.inline
  def apply(resolver: default = null): AnonResolver = {
    val __obj = js.Dynamic.literal()
    if (resolver != null) __obj.updateDynamic("resolver")(resolver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResolver]
  }
}


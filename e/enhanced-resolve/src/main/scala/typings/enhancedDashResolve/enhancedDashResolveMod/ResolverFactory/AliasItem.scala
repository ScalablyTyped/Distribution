package typings.enhancedDashResolve.enhancedDashResolveMod.ResolverFactory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasItem extends js.Object {
  var alias: String
  var name: String
  var onlyModule: js.UndefOr[Boolean] = js.undefined
}

object AliasItem {
  @scala.inline
  def apply(alias: String, name: String, onlyModule: js.UndefOr[Boolean] = js.undefined): AliasItem = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyModule)) __obj.updateDynamic("onlyModule")(onlyModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasItem]
  }
}


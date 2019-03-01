package typings
package enhancedDashResolveLib.enhancedDashResolveMod.ResolveNs.ResolverFactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasItem extends js.Object {
  var alias: java.lang.String
  var name: java.lang.String
  var onlyModule: js.UndefOr[scala.Boolean] = js.undefined
}

object AliasItem {
  @scala.inline
  def apply(
    alias: java.lang.String,
    name: java.lang.String,
    onlyModule: js.UndefOr[scala.Boolean] = js.undefined
  ): AliasItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alias")(alias)
    __obj.updateDynamic("name")(name)
    if (!js.isUndefined(onlyModule)) __obj.updateDynamic("onlyModule")(onlyModule)
    __obj.asInstanceOf[AliasItem]
  }
}


package typings
package enhancedDashResolveLib.libAliasPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasPlugin extends js.Object {
  var alias: java.lang.String
  var name: java.lang.String
  var onlyModule: scala.Boolean
  var options: enhancedDashResolveLib.enhancedDashResolveMod.ResolveNs.ResolverFactoryNs.AliasItem
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object AliasPlugin {
  @scala.inline
  def apply(
    alias: java.lang.String,
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    name: java.lang.String,
    onlyModule: scala.Boolean,
    options: enhancedDashResolveLib.enhancedDashResolveMod.ResolveNs.ResolverFactoryNs.AliasItem,
    source: java.lang.String,
    target: java.lang.String
  ): AliasPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alias")(alias)
    __obj.updateDynamic("apply")(apply)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("onlyModule")(onlyModule)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[AliasPlugin]
  }
}


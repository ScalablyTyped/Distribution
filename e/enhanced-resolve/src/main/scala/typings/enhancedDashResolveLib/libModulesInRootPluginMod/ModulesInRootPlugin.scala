package typings
package enhancedDashResolveLib.libModulesInRootPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModulesInRootPlugin extends js.Object {
  var path: java.lang.String
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object ModulesInRootPlugin {
  @scala.inline
  def apply(
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    path: java.lang.String,
    source: java.lang.String,
    target: java.lang.String
  ): ModulesInRootPlugin = {
    val __obj = js.Dynamic.literal(apply = apply, path = path, source = source, target = target)
  
    __obj.asInstanceOf[ModulesInRootPlugin]
  }
}


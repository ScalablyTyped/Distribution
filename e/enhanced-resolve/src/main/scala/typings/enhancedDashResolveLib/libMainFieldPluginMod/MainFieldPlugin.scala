package typings
package enhancedDashResolveLib.libMainFieldPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainFieldPlugin extends js.Object {
  var options: enhancedDashResolveLib.Anon_ForceRelative
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object MainFieldPlugin {
  @scala.inline
  def apply(
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    options: enhancedDashResolveLib.Anon_ForceRelative,
    source: java.lang.String,
    target: java.lang.String
  ): MainFieldPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(apply)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MainFieldPlugin]
  }
}


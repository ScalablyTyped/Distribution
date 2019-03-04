package typings
package enhancedDashResolveLib.libNextPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextPlugin extends js.Object {
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object NextPlugin {
  @scala.inline
  def apply(
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    source: java.lang.String,
    target: java.lang.String
  ): NextPlugin = {
    val __obj = js.Dynamic.literal(apply = apply, source = source, target = target)
  
    __obj.asInstanceOf[NextPlugin]
  }
}


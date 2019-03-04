package typings
package enhancedDashResolveLib.libJoinRequestPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinRequestPlugin extends js.Object {
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object JoinRequestPlugin {
  @scala.inline
  def apply(
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    source: java.lang.String,
    target: java.lang.String
  ): JoinRequestPlugin = {
    val __obj = js.Dynamic.literal(apply = apply, source = source, target = target)
  
    __obj.asInstanceOf[JoinRequestPlugin]
  }
}


package typings
package enhancedDashResolveLib.libAppendPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendPlugin extends js.Object {
  var appending: java.lang.String
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object AppendPlugin {
  @scala.inline
  def apply(
    appending: java.lang.String,
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    source: java.lang.String,
    target: java.lang.String
  ): AppendPlugin = {
    val __obj = js.Dynamic.literal(appending = appending, apply = apply, source = source, target = target)
  
    __obj.asInstanceOf[AppendPlugin]
  }
}


package typings
package enhancedDashResolveLib.libSymlinkPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymlinkPlugin extends js.Object {
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object SymlinkPlugin {
  @scala.inline
  def apply(
    apply: enhancedDashResolveLib.libResolverMod.namespaced => scala.Unit,
    source: java.lang.String,
    target: java.lang.String
  ): SymlinkPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source, target = target)
  
    __obj.asInstanceOf[SymlinkPlugin]
  }
}


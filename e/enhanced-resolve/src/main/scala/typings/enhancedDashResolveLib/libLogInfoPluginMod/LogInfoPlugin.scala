package typings
package enhancedDashResolveLib.libLogInfoPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogInfoPlugin extends js.Object {
  var source: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object LogInfoPlugin {
  @scala.inline
  def apply(apply: enhancedDashResolveLib.libResolverMod.namespaced => scala.Unit, source: java.lang.String): LogInfoPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source)
  
    __obj.asInstanceOf[LogInfoPlugin]
  }
}


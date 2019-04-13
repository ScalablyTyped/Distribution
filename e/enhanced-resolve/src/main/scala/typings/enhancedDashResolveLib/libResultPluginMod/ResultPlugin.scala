package typings
package enhancedDashResolveLib.libResultPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPlugin extends js.Object {
  var source: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.^): scala.Unit
}

object ResultPlugin {
  @scala.inline
  def apply(apply: enhancedDashResolveLib.libResolverMod.^ => scala.Unit, source: java.lang.String): ResultPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source)
  
    __obj.asInstanceOf[ResultPlugin]
  }
}


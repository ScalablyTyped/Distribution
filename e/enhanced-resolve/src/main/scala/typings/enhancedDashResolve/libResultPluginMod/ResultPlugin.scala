package typings.enhancedDashResolve.libResultPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPlugin extends js.Object {
  var source: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object ResultPlugin {
  @scala.inline
  def apply(apply: typings.enhancedDashResolve.libResolverMod.^ => Unit, source: String): ResultPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source)
  
    __obj.asInstanceOf[ResultPlugin]
  }
}


package typings.enhancedDashResolve.libModuleKindPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleKindPlugin extends js.Object {
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object ModuleKindPlugin {
  @scala.inline
  def apply(apply: typings.enhancedDashResolve.libResolverMod.^ => Unit, source: String, target: String): ModuleKindPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source, target = target)
  
    __obj.asInstanceOf[ModuleKindPlugin]
  }
}


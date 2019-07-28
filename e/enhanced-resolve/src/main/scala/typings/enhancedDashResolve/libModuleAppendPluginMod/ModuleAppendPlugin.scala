package typings.enhancedDashResolve.libModuleAppendPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleAppendPlugin extends js.Object {
  var appending: String
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object ModuleAppendPlugin {
  @scala.inline
  def apply(
    appending: String,
    apply: typings.enhancedDashResolve.libResolverMod.^ => Unit,
    source: String,
    target: String
  ): ModuleAppendPlugin = {
    val __obj = js.Dynamic.literal(appending = appending, apply = js.Any.fromFunction1(apply), source = source, target = target)
  
    __obj.asInstanceOf[ModuleAppendPlugin]
  }
}


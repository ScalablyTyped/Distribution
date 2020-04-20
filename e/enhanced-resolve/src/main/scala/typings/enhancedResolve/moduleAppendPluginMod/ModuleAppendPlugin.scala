package typings.enhancedResolve.moduleAppendPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleAppendPlugin extends js.Object {
  var appending: String
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
}

object ModuleAppendPlugin {
  @scala.inline
  def apply(
    appending: String,
    apply: typings.enhancedResolve.resolverMod.^ => Unit,
    source: String,
    target: String
  ): ModuleAppendPlugin = {
    val __obj = js.Dynamic.literal(appending = appending.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleAppendPlugin]
  }
}


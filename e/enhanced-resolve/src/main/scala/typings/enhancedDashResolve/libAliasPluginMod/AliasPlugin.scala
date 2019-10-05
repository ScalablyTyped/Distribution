package typings.enhancedDashResolve.libAliasPluginMod

import typings.enhancedDashResolve.enhancedDashResolveMod.ResolverFactory.AliasItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasPlugin extends js.Object {
  var alias: String
  var name: String
  var onlyModule: Boolean
  var options: AliasItem
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object AliasPlugin {
  @scala.inline
  def apply(
    alias: String,
    apply: typings.enhancedDashResolve.libResolverMod.^ => Unit,
    name: String,
    onlyModule: Boolean,
    options: AliasItem,
    source: String,
    target: String
  ): AliasPlugin = {
    val __obj = js.Dynamic.literal(alias = alias, apply = js.Any.fromFunction1(apply), name = name, onlyModule = onlyModule, options = options, source = source, target = target)
  
    __obj.asInstanceOf[AliasPlugin]
  }
}


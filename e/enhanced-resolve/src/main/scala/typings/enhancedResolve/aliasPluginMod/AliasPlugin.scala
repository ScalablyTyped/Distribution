package typings.enhancedResolve.aliasPluginMod

import typings.enhancedResolve.mod.ResolverFactory.AliasItem
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
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
}

object AliasPlugin {
  @scala.inline
  def apply(
    alias: String,
    apply: typings.enhancedResolve.resolverMod.^ => Unit,
    name: String,
    onlyModule: Boolean,
    options: AliasItem,
    source: String,
    target: String
  ): AliasPlugin = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), name = name.asInstanceOf[js.Any], onlyModule = onlyModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AliasPlugin]
  }
}


package typings.enhancedResolve.concordModulesPluginMod

import typings.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcordModulesPlugin extends js.Object {
  var options: Dictionary[_]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
}

object ConcordModulesPlugin {
  @scala.inline
  def apply(
    apply: typings.enhancedResolve.resolverMod.^ => Unit,
    options: Dictionary[_],
    source: String,
    target: String
  ): ConcordModulesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcordModulesPlugin]
  }
}


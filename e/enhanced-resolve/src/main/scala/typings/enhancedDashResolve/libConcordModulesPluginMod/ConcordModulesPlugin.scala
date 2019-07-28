package typings.enhancedDashResolve.libConcordModulesPluginMod

import typings.enhancedDashResolve.libConcordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcordModulesPlugin extends js.Object {
  var options: Dictionary[_]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object ConcordModulesPlugin {
  @scala.inline
  def apply(
    apply: typings.enhancedDashResolve.libResolverMod.^ => Unit,
    options: Dictionary[_],
    source: String,
    target: String
  ): ConcordModulesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options, source = source, target = target)
  
    __obj.asInstanceOf[ConcordModulesPlugin]
  }
}


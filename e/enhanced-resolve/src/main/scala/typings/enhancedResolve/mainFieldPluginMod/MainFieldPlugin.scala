package typings.enhancedResolve.mainFieldPluginMod

import typings.enhancedResolve.anon.ForceRelative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MainFieldPlugin extends js.Object {
  var options: ForceRelative
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
}

object MainFieldPlugin {
  @scala.inline
  def apply(
    apply: typings.enhancedResolve.resolverMod.^ => Unit,
    options: ForceRelative,
    source: String,
    target: String
  ): MainFieldPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainFieldPlugin]
  }
}


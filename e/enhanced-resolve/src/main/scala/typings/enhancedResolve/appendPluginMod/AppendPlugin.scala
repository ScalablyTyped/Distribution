package typings.enhancedResolve.appendPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendPlugin extends js.Object {
  var appending: String
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
}

object AppendPlugin {
  @scala.inline
  def apply(
    appending: String,
    apply: typings.enhancedResolve.resolverMod.^ => Unit,
    source: String,
    target: String
  ): AppendPlugin = {
    val __obj = js.Dynamic.literal(appending = appending.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendPlugin]
  }
}


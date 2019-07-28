package typings.enhancedDashResolve.libAppendPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendPlugin extends js.Object {
  var appending: String
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object AppendPlugin {
  @scala.inline
  def apply(
    appending: String,
    apply: typings.enhancedDashResolve.libResolverMod.^ => Unit,
    source: String,
    target: String
  ): AppendPlugin = {
    val __obj = js.Dynamic.literal(appending = appending, apply = js.Any.fromFunction1(apply), source = source, target = target)
  
    __obj.asInstanceOf[AppendPlugin]
  }
}


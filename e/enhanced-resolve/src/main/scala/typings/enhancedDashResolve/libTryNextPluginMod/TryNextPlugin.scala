package typings.enhancedDashResolve.libTryNextPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TryNextPlugin extends js.Object {
  var message: String | Null
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object TryNextPlugin {
  @scala.inline
  def apply(
    apply: typings.enhancedDashResolve.libResolverMod.^ => Unit,
    source: String,
    target: String,
    message: String = null
  ): TryNextPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source, target = target)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[TryNextPlugin]
  }
}


package typings
package enhancedDashResolveLib.libConcordMainPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcordMainPlugin extends js.Object {
  var options: enhancedDashResolveLib.libConcordMod.Dictionary[_]
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object ConcordMainPlugin {
  @scala.inline
  def apply(
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    options: enhancedDashResolveLib.libConcordMod.Dictionary[_],
    source: java.lang.String,
    target: java.lang.String
  ): ConcordMainPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(apply)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ConcordMainPlugin]
  }
}


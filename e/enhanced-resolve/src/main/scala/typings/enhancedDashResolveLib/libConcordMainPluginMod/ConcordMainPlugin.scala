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
    apply: enhancedDashResolveLib.libResolverMod.namespaced => scala.Unit,
    options: enhancedDashResolveLib.libConcordMod.Dictionary[_],
    source: java.lang.String,
    target: java.lang.String
  ): ConcordMainPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options, source = source, target = target)
  
    __obj.asInstanceOf[ConcordMainPlugin]
  }
}


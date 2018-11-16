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


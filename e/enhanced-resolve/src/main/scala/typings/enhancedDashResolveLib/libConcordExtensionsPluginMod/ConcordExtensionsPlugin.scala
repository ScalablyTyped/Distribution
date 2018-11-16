package typings
package enhancedDashResolveLib.libConcordExtensionsPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConcordExtensionsPlugin extends js.Object {
  var options: enhancedDashResolveLib.libConcordMod.Dictionary[_]
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}


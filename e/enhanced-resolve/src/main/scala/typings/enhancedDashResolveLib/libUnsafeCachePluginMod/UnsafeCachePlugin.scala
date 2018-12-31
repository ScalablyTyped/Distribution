package typings
package enhancedDashResolveLib.libUnsafeCachePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsafeCachePlugin extends js.Object {
  var cache: enhancedDashResolveLib.libConcordMod.Dictionary[_]
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
  def filterPredicate(request: enhancedDashResolveLib.libCommonDashTypesMod.ResolverRequest): scala.Boolean
}


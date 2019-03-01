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

object UnsafeCachePlugin {
  @scala.inline
  def apply(
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    cache: enhancedDashResolveLib.libConcordMod.Dictionary[_],
    filterPredicate: js.Function1[enhancedDashResolveLib.libCommonDashTypesMod.ResolverRequest, scala.Boolean],
    source: java.lang.String,
    target: java.lang.String
  ): UnsafeCachePlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(apply)
    __obj.updateDynamic("cache")(cache)
    __obj.updateDynamic("filterPredicate")(filterPredicate)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[UnsafeCachePlugin]
  }
}


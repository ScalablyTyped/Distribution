package typings
package enhancedDashResolveLib.libAliasPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasPlugin extends js.Object {
  var alias: java.lang.String
  var name: java.lang.String
  var onlyModule: scala.Boolean
  var options: enhancedDashResolveLib.enhancedDashResolveMod.ResolveNs.ResolverFactoryNs.AliasItem
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}


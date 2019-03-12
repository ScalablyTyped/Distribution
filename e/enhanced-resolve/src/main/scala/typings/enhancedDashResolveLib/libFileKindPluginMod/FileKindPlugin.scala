package typings
package enhancedDashResolveLib.libFileKindPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileKindPlugin extends js.Object {
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object FileKindPlugin {
  @scala.inline
  def apply(
    apply: enhancedDashResolveLib.libResolverMod.namespaced => scala.Unit,
    source: java.lang.String,
    target: java.lang.String
  ): FileKindPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source, target = target)
  
    __obj.asInstanceOf[FileKindPlugin]
  }
}


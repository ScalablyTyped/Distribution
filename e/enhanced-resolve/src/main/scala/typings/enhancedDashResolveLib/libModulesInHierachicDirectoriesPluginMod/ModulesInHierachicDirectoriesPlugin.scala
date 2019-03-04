package typings
package enhancedDashResolveLib.libModulesInHierachicDirectoriesPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModulesInHierachicDirectoriesPlugin extends js.Object {
  var directories: js.Array[java.lang.String]
  var source: java.lang.String
  var target: java.lang.String
  @JSName("apply")
  def apply(resolver: enhancedDashResolveLib.libResolverMod.namespaced): scala.Unit
}

object ModulesInHierachicDirectoriesPlugin {
  @scala.inline
  def apply(
    apply: js.Function1[enhancedDashResolveLib.libResolverMod.namespaced, scala.Unit],
    directories: js.Array[java.lang.String],
    source: java.lang.String,
    target: java.lang.String
  ): ModulesInHierachicDirectoriesPlugin = {
    val __obj = js.Dynamic.literal(apply = apply, directories = directories, source = source, target = target)
  
    __obj.asInstanceOf[ModulesInHierachicDirectoriesPlugin]
  }
}


package typings.enhancedDashResolve.libModulesInHierachicDirectoriesPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModulesInHierachicDirectoriesPlugin extends js.Object {
  var directories: js.Array[String]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object ModulesInHierachicDirectoriesPlugin {
  @scala.inline
  def apply(
    apply: typings.enhancedDashResolve.libResolverMod.^ => Unit,
    directories: js.Array[String],
    source: String,
    target: String
  ): ModulesInHierachicDirectoriesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), directories = directories, source = source, target = target)
  
    __obj.asInstanceOf[ModulesInHierachicDirectoriesPlugin]
  }
}


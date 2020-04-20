package typings.enhancedResolve.modulesInHierachicDirectoriesPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModulesInHierachicDirectoriesPlugin extends js.Object {
  var directories: js.Array[String]
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
}

object ModulesInHierachicDirectoriesPlugin {
  @scala.inline
  def apply(
    apply: typings.enhancedResolve.resolverMod.^ => Unit,
    directories: js.Array[String],
    source: String,
    target: String
  ): ModulesInHierachicDirectoriesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), directories = directories.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModulesInHierachicDirectoriesPlugin]
  }
}


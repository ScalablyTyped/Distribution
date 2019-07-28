package typings.enhancedDashResolve.libDirectoryExistsPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryExistsPlugin extends js.Object {
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object DirectoryExistsPlugin {
  @scala.inline
  def apply(apply: typings.enhancedDashResolve.libResolverMod.^ => Unit, source: String, target: String): DirectoryExistsPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source, target = target)
  
    __obj.asInstanceOf[DirectoryExistsPlugin]
  }
}


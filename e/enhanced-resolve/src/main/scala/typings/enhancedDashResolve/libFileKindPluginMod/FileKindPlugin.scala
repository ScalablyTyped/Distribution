package typings.enhancedDashResolve.libFileKindPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileKindPlugin extends js.Object {
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedDashResolve.libResolverMod.^): Unit
}

object FileKindPlugin {
  @scala.inline
  def apply(apply: typings.enhancedDashResolve.libResolverMod.^ => Unit, source: String, target: String): FileKindPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source, target = target)
  
    __obj.asInstanceOf[FileKindPlugin]
  }
}


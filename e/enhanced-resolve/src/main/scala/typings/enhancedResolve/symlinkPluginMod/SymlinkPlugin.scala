package typings.enhancedResolve.symlinkPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymlinkPlugin extends js.Object {
  var source: String
  var target: String
  @JSName("apply")
  def apply(resolver: typings.enhancedResolve.resolverMod.^): Unit
}

object SymlinkPlugin {
  @scala.inline
  def apply(apply: typings.enhancedResolve.resolverMod.^ => Unit, source: String, target: String): SymlinkPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymlinkPlugin]
  }
}


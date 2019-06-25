package typings
package eslintDashPluginDashReactLib.libTypesMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionTypeDefinition extends js.Object {
  var children: UnionTypeDefinitionChildren | eslintDashPluginDashReactLib.eslintDashPluginDashReactLibNumbers.`true`
  var `type`: eslintDashPluginDashReactLib.eslintDashPluginDashReactLibStrings.union | eslintDashPluginDashReactLib.eslintDashPluginDashReactLibStrings.shape
}

object UnionTypeDefinition {
  @scala.inline
  def apply(
    children: UnionTypeDefinitionChildren | eslintDashPluginDashReactLib.eslintDashPluginDashReactLibNumbers.`true`,
    `type`: eslintDashPluginDashReactLib.eslintDashPluginDashReactLibStrings.union | eslintDashPluginDashReactLib.eslintDashPluginDashReactLibStrings.shape
  ): UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionTypeDefinition]
  }
}


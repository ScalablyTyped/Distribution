package typings.eslintPluginReact.mod._Global_

import typings.eslintPluginReact.eslintPluginReactStrings.shape
import typings.eslintPluginReact.eslintPluginReactStrings.union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionTypeDefinition extends js.Object {
  var children: js.Array[_]
  var `type`: union | shape
}

object UnionTypeDefinition {
  @scala.inline
  def apply(children: js.Array[_], `type`: union | shape): UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionTypeDefinition]
  }
}


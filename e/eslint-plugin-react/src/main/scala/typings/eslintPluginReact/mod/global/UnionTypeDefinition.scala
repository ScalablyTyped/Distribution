package typings.eslintPluginReact.mod.global

import typings.eslintPluginReact.eslintPluginReactStrings.shape
import typings.eslintPluginReact.eslintPluginReactStrings.union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionTypeDefinition extends js.Object {
  var children: js.Array[_] = js.native
  var `type`: union | shape = js.native
}

object UnionTypeDefinition {
  @scala.inline
  def apply(children: js.Array[_], `type`: union | shape): UnionTypeDefinition = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionTypeDefinition]
  }
  @scala.inline
  implicit class UnionTypeDefinitionOps[Self <: UnionTypeDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildrenVarargs(value: js.Any*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[_]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: union | shape): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


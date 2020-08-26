package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPattern
  extends BaseNode
     with Pattern {
  var properties: js.Array[AssignmentProperty | RestElement] = js.native
  @JSName("type")
  var type_ObjectPattern: typings.estree.estreeStrings.ObjectPattern = js.native
}

object ObjectPattern {
  @scala.inline
  def apply(
    properties: js.Array[AssignmentProperty | RestElement],
    `type`: typings.estree.estreeStrings.ObjectPattern
  ): ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPattern]
  }
  @scala.inline
  implicit class ObjectPatternOps[Self <: ObjectPattern] (val x: Self) extends AnyVal {
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
    def setPropertiesVarargs(value: (AssignmentProperty | RestElement)*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: js.Array[AssignmentProperty | RestElement]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ObjectPattern): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


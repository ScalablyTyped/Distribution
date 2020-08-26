package typings.estree.mod

import typings.estree.estreeStrings.init
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.estree.mod.Node because Already inherited */ @js.native
trait AssignmentProperty extends Property {
  @JSName("kind")
  var kind_AssignmentProperty: init = js.native
  @JSName("value")
  var value_AssignmentProperty: Pattern = js.native
}

object AssignmentProperty {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: init,
    method: Boolean,
    shorthand: Boolean,
    `type`: typings.estree.estreeStrings.Property,
    value: Pattern
  ): AssignmentProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentProperty]
  }
  @scala.inline
  implicit class AssignmentPropertyOps[Self <: AssignmentProperty] (val x: Self) extends AnyVal {
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
    def setKind(value: init): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Pattern): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


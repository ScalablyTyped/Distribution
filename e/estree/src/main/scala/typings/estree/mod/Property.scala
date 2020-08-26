package typings.estree.mod

import typings.estree.estreeStrings.get
import typings.estree.estreeStrings.init
import typings.estree.estreeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Property
  extends BaseNode
     with Node {
  var computed: Boolean = js.native
  var key: Expression = js.native
   // Could be an AssignmentProperty
  var kind: init | get | set = js.native
  var method: Boolean = js.native
  var shorthand: Boolean = js.native
  @JSName("type")
  var type_Property: typings.estree.estreeStrings.Property = js.native
  var value: Expression | Pattern = js.native
}

object Property {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: init | get | set,
    method: Boolean,
    shorthand: Boolean,
    `type`: typings.estree.estreeStrings.Property,
    value: Expression | Pattern
  ): Property = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  @scala.inline
  implicit class PropertyOps[Self <: Property] (val x: Self) extends AnyVal {
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
    def setComputed(value: Boolean): Self = this.set("computed", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Expression): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: init | get | set): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: Boolean): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setShorthand(value: Boolean): Self = this.set("shorthand", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.estree.estreeStrings.Property): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Expression | Pattern): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


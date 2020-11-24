package typings.estree.mod

import typings.estree.estreeStrings.constructor
import typings.estree.estreeStrings.get
import typings.estree.estreeStrings.method
import typings.estree.estreeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodDefinition
  extends BaseNode
     with Node {
  
  var computed: Boolean = js.native
  
  var key: Expression = js.native
  
  var kind: constructor | method | get | set = js.native
  
  var static: Boolean = js.native
  
  @JSName("type")
  var type_MethodDefinition: typings.estree.estreeStrings.MethodDefinition = js.native
  
  var value: FunctionExpression = js.native
}
object MethodDefinition {
  
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: constructor | method | get | set,
    static: Boolean,
    `type`: typings.estree.estreeStrings.MethodDefinition,
    value: FunctionExpression
  ): MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodDefinition]
  }
  
  @scala.inline
  implicit class MethodDefinitionOps[Self <: MethodDefinition] (val x: Self) extends AnyVal {
    
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
    def setKind(value: constructor | method | get | set): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.MethodDefinition): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FunctionExpression): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}

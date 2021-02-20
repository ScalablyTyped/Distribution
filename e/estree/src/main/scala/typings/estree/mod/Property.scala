package typings.estree.mod

import typings.estree.estreeStrings.get
import typings.estree.estreeStrings.init
import typings.estree.estreeStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class PropertyMutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: init | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.Property): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Expression | Pattern): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

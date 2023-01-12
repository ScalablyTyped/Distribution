package typings.estree.mod

import typings.estree.estreeStrings.get
import typings.estree.estreeStrings.init
import typings.estree.estreeStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property
  extends StObject
     with BaseNode {
  
  var computed: Boolean
  
  var key: Expression | PrivateIdentifier
  
  // Could be an AssignmentProperty
  var kind: init | get | set
  
  var method: Boolean
  
  var shorthand: Boolean
  
  @JSName("type")
  var type_Property: typings.estree.estreeStrings.Property
  
  var value: Expression | Pattern
}
object Property {
  
  inline def apply(
    computed: Boolean,
    key: Expression | PrivateIdentifier,
    kind: init | get | set,
    method: Boolean,
    shorthand: Boolean,
    value: Expression | Pattern
  ): Property = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Property")
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setKey(value: Expression | PrivateIdentifier): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: init | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Boolean): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setShorthand(value: Boolean): Self = StObject.set(x, "shorthand", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.Property): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Expression | Pattern): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

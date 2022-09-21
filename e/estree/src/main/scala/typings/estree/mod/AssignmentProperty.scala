package typings.estree.mod

import typings.estree.estreeStrings.init
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignmentProperty
  extends StObject
     with Property {
  
  @JSName("kind")
  var kind_AssignmentProperty: init
  
  @JSName("value")
  var value_AssignmentProperty: Pattern
}
object AssignmentProperty {
  
  inline def apply(
    computed: Boolean,
    key: Expression | PrivateIdentifier,
    method: Boolean,
    shorthand: Boolean,
    value: Pattern
  ): AssignmentProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = "init", method = method.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Property")
    __obj.asInstanceOf[AssignmentProperty]
  }
  
  extension [Self <: AssignmentProperty](x: Self) {
    
    inline def setKind(value: init): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Pattern): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

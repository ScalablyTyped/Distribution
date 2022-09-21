package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberExpression
  extends StObject
     with BaseNode
     with ChainElement
     with Pattern {
  
  var computed: Boolean
  
  var `object`: Expression | Super
  
  var optional: Boolean
  
  var property: Expression | PrivateIdentifier
  
  @JSName("type")
  var type_MemberExpression: typings.estree.estreeStrings.MemberExpression
}
object MemberExpression {
  
  inline def apply(
    computed: Boolean,
    `object`: Expression | Super,
    optional: Boolean,
    property: Expression | PrivateIdentifier
  ): MemberExpression = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[MemberExpression]
  }
  
  extension [Self <: MemberExpression](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Expression | Super): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Expression | PrivateIdentifier): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.estree.estreeStrings.MemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExpression
  extends StObject
     with BaseNode {
  
  var properties: js.Array[Property | SpreadElement]
  
  @JSName("type")
  var type_ObjectExpression: typings.estree.estreeStrings.ObjectExpression
}
object ObjectExpression {
  
  inline def apply(properties: js.Array[Property | SpreadElement]): ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[ObjectExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectExpression] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: js.Array[Property | SpreadElement]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesVarargs(value: (Property | SpreadElement)*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setType(value: typings.estree.estreeStrings.ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

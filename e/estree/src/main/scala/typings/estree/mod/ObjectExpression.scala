package typings.estree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectExpression
  extends StObject
     with BaseNode
     with Expression {
  
  var properties: js.Array[Property | SpreadElement]
  
  @JSName("type")
  var type_ObjectExpression: typings.estree.estreeStrings.ObjectExpression
}
object ObjectExpression {
  
  @scala.inline
  def apply(properties: js.Array[Property | SpreadElement]): ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectExpression")
    __obj.asInstanceOf[ObjectExpression]
  }
  
  @scala.inline
  implicit class ObjectExpressionMutableBuilder[Self <: ObjectExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[Property | SpreadElement]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: (Property | SpreadElement)*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.estree.estreeStrings.ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonNullableType
  extends StObject
     with Type_ {
  
  var expression: Type_
  
  var prefix: Boolean
  
  var `type`: typings.doctrine.doctrineStrings.NonNullableType
}
object NonNullableType {
  
  @scala.inline
  def apply(expression: Type_, prefix: Boolean): NonNullableType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NonNullableType")
    __obj.asInstanceOf[NonNullableType]
  }
  
  @scala.inline
  implicit class NonNullableTypeMutableBuilder[Self <: NonNullableType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: Boolean): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.NonNullableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

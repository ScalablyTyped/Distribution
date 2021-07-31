package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterType
  extends StObject
     with Type_ {
  
  var expression: Type_
  
  var name: String
  
  var `type`: typings.doctrine.doctrineStrings.ParameterType
}
object ParameterType {
  
  @scala.inline
  def apply(expression: Type_, name: String): ParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ParameterType")
    __obj.asInstanceOf[ParameterType]
  }
  
  @scala.inline
  implicit class ParameterTypeMutableBuilder[Self <: ParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.doctrine.doctrineStrings.ParameterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

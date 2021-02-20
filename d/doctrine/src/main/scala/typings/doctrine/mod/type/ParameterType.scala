package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterType extends Type_ {
  
  var expression: Type_ = js.native
  
  var name: String = js.native
  
  var `type`: typings.doctrine.doctrineStrings.ParameterType = js.native
}
object ParameterType {
  
  @scala.inline
  def apply(expression: Type_, name: String, `type`: typings.doctrine.doctrineStrings.ParameterType): ParameterType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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

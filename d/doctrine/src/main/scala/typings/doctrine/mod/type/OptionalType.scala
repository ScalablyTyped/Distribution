package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalType
  extends StObject
     with Type_ {
  
  var expression: Type_
  
  var `type`: typings.doctrine.doctrineStrings.OptionalType
}
object OptionalType {
  
  inline def apply(expression: Type_): OptionalType = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("OptionalType")
    __obj.asInstanceOf[OptionalType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionalType] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.doctrine.doctrineStrings.OptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestType
  extends StObject
     with Type_ {
  
  var expression: js.UndefOr[Type_] = js.undefined
  
  var `type`: typings.doctrine.doctrineStrings.RestType
}
object RestType {
  
  inline def apply(): RestType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RestType")
    __obj.asInstanceOf[RestType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestType] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Type_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setType(value: typings.doctrine.doctrineStrings.RestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

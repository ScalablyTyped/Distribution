package typings.doctrine.mod.`type`

import typings.doctrine.mod.Type_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldType
  extends StObject
     with Type_ {
  
  var key: String
  
  var `type`: typings.doctrine.doctrineStrings.FieldType
  
  var value: js.UndefOr[Type_] = js.undefined
}
object FieldType {
  
  inline def apply(key: String): FieldType = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FieldType")
    __obj.asInstanceOf[FieldType]
  }
  
  extension [Self <: FieldType](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.doctrine.doctrineStrings.FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Type_): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

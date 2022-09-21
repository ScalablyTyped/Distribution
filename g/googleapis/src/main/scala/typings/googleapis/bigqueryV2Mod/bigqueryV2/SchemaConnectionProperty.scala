package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectionProperty extends StObject {
  
  /**
    * [Required] Name of the connection property to set.
    */
  var key: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Required] Value of the connection property.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaConnectionProperty {
  
  inline def apply(): SchemaConnectionProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectionProperty]
  }
  
  extension [Self <: SchemaConnectionProperty](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

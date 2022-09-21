package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetOwnerInstanceResponse extends StObject {
  
  /**
    * Full instance resource URL.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
}
object SchemaGetOwnerInstanceResponse {
  
  inline def apply(): SchemaGetOwnerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOwnerInstanceResponse]
  }
  
  extension [Self <: SchemaGetOwnerInstanceResponse](x: Self) {
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}

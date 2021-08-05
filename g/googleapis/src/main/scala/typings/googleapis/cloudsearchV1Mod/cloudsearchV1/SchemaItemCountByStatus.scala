package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaItemCountByStatus extends StObject {
  
  /**
    * Number of items matching the status code.
    */
  var count: js.UndefOr[String] = js.undefined
  
  /**
    * Status of the items.
    */
  var statusCode: js.UndefOr[String] = js.undefined
}
object SchemaItemCountByStatus {
  
  inline def apply(): SchemaItemCountByStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaItemCountByStatus]
  }
  
  extension [Self <: SchemaItemCountByStatus](x: Self) {
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}

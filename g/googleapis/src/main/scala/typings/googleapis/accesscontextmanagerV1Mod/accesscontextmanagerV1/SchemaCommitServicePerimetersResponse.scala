package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommitServicePerimetersResponse extends StObject {
  
  /**
    * List of all the Service Perimeter instances in the Access Policy.
    */
  var servicePerimeters: js.UndefOr[js.Array[SchemaServicePerimeter]] = js.undefined
}
object SchemaCommitServicePerimetersResponse {
  
  inline def apply(): SchemaCommitServicePerimetersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitServicePerimetersResponse]
  }
  
  extension [Self <: SchemaCommitServicePerimetersResponse](x: Self) {
    
    inline def setServicePerimeters(value: js.Array[SchemaServicePerimeter]): Self = StObject.set(x, "servicePerimeters", value.asInstanceOf[js.Any])
    
    inline def setServicePerimetersUndefined: Self = StObject.set(x, "servicePerimeters", js.undefined)
    
    inline def setServicePerimetersVarargs(value: SchemaServicePerimeter*): Self = StObject.set(x, "servicePerimeters", js.Array(value*))
  }
}

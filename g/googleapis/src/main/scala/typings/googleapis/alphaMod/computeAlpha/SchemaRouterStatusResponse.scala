package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRouterStatusResponse extends StObject {
  
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var result: js.UndefOr[SchemaRouterStatus] = js.undefined
}
object SchemaRouterStatusResponse {
  
  inline def apply(): SchemaRouterStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterStatusResponse]
  }
  
  extension [Self <: SchemaRouterStatusResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResult(value: SchemaRouterStatus): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}

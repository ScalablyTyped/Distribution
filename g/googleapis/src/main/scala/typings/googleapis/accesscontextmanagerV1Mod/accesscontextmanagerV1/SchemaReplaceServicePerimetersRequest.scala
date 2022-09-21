package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReplaceServicePerimetersRequest extends StObject {
  
  /**
    * Optional. The etag for the version of the Access Policy that this replace operation is to be performed on. If, at the time of replace, the etag for the Access Policy stored in Access Context Manager is different from the specified etag, then the replace operation will not be performed and the call will fail. This field is not required. If etag is not provided, the operation will be performed as if a valid etag is provided.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The desired Service Perimeters that should replace all existing Service Perimeters in the Access Policy.
    */
  var servicePerimeters: js.UndefOr[js.Array[SchemaServicePerimeter]] = js.undefined
}
object SchemaReplaceServicePerimetersRequest {
  
  inline def apply(): SchemaReplaceServicePerimetersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceServicePerimetersRequest]
  }
  
  extension [Self <: SchemaReplaceServicePerimetersRequest](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setServicePerimeters(value: js.Array[SchemaServicePerimeter]): Self = StObject.set(x, "servicePerimeters", value.asInstanceOf[js.Any])
    
    inline def setServicePerimetersUndefined: Self = StObject.set(x, "servicePerimeters", js.undefined)
    
    inline def setServicePerimetersVarargs(value: SchemaServicePerimeter*): Self = StObject.set(x, "servicePerimeters", js.Array(value*))
  }
}

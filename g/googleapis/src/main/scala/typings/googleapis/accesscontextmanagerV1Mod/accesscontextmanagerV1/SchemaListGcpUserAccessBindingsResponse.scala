package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGcpUserAccessBindingsResponse extends StObject {
  
  /**
    * GcpUserAccessBinding
    */
  var gcpUserAccessBindings: js.UndefOr[js.Array[SchemaGcpUserAccessBinding]] = js.undefined
  
  /**
    * Token to get the next page of items. If blank, there are no more items.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListGcpUserAccessBindingsResponse {
  
  inline def apply(): SchemaListGcpUserAccessBindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGcpUserAccessBindingsResponse]
  }
  
  extension [Self <: SchemaListGcpUserAccessBindingsResponse](x: Self) {
    
    inline def setGcpUserAccessBindings(value: js.Array[SchemaGcpUserAccessBinding]): Self = StObject.set(x, "gcpUserAccessBindings", value.asInstanceOf[js.Any])
    
    inline def setGcpUserAccessBindingsUndefined: Self = StObject.set(x, "gcpUserAccessBindings", js.undefined)
    
    inline def setGcpUserAccessBindingsVarargs(value: SchemaGcpUserAccessBinding*): Self = StObject.set(x, "gcpUserAccessBindings", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}

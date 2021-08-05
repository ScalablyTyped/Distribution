package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List sources response.
  */
trait SchemaListQuerySourcesResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var sources: js.UndefOr[js.Array[SchemaQuerySource]] = js.undefined
}
object SchemaListQuerySourcesResponse {
  
  inline def apply(): SchemaListQuerySourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListQuerySourcesResponse]
  }
  
  extension [Self <: SchemaListQuerySourcesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSources(value: js.Array[SchemaQuerySource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: SchemaQuerySource*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
